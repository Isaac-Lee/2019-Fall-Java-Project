# CNU 2019 Fall Java Term Projec

## Scooter Sharing Service - 스쿠터 공유 서비스
project url: https://github.com/users/Isaac-Lee/projects/3
### 개요
#### 전동 스쿠터 공유 서비스란?
Scooter를 공유해주는 가상의 회사는 고객들의 정보를 가지고 있다. 
- 고객들은 자신이 원하는 Scooter 에 대한 공유를 진행한다.
- 회사는 공유 서버를 통해 회원에게 Scooter를 사용할 수 있는 토큰을 제공한다.
- 고객들은 이 토큰을 통해 Scooter를 공유할 수 있다.
- 회사는 고객의 공유 시간을 통해 요금을 부과한다.
- 회사는 공유 관리자를 통해 고객의 토큰의 생성과 수정 관리한다. 

#### 스쿠터 공유 시스템 구성:(인터페이스, 클래스)
- Sharing server : 회원 정보 , 보유 토큰 정보 저장 / 전달 , 공유 정보 저장 , 요금 정보 저장
- Sharing manager : 회원 정보 생성 / 수정 / 관리, 토큰 정보 생성 / 수정 / 관리
- Sharing client : Scooter 사용 / 종료, 토큰 정보 조회 서비스, 요금 결제

### 요구사항 분석

#### Sharing server
##### 데이터 베이스 저장 항목
 - 회원 목록(MemberList)
 - 전동 스쿠터 목록(ScooterList)
 - 관리자(Manager) 및 고객(Member)
 - 기타(Guitar)

#### 서버 서비스
##### 권한
 - 회원 / 관리자 권한 인증 (authenticateUser)

##### 정보 추가 및 삭제  
- 회원 추가(addMember) / 삭제(deleteMember) 
- 전동 스쿠터 추가(addEvent) / 삭제(deleteEvent) - 전체적인 전동 스쿠터의 수 변경


##### 정보 접근 
- 회원 열람(findMember) / 이벤트 열람(findEvent) / 토큰 열람(findToken)
- 회원 목록 열람(findMemberList) / 전동 스쿠터 목록 열람(findScooterList)
- 모든 회원 수(getNumberOfMember) / 모든 전동 스쿠터 수(getNumberOfToken) / 사용중인 전동 스쿠터 수 / 사용가능한 전동 스쿠터 수

##### 기타(Gutiar)
- 기타를 넣어 놓는다.	

#### 회원(Member)
##### 속성
- ID / PASS(ID/PASS)
- 연락처(전화번호(Phone) , 이메일(Email)
- 전동 스쿠터를 사용중인지 아닌지(nowUse)

##### 기능
- 회원정보 수정(Set)
- 전동 스쿠터 예매(rentScooter)

#### Scooter
##### 속성
- ID
- 총 배터리 양(totalBattery)
- 남은 배터리 양(leftBattery)
- 사용중인지 아닌지(nowUse)
- 위치 값(location)

##### 기능
- 사용시간체크(checkingTime)

#### Sharing Manager
- 전동 스쿠터 추가 / 관리(위치확인 등)
- 모든 회원 목록 조회(getMemberList)
- 모든 전동 스쿠터 정보 조회(getScooterInfo)
- 회원 삭제(deleteMember) / 관리
- 서버를 이용해서 관리자 인증

#### Sharing Client
- 회원 정보 생성(중복생성방지 방법필요)/ 수정 / 관리
- 전동 스쿠터 조회(searchScooter)
- 전동 스쿠터 공유(shareScooter)

#### 데이터베이스 구성

- Member

|Name|ID|Password|Phone|Email|nowUse|
|---|---|---|---|---|---|
|varchar(20)|varbinary(20)|varbinary(20)|varchar(30)|varchar(30)|tinyint(1)|

- Manager

|Name|ID|Password|nowUse|
|---|---|---|---|
|varchar(20)|varbinary(20)|varbinary(20)|tinyint(1)|

- Scooter

|ID|Location|nowUse|
|---|---|---|
|varbinary(20)|varchar(50)|tinyint(1)|

