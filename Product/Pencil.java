package Product;

import java.util.Scanner;

public class Pencil extends Pen {
    private String stiffness;
    public Pencil() {}
    public Pencil(String name, String price, String brand, String color, String material, String stiffness) {
        super(name, price, brand, color, material);
        this.stiffness = stiffness;
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getStiffness().length());
    }
    public String getStiffness() {
        return "Độ cứng: " + stiffness;
    }
    public boolean compare(String info) {
        return getId().contains(info) || getName().toLowerCase().contains(info) || (getPrice()+"").equals(info) || getBrand().toLowerCase().contains(info) || getColor().toLowerCase().contains(info) || getMaterial().toLowerCase().contains(info) || getStiffness().toLowerCase().contains(info);
    }
    public void setStiffness() {
        System.out.print("Nhập độ cứng: ");
        this.stiffness = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getStiffness().length());
    }
    public void editInformation() {
        super.editInformation();
        setStiffness();
    }
    public static Pencil pencilFromScanner() {
        Pencil pencil = new Pencil();
        pencil.editInformation();
        return pencil;
    }
    public void showMode1(){
        int[] l = new int[] {Product.maxLenOfId+5, Product.maxLenOfName+5, Product.maxLenOfPrice+5, Product.maxLenOfBrand+5, Product.maxLenOfMoreInformation+5};
        String hyphenLine = "-".repeat(l[0]+l[1]+l[2]+l[3]+l[4]+6);
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                getId(), getName(), getPrice(), getBrand(), getColor()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getMaterial()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getStiffness()));
        System.out.println(hyphenLine);
    }
    public void showMode2() {
        super.showMode2();
        System.out.println("Độ cứng: " + stiffness);
        System.out.println("---------");
    }
}
