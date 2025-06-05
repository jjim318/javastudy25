desc emp; -- emp테이블 구조보기
select * from emp; -- emp테이블 내용보기

desc dept; -- dept테이블 구조보기
select * from dept; -- dept테이블 내용보기

desc bonus; -- bonus테이블 구조보기
select * from bonus;-- bonus테이블 내용보기

desc salgrade; -- salgrade테이블 구조보기
select * from salgrade;-- salgrade테이블 구조보기

--별칭
select ename, sal, sal*12+comm,comm from emp;-- 연산식에서 사용 *는 곱하기 +는 더하기

select ename, sal,sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal,comm from emp;--곱하기를 쓰지 않고 사원의 연간 총 수입 출력하기

select ename, sal,sal*12+comm as annsal,comm from emp;
--별칭은 최종적으로 출력되기를 원하는 열 이름을 직접지정 할 때 주로 사용
--긴 열 이름의 불편함 외에도 보안이나 데이터 노출문제로 사용
--String sql = "select ename, sal, sal*12+comm as "annsal", comm from emp";
--자바에서 사용할 때 select문 전체를 큰 따옴표로 묶어서 처리, 별칭을 지정할 때 중간에 큰 따옴표를 쓰면 프로그래머가 의도하지 않은 상황(오류,예외사항)이 발생

