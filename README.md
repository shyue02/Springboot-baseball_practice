# MyBatis DB연결 세팅

### 설정방법
- MyBatisConfig 파일 필요
- resources/mapper/*.xml 파일 필요
- Users 엔티티 필요
- UsersDao 인터페이스 생성 필요

### 테이블 생성
```sql
create table stadium(
    id int primary KEY auto_increment,
    name varchar(20),
    created_at TIMESTAMP
);

create table team(
    id int primary KEY auto_increment,
    name varchar(20),
    stadium_id INT,
    created_at TIMESTAMP
);

create table player(
    id int primary KEY auto_increment,
    name varchar(20),
    position VARCHAR(20),
    team_id INT,
    is_outer BOOLEAN,
    created_at TIMESTAMP
);
```

### 더미데이터 추가
```sql
INSERT INTO stadium(NAME, created_at) VALUES('사직야구장', NOW());
INSERT INTO stadium(NAME, created_at) VALUES('잠실야구장', NOW());
INSERT INTO stadium(NAME, created_at) VALUES('고척야구장', NOW());
INSERT INTO team(NAME, stadium_id, created_at) VALUES('롯데', 1, NOW());
INSERT INTO team(NAME, stadium_id, created_at) VALUES('두산', 2, NOW());
INSERT INTO team(NAME, stadium_id, created_at) VALUES('키움', 3, NOW());
INSERT INTO player(NAME, position, team_id, is_outer, created_at) VALUES('이대호', '1루수', 1, 0,NOW());
INSERT INTO player(NAME, position, team_id, is_outer, created_at) VALUES('홍길동', '외야수',2, 0,NOW());
INSERT INTO player(NAME, position, team_id, is_outer, created_at) VALUES('장보고', '투수', 3, 0,NOW());
COMMIT;
```

### Tip

### MariaDB auto commit 해제하기 (테스트할 때 롤백 못하니까 해제)
```sql
show variables like 'autocommit%';
SET AUTOCOMMIT = FALSE;
```