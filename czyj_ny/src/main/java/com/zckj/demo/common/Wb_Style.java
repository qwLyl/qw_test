//package com.zckj.demo.common;
//
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFFont;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.Font;
//import org.apache.poi.ss.usermodel.IndexedColors;
//
//public class Wb_Style {
//	public HSSFWorkbook wb = null;
//	public HSSFCellStyle style = null;
//	public HSSFCellStyle style1 = null;
//	public HSSFCellStyle style2 = null;
//	public HSSFFont font = null;
//	public HSSFFont font1 = null;
//	public HSSFFont font2 = null;
//
//	public Wb_Style() {
//		wb = new HSSFWorkbook();
//
//		// 设置字体
//	    font = wb.createFont();
//	    font.setFontName("宋体");
//	    font.setFontHeightInPoints((short) 10);
//
//	    font1 = wb.createFont();
//	    font1.setFontName("宋体");
//	    font1.setFontHeightInPoints((short) 18);
//
//	    font2 = wb.createFont();
//	    font2.setFontName("宋体");
//	    font2.setFontHeightInPoints((short) 10);
//	    font2.setBoldweight(Font.BOLDWEIGHT_BOLD);// 加粗
//
//	    style = wb.createCellStyle();
//	    style.setFont(font);
//	    style.setWrapText(true);// 自动换行
//	    style.setAlignment(CellStyle.ALIGN_CENTER);// 左右居中
//	    style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 上下居中
//	    style.setBorderTop((short) 1);// 边框的大小
//	    style.setBorderBottom((short) 1);
//	    style.setBorderLeft((short) 1);
//	    style.setBorderRight((short) 1);
//
//	    style1 = wb.createCellStyle();
//	    style1.setFont(font1);
//	    style1.setWrapText(true);// 自动换行
//	    style1.setAlignment(CellStyle.ALIGN_CENTER);// 左右居中
//	    style1.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 上下居中
//	    style1.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());// 设置单元格的背景颜色
//	    style1.setFillPattern(CellStyle.SOLID_FOREGROUND);
//	    style1.setBorderTop((short) 1);// 边框的大小
//	    style1.setBorderBottom((short) 1);
//	    style1.setBorderLeft((short) 1);
//	    style1.setBorderRight((short) 1);
//
//	    style2 = wb.createCellStyle();
//	    style2.setFont(font2);
//	    style2.setWrapText(true);// 自动换行
//	    style2.setAlignment(CellStyle.ALIGN_CENTER);// 左右居中
//	    style2.setVerticalAlignment(CellStyle.VERTICAL_CENTER);// 上下居中
//	    style2.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.getIndex());// 设置单元格的背景颜色
//	    style2.setFillPattern(CellStyle.SOLID_FOREGROUND);
//	    style2.setBorderTop((short) 1);// 边框的大小
//	    style2.setBorderBottom((short) 1);
//	    style2.setBorderLeft((short) 1);
//	    style2.setBorderRight((short) 1);
//	}
//
//}