--order by(오름차순,내림차순으로 정렬
select* from emp order by sal;-- emp테이블의 모든 열 급여 기준으로 오름차순 정렬
select* from emp order by sal desc;-- emp 테이블의 모든 열 급여 기준으로 내림차순 정렬
select* from emp order by deptno asc, sal desc;-- emp테이블의 전체 열 부서번호(오름차순), 급여(내림차순)으로 정렬
--select(조회할 열
--from(조회할 테이블 이름
--order by(정렬하려는 열 이름


--where(필요한 데이터만 출력
select* from emp where deptno = 30;--부서번호가 30인 사람들의 데이터만 출력
--select(조회할 열 이름
--from(조회할 테이블 이름
--where(조회할 행을 선별하기 위한 조건식

--and,or(여러개의 조건식
select* from emp where deptno = 30 and job = 'SALESMAN';
--직업 열을 비교하는 문자열 데이터는 반드시 대문자로 작성
--SQL문은 기본 형식은 대소문자를 가리지 않음
--테이블 안에 들어이 ㅆ는 무자 또는 문자열 데이터는 대소문자를 구별

select* from emp where deptno = 30 or job = 'CLERK';
--and,or을 실무에서는 여러가지 조건을 한 번에 찾기때문에 같이 쓰는 경우가 많음

--곱셈 산술 연산자 예
select* from emp where sal* 12=36000;

--대소 비교 연산자
select* from emp where sal >= 3000;
select* from emp where ename >= 'F'; --사원 이름의 첫 문자가 f와 같거나 뒤쪽인 것만 검색

--대소 비교 연산자(문자 여러개
select* from emp where ename <= 'FORZ';--*ford 맨 끈 글자 d가z보다 앞에 있어서 조건으 ㄹ만족

--등가 비교 연산자(!=
select* from emp where sal != 3000;
--등가 비교 연산자(<>
select* from emp where sal <> 3000;
--등가 비교 연산자(^=
select* from emp where sal ^= 3000;
--셋 다 같지 않다는 의미로 사용할 수 있어서 같은 결과 값을 출력

--논리 부정 연산자
select* from emp where not sal = 3000;--복잡한 조건식에서 정반대의 최동 결과를 원할 때 사용

--in 연산자
select* from emp where job = 'MANACER' or job = 'SALESMAN' or job = 'CLERK';
--번거롭기 때문 in 연산자 사용
--select(조회할 열
--from(조회할 테이블 이름
--where 열 이름 in(데이터N
select* from emp where job in ('MANAGER','SALESMAN','CLERK');

--등가 비교 연산자와 AND연산자를 사용하여 출력
select* from emp where job != 'MANACER' and job <>'SALESMAN' and job ^= 'CLERK';
select* from emp where job not in('MANAGER','SALESMAN','CLERK');
--두 개의 식의 출력이 같음

--between a and b 연산자
select* from emp where sal >= 2000 and sal <= 3000;
--특정 열 값의 최소 최고 범위를 지정하여 해당 범위 내의 데이터만 조회
--select(조회할 열
--from(조회할 테이블 이름
--where 열 이름 between 최솟값 and 최대값

--between a and b 연산자와 not연산자를 사용
select* from emp where sal not between 2000 and 3000;

--like 연산자와 와일드 카드
select* from emp where ename like 'S%';--S로 시작하는 데이터를 조회
--%기호는 와일드 카드라고 함
--like연산자와 함께 사용할 수 있는 와일드 카드는 _와% 두개
-- _:어떤 값이든 ㄴ상관엇이 한 개의 문자 데이터를 의미
-- %: 길이와 상관없이(문자 없는 경우도 포함) 모든 문자 데이터를 의미

select* from emp where ename like '_L%';
--두 번째 문자는 반드시'L'이고 L앞에는 반드시 한 문자가 와야 함
select* from emp where ename like '%AM%';
--AM이라는 단어가 반드시 포함되어있는 데이터를 찾음
select* from emp where ename not like '%AM%';
--앞에 not를 붙히면 포함되어있지 않는 데이터를 찾음

--와일드 카드 문자가 데이터 일부일 경우
--select* from some_table where some_column like 'A\_A%' escape '\';

--is null연산자
--null(값이 존재하지 않음, 해당 사항 없음, 노출할 수 없는 값, 확정되지 않은 값)
select* from emp where comm = null;
--값이 나오지 않음 null은 산술 연산자와 비교연산자로 비료해도 결과 값이 nulll이 되기 때문
--어떤 값인지 모르는 값에 숫자를 더해도 어떤 값인지 알 수 없고, 어떤 값인지 모르는 값이 특정 값보다 큰지 작은지 알 수 없다는 거와 같은 이치
select* from emp where comm is null;
--추가 수당 열 값이 존재하지 않는 데이터만 출력
select* from emp where mgr is not null;
--값이 존재하지 않는 것을 제외한 데이터만 출력

select* from emp where sal > null and comm is null;
--양쪽 항목이 모두 true인 경우만 결과 값을 출력
select* from emp where sal > null or comm is null;
--양쪽 항목 중 어느 항목만 true여도 결과 값을 출력

--집합연산자
select empno, ename, sal, deptno from emp where deptno = 10 union
select empno, ename, sal, deptno from emp where deptno = 20;
--데이트를 조환 결과를 하나의 집합과 같이 다룰 수 있는 집한 연산자

select empno, ename,sal,deptno from emp where deptno = 10 union
select ename, empno,sal,deptno from emp where deptno = 20;

select empno, ename,sal,deptno from emp where deptno = 10 union
select ename,empno, deptno,sal from emp where deptno = 20;
--집합 연산자로 두 개의 select문의 결과 값을 할 때 각 select문이 출력하려는 열 개수와 각 열의 자료형이 순별로 일치해야 한다

select empno, ename,sal,deptno from emp where deptno = 10 union
select sal,job,deptno,sal from emp where deptno = 20;
--열 이름은 맨 앞에 작성한 select 절의 열 이름을 사용한다

--union : 연결된 select문의 결과 값을 합집합으로 묶어줌(결과 값의 중복은 제거)
--union all : 연결된 select문의 결과 값을 합집합으로 묶어줌(중복된 결과 값도 제거없이 모두 출력)
--minus : 먼저 작성한 select문의 결과 값에서 다음 select문의 결과 값을 차집합 처리(먼저 작성한 select문의 결과 값 중 다음 select문에 존재하지 않는 데이터만 출력)
--intersect : 먼저 작성한 select문과 다음 select문의 결과 값이 같은 데이터만 출력(교집합과 같은 의미)

select empno, ename, sal, deptno from emp where deptno = 10 union
select empno, ename, sal, deptno from emp where deptno = 10;

select empno, ename, sal, deptno from emp where deptno = 10 union all
select empno, ename, sal, deptno from emp where deptno = 10;

select empno, ename, sal, deptno from emp minus
select empno, ename, sal, deptno from emp where deptno = 10;

select empno, ename, sal, deptno from emp intersect
select empno, ename, sal, deptno from emp where deptno = 10;


--문자 데이터를 가공하는 문자 함수
--upper : 괄호 안 문자 데이터를 모두 대문자로 변환하여 반환
--lower : 괄호 안 문자 데이터를 모두 소문자로 변환하여 반환
--initcap : 괄호 안 문자 데이터 중 첫 글자는 대문자로, 나머지 문자를 소문자로 변환 후 반환

select ename, upper(ename), lower(eanme), initcap(ename) from emp;

select* from emp where upper(ename) = upper('scott');
--사원 이름이 scott인 데이터 찾기
select* from emp where upper(ename) like upper('%scott');
--사원 이름에 scott 단어를 포함한 데이터 찾기

--문자열 길이를 구하는 함수
select ename, length(ename) from emp;
select ename, length(ename) from emp where length(ename)>= 5;
--length 함수는 숫가 비교도 가능

select length('한글'), lengthb('한글') from dual;
--문자열의 길이를 반환,문자열의 바이트 수를 반환

--문자열 일부를 추출하는 substr 함수
select job, substr(job,1,2),substr(job,3,2),substr(job,5) from emp;
--substr(문자열 데이터, 시작 위치, 추출 길이)
--substr(문자열 데이터, 시작 위치
--오라클 책 135페이지까지




--오라클 책 266페이지부터
create table dept_temp as select* from dept;
--dept_temp테이블 만들
select* from dept_temp;--전체 열 조회
--잘못 만들었을 때는 drop table 테이블 이름;을 하면 기본 테이블이 삭제됨

--테이블에 데이터를 추가(insert
--insert into 테이블 이름[(열n)]
--values(열n에 들어갈 데이터;)
insert into dept_temp(deptno, dname, loc) values(50,'database','seoul');
select* from dept_temp;
--insert문을 ctrl+엔터를 누른 만큼 추가가 된 걸 select문으로 확인 가능

--insert문은 지정한 열 개수와 각 열에 입력할 데이터 개수가 일치하지 않거나 자료형이 맞지 않으면 실행되지 않는다
--또 열 길이를 초과하는 데이터를 지정하는 경우에도 실행되지 않음
insert into dept_temp(deptno,dname  ,loc) values(60   ,'network'   );

--insert문에 열 지정 없이 데이터 추가
insert into dept_temp values(60  , 'network','busan');
select* from dept_temp;

--null지정 입력
insert into dept_temp(deptno,dname,loc) values(70  ,'web',null);
select* from dept_temp;

--빈 공백을 문자열로 null처리
insert into dept_temp(deptno, dname  ,loc) values(80   ,'mobile','');
select* from dept_temp;
--실무에서는 null이라고 정확하게 입력하는 것이 좋다 남들이 봤을 때 헷갈릴 수 있기 때문

--열 데이터를 넣지 않는 방식으로 null 데이터 입력하기
insert into dept_temp(deptno, loc) values(90  ,'incheon');
select* from dept_temp;
--deame열을 insert문에서 제외시키면 자동으로 null처리가 됨

create table emp_temp as select* from emp where 1<>1;
select* from emp_temp;
--억지스럽지만 급하게 테이블 열 구조만 같은 테이블을 만들어야 할 경우 where절의 조건이 1<>1이기 때문에 각 행을 조건식에 대입한 결과 값은 항상 false가 되어 결과적으로 행은 만들어지지 않음

--테이블에 날짜 데이터 입력하기
insert into emp_temp (empno, ename, job, mgr,hiredate,sal,comm,deptno)values(9999,'홍길동','president',null,'2001/01/01',5000,1000,10);
select* from emp_temp;

insert into emp_temp (empno, ename, job, mgr,hiredate,sal,comm,deptno)values(1111,'성춘향','manager',9999,'2001-01-05',4000,null,20);
select* from emp_temp;
--유의점 : 년/월/일 순서오아 반대로 일/월/년 순서로 데이터를 입력사면 오류가 발생함
--오라클이 설치되어 있는 운영체제의 종류나 사용하는 기본 언어군에 따라 날짜 표기방식이 다르기때문

--to_date함수 사용
insert into emp_temp(empno, ename, job, mgr,hiredate, sal, comm, deptno) values (2111,'이순신','manager',9999,to_date('07/01/2001','dd/mm/yyyy'),4000,null,20);
select* from emp_temp;
--to_date를 사용하면 통일로 사용가능

--sysdate함수 사용
insert into emp_temp(empno, ename,job,mgr, hiredate,sal,comm,deptno) values(3111,'심청이','manager',9999,sysdate,4000,null,30);
select* from emp_temp;
--현재 컴퓨터의 날짜와 시간이 출력

--서브쿼리를 사용하여 한 번에 여러 데이터 추가
insert into emp_temp(empno, ename,job,mgr, hiredate,sal,comm,deptno)
select e.empno,e.ename,e.job,e.mgr,e.hiredate,e.sal,e.comm,e.deptno from emp e,salgrade s where e.sal between s.losal and s.hisal and s.grade =1;
select* from emp_temp;
--여러 행의 데이터를 추가할 수 있음
--유의점 : values절은 사용하지 않는다
--데이터가 추가되는 테이블의 열 개수와 서브쿼리의 열 개수가 일치해야한다
--데이터가 추가되는 테이블의 자료형과 서브쿼리의 자료형이 일치해야한다

--테이블에 있는 데이터 수정
create table dept_temp2 as select* from dept;
select* from dept_temp2;

--update[변경할 테이블]
--set [변경할 열1][변경할 열n]=[데이터]
--[where 데이터를 변경할 대상 행을 선별하기 우한 조건];

--전체 수정
update dept_temp2 set loc='seoul';
select* from dept_temp2;

--수정한 내용 돌리기
rollback;--update명령어를 실행한 이전 상태로 돌아감

--데이터 일부분만 수정
update dept_temp2 set dname = 'database', loc = 'seoul' where deptno = 40;
select* from dept_temp2;

--서브쿼리를 사용하여 데이터 수정
--여러열 한 번에 수정
update dept_temp2 set(dname,loc) = (select dname,loc from dept where deptno = 40) where deptno = 40;
select* from dept_temp2;

--열 하나하나 수정
update dept_temp2 set dname = (select dname from dept where deptno = 40), loc = (select loc from dept where deptno = 40) where deptno = 40;
--위에랑 결과는 같지만 방법이 다름
--변경 열의 개수에 따라 서브쿼리에서 지정한 열 개수도 변하고 있음

--where절에 서브쿼리를 사용하여 데이터 수정
update dept_temp2 set loc = 'seoul' where deptno = (select deptno from dept_temp2 where dname='operations');
select* from dept_temp2;

--유의점
update dept_temp2 set dname = 'database', loc = 'seoul' where deptno = 40;
--라고 했을 때 실행하기 전에 where절의 조건식이 수정해야 하는 데이터를 정확히 가리키고 있는 지 알고 싶다면, 다음과 같이 select문에 같은 조건 식의 where문을 적용하여 결과 값 확인
select* from dept_temp2 where deptno = 40;
--실무에는 더 중요 조건들이 많아지기 때문
--update문과 delete문을 실행하기전에 select문으로 where절의 조건식이 정확한지 확인하는 습관이 중요

--데이터 삭제하기
create table emp_temp2 as select * from emp;
select* from emp_temp2;

--delete문의 기본형식
--delete[from][테이블이름]
--[where 삭제할 대상 행을 선별하기 위한 조건식];

--일부분 삭제
delete from emp_temp2 where job = 'manager';
select* from emp_temp2;

--서브쿼리를 사용하여 데이터 삭제
delete from emp_temp2 where empno in(select e.empno from emp_temp2 e, salgrade s where e.sal between s.losal and s.hisal and s.GRADE = 3 and deptno = 30);
select* from emp_temp2;

--전체 삭제하기
delete from emp_temp2;
select* from emp_temp2;

--트랜잭션
--관계형 데이터 베이스에서 하나의 작업 또는 밀접하게 연관되어 있는 작업 수행을 위해 나눌 수 없는 최소 수행 단위
--하나의 트랜잭션 내에 있는 여러 명령어를 한 번에 수행하여 작업을 완료하거나 아예 모두 수행하지 않는 상태, 즉 모든 작업을 취소
--이러한 특성으로 트랜잭션 의미를 all dr nothing문장으로 설명함
--트랜잭션을 제어하기 위해 사용하는 명령어를 TCL이라고 함
--모든 명령어가 수행되거나 모든 명령어가 수행되지 않음

--dept_tcl테이블 만들어 입력 수정 삭제
create table dept_tcl as select* from dept;
select* from dept_tcl;

insert into dept_tcl values(50,'database','seoul');--입력
update dept_tcl set loc ='busan' where deptno = 40;--수정
delete from dept_tcl where dname = 'research';--삭제
select* from dept_tcl;

--트랜잭션 취소
rollback;
select* from dept_tcl;
--트랜잭션에 포함된 데이터 조작관련 명령어의 수행을 모두 취소

--트랜잭션을 영원히 반영
insert into dept_tcl values(50,'network','seoul');--입력
update dept_tcl set loc ='busan' where deptno = 20;--수정
delete from dept_tcl where deptno = 40;--삭제
select* from dept_tcl;

commit;
--사용기점부터 50번 부서 추가, 20번 부서 변경,40번 부서 삭제는 취소가 불가
--rollback명령어 역시 이 시점부터 소용이 없음
--확신을 가지고 사용해야 함

--세션
--세션이 트랜잭션보다 큰 개념
--데이터 베이스 접속을 시작으로 여러 데이터 베시스에서 관련 작업을 수행한 후 접속을 종료하기까지 전체 기간
--읽기 일관성 : 어떤 특정 세션에서 테이블의 데이터를 변경 중일 때 그 외 다른 세션에서는 데이터의 변경이 확정되기 전까지 변경 사항을 알 필요가 없기 때문에
--데이터를 변경중인 세션을 제외한 나머지 세션에서는 현재 진행중인 변경과 무관한 본래의 데이터를 보여줌
--commit을 하면 다른 곳에서도 변경 된 세션으로 보임

--lock
--조작 중인 데이터를 다른 세션은 조작할 수 없도록 접근을 보류시키는 것
--303페이지


--데이터 정의어
--유의점 : 자동으로 commit되기 때문에 이전에 사용한 데이터 조작어는 영구히 데이터베이스에 반영
--실행취소가 아예불가


--테이블 생성
--create table 소유계정.테이블이름( 열이름 n 열n 자료형);

create table emp_ddl( empno number(4), ename varchar2(10), job varchar2(9), mgr number(4), hiredate date, sal number(7,2),deptno number(2));
desc emp_ddl;

--다른 테이블을 복사하여 테이블 생성(기존 테이블 열 구조와 데이터를 복사하여 새 테이블 생성
create table dept_ddl as select* from dept;
desc dept_ddl;
select* from dept_ddl;
--create문에서 서브쿼리를 사용할 때 as키워드를 함께 씀

--다른 테이블의 일부를 복사하여 테이블 생성
create table emp_ddl_30 as select* from emp where deptno = 30;
select* from emp_ddl_30;

--다른 테이블을 복사하여 테이블 생성(기존 테이블의 열구조만 복사하여 새 테이블 생성
create table empdept_ddl as select e.empno,e.ename,e.job, e.mgr,e.hiredate,e.sal,e.comm,d.deptno,d.dname,d.loc from emp e, dept d where 1<>1;
select* from empdept_ddl;


--테이블 수정
create table emp_alter as select* from emp;
select* from emp_alter;

--alter명령어로 hp열 추가
alter table emp_alter add hp varchar2(20);
select* from emp_alter;
--alter명령어로 hp열 이름을 tel로 변경
alter table emp_alter rename column hp to tel;
select* from emp_alter;
--alter명령어로 empno열 길이 변경
alter table emp_alter modify empno number(5);
desc emp_alter;
--alter명령어로 tel열 삭제
alter table emp_alter drop column tel;
select* from emp_alter;

--테이블 이름 변경
rename emp_alter to emp_rename;
--바꾸기 전 이름으로 테이블 구성
desc emp_alter;--안 됨
--변경된 테이블 이름(emp_rename)으로 조회
select* from emp_rename;

--emp_rename 테이블의 전체 데이터 삭제
truncate table emp_rename;
select* from emp_rename;
--truncate 명령어는 특정테이블의 모든 데이터를 삭제 
--데이터만 삭제, 테이블 구조에는 영향 안 줌
--유의점 : where절을 명시하지 않은 delete문의 수행으로도 가능
--truncate는 데이터 정의어이기 때문에 rollback이 되지 않음, 삭제이후 복구 안 됨

--emp_rename 테이블 삭제
drop table emp_rename;
--drop명령어는 데이터 베이스 객체를 삭제
--테이블이 삭제되므로 테이블에 저장된 데이터도 모두 삭제
desc emp_rename;
--데이터 정의어이기 때문에 rollback명령어로 테이블 삭제 수행을 취소할 수 없음

--데이터 사전
--테이블은 사용자 테이블과 데이터 사전으로 나뉨
--사용자 테이블은 데이터베이스를 통해 관리할 데이터를 저장하는 테이블을 뜻함
--데이터 사전은 데이터베이스를 구성하고 운영하는 데 필요한 모든 정보를 저장
--데이터베이스가 생성되는 시점에 자동으로 만들어짐
--사용자가 데이터 사전 정보에 직접 접근하거나 작업하는 것을 허용하지 않음

--데이터 사전 살펴보기
select* from dict;
select* from dictionary;
--두 개의 실행 결과가 같음

--객체정보 살펴보기(user_
select table_name from user_tables;
--접두어 뒤에 복수형 단어로 이름을 구성하고 있음
--계정이 가지고 있는 테이블 이름을 보여줌

--객체정보 살펴보기(all_
select owner, table_name from all_tables;
--owner열은 테이블을 소유한 사용자 명시

--dba_사용
select* from dba_tables;
--데이터베이스 관리 권한을 가진 사용자만 조회 가능
--안내문구에 존재하지 않는다라고 표현하는 경우는 보안문제 때문
--334페이지

--제약조건
--테이블의 특정 열에 지정, 제약 조건을 지정한 열에 제약 조건에 부합하지 않는 데이터를 저장할 수 없음

--데이터무결성
--데이터베이스에 저장되는 데이터의 정확성과 일관성을 보장한다는 의미
--항상 유지해야 하는 기본 규칙을 가지고 있음
--제약 조건은 이러한 데이터 무결성을 지키기 위한 안전장치로 중요함
--영역 무결성 : 열에 저장되는 값의 적정 여부를 확인. 자료형, 적절한 형식의 데이터, NULL 여부같은 정해놓은 범위를 만족하는 데이터임을 규정
--개체 무결성 :  테이블 데이터를 유일하게 식별할 수 있는 기본키는 반드시 값을 가지고 있어야 하며 null이 될 수 없고 중복될 수도 없음을 규정
--참조 무결성 :  참조 테이블의 외래키 값은 참조 테이블의 기본키로서 존재해야 하며 null이 가능

--테이블 생성하며 제약 조건 지정
--테이블을 생성할 때 not null설정
create table table_notnull( login_id varchar2(20) not null, login_pwd varchar2(20) not null, tel varchar2(20));
desc table_notnull;

insert into table_notnull(login_id,login_pwd,tel) values('test_id_01',null,'010-1234-5678');
--실행되지 않음
insert into table_notnull(login_id,login_pwd) values('test_id_01','1234');
select* from table_notnull;
--tel열을 비워둠으로써 null을 암시적으로 삽입
--열의 제약 조건으로 not null을 지정하면 update문을 사용하여 login_id,login_pwd열 값을 null로 수정하는 것도 불가능

--not null제약 조건이 지정된 열 데이터를 null값으로 업데이트
update table_notnull set login_pwd = null where login_id = 'test_id_01';
--실행 안 됨

--제약 조건
--owner :  제약 조건 소유 계정
--constraint_name : 제약 조건 이름(직접 지정하지 않을 경우 오라클이 자동으로 지정
--constraint_type : 제약 조건 종류
--c : check, not null
--u : rnique
--p : primary key
--r : foreign key
--table_name : 제약 조건을 지정한 테이블 이름

--제약조건 살펴보기
select owner, constraint_name, constraint_type, table_name from user_constraints;

--제약 조건 이름 직접 지정
create table table_notnull2( login_id varchar2(20) constraint tblnn2_login_nn not null,
login_pwd varchar(20) constraint tblnn2_loginpw_nn not null, tel varchar2(20));
select owner, constraint_name, constraint_type,table_name from user_constraints;
--실무에서는 자동으로 오라클이 지정해주는 이름으로 사용하면 찾기가 어려워 이름 붙이는 규칙을 정해 직접 입력함

--이미 생성한 테이블에 제약 조건 지정
--생성한 테이블에 제약 조건 추가
alter table tavle_notnull modify(tel not null);
--실행 안 됨
--제약 조건 대상이 되는 열이 가진 데이터 중 추가하려는 제약 조건에 맞지 않는 데이터가 존재하기 때문
--지금은 열 데이터에 null을 허용하지 않는 not null 제약 조건을 추가하려 했는데 이미 tel열의 데이터 중 null값이 존재하기 때문

--tel열 데이터 수정하기
update table_notnull set tel = '010-1234-5678' where login_id = 'test_id_01';
select* from table_notnull;
--not null제약조건 추가
alter table table_notnull modify(tel not null);
select owner, constraint_name, constraint_type,table_name from user_constraints;

--제약 조건에 이름 지정해서 추가
alter table table_notnull2 modify(tel constraint tblnn_tel_nn not null);
select owner, constraint_name, constraint_type,table_name from user_constraints;

--table_notnull2테이블 열 구조 확인
desc table_notnull2;

--이미 생성된 제약 조건 이름 변경
alter table table_notnull2 rename constraint tblnn_tel_nn to tblnn2_tel_nn;
select owner, constraint_name, constraint_type,table_name from user_constraints;

--제약 조건 삭제
alter table table_notnull2 drop constraint tblnn2_tel_nn;
desc table_notnull2;

--제약 조건 지정(테이블 생성
create table table_unique(login_id varchar2(20) unique, login_pwd varchar2(20) not null, tel varchar2(20));
desc table_unique;

--user_constraints 데이터 사전 뷰로 제약 조건 확인
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'TABLE_UNIQUE';
--안 나올 경우 대문자로 해보기(정의가 대문자로 되어있으면 소문자로 쓸 경우 안 될 수도 있음

--table_unique 테이블에 데이터 입력하기
insert into table_unique(login_id, login_pwd,tel) values('test_id_01','pwd01','010-1234-5678');
select* from table_unique;

--login_id 열에 중복되는 데이터 넣기
insert into table_unique(login_id,login_pwd, tel) values('test_id_01','pwd01','010-1234-5678');
--실행 안 됨

--table_unique 테이블에 데이터 입력
insert into table_unique(login_id,login_pwd,tel) values('test_id_02','pwd01','010-1234-5678');
select* from table_unique;

--unique제약 조건이 지정된 열에 null 값 입력
insert into table_unique(login_id,login_pwd,tel) values(null,'pwd01','010-1234-5678');
select* from table_unique;

--table_unique테이블 데이터 수정
update table_unique set login_id='test_id_01' where login_id is null;
--실행 안 됨

--테이블을 생성할 때 unoque제약 조건 설정
create table table_unique2(login_id varchar2(20) constraint tblunq2_lgnid_unq unique,
login_pwd varchar2(20) constraint tblunq2_lgnpw_nn not null, tel varchar2(20));
--생성한 unique제약 조건 확인
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';
--대문자로 써야 함

--이미 생성한 테이블 열에 unique제약 조건 추가
alter table table_unique modify(tel unique);
--tel열에 이미 중복된 열이 있기 때문 not null과 마찬가지로 제약 조건을 추가할 때 해당 열에 추가하려는 제약 조건에 맞지 않는 데이터가 존재할 경우 실행 안 됨

--tel 열 값을 모두 null값으로 변경
update table_unique set tel = null;
select* from table_unique;

--tel 값에 unique 제약 조건 설정
alter table table_unique modify(tel unique);

--unique제약 조건 이름 직접 지정
alter table table_unique2 modify(tel constraint tblunq_tel_unq unique);
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';
--대문자로 적어야 함

--이미 만들어져 있는 unique제약 조건 이름 수정
alter table table_unique2 rename constraint tblunq_tel_unq to tblunq2_twl_unq;
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';
--twl>tel오타

--제약 조건 삭제
alter table table_unique2 drop constraint tblunq2_twl_unq;
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';
--오타 그대로 삭제

--primary key 제약 조건은 unique와 not null제약 조건의 특성을 모두 가지는 제약 조건
--데이터 중복을 허용하지 않고 null도 허용하지 않음

--테이블 생성할 때 특정 열에 primary key설정
create table table_pk(login_id varchar2(20) primary key, login_pwd varchar2(20) not null, tel varchar2(20));
desc table_pk;
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME LIKE 'TABLE_PK%';

--생성한 primary key를 통해 자동 생성된 index 확인
SELECT INDEX_NAME, TABLE_OWNER, TABLE_NAME FROM USER_INDEXES WHERE TABLE_NAME LIKE 'TABLE_PK%';
--대문자로 사용

--제약 조건의 이름을 직접 지정하여 테이블 생성
create table table_pk2( login_id varchar2(20) constraint tblpk2_lgnid_pk primary key,
login_pwd varchar2(20) constraint tblpk2_lgnpw_nn not null, tel varchar2(20));
desc table_pk2;
--390페이지


--사용자
--오라클 데이터베이스에서 데이터 베이스에 접속하여 데이터를 관리하는 계정을 사용자라 함
--필요 이유 : 실무에서 사용하는 여러 종류의 서비스는 한 사용자가 관리하기에는 데이터 분량이 너무 방대하거나 구조가 복잡해짐
--데이터베이스 스키마 : 오라클 데이터 베이스에서는 스키마와 사용자를 구별하지 않고 사용하기도 함
--사용자는 데이터를 사용 및 관리하기 위해 오라클 데이터베이스에 접속하는 개체
--스미카는 오라클 데이터베이스에서 접속한 사용자와 연결된 객체
--****모든 객체는 scott의 스키마가 됨*****


--사용자 생성
--create user 사용자 이름(필수
--identified by 패스워드(필수
--erfault tablespace 테이블 스페이스 이름(선택
--temporary tablespace 테이블 스페이스(그룹) 이름(선택)
--quota 테이블 스페이스크기 on 테이블 스페이스 이름(선택
--profile 프로파일 이름 (선택
--password expire(선택
--account [lock/unlock](선택);

--scott계정으로 사용자 생성
create user orclstudy identified by oracle;
--실행 안 됨

--사용자 생성은 일반적으로 데이터베이스 관리 권한을 가진 사용자가 권한을 가지고 있음
--오라클 데이터베이스를 설치할 때 자동으로 생성된 sys,system이 데이터 베이스 관리 권한을 가진 사용자
--system계정에서 확인
--grant문은 권한을 부여하기 위해 사용하는 명령어

--설정 실행에서
--system 사용자로 접속 후 사용자 생성(sql*plus
create user orclstudy identified by oracle;

--사용자에게 권한 부여
grant create session to oaclstudy;

--사용자 정보 조회
select* from all_users where username = 'orclstudy';--s를 붙히는 이유는 여러가지를 보기 위해
--where userneme- 문장을 빼면 모두 나옴
select* from dba_users where useaname = 'orclstydy';
select* from dba_objects where owner = 'orclstudy';

--사용자 정보(패스워드)변경
alter user orclstudy identified by orcl;
--사용자 삭제
drop user orclstudy;
--사용자와 객체 모두 삭제
drop user orclstudy cascade;

--권한관리
--특정 데이터에 대해서 관련 된 사용자만 데이터를 사용 및 관리할 수 있는 보안 장치가 필요
--사용자 이름과 패스워드를 통해 데이터베이스 접속을 허가하는 것이 첫 번째
--접속 사용자에 따라 접근할 수 있는 데이터 영역과 권한을 지정해 줄 수 있음
--권한은 시스템 권한과 객체 권한으로 분류

--시스템 권한
--사용자 생성과 정보 수정 및 삭제,데이터베이스 접근, 오라클 데이터베이스의 여러 자원과 객체 생성 및 관리등 권한을 포함
--시스템 권한의 일부이며 any키워드가 들어 있는 권한은 소유자에게 상관없이 사용 가능한 권한을 의미

--시스템 권한 부여
--grant create ceccion to orclstudy;
--이 명령어는 orclstudy사용자에게 create session권한을 부여하겠다는 뜻
--grant[시스템 권한]to[사용자 이름/롤(role)이름/public][with admin option];


--설정 실행에서
--system계정으로 접속하여 사용자 생성(sql*plus)
create user oaclstudy identified by oracle;
--사용자 권한 부여(sql*plus
grant resource, create session, create table to orclstudy;

--시스템 권한 취소
--revoke[시스템 권한]from[사용자 이름/롤(role)이름/public];
--설정 실행에서
--revoke resource, create table from orclstudy;

--객체 권한
--특정 사용자가 생성한 테이블 인덱스 뷰 시퀸스 등과 관려된 권한

--객채 권한 부여
--grant[객체 권한/all privileges] on [스키마.객체 이름]to[사용자 이름/롤(role)이름/pubic][with grant option];
--설정 실행에서
--conn scott/tiger
--create table temp(col1 varchar(20),col2 varchar(20));
--grant select on temp to orclstudy;
--grant insert on temp to orclstudy;

--orcl에게 temp 테이블의 여러 권한을 한 번에 부여
grant select, insert on temp to orclstudy;
--orclstudy로 사용 권한을 부여받으 temp테이블 사용
conn orclstudy/oracle
select* from scott.temp;
insert into scott.temp values('text','from orclstudy');
select*from scott.temp;


--객체 권한 취소
--revoke[객체 권한/all privileges](필수) on [스키마.객체 이름](필수)from[사용자 이름/롤(role)이름/public](필수)[cascade constraints/force](선택);
--orclstudy에 부여된 temp테이블 사용권한 취소
conn scott/tiger
revoke select, insert on temp from orclstudy;
--orclstudy로 권한 철회된 temp테이블 조회(실패
conn orclstudy/oracle
select* from scott.temp;
--여기까지 설정-실행에서 함

--롤 관리
--사용자가 어떤 작업을 진행하기 위해 해당 작업과 관련된 권한을 반드시 부여받아야 함
--사전 정의된 롤 : connect롤,dba롤
--오라틀 9i버전까지는 다음 8가지 권한을 가지고 있었지만 10g버전부터 create session권한만 있다
--connect롤 : alter session,create cluster, 

