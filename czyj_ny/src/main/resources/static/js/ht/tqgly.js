$(document).ready(function(){
	
});

$(function(){
    $('#btn').bind('click', function(){
		var org_no = $("#org_no1").val();
		//var org_no ="4341231";
		$('#tqglyxx').datagrid('loadData',{total:0,rows:[]})
		$("#tqglyxx").datagrid("reload",'ht/findTqglyByorg_no?org_no=' + org_no);
    });
});
