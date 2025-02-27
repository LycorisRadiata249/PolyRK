USE [QLBV]
GO
/****** Object:  Table [dbo].[Chatlieu]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Chatlieu](
	[ID] [int] NOT NULL,
	[Ten] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTSP]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTSP](
	[ID] [int] NOT NULL,
	[IDSP] [int] NOT NULL,
	[SOLUONG] [int] NOT NULL,
	[KichcoID] [int] NOT NULL,
	[ChatlieuID] [int] NOT NULL,
	[XuatxuID] [int] NOT NULL,
	[MauID] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HDCT]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HDCT](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDHoadon] [int] NOT NULL,
	[IDCTSP] [int] NOT NULL,
	[SOLUONG] [int] NOT NULL,
	[tonghdct] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Hoadon]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hoadon](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDNV] [char](10) NOT NULL,
	[Ngayban] [date] NOT NULL,
	[Trangthai] [bit] NULL,
	[Tongtien] [float] NOT NULL,
	[ghichu] [nvarchar](50) NULL,
	[idkhuyenmai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Khuyenmai]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khuyenmai](
	[ID] [int] NOT NULL,
	[Tenkhuyenmai] [nvarchar](50) NOT NULL,
	[Phantramgiam] [float] NOT NULL,
	[Sotiengiam] [float] NOT NULL,
	[Ngaybatdau] [date] NOT NULL,
	[Ngayketthuc] [date] NOT NULL,
	[Ghichu] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Kichco]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Kichco](
	[ID] [int] NOT NULL,
	[Ten] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Mau]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Mau](
	[ID] [int] NOT NULL,
	[Tenmau] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Nhanvien]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Nhanvien](
	[ID] [char](10) NOT NULL,
	[Matkhau] [nchar](10) NOT NULL,
	[Hoten] [nvarchar](255) NOT NULL,
	[SDT] [nchar](12) NOT NULL,
	[Vaitro] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SANPHAM]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SANPHAM](
	[ID] [int] NOT NULL,
	[TEN] [nvarchar](50) NOT NULL,
	[GIABAN] [float] NOT NULL,
	[MOTA] [nvarchar](255) NULL,
	[TRANGTHAI] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[XUATXU]    Script Date: 12/3/2023 5:22:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[XUATXU](
	[ID] [int] NOT NULL,
	[Ten] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Chatlieu] ([ID], [Ten]) VALUES (1, N'Thep')
INSERT [dbo].[Chatlieu] ([ID], [Ten]) VALUES (2, N'Nhom')
INSERT [dbo].[Chatlieu] ([ID], [Ten]) VALUES (3, N'Graphite')
INSERT [dbo].[Chatlieu] ([ID], [Ten]) VALUES (4, N'Gang D')
GO
INSERT [dbo].[CTSP] ([ID], [IDSP], [SOLUONG], [KichcoID], [ChatlieuID], [XuatxuID], [MauID]) VALUES (1, 1, 2, 1, 1, 1, 1)
INSERT [dbo].[CTSP] ([ID], [IDSP], [SOLUONG], [KichcoID], [ChatlieuID], [XuatxuID], [MauID]) VALUES (2, 2, 72, 2, 2, 2, 2)
INSERT [dbo].[CTSP] ([ID], [IDSP], [SOLUONG], [KichcoID], [ChatlieuID], [XuatxuID], [MauID]) VALUES (3, 3, 44, 3, 3, 3, 3)
INSERT [dbo].[CTSP] ([ID], [IDSP], [SOLUONG], [KichcoID], [ChatlieuID], [XuatxuID], [MauID]) VALUES (4, 2, 80, 1, 1, 1, 1)
INSERT [dbo].[CTSP] ([ID], [IDSP], [SOLUONG], [KichcoID], [ChatlieuID], [XuatxuID], [MauID]) VALUES (5, 1, 5, 1, 1, 1, 1)
INSERT [dbo].[CTSP] ([ID], [IDSP], [SOLUONG], [KichcoID], [ChatlieuID], [XuatxuID], [MauID]) VALUES (6, 1, 36, 2, 2, 4, 4)
GO
SET IDENTITY_INSERT [dbo].[HDCT] ON 

INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (163, 3, 3, 1, 3000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (164, 3, 4, 1, 18000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (185, 5, 2, 20, 8000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (194, 3, 5, 20, 20000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (200, 4, 2, 5, 10000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (205, 3, 2, 5, 10000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (210, 5, 1, 15, 13000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (220, 4, 1, 10, 10000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (236, 1, 3, 1, 3000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (237, 1, 1, 1, 1000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (238, 1, 4, 3, 6000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (239, 1, 2, 5, 10000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (240, 1, 5, 6, 6000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (241, 1, 4, 1, 2000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (242, 1, 1, 1, 1000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (243, 1, 2, 2, 4000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (245, 2, 4, 5, 10000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (246, 7, 5, 8, 8000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (247, 12, 2, 6, 12000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (248, 13, 2, 5, 10000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (249, 11, 4, 9, 18000)
INSERT [dbo].[HDCT] ([ID], [IDHoadon], [IDCTSP], [SOLUONG], [tonghdct]) VALUES (250, 13, 2, 3, 6000)
SET IDENTITY_INSERT [dbo].[HDCT] OFF
GO
SET IDENTITY_INSERT [dbo].[Hoadon] ON 

INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (1, N'NV001     ', CAST(N'2023-11-28' AS Date), 1, 33000, N'asd', 2)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (2, N'NV001     ', CAST(N'2023-12-01' AS Date), 1, 10000, N'abc', 4)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (3, N'NV002     ', CAST(N'2023-12-01' AS Date), 1, 51000, N'a', 0)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (4, N'NV002     ', CAST(N'2023-12-02' AS Date), NULL, 20000, N'asd', 2)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (5, N'NV001     ', CAST(N'2023-11-30' AS Date), 0, 21000, N'8', 6)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (6, N'NV001     ', CAST(N'2023-11-30' AS Date), NULL, 0, N'8', 6)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (7, N'NV003     ', CAST(N'2023-12-03' AS Date), 1, 8000, N'a', 0)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (8, N'NV003     ', CAST(N'2023-12-03' AS Date), 1, 0, N'', 0)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (9, N'NV003     ', CAST(N'2023-12-03' AS Date), 1, 0, N'', 0)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (10, N'NV003     ', CAST(N'2023-12-03' AS Date), 1, 0, N'', 0)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (11, N'NV003     ', CAST(N'2023-12-03' AS Date), 1, 18000, N'', 0)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (12, N'NV003     ', CAST(N'2023-12-03' AS Date), 0, 12000, N'', 0)
INSERT [dbo].[Hoadon] ([ID], [IDNV], [Ngayban], [Trangthai], [Tongtien], [ghichu], [idkhuyenmai]) VALUES (13, N'NV003     ', CAST(N'2023-12-03' AS Date), 1, 16000, N'', 0)
SET IDENTITY_INSERT [dbo].[Hoadon] OFF
GO
INSERT [dbo].[Khuyenmai] ([ID], [Tenkhuyenmai], [Phantramgiam], [Sotiengiam], [Ngaybatdau], [Ngayketthuc], [Ghichu]) VALUES (0, N'', 0, 0, CAST(N'2023-02-04' AS Date), CAST(N'2023-09-09' AS Date), N'')
INSERT [dbo].[Khuyenmai] ([ID], [Tenkhuyenmai], [Phantramgiam], [Sotiengiam], [Ngaybatdau], [Ngayketthuc], [Ghichu]) VALUES (1, N'Khuyến mãi A', 10, 0, CAST(N'2023-01-01' AS Date), CAST(N'2023-01-31' AS Date), N'Ghi chú cho khuyến mãi A')
INSERT [dbo].[Khuyenmai] ([ID], [Tenkhuyenmai], [Phantramgiam], [Sotiengiam], [Ngaybatdau], [Ngayketthuc], [Ghichu]) VALUES (2, N'Khuyến mãi B', 20, 0, CAST(N'2023-02-01' AS Date), CAST(N'2023-02-28' AS Date), N'Ghi chú cho khuyến mãi B')
INSERT [dbo].[Khuyenmai] ([ID], [Tenkhuyenmai], [Phantramgiam], [Sotiengiam], [Ngaybatdau], [Ngayketthuc], [Ghichu]) VALUES (3, N'Khuyến mãi C', 15, 0, CAST(N'2023-03-01' AS Date), CAST(N'2023-03-31' AS Date), N'Ghi chú cho khuyến mãi C')
INSERT [dbo].[Khuyenmai] ([ID], [Tenkhuyenmai], [Phantramgiam], [Sotiengiam], [Ngaybatdau], [Ngayketthuc], [Ghichu]) VALUES (4, N'Khuyến mãi D', 12.5, 0, CAST(N'2023-04-01' AS Date), CAST(N'2023-04-30' AS Date), N'Ghi chú cho khuyến mãi D')
INSERT [dbo].[Khuyenmai] ([ID], [Tenkhuyenmai], [Phantramgiam], [Sotiengiam], [Ngaybatdau], [Ngayketthuc], [Ghichu]) VALUES (5, N'Khuyến mãi E', 18, 0, CAST(N'2023-05-01' AS Date), CAST(N'2023-05-31' AS Date), N'Ghi chú cho khuyến mãi E')
INSERT [dbo].[Khuyenmai] ([ID], [Tenkhuyenmai], [Phantramgiam], [Sotiengiam], [Ngaybatdau], [Ngayketthuc], [Ghichu]) VALUES (6, N'Khuyến Mãi F', 0, 5000, CAST(N'2023-02-03' AS Date), CAST(N'2023-05-09' AS Date), N'')
GO
INSERT [dbo].[Kichco] ([ID], [Ten]) VALUES (1, N'3U')
INSERT [dbo].[Kichco] ([ID], [Ten]) VALUES (2, N'4U')
INSERT [dbo].[Kichco] ([ID], [Ten]) VALUES (3, N'5U')
INSERT [dbo].[Kichco] ([ID], [Ten]) VALUES (4, N'7U')
GO
INSERT [dbo].[Mau] ([ID], [Tenmau]) VALUES (1, N'Xanh')
INSERT [dbo].[Mau] ([ID], [Tenmau]) VALUES (2, N'Do')
INSERT [dbo].[Mau] ([ID], [Tenmau]) VALUES (3, N'Tim')
INSERT [dbo].[Mau] ([ID], [Tenmau]) VALUES (4, N'Vang')
INSERT [dbo].[Mau] ([ID], [Tenmau]) VALUES (5, N'Lam')
INSERT [dbo].[Mau] ([ID], [Tenmau]) VALUES (6, N'Hong')
INSERT [dbo].[Mau] ([ID], [Tenmau]) VALUES (7, N'Hong Canh H')
GO
INSERT [dbo].[Nhanvien] ([ID], [Matkhau], [Hoten], [SDT], [Vaitro]) VALUES (N'NV001     ', N'Matkhau1  ', N'Nguyễn Văn A', N'0123456789  ', 0)
INSERT [dbo].[Nhanvien] ([ID], [Matkhau], [Hoten], [SDT], [Vaitro]) VALUES (N'NV002     ', N'Matkhau2  ', N'Trần Thị B', N'0987654321  ', 1)
INSERT [dbo].[Nhanvien] ([ID], [Matkhau], [Hoten], [SDT], [Vaitro]) VALUES (N'NV003     ', N'Matkhau3  ', N'Lê Văn C', N'0369852147  ', 1)
INSERT [dbo].[Nhanvien] ([ID], [Matkhau], [Hoten], [SDT], [Vaitro]) VALUES (N'NV004     ', N'Matkhau4  ', N'Phạm Thị D', N'0795321468  ', 1)
INSERT [dbo].[Nhanvien] ([ID], [Matkhau], [Hoten], [SDT], [Vaitro]) VALUES (N'NV005     ', N'Matkhau5  ', N'Huỳnh Văn E', N'0542136987  ', 1)
GO
INSERT [dbo].[SANPHAM] ([ID], [TEN], [GIABAN], [MOTA], [TRANGTHAI]) VALUES (1, N'Yonex', 1000, N'khong', NULL)
INSERT [dbo].[SANPHAM] ([ID], [TEN], [GIABAN], [MOTA], [TRANGTHAI]) VALUES (2, N'Yonex Nano', 2000, N'khong', 0)
INSERT [dbo].[SANPHAM] ([ID], [TEN], [GIABAN], [MOTA], [TRANGTHAI]) VALUES (3, N'Yonex Arcsaber 11', 3000, N'khong', 1)
GO
INSERT [dbo].[XUATXU] ([ID], [Ten]) VALUES (1, N'Trung Quoc')
INSERT [dbo].[XUATXU] ([ID], [Ten]) VALUES (2, N'Nhat Ban')
INSERT [dbo].[XUATXU] ([ID], [Ten]) VALUES (3, N'Han Quoc')
INSERT [dbo].[XUATXU] ([ID], [Ten]) VALUES (4, N'Duc')
INSERT [dbo].[XUATXU] ([ID], [Ten]) VALUES (5, N'SeriA')
GO
ALTER TABLE [dbo].[Hoadon] ADD  CONSTRAINT [DF_hoadon_Ngayban]  DEFAULT (getdate()) FOR [Ngayban]
GO
ALTER TABLE [dbo].[CTSP]  WITH CHECK ADD FOREIGN KEY([ChatlieuID])
REFERENCES [dbo].[Chatlieu] ([ID])
GO
ALTER TABLE [dbo].[CTSP]  WITH CHECK ADD FOREIGN KEY([IDSP])
REFERENCES [dbo].[SANPHAM] ([ID])
GO
ALTER TABLE [dbo].[CTSP]  WITH CHECK ADD FOREIGN KEY([KichcoID])
REFERENCES [dbo].[Kichco] ([ID])
GO
ALTER TABLE [dbo].[CTSP]  WITH CHECK ADD FOREIGN KEY([MauID])
REFERENCES [dbo].[Mau] ([ID])
GO
ALTER TABLE [dbo].[CTSP]  WITH CHECK ADD FOREIGN KEY([XuatxuID])
REFERENCES [dbo].[XUATXU] ([ID])
GO
ALTER TABLE [dbo].[HDCT]  WITH CHECK ADD  CONSTRAINT [FK_hdct_ctsp] FOREIGN KEY([IDCTSP])
REFERENCES [dbo].[CTSP] ([ID])
GO
ALTER TABLE [dbo].[HDCT] CHECK CONSTRAINT [FK_hdct_ctsp]
GO
ALTER TABLE [dbo].[Hoadon]  WITH CHECK ADD FOREIGN KEY([IDNV])
REFERENCES [dbo].[Nhanvien] ([ID])
GO
ALTER TABLE [dbo].[Hoadon]  WITH CHECK ADD  CONSTRAINT [FK_hoadon_khuyenmai] FOREIGN KEY([idkhuyenmai])
REFERENCES [dbo].[Khuyenmai] ([ID])
GO
ALTER TABLE [dbo].[Hoadon] CHECK CONSTRAINT [FK_hoadon_khuyenmai]
GO
