
$(function () {

});


function showcontent(url) {
	var strhtml = '<iframe src="' + url + '" scrolling="yes" width="100%" height="100%" frameborder="0"></iframe>';
	return strhtml;
}
function addPanel(Bname,url ) {
	//$.messager.alert(Bname,url);
	var title = $("btn").linkbutton().text();
	var isExt = $('#tt').tabs('exists', Bname);
	if (isExt) {
		$('#tt').tabs('select', Bname);
		return;
	}
	$('#tt').tabs('add', {
		title: Bname,
		content: showcontent(url),
		closable: true
	});
}
//初始化grid
function Gridinit(name,colum) {
	var grid = document.getElementById(name);
	//alert(colum);
	var param = 'org_typ_cd="3"&roleid="4"';
	var Result=eval("("+colum+")");
	//var grid = $('#name');
	//alert(grid.title);
	$('#'+name).datagrid({
		method: "GET",
		contentType: "application/json",
		size: { w: 4, h: 170 },
		url: '',
		queryParams: {},
		pagination: false,
		customLoad: false,
		remoteSort: true,
		fit: true,
		pageSize: 20,
		rownumbers: true,
		singleSelect: true,//行单选
		columns:Result

	});


}
//grid加载数据
function LGridData(name,ajaxUrl,Param) {
	//动态加载标题和数据
	//alert(name);
	$.ajax({
		url : ajaxUrl,
		datatype : "json", //数据类型
		data : Param,
		//data :{roleid:"3",org_typ_cd:"3"},
		success : function(Result1) {
			var Result = eval("(" + Result1 + ")");
			if (Result.rows.length<1) {
				//$.messager.alert('提示', '查询数据失败！');
				$('#'+name).datagrid("loadData", Result.rows); //动态取数据
			} else {
				//$("#dg").datagrid({
				//     columns: [data.title]    //动态取标题
				// });
				//$.messager.alert('提示',Result.rows);
				$('#'+name).datagrid("loadData", Result.rows); //动态取数据
			}
		}
	});

}

//combobox加载数据
function LCmbData(name, ajaxUrl, Param) {
	//动态加载标题和数据
	//alert(name);
	$.ajax({
		url : ajaxUrl,
		datatype : "json", //数据类型
		data : Param,
		//data :{roleid:"3",org_typ_cd:"3"},
		success : function(Result1) {
			var Result = eval("(" + Result1 + ")");
			$('#' + name).combobox({
				data : Result.rows,
				valueField : 'tj',
				textField : 'note',
				onLoadSuccess : function() { //加载完成后,设置选中第一项
					var val = $('#' + name).combobox("getData");
					if (val.length > 0) {
						$('#' + name).combobox('select', val[0].tj);
					}
				}
			});

		}
	});
}
//combobox加载数据
function LCmbData1(name, ajaxUrl, Param,valueField,textField) {
	//动态加载标题和数据
	//alert(name);
	$.ajax({
		url : ajaxUrl,
		datatype : "json", //数据类型
		data : Param,
		//data :{roleid:"3",org_typ_cd:"3"},
		success : function(Result1) {
			var Result = eval("(" + Result1 + ")");
			$('#' + name).combobox({
				data : Result.rows,
				valueField : valueField,
				textField : textField,
				onLoadSuccess : function() { //加载完成后,设置选中第一项
					var val = $('#' + name).combobox("getData");
					if (val.length > 0) {
						$('#' + name).combobox('select', val[0].tj);
					}
				}
			});

		}
	});
}
Date.prototype.format = function(format)
{
	var o = {
		"M+" : this.getMonth()+1, //month
		"d+" : this.getDate(),    //day
		"h+" : this.getHours(),   //hour
		"m+" : this.getMinutes(), //minute
		"s+" : this.getSeconds(), //second
		"q+" : Math.floor((this.getMonth()+3)/3),  //quarter
		"S" : this.getMilliseconds() //millisecond
	}
	if(/(y+)/.test(format)) format=format.replace(RegExp.$1,
		(this.getFullYear()+"").substr(4 - RegExp.$1.length));
	for(var k in o)if(new RegExp("("+ k +")").test(format))
		format = format.replace(RegExp.$1,
			RegExp.$1.length==1 ? o[k] :
				("00"+ o[k]).substr((""+ o[k]).length));
	return format;
}
//datagrid导出excel调示例：ExpExcel('_3tqmx',month+'月工单');
function ExpExcel(GridName,filename)
{
	//var field =new Array("temp1","temp2","temp3","temp4","temp5","temp6");
	//var title =new Array("日期","单位编号","单位名称","字段名4","字段名5","字段名6");
	if(GridName=="" ||GridName==null){
		$.messager.alert('提示', 'gridId不能为空!');
		return;
	}
	if(filename=="" ||filename==null){
		$.messager.alert('提示', '导出文件名不能为空!');
		return;
	}

	var url = $('#'+GridName).datagrid('options').url;//取grid的url
	if(url=="" || url ==null){

		return;
	}
	if(url.indexOf('?') == -1)//grid的url没有参数
		url = url+'?';
	var title = new Array();
	var field = $('#'+GridName).datagrid('getColumnFields');//取grid字段名
	for(var i=0;i<field.length;i++)
	{

		title[i] = $('#'+GridName).datagrid('getColumnOption',field[i]).title;//取grid字段标题名

	}

	window.open(url+'&title='+title.toString()+'&field='+field.toString()+'&filename='+filename);
}
//导出

