package org.javaexcel.model;

import java.util.ArrayList;
import java.util.List;

/*
 * File name   : ExeclTitle.java
 * @Copyright  : luoyoub@163.com
 * Description : javaexcel
 * Author      : Robert
 * CreateTime  : 2016年4月1日
 */
public class ExcelTitle {
    // 列索引
    private int index;

    // 列名
    private String name;

    // 设置列宽
    private int columnWidth;

    // 列标题
    private String displayName;

    private CellType dataType;

    // 列是否支持合并(行合并)
    private boolean isMerge = false;

    private ExcelCellStyle cellStyle = new ExcelCellStyle();

    // 子标题列表
    private List<ExcelTitle> subTitles = new ArrayList<ExcelTitle>();

    // 当单元格为空时填充字符
    private String fillChar = "";

    public String getFillChar() {
        return fillChar;
    }

    public void setFillChar(String fillChar) {
        this.fillChar = fillChar;
    }

    public ExcelCellStyle getCellStyle() {
        return cellStyle;
    }

    public void setCellStyle(ExcelCellStyle cellStyle) {
        this.cellStyle = cellStyle;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getColumnWidth() {
        return columnWidth;
    }

    public void setColumnWidth(int columnWidth) {
        this.columnWidth = columnWidth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CellType getDataType() {
        return dataType;
    }

    public void setDataType(CellType dataType) {
        this.dataType = dataType;
    }

    public boolean isMerge() {
        return isMerge;
    }

    public void setMerge(boolean isMerge) {
        this.isMerge = isMerge;
    }

    public List<ExcelTitle> getSubTitles() {
        return subTitles;
    }

    public void setSubTitles(List<ExcelTitle> subTitles) {
        this.subTitles = subTitles;
    }
}