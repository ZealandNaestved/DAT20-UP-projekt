import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.ArrayList;

class data {
    int id;
    String name;
    int amount;
    double price;

    public data(int id, String name, int amount, double price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("qwe");
            String[] columnHeadings = {" ", "Resultatopgørelse 2021"};
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < columnHeadings.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columnHeadings[i]);
            }
            ArrayList<data> a = createData();
            for (int i = 1; i < a.size()+1; i++) {
                Row row = sheet.createRow(i);
                row.createCell(0).setCellValue(a.get(i - 1).id);
                row.createCell(1).setCellValue(a.get(i - 1).name);
                row.createCell(2).setCellValue(a.get(i - 1).amount);
                row.createCell(3).setCellValue(a.get(i - 1).price);
            }


            FileOutputStream fileOutputStream = new FileOutputStream("/home/virtualzeth/Documents/demo.xlsx");
            workbook.write(fileOutputStream);
            fileOutputStream.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static ArrayList<data> createData() {
        ArrayList<data> a = new ArrayList<>();
        a.add(new data(1, "qwe", 12, 500));
        a.add(new data(2, "qweqwe", 55, 400));
        a.add(new data(3, "ewqewq", 44, 300));
        a.add(new data(4, "ewq", 33, 600));
        return a;
    }
}
