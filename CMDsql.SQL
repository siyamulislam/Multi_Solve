create database multi_solve


create table worker_data (
 worker_id int primary key auto_increment, 
 first_name varchar (30) not null,
 last_name varchar (30), 
 address varchar (150) not null, 
 email varchar (50) not null, 
 gender varchar (10) not null,
 join_as varchar (30) not null,
 age int check (age>=18),
 phone int not null UNIQUE, 
 password varchar (30) not null
 )
 
alter table worker_data auto_increment=10001


create table user_data (
 user_id int primary key auto_increment, 
 first_name varchar (30) not null,
 last_name varchar (30), 
 address varchar (150) not null, 
 email varchar (50) not null, 
 gender varchar (10) not null,
 age int check (age>=18),
 phone int not null UNIQUE, 
 password varchar (30) not null
 )
 
alter table user_data auto_increment=20001




 Insert into UserData( Fname ,Lname,Address,Email,Gender, Age, Phone, Password  )

 Values ('Siyamul', 'Islam','53/2 Shukrabad, Dhaka','siyamulislam.1@gmail.com', 'Male', 20, 01717338996 , '1234' )



 Insert into  WorkerData( Fname ,Lname,Address,Email,Gender, JoinAs, Age, Phone, Password  )

 Values ('Siyamul', 'Islam','53/2 Shukrabad, Dhaka','siyamulislam.1@gmail.com', 'Male','Tutor', 20, 01717338996 , '1234' )

 
  

  create table Tutor 
  (
  Tversion varchar(50) not null,
  Tclass varchar(10) not null,
  Tsubject varchar(30) not null,
  sertype varchar(20) not null,
  sdate varchar (100) not null,
  phone varchar(30) not null
  )



  create table Photographer 
  (
  Pevent varchar(50) not null,
  Duration varchar(20) not null,
  sertype varchar(20) not null,
  sdate varchar (100) not null,
  phone varchar(30) not null
  )




  Select *  from UserData
  Select *  from WorkerData
  Select * from Tutor 
  Select * from Photographer 
