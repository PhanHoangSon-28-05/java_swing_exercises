Create database MaSinhVienCuaBan
use MaSinhVienCuaBa

Create table NhanVien(
	ID varchar(10) not null primary key,
	Name nvarchar(50) not null,
	Age char(10) not null
)

insert into NhanVien Values
('NV001', N'Nguyễn Văn Thảo',18),
('NV002', N'Trần Thị Châu',21),
('NV003', N'Nguyễn Thị Mơ',22),
('NV004', N'Võ Văn Chung',20),
('NV005', N'Lê Thị Hạnh',23)