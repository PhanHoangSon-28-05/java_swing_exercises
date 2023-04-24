CREATE DATABASE QLTV
USE QLTV


CREATE TABLE ACCOUNT
(Username VARCHAR(20) ,
Pass CHAR(20),
Confirm CHAR(20)
Constraint pk_us Primary key (Username)
)




CREATE TABLE SACH
(Masach char(4) not null,
Tensach NVARCHAR(50),
Theloai NVARCHAR(30),
Tacgia NVARCHAR(30),
Soluong int,
Tinhtrang NVARCHAR(30)
Constraint MS_us Primary key (Masach)
)

CREATE TABLE DOCGIA
(MaDG CHAR(4) not null,
TenDG NVARCHAR(40),
DiaChi NVARCHAR(40),
Email VARCHAR(40),
SDT CHAR(10)
Constraint MDG_us Primary key (MaDG)
)

CREATE TABLE PhieuMuon
(Maphieu VARCHAR(20) ,
Masach char(4)not null ,
MaDG CHAR(4) not null,
NgayMuon date
Constraint Mp_us Primary key (Maphieu)
constraint fk_MaSach foreign key (Masach) references  SACH(Masach),
constraint fk_MaDocGia foreign key (MaDG) references  DOCGIA(MaDG)
)

SELECT * FROM DOCGIA
SELECT * FROM SACH
SELECT * FROM ACCOUNT
SELECT * FROM PhieuMuon



insert into ACCOUNT(Username,Pass,Confirm) VALUES
('Admin','1234','1234'),
('Khánh Hoàng','1234','1234')



insert into SACH(Masach,Tensach,Theloai,Tacgia,SoLuong,TinhTrang) VALUES
('CX01',N'Nhật Ký Đặng Thuỳ Trâm',N'Lịch Sử',N'Liệt sỹ Đặng Thuỳ Trâm',12,N'Còn'),
('CX02',N'Hãy nhắm mắt khi anh đến',N'Ngôn tình',N'Đinh Mặc',22,N'Hết'),
('CX03',N'Tôi thấy hoa vàng trên cỏ xanh',N'Tiểu thuyết',N'Nguyễn Nhật Ánh',50,N'Còn'),
('TQ04',N'Bình Ngô Đại Cáo',N'Lịch sử','Nguyễn Trãi',20,N'Còn'),
('TQ05',N'Kinh Thánh',N'Tôn Giáo','Nhiều tác giả',18,N'Còn')


insert into DOCGIA(MaDG,TenDG,DiaChi,Email,SDT) VALUES
('DG01',N'Nguyễn Ngọc Anh','Hà Nội','Ngocanh@gmail.com','0976223405'),
('DG02',N'Nguyễn Thị Vân Anh','Phú Yên','Vananh29@gmail.com','0344764132'),
('DG03',N'Phan Thị Yến Nhi','Hà Tĩnh','YenNhi@gmail.com','096254173'),
('DG04',N'Trần Anh Quân','Kiên Giang','Anhquan@gmail.com','0343221430'),
('DG05',N'Nguyễn Ngọc Thu Uyên','Nghệ An','Thuuyen@gmail.com','037476354')


insert into PhieuMuon VALUES
('MP01','CX01','DG01', GETDATE()),
('MP02','CX02','DG01',GETDATE()),
('MP03','CX03','DG02',GETDATE()),
('MP04','TQ05','DG01',GETDATE())


select Username, Pass, Confirm from ACCOUNT

Select * from SACH where Theloai = N'Lịch Sử'

UPDATE SACH SET Tensach = N'Bình Ngô Đại Cáo', Theloai = N'Lịch Sử', Tacgia = N'Nguyễn Trãi', Soluong = 20, Tinhtrang = N'Còn'
Where Masach = 'TQ04'

Select count(*) as KetQua1 from Sach






