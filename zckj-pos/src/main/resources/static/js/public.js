var baseurl="http://127.0.0.1:10087/czyj_pos";//url基础路径
//datagrid导出excel调示例：ExpExcel('_3tqmx',month+'月工单');
function ExpExcel(url,filename,field,title)
 {
	//var field =new Array("rq","tqbh","tgmc","gdl","sdl","ssl");
	//var title =new Array("日期","单位编号","单位名称","字段名4","字段名5","字段名6"); 
	if(url=="" ||url==null){
		$.messager.alert('提示', 'url不能为空!');
		return;
	}
	if(filename=="" ||filename==null){
		$.messager.alert('提示', '导出文件名不能为空!');
		return;
	}

	 if(url=="" || url ==null){
			
			return;
		}
	 if(url.indexOf('?') == -1)//grid的url没有参数
		 url = url+'?';	
		 window.open(url+'&title='+title.toString()+'&field='+field.toString()+'&filename='+filename);
 }