/*$.extend($.fn.datagrid.methods, {
	toExcel: function(jq, filename){
		return jq.each(function(){
			var uri = 'data:application/vnd.ms-excel;base64,'
				, template = '<html xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns="http://www.w3.org/TR/REC-html40"><head><!--[if gte mso 9]><xml><x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet><x:Name>{worksheet}</x:Name><x:WorksheetOptions><x:DisplayGridlines/></x:WorksheetOptions></x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook></xml><![endif]--></head><body><table>{table}</table></body></html>'
				, base64 = function (s) { return window.btoa(unescape(encodeURIComponent(s))) }
				, format = function (s, c) { return s.replace(/{(\w+)}/g, function (m, p) { return c[p]; }) }

			var alink = $('<a style="display:none"></a>').appendTo('body');
			var view = $(this).datagrid('getPanel').find('div.datagrid-view');

			var table = view.find('div.datagrid-view2 table.datagrid-btable').clone();
			var tbody = table.find('>tbody');
			view.find('div.datagrid-view1 table.datagrid-btable>tbody>tr').each(function(index){
				$(this).clone().children().prependTo(tbody.children('tr:eq('+index+')'));
			});

			var head = view.find('div.datagrid-view2 table.datagrid-htable').clone();
			var hbody = head.find('>tbody');
			view.find('div.datagrid-view1 table.datagrid-htable>tbody>tr').each(function(index){
				$(this).clone().children().prependTo(hbody.children('tr:eq('+index+')'));
			});
			hbody.prependTo(table);

			var ctx = { worksheet: name || 'Worksheet', table: table.html()||'' };
			alink[0].href = uri + base64(format(template, ctx));
			alink[0].download = filename;
			alink[0].click();
			alink.remove();
		})
	}
});*/
function addZero(val, row) {
	if (val > 0) {
		if (val < 1) {
			val = '0' + val;
		}
	} else if (val < 0) {
		if (val > -1) {
			val = '-' + (-val);
		}
	}
	return val;
}
//------------通用函数-----------//
//--转小写.toLowerCase()--转大写.toUpperCase()
//字符串首字母替换成大写
function UpperFirst(str) {
	return str.toLowerCase().replace(/( |^)[a-z]/g, (L) => L.toUpperCase());
}


//stringObject.substr(start,length) 截取的是开始与字符串长度。
//stringObject.substring(start,stop) //截取的是开始与结束的字符串。
//去掉第一个字符
function RemoveFirst(str) {
	return str.substring(1, str.length);
}
//去掉最后一个字符
function RemoveLast(str) {
	return str.substring(0, str.length - 1);
}
