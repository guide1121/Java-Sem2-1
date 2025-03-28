<h1 align="center">🛍️ MiniShop - ระบบร้านค้าขนาดเล็ก</h1>

## 📋 รายละเอียด

โปรเจ็กต์นี้เป็นระบบร้านค้าขนาดเล็กที่พัฒนาด้วย Java สามารถจัดการ:
- สินค้าและสต็อก
- ตะกร้าสินค้า
- ข้อมูลลูกค้า
- คำสั่งซื้อและยอดขาย

## 🚀 ความสามารถหลัก

- [ ] จัดการข้อมูลสินค้า (ชื่อ, ราคา, สต็อก)
- [ ] จัดการข้อมูลลูกค้าและประวัติการสั่งซื้อ
- [ ] ระบบตะกร้าสินค้า
- [ ] คำนวณราคาอัตโนมัติ
- [ ] ปรับสต็อกอัตโนมัติ
- [ ] แสดงรายงานยอดขาย

## 🏗️ โครงสร้างโปรเจ็กต์

```
src/
├── Product.java     # จัดการข้อมูลสินค้า
├── Customer.java    # จัดการข้อมูลลูกค้า
├── Cart.java        # ระบบตะกร้าสินค้า
├── Order.java       # จัดการคำสั่งซื้อ
├── Store.java       # จัดการร้านค้า
└── Main.java        # โปรแกรมหลัก
```

## 📝 รายละเอียดคลาส

### Product
- จัดเก็บข้อมูลสินค้า: รหัส, ชื่อ, ราคา, สต็อก
- ลดจำนวนสต็อกอัตโนมัติ

### Customer
- จัดเก็บข้อมูลลูกค้า: ชื่อ, เบอร์โทร
- บันทึกประวัติการสั่งซื้อ

### Cart
- เพิ่ม/ลบสินค้า
- คำนวณราคารวม
- ล้างตะกร้า

### Order
- บันทึกรายการสั่งซื้อ
- คำนวณยอดรวม

### Store
- จัดการสต็อกสินค้า
- ประมวลผลคำสั่งซื้อ
- แสดงยอดขายรวม

## 🛠️ การใช้งาน

1. สร้างสินค้าในร้าน
2. ลูกค้าเพิ่มสินค้าในตะกร้า
3. ระบบคำนวณราคา
4. ยืนยันการสั่งซื้อ
5. ระบบปรับสต็อกและบันทึกยอดขาย

## ⚙️ ข้อกำหนด

- ใช้ ArrayList/HashMap เก็บข้อมูล
- มีการตรวจสอบสต็อกก่อนขาย
- แสดงรายงานการขายได้

