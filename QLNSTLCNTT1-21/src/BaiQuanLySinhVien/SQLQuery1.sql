Create Database demo
use demo

Create table QUANLYSINHVIEN(
ID varchar(5) not null primary key,
HoTen nvarchar(50),
Email nvarchar(50),
GioiTinh nvarchar(30),
TinhTrang nvarchar(30)
)
insert into[dbo].[QUANLYSINHVIEN] values
('12345', N'Phan Hoàng Sơn',N'hoangson28052002@gmail.com',N'Nam',N'Độc thân')