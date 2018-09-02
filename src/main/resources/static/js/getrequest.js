$( document ).ready(function() {
	
	// GET REQUEST
	$("#getAllTasks").click(function(event){
		event.preventDefault();
		ajaxGet();
	});
	
	// DO GET
	function ajaxGet(){
		$.ajax({
			type : "GET",
			url : window.location + "api/tasks",
			success: function(result){
				$('#getResultDiv ul').empty();
				
				$.each(result, function(i, task){
					var task = "Task -> id = " + task.id + ", name = " + task.name +", eRole = " + task.eRole + "<br> <br>";
					$('#getResultDiv ul').append("<li>" + task + "</li>");
		        });
				console.log("Success: ", result);
			},
			error : function(e) {
				$("#getResultDiv").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
})