-- 테이블당 두개 정도의 튜플 인서트문.
  
insert into gu values("강서구"); 
insert into gu values("강동구"); 
  
select * from gu;
  
insert into member values("totoro","1234","sun_juho@naver.com", "토토로","또또로","유후인", "010-4190-5489", "ADMIN", now());
insert into member values("hong","1234","hong@naver.com", "홍길동", "홍번쩍", "조선", "010-7890-1234","OWNER", now());
insert into member values("nobita","toraemonn","nobita@naver.com", "노진구", "노징징", "도쿄", "010-1234-5678", "USER", now());
insert into member values("test11","1234","nobita@naver.com","010-1234-5678", "OWNER", now());
insert into member values("test22","1234","test22@naver.com","010-1234-5678", "USER", now());
insert into member values("test33","1234","nobita@naver.com","010-1234-5678", "OWNER", now());

select * from member;

update member set password="doraemonn" where id="nobita";

select * from added_cafe;

delete from member where id like '?%';

desc waiting_cafe;

select * from waiting_cafe;

insert into waiting_cafe values("test11","스타벅스 관철점", "종로구","관철동 솔데스크 8층","facebook", 0, "cafe11.com", "테스트용 카페 입니다.", now());

insert into waiting_cafe_option values(1, 1, 0, 53, 1, 1, 1, 2, "내부에 별도");

select * from waiting_cafe natural join waiting_cafe_option;
	

