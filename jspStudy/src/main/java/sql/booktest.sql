USE booktest;--사용자가 정의된 데이터베이스를 사용

create table if not exists book(
b_id varchar(10)not null,
b_name varchar(20),
b_unitPrice integer,
b_author varchar(20),
b_description text,
b_publisher varchar(20),
b_category varchar(20),
b_unitsInStock long,
b_releaseDate varchar(20),
b_condition varchar(20),
b_fileName varchar(20),
primary key (b_id)
)default charset=utf8;

desc book;

drop table book;--잘못 생성시 제거

insert into book values('aaa1','도원암귀', 6000, '우루시바라 유라', '일본의 다크판타지 만화', '아키타 쇼텐', '만화/애니', 20, '2020/10/08', 'new', 'aaa1.jpg');
insert into book values('adddd','히카루가 죽은 여름', 9000, '히카루', '일본 스릴러', '양지미니', '만화/애니', 15, '2024/10/08', 'new', '');
select * from book;