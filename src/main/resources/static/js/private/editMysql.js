$(function() {
	$('#editmysqlpassword').click(function(){
		alert(111)
//		var param = {userNmae:$('#userName').val(),newPassWord:$('#newpassword').val()};
		$.ajax({
			type: 'POST', 
			url: "/edit/editMysql",    //规定连同请求发送到服务器的数据；
			data: {userNmae:$('#userName').val(),newPassWord:$('#newpassword').val()},   //映射或字符串值，规定连同请求发送到服务器的数据；
			dataType:"json",
			scriptCharset: 'utf-8',
			contentType: "application/json; charset=utf-8",
			success: function(data) {
				alert('修改成功')
			}
		});
		
	});
	
});