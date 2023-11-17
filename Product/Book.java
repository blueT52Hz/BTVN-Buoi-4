package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Product {
    private String type, author, publishCompany, publishDate, language;
    public Book() {
        super();
    }
    public Book(String name, String price, String brand, String type, String author, String publishCompany, String publishDate, String language) {
        super(name, price, brand);
        this.type = type;
        this.author = author;
        this.publishCompany = publishCompany;
        this.publishDate = publishDate;
        this.language = language;
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getType().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getAuthor().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getPublishCompany().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getPublishDate().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getLanguage().length());
    }

    public String getType() {
        return "Thể loại: " + type;
    }
    public String getAuthor() {
        return "Tác giả: " + author;
    }
    public String getPublishCompany() {
        return "Nhà xuất bản: " + publishCompany;
    }
    public String getPublishDate() {
        return "Năm xuất bản: " + publishDate;
    }
    public String getLanguage() {
        return "Ngôn ngữ: " + language;
    }
    public boolean compare(String info) {
        return getId().contains(info) || getName().toLowerCase().contains(info) || (getPrice()+"").equals(info) || getBrand().toLowerCase().contains(info) || getType().toLowerCase().contains(info) || getAuthor().toLowerCase().contains(info) || getPublishDate().toLowerCase().contains(info) || getPublishCompany().toLowerCase().contains(info) || getLanguage().contains(info);
    }
    public void setType() {
        System.out.print("Nhập thể loại: ");
        this.type = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getType().length());
    }
    public void setAuthor() {
        System.out.print("Nhập tác giả: ");
        this.author = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getAuthor().length());
    }
    public void setPublishCompany() {
        System.out.print("Nhập nhà xuất bản: ");
        this.publishCompany = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getPublishCompany().length());
    }
    public void setPublishDate() {
        System.out.print("Nhập năm xuất bản: ");
        this.publishDate = sc.nextLine();
    }
    public void setLanguage() {
        System.out.print("Nhập ngôn ngữ: ");
        this.language = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getLanguage().length());
    }
    public void editInformation() {
        super.editInformation();
        setType();
        setAuthor();
        setPublishCompany();
        setPublishDate();
        setLanguage();
    }
    public static Book bookFromScanner() {
        Book tmp = new Book();
        tmp.editInformation();
        return tmp;
    }
    public void showMode1() {
        int[] l = new int[] {Product.maxLenOfId+5, Product.maxLenOfName+5, Product.maxLenOfPrice+5, Product.maxLenOfBrand+5, Product.maxLenOfMoreInformation+5};
        String hyphenLine = "-".repeat(l[0]+l[1]+l[2]+l[3]+l[4]+6);
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                         getId(), getName(), getPrice(), getBrand(), getType()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                        "", "", "", "", getAuthor()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getPublishCompany()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getPublishDate()));
        System.out.printf(String.format("|%-"+l[0]+ "s|%-"+l[1]+ "s|%-"+l[2]+ "s|%-"+l[3]+ "s|%-"+l[4]+"s|\n",
                "", "", "", "", getLanguage()));
        System.out.println(hyphenLine);
    }
    public void showMode2() {
        super.showMode2();
        System.out.println("Thể loại: " + type);
        System.out.println("Tác giả: " + author);
        System.out.println("Nhà xuất bản: " + publishCompany);
        System.out.println("Năm xuất bản: " + publishDate);
        System.out.println("Ngôn ngữ: " + language);
        System.out.println("---------");
    }
}