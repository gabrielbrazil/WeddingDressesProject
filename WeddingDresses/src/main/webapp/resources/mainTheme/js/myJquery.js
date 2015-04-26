$(document).ready(function(){
	
	
	$('.frm_cep').focusout(function(){
		var cep = $('.frm_cep').val();
		 $.ajax({ 
		      url:'',
		      data: cep,
		      dataType: 'json', 
		      success:function(data){
		    	  if(data.success){
		    		  
		    	  }else{
		    		  
		    	  }
		      },
		      error:function(){
		    	  return false;
		      }
		 });
		});
  	});	
	
	