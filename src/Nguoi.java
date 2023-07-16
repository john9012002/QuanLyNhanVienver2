import java.util.Scanner;

public class Nguoi {
    private String maDinhDanh;
    private String hoTen;

    public Nguoi() {
    }

    public Nguoi(String maDinhDanh, String hoTen) {
        this.maDinhDanh = maDinhDanh;
        this.hoTen = hoTen;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã định danh: ");
        maDinhDanh = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("Mã định danh: " + maDinhDanh);
        System.out.println("Họ tên: " + hoTen);
    }

    public String getMaDinhDanh() {
        return maDinhDanh;
    }

    public void setMaDinhDanh(String maDinhDanh) {
        this.maDinhDanh = maDinhDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}