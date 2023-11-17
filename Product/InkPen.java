package Product;

import java.util.Scanner;

public class InkPen extends Pen {
    private String typeOfInk, smoothly;
    public InkPen(){}
    public InkPen(String name, String price, String brand, String color, String material, String typeOfInk, String smoothly) {
        super(name, price, brand, color, material);
        this.typeOfInk = typeOfInk;
        this.smoothly = smoothly;
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getTypeOfInk().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getSmoothly().length());
    }
    public String getTypeOfInk() {
        return "Loại mực: " + typeOfInk;
    }
    public String getSmoothly() {
        return "Độ mịn: " + smoothly;
    }
    public boolean compare(String info) {
        return getId().contains(info) || getName().toLowerCase().contains(info) || (getPrice()+"").equals(info) || getBrand().toLowerCase().contains(info) || getColor().toLowerCase().contains(info) || getMaterial().toLowerCase().contains(info) || getTypeOfInk().contains(info) || getSmoothly().contains(info);
    }
    public void setTypeOfInk() {
        System.out.print("Nhập loại mực: ");
        this.typeOfInk = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getTypeOfInk().length());
    }
    public void setSmoothly() {
        System.out.print("Nhập độ mịn: ");
        this.smoothly = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getSmoothly().length());

    }
    public void editInformation() {
        super.editInformation();
        setSmoothly();
        setTypeOfInk();
    }
    public static InkPen inkPenFromScanner() {
        InkPen inkPen = new InkPen();
        inkPen.editInformation();
        return inkPen;
    }
    public void showMode1(){
        int[] l = new int[] {Product.maxLenOfId+5, Product.maxLenOfName+5, Product.maxLenOfPrice+5, Product.maxLenOfBrand+5, Product.maxLenOfMoreInformation+5};
        String hyphenLine = "-".repeat(l[0]+l[1]+l[2]+l[3]+l[4]+6);
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                getId(), getName(), getPrice(), getBrand(), getColor()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getMaterial()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getTypeOfInk()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getSmoothly()));
        System.out.println(hyphenLine);
    }
    public void showMode2() {
        super.showMode2();
        System.out.println("Loại mực: " + typeOfInk);
        System.out.println("Độ mịn: " + smoothly);
        System.out.println("---------");
    }
}
