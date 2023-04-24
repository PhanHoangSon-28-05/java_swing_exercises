create database DemoDB
use DemoDB

create table Employee(
	ID int IDentity(1,1) not null,
	first nvarchar(20),
	last nvarchar(20),
	age int
	constraint pk_ primary key(ID)

)

Insert into [dbo].[Employee]([first],[last],[age]) values
(N'Sơn', N'Phan Hoàng', 20),
(N'Lộc', N'Huỳnh Văn', 19),
(N'Vũ', N'Nguyễn Minh',21),
(N'Hoàng', N'Trần Khánh', 22)