$( document ).ready(function() {
	
	// SUBMIT FORM
    $("#taskForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		ajaxPost();
	});
    
    
    function ajaxPost(){
    	
    	// PREPARE FORM DATA
    	var formData = {
    		id : $("#id").val(),
    		name : $("#name").val(),
			eRole : $("#eRole").val()
    	}
    	
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : window.location + "api/task",
			data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				$("#postResultDiv").html("<p style='padding-left:20px'>" + "Post Successfully! <br>" +
										 "---> Task's Info: id = " + 
											result.id + ", name = " + result.name +" , eRole = " + result.eRole + "</p>");
				console.log(result);
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    	
    	// Reset FormData after Posting
    	resetData();
 
    }
    
    function resetData(){
    	$("#id").val("");
    	$("#name").val("");
    }
})