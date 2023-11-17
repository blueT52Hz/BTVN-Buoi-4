package Product;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<String> title = new ArrayList<>();
    private List<Integer> width = new ArrayList<>();
    private List<List<String>> data = new ArrayList<>();
    private final int widthOffset = 5;
    private String endLine = "-".repeat(70);

    public Table() {
    }

    public Table(List<String> title) {
        this.width.clear();
        this.data.clear();
        this.title.clear();
        this.title = title;
        setTitle(title);
    }

    public void clearData(){
        data.clear();
    }

    private void setTitle(List<String> title) {
        for (int i = 0; i < title.size(); i++) {
            width.add(title.get(i).length() + widthOffset);
        }
        for (int i = 0; i < title.size(); i++) {
            fitIn(title.get(i), i);
        }
    }

    private void fitIn(String str, int index) {
        if (str.length() + this.widthOffset > width.get(index)) {
            width.set(index, str.length() + widthOffset);
        }
    }

    public void addData(List<String> data) {
        this.data.add(data);
        for (int i = 0; i < data.size(); i++) {
            fitIn(data.get(i), i);
        }
    }

    public int getDataSize() {
        return data.size();
    }
    public void printTitle() {
        for (int i = 0; i < title.size(); i++) {
            System.out.print(String.format("|%-"+width.get(i)+"s", title.get(i)));
        }
        System.out.println();
    }

    public void printEndLine() {
        System.out.println(endLine);
    }

    public void printData() {
        if (data.isEmpty()) {
            System.out.println("Không có dữ liệu");
            return;
        }
        int sum = 0;
        for (int i = 0; i < width.size(); i++) {
            sum += width.get(i);
        }
        for (int i = 0; i < this.data.size(); i++) {
            for (int j = 0; j < this.data.get(i).size(); j++) {
                    System.out.print(String.format("|%-"+width.get(j)+"s", this.data.get(i).get(j)));
            }
            System.out.println();
        }
    }
}