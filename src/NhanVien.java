import java.util.Arrays;
import java.util.Scanner;

public class NhanVien extends Nguoi {
    private int namSinh;
    private float heSoLuong;
    private static float tienPhuCap = 500000;

    public NhanVien() {
    }

    public NhanVien(String maDinhDanh, String hoTen, int namSinh, float heSoLuong) {
        super(maDinhDanh, hoTen);
        this.namSinh = namSinh;
        this.heSoLuong = heSoLuong;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm sinh: ");
        namSinh = scanner.nextInt();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = scanner.nextFloat();
    }

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Hệ số lương: " + heSoLuong);
    }

    public float tinhLuong() {
        return heSoLuong * 1550 + tienPhuCap;
    }

    public static void sapXepGiamDan(NhanVien[] danhSachNhanVien) {
        Arrays.sort(danhSachNhanVien, (nv1, nv2) -> {
            if (nv1.heSoLuong < nv2.heSoLuong) {
                return 1;
            } else if (nv1.heSoLuong > nv2.heSoLuong) {
                return -1;
            }
            return 0;
        });
    }
}
