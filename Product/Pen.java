package Product;

public class Pen extends Product {
    private String color, material;
    public Pen(){}
    public Pen(String name, String price, String brand, String color, String material) {
        super(name, price, brand);
        this.color = color;
        this.material = material;
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getColor().length());
        maxLenOfMoreInformation = Math.max(maxLenOfMoreInformation, getMaterial().length());
    }
    public String getColor() {
        return "Màu sắc: " +  color;
    }
    public String getMaterial() {
        return "Chất liệu: " + material;
    }
    public boolean compare(String info) {
        return getName().toLowerCase().contains(info) || (getPrice()+"").equals(info) || getBrand().toLowerCase().contains(info) || getColor().toLowerCase().contains(info) || getMaterial().toLowerCase().contains(info);
    }
    public void setColor() {
        System.out.print("Nhập màu sắc: ");
        this.color = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getColor().length());
    }
    public void setMaterial() {
        System.out.print("Nhập chất liệu: ");
        this.material = sc.nextLine();
        maxLenOfMoreInformation=Math.max(maxLenOfMoreInformation, getMaterial().length());
    }
    public void editInformation() {
        super.editInformation();
        setColor();
        setMaterial();
    }
    public void showMode1(){}
    public void showMode2() {
        super.showMode2();
        System.out.println("Màu sắc: " + color);
        System.out.println("Chất liệu: " + material);
    }
}
