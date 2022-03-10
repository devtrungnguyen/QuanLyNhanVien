package ProjectQLNV;
import java.util.ArrayList;
import java.util.Scanner;

public class code {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> listNV = new ArrayList<>();
        ArrayList<QuanLy> listQL = new ArrayList<>();
        System.out.println("0. Thoat");
        System.out.println("1. Them Quan Ly");
        System.out.println("2. Them nhan vien");
        System.out.println("3. Hien thi danh sach quan ly");
        System.out.println("4. Hien thi danh sach nhan vien");
        int luachon = 5;

        while (luachon != 0) {
            System.out.println("Moi ban nhap lua chon: ");
            luachon = Integer.parseInt(scanner.nextLine());
            String name = "";
            switch (luachon) {
                case 1:
                    System.out.println("Ten quan ly: ");
                    name = scanner.nextLine();
                    QuanLy QL = new QuanLy(name);
                    listQL.add(QL);
                    break;

                case 2:
                    System.out.println("Ten nhan vien: ");
                    name = scanner.nextLine();
                    NhanVien NV = new NhanVien(name);
                    listNV.add(NV);
                    break;

                case 3:
                    if (listQL.size() == 0) {
                        System.out.println("Chua co quan ly");
                    }
                    else {
                        listQL.forEach((item) -> {
                            System.out.println(item.getName());
                        });
                    }
                    break;

                case 4:
                    if (listNV.size() ==0) {
                        System.out.println("Chua co nhan vien");
                    }
                    else {
                        listNV.forEach((item) -> {
                            System.out.println(item.getName());
                        });
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
