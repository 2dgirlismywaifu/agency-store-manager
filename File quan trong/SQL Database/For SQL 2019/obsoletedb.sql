USE [QUANLYDAILY]
GO
/****** Object:  UserDefinedFunction [dbo].[func_EncryptPassword]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE function [dbo].[func_EncryptPassword] (@Data varchar(100))
returns varchar(256)
as
begin
return convert(varchar(256),HASHBYTES('SHA2_256',@Data),2)
end
GO
/****** Object:  Table [dbo].[CHITIETXUATHANG]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CHITIETXUATHANG](
	[MaPhieuXuat] [nvarchar](50) NOT NULL,
	[MaMatHang] [nvarchar](50) NOT NULL,
	[DonViTinh] [nvarchar](50) NOT NULL,
	[SoLuong] [nvarchar](20) NOT NULL,
	[DonGia] [numeric](18, 0) NULL,
	[ThanhTien] [nvarchar](50) NULL,
 CONSTRAINT [PK_CHITIETXUATHANG] PRIMARY KEY CLUSTERED 
(
	[MaPhieuXuat] ASC,
	[MaMatHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CONGNO]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CONGNO](
	[MaDaiLy] [nvarchar](50) NOT NULL,
	[thang] [nvarchar](50) NOT NULL,
	[NoDau] [nvarchar](50) NOT NULL,
	[PhatSinh] [nvarchar](50) NOT NULL,
	[NoCuoi] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_CONGNO] PRIMARY KEY CLUSTERED 
(
	[MaDaiLy] ASC,
	[thang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DAILY]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DAILY](
	[MaDaiLy] [nvarchar](50) NOT NULL,
	[TenDaiLy] [nvarchar](50) NOT NULL,
	[Loai] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[Quan] [nvarchar](50) NOT NULL,
	[DienThoai] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[NgayTiepNhan] [date] NOT NULL,
	[TienNo] [decimal](18, 0) NOT NULL,
 CONSTRAINT [PK_DAILY] PRIMARY KEY CLUSTERED 
(
	[MaDaiLy] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DANGNHAP]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DANGNHAP](
	[ID] [int] NOT NULL,
	[username] [nvarchar](256) NOT NULL,
	[password] [nvarchar](256) NOT NULL,
 CONSTRAINT [PK_DANGNHAP] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DOANHSO]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DOANHSO](
	[MaDaiLy] [nvarchar](50) NOT NULL,
	[Thang] [nvarchar](50) NOT NULL,
	[SoPhieuXuat] [nvarchar](50) NOT NULL,
	[TongTriGia] [nvarchar](50) NOT NULL,
	[TiLe] [int] NULL,
 CONSTRAINT [PK_BANGDOANHSO] PRIMARY KEY CLUSTERED 
(
	[MaDaiLy] ASC,
	[Thang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LOAIDAILY]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOAIDAILY](
	[Loai] [nvarchar](50) NOT NULL,
	[TenLoai] [nvarchar](50) NOT NULL,
	[NoToiDa] [money] NOT NULL,
 CONSTRAINT [PK_LOAIDAILY] PRIMARY KEY CLUSTERED 
(
	[Loai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MATHANG]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MATHANG](
	[MaMatHang] [nvarchar](50) NOT NULL,
	[TenMatHang] [nvarchar](50) NOT NULL,
	[DonGia] [decimal](20, 0) NOT NULL,
 CONSTRAINT [PK_MATHANG] PRIMARY KEY CLUSTERED 
(
	[MaMatHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHIEUTHUTIEN]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHIEUTHUTIEN](
	[MaPhieuThu] [nvarchar](50) NOT NULL,
	[MaDaiLy] [nvarchar](50) NOT NULL,
	[DienThoai] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[NgayThuTien] [date] NOT NULL,
	[SoTienThu] [decimal](18, 0) NOT NULL,
 CONSTRAINT [PK_PHIEUTHUTIEN] PRIMARY KEY CLUSTERED 
(
	[MaPhieuThu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHIEUXUATHANG]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHIEUXUATHANG](
	[MaPhieuXuat] [nvarchar](50) NOT NULL,
	[MaDaiLy] [nvarchar](50) NOT NULL,
	[TongTien] [decimal](18, 0) NULL,
	[NgayLapPhieu] [date] NOT NULL,
 CONSTRAINT [PK_PHIEUXUATHANG] PRIMARY KEY CLUSTERED 
(
	[MaPhieuXuat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TOCHUCDAILY]    Script Date: 17/08/2021 3:15:49 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TOCHUCDAILY](
	[SoLoaiDaiLy] [nvarchar](50) NULL,
	[SoDaiLyToiDa] [nvarchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[CHITIETXUATHANG] ([MaPhieuXuat], [MaMatHang], [DonViTinh], [SoLuong], [DonGia], [ThanhTien]) VALUES (N'X001', N'MH001', N'Chiếc', N'8', CAST(10000 AS Numeric(18, 0)), N'80000')
INSERT [dbo].[CHITIETXUATHANG] ([MaPhieuXuat], [MaMatHang], [DonViTinh], [SoLuong], [DonGia], [ThanhTien]) VALUES (N'X002', N'MH002', N'Chiec', N'3', CAST(8000000 AS Numeric(18, 0)), N'24000000')
INSERT [dbo].[CHITIETXUATHANG] ([MaPhieuXuat], [MaMatHang], [DonViTinh], [SoLuong], [DonGia], [ThanhTien]) VALUES (N'X003', N'MH003', N'Chiec', N'3', CAST(10000000 AS Numeric(18, 0)), N'30000000')
INSERT [dbo].[CHITIETXUATHANG] ([MaPhieuXuat], [MaMatHang], [DonViTinh], [SoLuong], [DonGia], [ThanhTien]) VALUES (N'X004', N'MH001', N'Hop', N'8', CAST(10000 AS Numeric(18, 0)), N'80000')
INSERT [dbo].[CHITIETXUATHANG] ([MaPhieuXuat], [MaMatHang], [DonViTinh], [SoLuong], [DonGia], [ThanhTien]) VALUES (N'X005', N'MH002', N'Chiec', N'20', CAST(8000000 AS Numeric(18, 0)), N'160000000')
INSERT [dbo].[CHITIETXUATHANG] ([MaPhieuXuat], [MaMatHang], [DonViTinh], [SoLuong], [DonGia], [ThanhTien]) VALUES (N'X005', N'MH003', N'chiec', N'4', CAST(10000000 AS Numeric(18, 0)), N'40000000')
INSERT [dbo].[CHITIETXUATHANG] ([MaPhieuXuat], [MaMatHang], [DonViTinh], [SoLuong], [DonGia], [ThanhTien]) VALUES (N'X006', N'MH003', N'chiec', N'8', CAST(10000000 AS Numeric(18, 0)), N'80000000')
INSERT [dbo].[CHITIETXUATHANG] ([MaPhieuXuat], [MaMatHang], [DonViTinh], [SoLuong], [DonGia], [ThanhTien]) VALUES (N'X006', N'MH004', N'chiec', N'8', CAST(100000 AS Numeric(18, 0)), N'800000')
GO
INSERT [dbo].[CONGNO] ([MaDaiLy], [thang], [NoDau], [PhatSinh], [NoCuoi]) VALUES (N'D02', N'01', N'50000', N'100000', N'150000')
INSERT [dbo].[CONGNO] ([MaDaiLy], [thang], [NoDau], [PhatSinh], [NoCuoi]) VALUES (N'D02', N'04', N'50000', N'100000', N'150000')
INSERT [dbo].[CONGNO] ([MaDaiLy], [thang], [NoDau], [PhatSinh], [NoCuoi]) VALUES (N'D03', N'01', N'34000', N'100000', N'134000')
INSERT [dbo].[CONGNO] ([MaDaiLy], [thang], [NoDau], [PhatSinh], [NoCuoi]) VALUES (N'D03', N'02', N'34000', N'100000', N'134000')
INSERT [dbo].[CONGNO] ([MaDaiLy], [thang], [NoDau], [PhatSinh], [NoCuoi]) VALUES (N'D04', N'02', N'12000', N'100000', N'112000')
INSERT [dbo].[CONGNO] ([MaDaiLy], [thang], [NoDau], [PhatSinh], [NoCuoi]) VALUES (N'D04', N'04', N'12000', N'100000', N'112000')
INSERT [dbo].[CONGNO] ([MaDaiLy], [thang], [NoDau], [PhatSinh], [NoCuoi]) VALUES (N'D06', N'02', N'30000', N'100000', N'130000')
GO
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D02', N'Đai Ly B', N'1', N'20-Van Quan', N'08', N'0433828383', N'gjh@gmail.com', CAST(N'2021-04-06' AS Date), CAST(50000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D03', N'Đai Ly C', N'1', N'20-Van Quan ', N'10', N'0482323723', N'shas@gmail.com', CAST(N'2021-04-03' AS Date), CAST(34000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D04', N'Đai Ly D', N'1', N'40-Nguyen Chi Thanh', N'15', N'0328382832', N'eee@gmail.com', CAST(N'2021-01-11' AS Date), CAST(12000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D05', N'Đai Ly E', N'1', N'40-Nguyen Chi Thanh', N'16', N'0253632532', N'euq@gmail.com', CAST(N'2021-02-02' AS Date), CAST(11000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D06', N'Đai Ly F', N'2', N'123', N'17', N'0232918199', N'ddd@gmail.com', CAST(N'2021-03-02' AS Date), CAST(30000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D07', N'Đai Ly G', N'2', N'11', N'17', N'0322321211', N'sas@gmail.com', CAST(N'2021-03-03' AS Date), CAST(24000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D08', N'Đai Ly H', N'2', N'112', N'18', N'0348328321', N'dau@gmail.com', CAST(N'2021-03-21' AS Date), CAST(10000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D09', N'Đai Ly I', N'2', N'231', N'18', N'0212121211', N'fff@gmail.com', CAST(N'2021-03-01' AS Date), CAST(35000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D10', N'Đai Ly J', N'3', N'44', N'19', N'0331212121', N'dai@gmail.com', CAST(N'2021-02-02' AS Date), CAST(23000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D11', N'Đai Ly AB', N'3', N'321', N'19', N'0332832111', N'dss@gmail.com', CAST(N'2021-01-23' AS Date), CAST(29000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D12', N'Đai ly fshsr', N'3', N'223', N'20', N'0323214531', N'rye@gmail.com', CAST(N'2021-02-23' AS Date), CAST(33000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D13', N'Đai ly dfghsdh', N'3', N'100', N'01', N'0329119123', N'fia@gmail.com', CAST(N'2021-03-04' AS Date), CAST(12000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D14', N'Đai Ly dfszgder', N'3', N'234', N'01', N'0987654321', N'2d@gmail.com', CAST(N'2021-04-04' AS Date), CAST(22000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D15', N'Đai Ly An Nam', N'4', N'12', N'02', N'0334578290', N'3de@gmai.com', CAST(N'2021-02-06' AS Date), CAST(17000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D16', N'Đai ly 5865', N'4', N'19', N'02', N'0333183833', N'2v1@gmail.com', CAST(N'2021-03-05' AS Date), CAST(20000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D17', N'Đai Ly 155', N'4', N'333', N'03', N'0928375611', N'swj@gmail.com', CAST(N'2021-02-05' AS Date), CAST(36000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D18', N'Đai Ly 252', N'4', N'145', N'04', N'0384818381', N'ook@gmail.com', CAST(N'2021-02-07' AS Date), CAST(10000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D19', N'Đai Ly 554', N'5', N'2', N'04', N'0987656789', N'wqqw@gmail.com', CAST(N'2021-01-31' AS Date), CAST(12000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D20', N'Đai Ly Van Toan', N'5', N'31', N'05', N'0492391990', N'dqo@gmail.com', CAST(N'2021-02-02' AS Date), CAST(20000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D21', N'đai ly degse', N'5', N'23', N'06', N'0323192912', N'fjk@gmail.com', CAST(N'2021-09-01' AS Date), CAST(15000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D22', N'dai ly geghrs', N'5', N'293', N'06', N'0989123812', N'rti@gmail.com', CAST(N'2021-02-20' AS Date), CAST(40000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D23', N'đai ly 435436w', N'1', N'124', N'07', N'0918372773', N'e1u@gmail.com', CAST(N'2021-01-01' AS Date), CAST(10000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D24', N'đai ly an tam', N'1', N'324', N'07', N'0319319192', N'djo@gmail.com', CAST(N'2021-09-03' AS Date), CAST(23000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D25', N'đai ly phuc dat', N'2', N'139', N'08', N'0333019384', N'dii@gmail.com', CAST(N'2021-01-01' AS Date), CAST(13000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D26', N'đai ly hy cuong', N'2', N'343', N'08', N'0218281283', N'djk@gmail.com', CAST(N'2021-01-03' AS Date), CAST(24000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D27', N'đai ly nam toan', N'3', N'021', N'09', N'0294294822', N'uwu@gmail,com', CAST(N'2021-02-01' AS Date), CAST(10000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D28', N'đai ly phuc loi', N'3', N'098', N'10', N'0392919294', N'ei@gmail.com', CAST(N'2021-02-01' AS Date), CAST(20000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D29', N'đai ly toan gia', N'4', N'381', N'10', N'0281282819', N'eu11@gmail.com', CAST(N'2021-01-03' AS Date), CAST(50000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D30', N'đai ly toan lac', N'4', N'433', N'11', N'0192192294', N'dqo@gmail.com', CAST(N'2021-10-01' AS Date), CAST(19000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D31', N'đai ly an gia', N'5', N'192', N'11', N'0333838189', N'doii@gmail.com', CAST(N'2021-01-09' AS Date), CAST(38000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D32', N'đai ly son hip', N'5', N'101', N'12', N'0238382382', N'djqo@gmail.com', CAST(N'2021-01-01' AS Date), CAST(13000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D33', N'đai ly thuy gia', N'1', N'121', N'12', N'0381281822', N'hello@gmail.com', CAST(N'2021-12-01' AS Date), CAST(20000 AS Decimal(18, 0)))
INSERT [dbo].[DAILY] ([MaDaiLy], [TenDaiLy], [Loai], [DiaChi], [Quan], [DienThoai], [Email], [NgayTiepNhan], [TienNo]) VALUES (N'D34', N'đai ly 365', N'2', N'212', N'13', N'0482482488', N'did@gmail.com', CAST(N'2021-01-03' AS Date), CAST(45000 AS Decimal(18, 0)))
GO
INSERT [dbo].[DANGNHAP] ([ID], [username], [password]) VALUES (1, N'admin', N'92BD468C6EEC0C22694440E816849A382017A7E53EAA7055F589666473EE0F4D')
GO
INSERT [dbo].[DOANHSO] ([MaDaiLy], [Thang], [SoPhieuXuat], [TongTriGia], [TiLe]) VALUES (N'D02', N'05', N'1', N'80000', NULL)
INSERT [dbo].[DOANHSO] ([MaDaiLy], [Thang], [SoPhieuXuat], [TongTriGia], [TiLe]) VALUES (N'D03', N'01', N'1', N'120000000', NULL)
INSERT [dbo].[DOANHSO] ([MaDaiLy], [Thang], [SoPhieuXuat], [TongTriGia], [TiLe]) VALUES (N'D03', N'02', N'1', N'80000', NULL)
INSERT [dbo].[DOANHSO] ([MaDaiLy], [Thang], [SoPhieuXuat], [TongTriGia], [TiLe]) VALUES (N'D04', N'02', N'1', N'120000000', NULL)
GO
INSERT [dbo].[LOAIDAILY] ([Loai], [TenLoai], [NoToiDa]) VALUES (N'1', N'đồ gia dụng', 20000.0000)
INSERT [dbo].[LOAIDAILY] ([Loai], [TenLoai], [NoToiDa]) VALUES (N'2', N'đồ nhựa', 50000.0000)
INSERT [dbo].[LOAIDAILY] ([Loai], [TenLoai], [NoToiDa]) VALUES (N'3', N'đồ điện', 100000.0000)
INSERT [dbo].[LOAIDAILY] ([Loai], [TenLoai], [NoToiDa]) VALUES (N'4', N'thực phẩm', 200000.0000)
INSERT [dbo].[LOAIDAILY] ([Loai], [TenLoai], [NoToiDa]) VALUES (N'5', N'văn phòng phẩm', 500000.0000)
GO
INSERT [dbo].[MATHANG] ([MaMatHang], [TenMatHang], [DonGia]) VALUES (N'MH001', N'Bánh Oreo', CAST(10000 AS Decimal(20, 0)))
INSERT [dbo].[MATHANG] ([MaMatHang], [TenMatHang], [DonGia]) VALUES (N'MH002', N'TV', CAST(8000000 AS Decimal(20, 0)))
INSERT [dbo].[MATHANG] ([MaMatHang], [TenMatHang], [DonGia]) VALUES (N'MH003', N'Máy giặt', CAST(10000000 AS Decimal(20, 0)))
INSERT [dbo].[MATHANG] ([MaMatHang], [TenMatHang], [DonGia]) VALUES (N'MH004', N'Bóng đèn', CAST(100000 AS Decimal(20, 0)))
INSERT [dbo].[MATHANG] ([MaMatHang], [TenMatHang], [DonGia]) VALUES (N'MH005', N'Tủ lạnh', CAST(7000000 AS Decimal(20, 0)))
GO
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T002', N'D03', N'0482323723', N'20-Van Quan ', N'shas@gmail.com', CAST(N'2021-12-02' AS Date), CAST(40000 AS Decimal(18, 0)))
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T003', N'D03', N'0482323723', N'20-Van Quan ', N'shas@gmail.com', CAST(N'2021-03-06' AS Date), CAST(34000 AS Decimal(18, 0)))
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T004', N'D04', N'0328382832', N'40-Nguyen Chi Thanh', N'eee@gmail.com', CAST(N'2021-04-03' AS Date), CAST(12000 AS Decimal(18, 0)))
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T005', N'D05', N'0253632532', N'40-Nguyen Chi Thanh', N'euq@gmail.com', CAST(N'2021-08-06' AS Date), CAST(11000 AS Decimal(18, 0)))
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T006', N'D06', N'0232918199', N'123', N'ddd@gmail.com', CAST(N'2021-05-03' AS Date), CAST(30000 AS Decimal(18, 0)))
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T007', N'D07', N'0322321211', N'11', N'sas@gmail.com', CAST(N'2021-04-05' AS Date), CAST(24000 AS Decimal(18, 0)))
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T008', N'D08', N'0348328321', N'112', N'dau@gmail.com', CAST(N'2021-03-04' AS Date), CAST(10000 AS Decimal(18, 0)))
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T009', N'D09', N'0212121211', N'231', N'fff@gmail.com', CAST(N'2021-03-30' AS Date), CAST(35000 AS Decimal(18, 0)))
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T010', N'D10', N'0331212121', N'44', N'dai@gmail.com', CAST(N'2021-02-02' AS Date), CAST(23000 AS Decimal(18, 0)))
INSERT [dbo].[PHIEUTHUTIEN] ([MaPhieuThu], [MaDaiLy], [DienThoai], [DiaChi], [Email], [NgayThuTien], [SoTienThu]) VALUES (N'T011', N'D10', N'0331212121', N'44', N'dai@gmail.com', CAST(N'2021-06-08' AS Date), CAST(20000 AS Decimal(18, 0)))
GO
INSERT [dbo].[PHIEUXUATHANG] ([MaPhieuXuat], [MaDaiLy], [TongTien], [NgayLapPhieu]) VALUES (N'X001', N'D02', CAST(80000 AS Decimal(18, 0)), CAST(N'2021-05-02' AS Date))
INSERT [dbo].[PHIEUXUATHANG] ([MaPhieuXuat], [MaDaiLy], [TongTien], [NgayLapPhieu]) VALUES (N'X002', N'D03', CAST(24000000 AS Decimal(18, 0)), CAST(N'2021-01-09' AS Date))
INSERT [dbo].[PHIEUXUATHANG] ([MaPhieuXuat], [MaDaiLy], [TongTien], [NgayLapPhieu]) VALUES (N'X003', N'D04', CAST(30000000 AS Decimal(18, 0)), CAST(N'2021-03-02' AS Date))
INSERT [dbo].[PHIEUXUATHANG] ([MaPhieuXuat], [MaDaiLy], [TongTien], [NgayLapPhieu]) VALUES (N'X004', N'D03', CAST(80000 AS Decimal(18, 0)), CAST(N'2021-02-03' AS Date))
INSERT [dbo].[PHIEUXUATHANG] ([MaPhieuXuat], [MaDaiLy], [TongTien], [NgayLapPhieu]) VALUES (N'X005', N'D04', CAST(200000000 AS Decimal(18, 0)), CAST(N'2021-02-01' AS Date))
INSERT [dbo].[PHIEUXUATHANG] ([MaPhieuXuat], [MaDaiLy], [TongTien], [NgayLapPhieu]) VALUES (N'X006', N'D25', CAST(80800000 AS Decimal(18, 0)), CAST(N'2021-06-04' AS Date))
GO
INSERT [dbo].[TOCHUCDAILY] ([SoLoaiDaiLy], [SoDaiLyToiDa]) VALUES (N'7', N'8')
GO
ALTER TABLE [dbo].[CHITIETXUATHANG]  WITH CHECK ADD  CONSTRAINT [FK_CHITIETXUATHANG_MATHANG] FOREIGN KEY([MaMatHang])
REFERENCES [dbo].[MATHANG] ([MaMatHang])
GO
ALTER TABLE [dbo].[CHITIETXUATHANG] CHECK CONSTRAINT [FK_CHITIETXUATHANG_MATHANG]
GO
ALTER TABLE [dbo].[CHITIETXUATHANG]  WITH CHECK ADD  CONSTRAINT [FK_CHITIETXUATHANG_PHIEUXUATHANG] FOREIGN KEY([MaPhieuXuat])
REFERENCES [dbo].[PHIEUXUATHANG] ([MaPhieuXuat])
GO
ALTER TABLE [dbo].[CHITIETXUATHANG] CHECK CONSTRAINT [FK_CHITIETXUATHANG_PHIEUXUATHANG]
GO
ALTER TABLE [dbo].[CONGNO]  WITH CHECK ADD  CONSTRAINT [FK_CONGNO_DAILY] FOREIGN KEY([MaDaiLy])
REFERENCES [dbo].[DAILY] ([MaDaiLy])
GO
ALTER TABLE [dbo].[CONGNO] CHECK CONSTRAINT [FK_CONGNO_DAILY]
GO
ALTER TABLE [dbo].[DAILY]  WITH CHECK ADD  CONSTRAINT [FK_DAILY_LOAIDAILY] FOREIGN KEY([Loai])
REFERENCES [dbo].[LOAIDAILY] ([Loai])
GO
ALTER TABLE [dbo].[DAILY] CHECK CONSTRAINT [FK_DAILY_LOAIDAILY]
GO
ALTER TABLE [dbo].[DOANHSO]  WITH CHECK ADD  CONSTRAINT [FK_DOANHSO_DAILY] FOREIGN KEY([MaDaiLy])
REFERENCES [dbo].[DAILY] ([MaDaiLy])
GO
ALTER TABLE [dbo].[DOANHSO] CHECK CONSTRAINT [FK_DOANHSO_DAILY]
GO
ALTER TABLE [dbo].[PHIEUTHUTIEN]  WITH CHECK ADD  CONSTRAINT [FK_PHIEUTHUTIEN_DAILY] FOREIGN KEY([MaDaiLy])
REFERENCES [dbo].[DAILY] ([MaDaiLy])
GO
ALTER TABLE [dbo].[PHIEUTHUTIEN] CHECK CONSTRAINT [FK_PHIEUTHUTIEN_DAILY]
GO
ALTER TABLE [dbo].[PHIEUXUATHANG]  WITH CHECK ADD  CONSTRAINT [FK_PHIEUXUATHANG_DAILY] FOREIGN KEY([MaDaiLy])
REFERENCES [dbo].[DAILY] ([MaDaiLy])
GO
ALTER TABLE [dbo].[PHIEUXUATHANG] CHECK CONSTRAINT [FK_PHIEUXUATHANG_DAILY]
GO
/****** Object:  Trigger [dbo].[PasswordHash]    Script Date: 17/08/2021 3:15:50 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create trigger [dbo].[PasswordHash] on [dbo].[DANGNHAP]
for insert, update
as
begin
	if UPDATE ([password])
	begin 
		declare @id int
		declare @password varchar(256)
		select @password = [password], @id = ID from inserted
		set @password = [dbo].[func_EncryptPassword] (@password)
		update [DANGNHAP] set [password] = @password where ID = @id
	end
end

---hash password
GO
ALTER TABLE [dbo].[DANGNHAP] ENABLE TRIGGER [PasswordHash]
GO
