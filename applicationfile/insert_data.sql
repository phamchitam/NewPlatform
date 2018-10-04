
insert into role(code,name) values('ADMIN','Quản trị hệ thống');
insert into role(code,name) values('USER','người dùng');

insert into users(username,password,fullname,status,email,phone)
values('admin','0192023A7BBD73250516F069DF18B500','Pham Chi Tam',1,'tampc@vnpt.vn','0919091797');
insert into users(username,password,fullname,status,email,phone)
values('user','6AD14BA9986E3615423DFCA256D04E3F','Nguyen Thi Nguyen',1,'nguyennt@vnpt.vn','0917787789');

INSERT INTO user_role(user_id,role_id) VALUES (1,1);
INSERT INTO user_role(user_id,role_id) VALUES (2,2);

