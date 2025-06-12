----------member 테이블 부모로 생성하기---------
create table member(
mno number(5) not null,
bwriter nvarchar2(10) not null,--mname
id nvarchar2(10) primary key,
pw nvarchar2(10) not null,
regidate date default sysdate not null
)
--시퀸스 객체는 이미 1개가 있으니 board_seq를 같이 사용
drop table member-- member테이블 삭제용

--부모더미데이터 입력
insert into member (mno, bwriter, id, pw)--regidate는 자동으로 잘 들어가는지 확인하기 위해 안 적음
values(board_seq.nextval,'페이커','faker','1234')
insert into member (mno, bwriter, id, pw)
values(board_seq.nextval,'박원빈','pwb','1234')
insert into member (mno, bwriter, id, pw)
values(board_seq.nextval,'양지민','yjm','1234')

select * from member

--------member의 자식 board 외래키 생성 필수---------------

drop table board --기존에 board테이블 삭제
drop sequence board_seq--자동번호 생성 제거

create table board(
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence board_seq increment by 1 start with 1 nocycle nocache

alter table board add constraint board_member_fk foreign key(bwriter) references member(id)
--보드테이블은 멤버의 자식 테이블로 멤버의 id와 보드의 bwriter를 관계설정(외래키)
--이미 자식테이블에 값이 있어서 오류가 뜸 -> pk와 fk를 확인하고 연결 -> 자식테입ㄹ의 더미데이터를 삭제하고 실행해야 함

--보드 테이블에 더미데이터를 넣으니
--ORA-02291: integrity constraint (BOARDTEST.BOARD_MEMBER_FK) violated - parent key not found
--부모테이블에 양지민이라는 값이 없다 -> 보드에 양지민을 id인 faker로 변경

delete from board --조건 없이 delete를 실행하면 모든 데이터가 삭제 -> 그 뒤에 외래키를 설정해야 함

insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values(board_seq.nextval,'안농','집가고싶어','faker',sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values(board_seq.nextval,'바이','집가고싶어','pwb',sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values(board_seq.nextval,'잠깐만','집가고싶어','yjm',sysdate)

select * from board

-----------------------------------------
--조인 : 2개의 테이블을 연결하여 값을 가져옴

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id = 'faker'
--보드테이블 전체, 멤버테이블의 bwriter부터 m은 멤버테이블 안에있는 id와 b는 보드테이블 안에있는 bwriter를 찾아 붙히는데 그 중 id가 faker인 아이를 표로 보여줌
