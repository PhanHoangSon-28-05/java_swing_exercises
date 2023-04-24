Create database ThuVien
use ThuVien

create table SINHVIEN(
	MaSV varchar(10) not null,
	TenSV nvarchar(50) not null,
	MaLop varchar(10) not null,
	NgayHetHan date not null,
	Email varchar(150) not null,
	SDT int not null
	constraint pk_SinhVien primary key(MaSV)
)

create table PHIEUMUON(
	MaPhieu varchar(10) not null,
	MaSV varchar(10) not null,
	NgayMuon date not null,
	NgayTra date not null,
	GhiChu nvarchar(150)
	Constraint pk_Phieu primary key (MaPhieu)
	Constraint fk_SinhVien foreign key (MaSV) references SINHVIEN(MaSV)
)

Create table LOAISACH(
	MaLoai varchar(10) not null,
	LoaiSach nvarchar(20)
	Constraint pk_LoaiSach primary key(MaLoai)
)

create table SACH(
	MaSach varchar(10) not null,
	TenSach nvarchar(50) not null,
	TacGia nvarchar(50) not null,
	SoLuong int not null,
	MaLoai varchar(10) not null,
	NXB varchar(50) not null,
	GiaTien float not null,
	NgayNhapKho date not null,
	SoTrang int,
	ViTriDatSach varchar(50)
	Constraint pk_Sach primary key (MaSach)
	Constraint fk_LoaiSach foreign key (MaLoai) references LOAISACH(MaLoai)
)



create table CHITIETPM(
	MaPhieu varchar(10) not null,
	MaSach varchar(10) not null,
	GhiChu nvarchar(150)
	Constraint pk_MP_S primary key (MaPhieu,MaSach)
	constraint fk_MaPhieu foreign key (MaPhieu) references  PHIEUMUON(MaPhieu),
	constraint fk_MaSach foreign key (Masach) references  SACH(Masach)
)

insert into [dbo].[SINHVIEN] values
('SV1001',N'Phan Hoàng Sơn','CNTT1_21',GETDATE(),'hoangson28052002@gmail.com',0528689935),
('SV1002',N'Trần Khánh Hoàng','CNTT1_21','2009/03/05','hoangmo2000ht@gmail.com',0321316545),
('SV1003',N'Nguyễn Tấn Quí','CNTT2_21','2012/06/12','nguyentanqui@gmail.com',0258357159),
('SV1004',N'Phạm Hải Phát','CNTT2_21','2020/12/09','phamhaiphat2@gmail.com',0486215973),
('SV1005',N'Ngọc Yến','CNTT2_21','2018/06/13','phanthingocyen0129@gmail.com',0126754825)

insert into [dbo].[LOAISACH] values
('LS001',N'Lịch Sử'),('NT002',N'Ngôn Tình'),('CT003',N'Chính Trị'),('TT004',N'Tiểu Thuyết')

insert into [dbo].[PHIEUMUON] values
('NC01','SV1001','2019/02/12','2019/02/19',N'Chưa trả'),
('NC02','SV1001','2021/03/06','2021/03/09',N'Chưa trả'),
('NC03','SV1002','2022/12/28','2023/01/04',N'Đã trả'),
('NC04','SV1003','2022/08/12','2022/08/15',N'Chưa trả'),
('NC05','SV1003','2022/06/03','2022/06/07',N'Đã trả'),
('NC06','SV1004','2016/03/05','2016/03/10',N'Đã trả')


select * from [dbo].[PHIEUMUON]
where [GhiChu] = N'Đã trả'
order by [NgayMuon]