package hoekcel.controller.export;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class Excel {
    private final Workbook workbook = new XSSFWorkbook();
    private final Sheet sheet = workbook.createSheet("Resultatopgørelse");

    public void export(LinkedHashMap<Object, Object> data, String path) {
        try {
            generateHeadings();
            generateCells(data);
            outputFile(path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void generateHeadings() {
        var headerRow = this.sheet.createRow(1);
        headerRow.setHeight((short) 409);

        var headerFont = ((XSSFWorkbook) workbook).createFont();
        var headerStyle = workbook.createCellStyle();
        headerFont.setBold(true);
        headerFont.setFontHeight(18);
        headerStyle.setFont(headerFont);

        Cell cell = headerRow.createCell(1);
        cell.setCellStyle(headerStyle);
        cell.setCellValue("Resultatopgørelse");
    }

    private void generateCells(LinkedHashMap<Object, Object> data) {
        String[] arr = new String[]{"Omsætning", "Vareforbrug", "Bruttofortjenste", "Salgsfremmende omkostninger",
                "Markedsføringsbidrag", "Øvrige kapacitetsomkostninger", "Indtjeningsbidrag", "Afskrivninger",
                "Resultat før renter", "Renteomkostninger", "Resultat"};

        for (int i = 0; i < data.size(); i++) {
            Row row = sheet.createRow(i+2);
            row.createCell(1).setCellValue(arr[i]);
            row.createCell(2).setCellValue(data.get(i).toString());
        }
        this.sheet.autoSizeColumn(1);
        this.sheet.autoSizeColumn(2);
    }

    private void outputFile(String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(String.format("%s.xlsx", path));
        this.workbook.write(fileOutputStream);
        fileOutputStream.close();
        this.workbook.close();
    }
}
