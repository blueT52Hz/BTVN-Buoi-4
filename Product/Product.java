package Product;

public class Product extends Scan{
    public static int numberOfProduct=0;
    public static int maxLenOfId = 5;
    public static int maxLenOfName = "Tên sản phẩm".length();
    public static int maxLenOfPrice = "Giá bán".length();
    public static int maxLenOfBrand = "Thương hiệu".length();
    public static int maxLenOfMoreInformation = "Thông tin thêm".length();

    private String id, name, brand, price;
    public Product() {
        numberOfProduct++;
        String id = numberOfProduct+"";
        while(id.length() < 4) id = "0" + id;
        this.id=id;
    }

    public Product(String name, String price, String brand) {
        numberOfProduct++;
        String id = numberOfProduct+"";
        while(id.length() < 4) id = "0" + id;
        this.id=id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        maxLenOfName = Math.max(maxLenOfName, getName().length());
        maxLenOfBrand = Math.max(maxLenOfBrand, getBrand().length());
        maxLenOfPrice = Math.max(maxLenOfPrice, getPrice().length());
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public String getPrice() {
        return price;
    }
    public boolean compare(String info) {
        return getName().toLowerCase().contains(info) || getBrand().toLowerCase().contains(info) || price.equals(info);
    }
    public void setName() {
        System.out.print("Nhập tên sản phẩm: ");
        this.name = sc.nextLine();
        maxLenOfName = Math.max(maxLenOfName, getName().length());
    }
    public void setBrand() {
        System.out.print("Nhập thương hiệu: ");
        this.brand = sc.nextLine();
        maxLenOfBrand = Math.max(maxLenOfBrand, getBrand().length());
    }
    public void setPrice() {
        System.out.print("Nhập giá: ");
        price = sc.nextLine();
        maxLenOfPrice = Math.max(maxLenOfPrice, getPrice().length());
    }
    public void editInformation() {
        setName();
        setPrice();
        setBrand();
    }

    public void showMode1(){
        System.out.println("fhkjsdfsd");
    }

    public void showMode2() {
        System.out.println("Id: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá bán: " + price);
        System.out.println("Thương hiệu: " + brand);
    }
}
