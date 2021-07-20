//package com.zckj.demo.common;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.util.Arrays;
//import java.util.List;
//
//public class Excel {
//    public  void ExpExcel(List<?> list, String path, String d1, String d2) throws IOException {
//        Method metd = null;
//        String fdname = null;
//        Wb_Style wb = new Wb_Style();
//        HSSFSheet sheet = wb.wb.createSheet("导出");
//        String[] data1 = d1.toString().split(",");
//        String[] data2 = d2.toString().split(",");
//        List<String> lsttitle= Arrays.asList(data1);
//        List<String> lstfield = Arrays.asList(data2);
//        // 设置excel每列宽度
//        for (int i = 0; i < lsttitle.size(); i++) {
//            sheet.setColumnWidth(i, 20 * 256);
//        }
//        HSSFRow row = sheet.createRow(0);
//        row.setHeight((short) 300);
//        HSSFCell cell = row.createCell(0);
//        // 设置excel列名
//        for (int i = 0; i < lsttitle.size(); i++) {
//            cell = row.createCell(i);
//            cell.setCellValue(lsttitle.get(i));
//            cell.setCellStyle(wb.style2);
//            //System.out.print(lsttitle.get(i) + "|");
//        }
//        //System.out.print("\n");
//        try {
//            int h = 1;
//            for (Object object : list) {
//                Class clazz = object.getClass();// 获取集合中的对象类型
//                Field[] fds = clazz.getDeclaredFields();// 获取他的字段数组
//                row = sheet.createRow(h);
//                row.setHeight((short) 400);
//                int l=0;
//                for (int i = 0; i < lstfield.size(); i++) {
//                    for (Field field : fds) {// 遍历该数组
//                        fdname = field.getName();// 得到字段名，
//                        metd = clazz.getMethod("get" + change(fdname), null);// 根据字段名找到对应的get方法，null表示无参数
//
//                        if (lstfield.get(i).equals(fdname) && metd != null) {// 比较是否在lstfield字段数组中存在字段，如果不存在短路，如果存在继续判断该字段的get方法是否存在，同时存在继续执行
//                            Object name = metd.invoke(object, null);// 调用该字段的get方法
//                            cell = row.createCell(l);
//                            if(name==null)
//                                name="";
//                            cell.setCellValue(name.toString());
//                            cell.setCellStyle(wb.style);
//                            //System.out.print(name + "|");//输出结果
//
//                        }
//                    }
//                    l++;
//                }
//                //System.out.print("\n");
//                h++;
//            }
//            FileOutputStream os = new FileOutputStream(path);
//            wb.wb.write(os);
//            os.close();
//        } catch (SecurityException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IllegalArgumentException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//    public static String change(String src) {
//        if (src != null) {
//            StringBuffer sb = new StringBuffer(src);
//            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
//            return sb.toString();
//        } else {
//            return null;
//        }
//    }
//}
