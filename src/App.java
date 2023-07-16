import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin người:");
        Nguoi nguoi = new Nguoi();
        nguoi.nhapThongTin();
        System.out.println("Thông tin người:");
        nguoi.xuatThongTin();

        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        NhanVien[] danhSachNhanVien = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            danhSachNhanVien[i] = new NhanVien();
            danhSachNhanVien[i].nhapThongTin();
        }

        System.out.println("Thông tin các nhân viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ":");
            danhSachNhanVien[i].xuatThongTin();
            System.out.println("Lương: " + danhSachNhanVien[i].tinhLuong());
            System.out.println();
        }

        NhanVien.sapXepGiamDan(danhSachNhanVien);

        System.out.println("Danh sách các nhân viên sau khi sắp xếp theo hệ số lương giảm dần:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ":");
            danhSachNhanVien[i].xuatThongTin();
            System.out.println("Lương: " + danhSachNhanVien[i].tinhLuong());
            System.out.println();
        }
    }
}
