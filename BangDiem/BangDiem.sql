create database QLSinhVien
use QLSinhVien

create table NguoiDung(
	TenDangNhap varchar(20) not null,
	MatKhau varchar(20),
	VaiTro nvarchar(30),
	constraint pk_ND primary key (TenDangNhap)
)
create table SinhVien(
	MaSinhVien char(5) not null,
	HoTen nvarchar(50) not null,
	Email varchar(50) not null,
	SoDT char(10),
	GioiTinh smallint not null,
	DiaChi nvarchar(80),
	Hinh image,
	constraint pk_SV primary key (MaSinhVien)
)
create table Lop(
	MaSinhVien char(5) not null,
	TenLop nvarchar(60) not null,
)
alter table [dbo].[Lop]
add constraint pk_SV_lop primary key ([MaSinhVien],[TenLop])

alter table [dbo].[Lop]
add constraint fk_SV_lop foreign key([MaSinhVien]) references [dbo].[SinhVien]([MaSinhVien])

Create table BangDiem(
	Ma int IDENTITY (1,1) not null,
	MaSinhVien char(5) not null,
	TiengAnh float,
	TinHoc float,
	GDTC float,
	constraint pk_BD primary key (Ma),
	constraint fk_SV foreign key (MaSinhVien) references [dbo].[SinhVien]([MaSinhVien])
)

Create table LichSuDiem(
	MaSinhVien char(5) not null,
	ThoiGian datetime,
	GhiChu nvarchar(100)
)
Create table LichSuSinhVien(
	MaSinhVien char(5) not null,
	ThoiGian datetime,
	GhiChu nvarchar(100)
)
Create table LichSuLop(
	MaSinhVien char(5) not null,
	ThoiGian datetime,
	GhiChu nvarchar(100)
)

sp_rename 'BangDiem.TiengAnh', 'Java', 'COLUMN';
sp_rename 'BangDiem.TinHoc', 'SQL', 'COLUMN';
sp_rename 'BangDiem.GDTC', 'PhanTichHeThong', 'COLUMN';

alter table [dbo].[BangDiem]
add Ios float,
	Php float


alter table [dbo].[SinhVien]
add NgaySinh date

alter table [dbo].[SinhVien]
add TinhTrang bit

---///
insert into [dbo].[NguoiDung]values 
('admin','12345',N'Đào Tạo'),
('DinhTha','0905277135',N'Giảng Viên'),
('MinhNgoc','0993038888',N'Giảng Viên'),
('ThanTan','0905170071',N'Giảng Viên')

update [dbo].[NguoiDung]
set [VaiTro] = N'Dạy Thay',[TenDangNhap] = 'ThanhTan'
where [MatKhau] = '0905170071'

select[TenDangNhap], [MatKhau],[VaiTro]from[dbo].[NguoiDung]where [TenDangNhap] = 'admin' and [MatKhau] = '12345'

select * from  [dbo].[SinhVien]

Select top 3 *,([Java] + [SQL] + [PhanTichHeThong] + [Ios] + [Php])/5 as DTB
from BangDiem 
order by DTB desc

Select sv.* from SinhVien sv, Lop l 
 Where sv.MaSinhVien = l.MaSinhVien and TenLop = 'CNTT1_21'and [HoTen] =''

 select * from [dbo].[SinhVien]

 Delete 
 from [dbo].[SinhVien] 
 where MaSinhVien = 'SV102'

 alter table [dbo].[BangDiem]
 add Constraint  fk_BD_SV foreign key (MaSinhVien) REFERENCES [dbo].[SinhVien]([MaSinhVien]) ON DELETE CASCADE

  alter table [dbo].[Lop]
 add Constraint  fk_Lop_SV foreign key (MaSinhVien) REFERENCES [dbo].[SinhVien]([MaSinhVien]) ON DELETE CASCADE


 /*ALTER TABLE hangtonkho ADD CONSTRAINT fk_htk_id_sanpham FOREIGN KEY (id_sanpham)  REFERENCES sanpham (id_sanpham) ON DELETE CASCADE;

 CREATE TABLE bang_con(  cot1 kieudulieu [ NULL | NOT NULL ], cot2 kieudulieu [ NULL | NOT NULL ],
 … CONSTRAINT fk_ten  FOREIGN KEY (cot_con1, cot_con2, … cot_con_n)
 REFERENCES bang_me (cot_me1, cot_me2, … cot_me_n)
 ON DELETE CASCADE   [ ON UPDATE { NO ACTION | CASCADE | SET NULL | SET DEFAULT } ]);

 CREATE TABLE sanpham( id_sanpham INT PRIMARY KEY,  ten_sanpham VARCHAR(50) NOT NULL,  phan_loai VARCHAR(25))
 CREATE TABLE hangtonkho( id_hangtonkho INT PRIMARY KEY,   id_sanpham INT NOT NULL,  soluong INT,  luong_toithieu INT,  luong_toida INT,  CONSTRAINT fk_htk_id_sanpham   FOREIGN KEY (id_sanpham)
 REFERENCES sanpham (id_sanpham)    ON DELETE CASCADE );*/

 select * from SinhVien where TinhTrang = 1

 INSERT INTO dbo.LichSuSinhVien(MaSinhVien,ThoiGian,GhiChu) values('SV101',GetDate(),'Lưu')

