package ss12JavaCollectionFramework.BaiTap.LuyenTapSuDungArraylistLinkedlistTrongJavaCollectionFramework;

import java.util.Comparator;

public class ProductList implements Comparator {
    private int id = 0;
    private String name;
    private int price;
    private int amount;
    private String production;

    public ProductList() {
    }

    public ProductList(int id, String name, int price, int amount, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.production = production;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Sản phẩm có mã là: " + id +
                " ---Tên sản phẩm là: " + name +
                " ---Giá là: " + price + "TRIỆU VND" +
                " ---Số lượng là: " + amount + "Cái" +
                "--- Nhà sản xuất là: " + production;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}