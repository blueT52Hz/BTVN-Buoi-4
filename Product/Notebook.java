package Product;

import java.util.List;
import java.util.Scanner;

public class Notebook extends Product {
    private String numOfPage, type, colorOfcover, material, size;
    public Notebook() {
    }
    public Notebook(String name, String price, String brand, String numOfPage, String type, String colorOfcover, String material, String size) {
        super(name, price, brand);
        this.numOfPage = numOfPage;
        this.type = type;
        this.colorOfcover = colorOfcover;
        this.material = material;
        this.size = size;
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getNumOfPage().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getType().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getColorOfcover().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getMaterial().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getSize().length());
    }
    public String getNumOfPage() {
        return "Số trang: " + numOfPage;
    }
    public String getType() {
        return "Thể loại: " + type;
    }
    public String getColorOfcover() {
        return "Màu sắc bìa: " + colorOfcover;
    }
    public String getMaterial() {
        return "Chất liệu giấy: " + material;
    }
    public String getSize() {
        return "Kích cỡ: " + size;
    }
    public boolean compare(String info) {
        return getId().contains(info) || getName().toLowerCase().contains(info) || (getPrice()+"").equals(info) || getBrand().toLowerCase().contains(info) || (numOfPage+"").equals(info) || getType().toLowerCase().contains(info) || getColorOfcover().toLowerCase().contains(info) || getMaterial().toLowerCase().contains(info) || getSize().toLowerCase().contains(info);
    }
    public void setNumOfPage() {
        System.out.print("Nhập số trang: ");
        this.numOfPage = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getNumOfPage().length());
    }
    public void setType() {
        System.out.print("Nhập loại vở: ");
        this.type = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getType().length());
    }
    public void setColorOfcover() {
        System.out.print("Nhập màu bìa: ");
        this.colorOfcover = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getColorOfcover().length());
    }
    public void setMaterial() {
        System.out.print("Nhập chất liệu vở: ");
        this.material = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getMaterial().length());
    }
    public void setSize() {
        System.out.print("Nhập kích thước: ");
        this.size = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getSize().length());
    }
    public void editInformation(){
        super.editInformation();
        setType();
        setColorOfcover();
        setMaterial();
        setSize();
        setNumOfPage();
    }
    public static Notebook notebookFromScanner() {
        Notebook notebook = new Notebook();
        notebook.editInformation();
        return notebook;
    }
    public void showMode1(){
        int[] l = new int[] {Product.maxLenOfId+5, Product.maxLenOfName+5, Product.maxLenOfPrice+5, Product.maxLenOfBrand+5, Product.maxLenOfMoreInformation+5};
        String hyphenLine = "-".repeat(l[0]+l[1]+l[2]+l[3]+l[4]+6);
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                getId(), getName(), getPrice(), getBrand(), getNumOfPage()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getType()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getColorOfcover()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getMaterial()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getSize()));
        System.out.println(hyphenLine);
    }
    public void showMode2() {
        super.showMode2();
        System.out.println("Số trang: " + numOfPage);
        System.out.println("Loại vở: " + type);
        System.out.println("Màu sắc bìa: " + colorOfcover);
        System.out.println("Chất liệu giấy: " + material);
        System.out.println("Kích thước: " + size);
        System.out.println("---------");
    }

}
