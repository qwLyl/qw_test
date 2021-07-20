### 1.引入js

```html
		<script lang="javascript" src="js/xlsx.full.min.js"></script>
		<script src="js/FileSaver.min.js" charset="utf-8"></script>
```

### 2.添加方法

```js
exportData() {
					var xlsxParam = { raw: true };
					var wb = XLSX.utils.table_to_book(document.querySelector('#exportable'),xlsxParam);
					var wbout = XLSX.write(wb, { bookType: 'xlsx', bookSST: true, type: 'array' })
					try {
						saveAs(new Blob([wbout], { type: 'application/octet-stream' }), '薪资明细.xlsx')
					} catch (e) { if (typeof console !== 'undefined') console.log(e, wbout) }
					return wbout
				},
```

### 3.添加id

```html
				<el-table id="exportable" ref="table" :height="tableHeight" highlight-current-row  v-loading="loading" :data="tableData" >

```

