--system계정으로 dba_접두어 사용
select* from dba_tables;
--dba_users를 사용하여 사용자 정보를 알아보기
select* from dba_users where username = 'SCOTT';
--데이터베이스 자체를 관리하는 목적 외에 오라클 데이터베이스를 사용하여 데이터를 보관하고 관리하는 업무를 진행할 때는 그리 자주 사용 안 함

