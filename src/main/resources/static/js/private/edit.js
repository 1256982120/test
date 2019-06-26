$(function() {
	var message = '';
	$.ajax({
		type: 'POST', 
		url: "/edit/userInfo",    //规定连同请求发送到服务器的数据；
		dataType:"json",
		scriptCharset: 'utf-8',
		contentType: "application/json; charset=utf-8",
		success: function(data) {
			message = message + 
				"mysql用户名："+
				"<span id='userName'>"+data.userName+
				"</span>";
			$("#message").html(message);
		}
	});
//	$.ajax({
//			type: 'POST', 
//			url: "/edit/editMysql",    //规定连同请求发送到服务器的数据；
//			data: JSON.stringify(param),   //映射或字符串值，规定连同请求发送到服务器的数据；
//			dataType:"json",
//			scriptCharset: 'utf-8',
//			contentType: "application/json; charset=utf-8",
//			success: function(weather) {
//				alert('修改成功')
//			}
//		});
	$('#editmysqlpassword').click(function(){
		var param = {userName:$('#userName').val(),newPassWord:$('#newpassword').val()};
		alert(param)
		$.ajax({
			type: 'POST', 
			url: "/edit/editMysql",    //规定连同请求发送到服务器的数据；
			data: JSON.stringify(param),   //映射或字符串值，规定连同请求发送到服务器的数据；
			dataType:"json",
			scriptCharset: 'utf-8',
			contentType: "application/json; charset=utf-8",
			success: function(data) {
				if(data!=null){
					alert('修改成功')
				}
			}
		});
		
	});
	
	var postgremessage = '';
	$.ajax({
		type: 'POST', 
		url: "/edit/postgreSQLInfo",    //规定连同请求发送到服务器的数据；
		dataType:"json",
		scriptCharset: 'utf-8',
		contentType: "application/json; charset=utf-8",
		success: function(data) {
			postgremessage = postgremessage + 
				"mysql用户名："+
				"<span id='userName'>"+data.userName+
				"</span>";
			$("#postgremessage").html(postgremessage);
		}
	});
	
	$('#editpostgresqlpassword').click(function(){
		alert($('#postgreuserName').val()+" "+$('#postgrenewpassword').val())
		var param = {userName:$('#postgreuserName').val(),newPassWord:$('#postgrenewpassword').val()};
		$.ajax({
			type: 'POST', 
			url: "/edit/editPostgreSQL",    //规定连同请求发送到服务器的数据；
			data: JSON.stringify(param),   //映射或字符串值，规定连同请求发送到服务器的数据；
			dataType:"json",
			scriptCharset: 'utf-8',
			contentType: "application/json; charset=utf-8",
			success: function(data) {
				if(data!=null){
					alert('修改成功')
				}
			}
		});
		
	});
	
});