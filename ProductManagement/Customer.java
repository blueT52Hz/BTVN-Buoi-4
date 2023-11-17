package ProductManagement;

import java.util.List;
import java.util.Scanner;
import Product.*;
import ProductManagement.ProductManagement;

public class Customer extends ProductManagement {
    public static void menuCustomer() {
        System.out.println("|---------------------------------|");
        System.out.println("|  Chức năng của khách:           |");
        System.out.println("|  0. Thoát.                      |");
        System.out.println("|  1. Tìm kiếm sản phẩm.          |");
        System.out.println("|  2. Xem danh sách sản phẩm.     |");
        System.out.println("|---------------------------------|");
    }
    public static void chooseModeCustomer() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            menuCustomer();
            System.out.print("Chọn chức năng của khách: ");
            int mode = Integer.valueOf(sc.nextLine());
            if(mode==0) {
                System.out.println("Thoát tài khoản khách.");
                System.out.println("----------");
                break;
            }
            if(mode==1) {
                System.out.println("Chức năng tìm kiếm sản phầm.");
                System.out.print("Nhập thông tin sản phẩm: ");
                String info = sc.nextLine();
                System.out.println("---------");
                List<Product> productsFound = findProduct(info.toLowerCase());
                if(productsFound.isEmpty()) System.out.println("Không tìm thấy sản phầm có thông tin trên.\n----------");
                else showProduct(productsFound);
            }
            if(mode==2) {
                System.out.println("Xem danh sách sản phẩm.");
                System.out.println("----------");
                showProduct(productList);
            }
        }
    }

}
