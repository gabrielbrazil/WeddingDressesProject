$(document).ready(function(){
	
	
	$('.frm_cep').focusout(function(){
		var cep = $('.frm_cep').val();
		 $.ajax({ 
			  type:'GET',
		      url:'getEstados',
		      data: {"cep": cep},
		      dataType: 'json', 
		      success:function(data){
		    	alert(data);
		      },
		 });
		});
  	});	
	
	