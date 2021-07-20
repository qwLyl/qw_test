# vue + elementUI 表格下载为excel
---
## 1. 安装插件：
```cmd
npm install --save xlsx file-saver
```
## 2. 引入插件：
```js
import FileSaver from 'file-saver'
import XLSX from 'xlsx'
```
## 3. 添加导出按钮
```css
<el-button type="primary" plain size="mini" @click="exportOrderData()">导出</el-button>
```
## 4. 添加方法：
```js
      exportOrderData() {
        var xlsxParam = { raw: true };
        var wb = XLSX.utils.table_to_book(document.querySelector('#out-table'),xlsxParam);
        var wbout = XLSX.write(wb, { bookType: 'xlsx', bookSST: true, type: 'array' })
        try {
        FileSaver.saveAs(new Blob([wbout], { type: 'application/octet-stream' }), '薪资明细.xlsx')
        } catch (e) { if (typeof console !== 'undefined') console.log(e, wbout) }
        return wbout
      },
```
## 5. 设置 ` id="out-table"`
在需要导出为 excel 的表格上添加 id 
```css
     <el-table
       :data="dataList"
       border
       v-loading="dataListLoading"
       @selection-change="selectionChangeHandle"
       id="out-table"
       >
    </el-table>
 ```
---

参考：
[1] [vue+elementUI表格下载为excel]( https://blog.51cto.com/butcher36/2506830?source=dra)
