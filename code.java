package ProjectQLNV;
import java.util.ArrayList;
import java.util.Scanner;

public class code {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<STAFF> liststaff = new ArrayList<>();
        ArrayList<MANAGER> listmanager = new ArrayList<>();
        int option = 5;

        while (option != 0) {
            System.out.println("0. Thoat");
            System.out.println("1. Them Quan Ly");
            System.out.println("2. Them nhan vien");
            System.out.println("3. Hien thi danh sach quan ly");
            System.out.println("4. Hien thi danh sach nhan vien");
            System.out.println("Moi ban nhap lua chon: ");
            option = Integer.parseInt(scanner.nextLine());
            String name = "";
            switch (option) {
                case 1:
                    System.out.println("Ten quan ly: ");
                    name = scanner.nextLine();
                    MANAGER manager = new MANAGER(name);
                    listmanager.add(manager);
                    break;

                case 2:
                    System.out.println("Ten nhan vien: ");
                    name = scanner.nextLine();
                    STAFF staff = new STAFF(name);
                    liststaff.add(staff);
                    break;

                case 3:
                    if (listmanager.size() == 0) {
                        System.out.println("Chua co quan ly");
                    }
                    else {
                        listmanager.forEach((item) -> {
                            System.out.println(item.getName());
                        });
                    }
                    break;

                case 4:
                    if (liststaff.size() == 0) {
                        System.out.println("Chua co nhan vien");
                    }
                    else {
                        liststaff.forEach((item) -> {
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
