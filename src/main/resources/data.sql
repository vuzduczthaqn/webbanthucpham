insert into [tbl.Position](position_id,position_name)
values('ADMIN','admin'),
('USER','user')

insert into [tbl.Customer](customer_name,age,email)
values(N'Vũ Đức Thắng',20,'123xxthang@gmail.com'),
(N'Đào Thị Khánh Linh',20,'dtklinh@gmail.com'),
(N'Lê Thanh Xuân',20,'thanhxuanle@gmail.com'),
(N'Tạ Ngọc Linh Chi',20,'linhchi3007@gmail.com')


insert into [tbl.User](customer_id,password,username,position_id)
values('1','12345678','vdt1410','USER'),
('4','12345678','linhchi3007','USER'),
('2','12345678','daolinh','ADMIN')

insert into [tbl.Product_Type](type_id,type_name)
values ('SF',N'Hải sản'),
		('RC',N'Rau củ'),
		('BT',N'Bơ và Trứng'),
		('TT',N'Thịt tươi sống'),
		('HK',N'Các loại hạt'),
		('HQ',N'Hoa quả'),
		('NE',N'Nước ép trái cây')

insert into [tbl.Producer](producer_id,producer_name,address)
values
('NSX01',N'nhà sản xuất 01',N'Ngã cạy, TT. Ngã Sáu, Châu Thành, Hậu Giang, Việt Nam'),
('NSX02',N'nhà sản xuất 02',N'Mường Bang, Mộc Châu, Sơn La, Việt Nam'),
('NSX03',N'nhà sản xuất 03',N'Trung Hà, Yên Lạc, Vĩnh Phúc, Việt Nam')


insert into [tbl.Product](type_id,producer_id,product_name,Evaluate,describe,path_img,price,status)
values('HQ','NSX01',N'Chuối tây','4.5',N'Dinh dưỡng của chuối chưa chín có một tỷ
lệ cao kháng tinh bột. Chất này khi được đưa vào ruột sẽ không được tiêu hoá.
Trong ruột già, tinh bột này được lên men bởi vi khuẩn để tạo thành butyrate-là
một loại acid béo chuỗi ngắn-có tác dụng có lợi cho sức khỏe đường ruột.','/template/web/ImageProduct/fruit2.jpg','10000','50'),

('HQ','NSX01',N'Thanh long ','4.5',N'Dinh dưỡng của chuối chưa chín có một tỷ
lệ cao kháng tinh bột. Chất này khi được đưa vào ruột sẽ không được tiêu hoá.
Trong ruột già, tinh bột này được lên men bởi vi khuẩn để tạo thành butyrate-là
một loại acid béo chuỗi ngắn-có tác dụng có lợi cho sức khỏe đường ruột.','/template/web/ImageProduct/fruit5.jpg','10000','50'),

('HQ','NSX01',N'Bơ','4.5',N'Dinh dưỡng của chuối chưa chín có một tỷ
lệ cao kháng tinh bột. Chất này khi được đưa vào ruột sẽ không được tiêu hoá.
Trong ruột già, tinh bột này được lên men bởi vi khuẩn để tạo thành butyrate-là
một loại acid béo chuỗi ngắn-có tác dụng có lợi cho sức khỏe đường ruột.','/template/web/ImageProduct/fruit1.jpg','50000','50'),

('HQ','NSX01',N'Chanh','4.5',N'Dinh dưỡng của chuối chưa chín có một tỷ
lệ cao kháng tinh bột. Chất này khi được đưa vào ruột sẽ không được tiêu hoá.
Trong ruột già, tinh bột này được lên men bởi vi khuẩn để tạo thành butyrate-là
một loại acid béo chuỗi ngắn-có tác dụng có lợi cho sức khỏe đường ruột.','/template/web/ImageProduct/fruit3.jpg','5000','50'),
('HQ','NSX01',N'Ổi','4.5',N'Dinh dưỡng của chuối chưa chín có một tỷ
lệ cao kháng tinh bột. Chất này khi được đưa vào ruột sẽ không được tiêu hoá.
Trong ruột già, tinh bột này được lên men bởi vi khuẩn để tạo thành butyrate-là
một loại acid béo chuỗi ngắn-có tác dụng có lợi cho sức khỏe đường ruột.','/template/web/ImageProduct/fruit3.jpg','15000','50'),

('RC','NSX02',N'Cà chua','4.5',N'Dinh dưỡng của chuối chưa chín có một tỷ
lệ cao kháng tinh bột. Chất này khi được đưa vào ruột sẽ không được tiêu hoá.
Trong ruột già, tinh bột này được lên men bởi vi khuẩn để tạo thành butyrate-là
một loại acid béo chuỗi ngắn-có tác dụng có lợi cho sức khỏe đường ruột.','/template/web/ImageProduct/vegetable4.jpg','10000','50'),

('RC','NSX02',N'Mướp đắng','4.5',N'Dinh dưỡng của chuối chưa chín có một tỷ
lệ cao kháng tinh bột. Chất này khi được đưa vào ruột sẽ không được tiêu hoá.
Trong ruột già, tinh bột này được lên men bởi vi khuẩn để tạo thành butyrate-là
một loại acid béo chuỗi ngắn-có tác dụng có lợi cho sức khỏe đường ruột.','/template/web/ImageProduct/vegetable3.jpg','10000','50'),

('RC','NSX02',N'Súp lơ','4.5',N'Dinh dưỡng của chuối chưa chín có một tỷ
lệ cao kháng tinh bột. Chất này khi được đưa vào ruột sẽ không được tiêu hoá.
Trong ruột già, tinh bột này được lên men bởi vi khuẩn để tạo thành butyrate-là
một loại acid béo chuỗi ngắn-có tác dụng có lợi cho sức khỏe đường ruột.','/template/web/ImageProduct/vegetable5.jpg','10000','50'),

('RC','NSX02',N'Củ cải','4.5',N'Dinh dưỡng của chuối chưa chín có một tỷ
lệ cao kháng tinh bột. Chất này khi được đưa vào ruột sẽ không được tiêu hoá.
Trong ruột già, tinh bột này được lên men bởi vi khuẩn để tạo thành butyrate-là
một loại acid béo chuỗi ngắn-có tác dụng có lợi cho sức khỏe đường ruột.','/template/web/ImageProduct/vegetable2.jpg','10000','50')


alter proc getProduct(@start int,@end int)
as
begin
SELECT *
FROM [tbl.Product]
ORDER BY (SELECT NULL)
OFFSET @start-1 ROWS
FETCH NEXT @end ROWS ONLY
end


exec getProduct 1,3