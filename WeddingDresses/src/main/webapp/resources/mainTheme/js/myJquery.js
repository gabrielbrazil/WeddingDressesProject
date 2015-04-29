$(document).ready(function(){
	
	
	$('#btn_cep').click(function(){
		$cep = $('.frm_cep');
		 $.ajax({ 
			  type:'GET',
		      url:'getEstados',
		      data: {"cep":$cep.val()},
		      dataType:'json',
		      success:function(data){
		    	  var rua = "logradouro";
		    	  var complemento ="complemento";
		    	  var bairro = "bairro";
		    	  var estado = "localidade";
		    	  var uf = "uf";
		    	  $.each(data, function( key, value ) {
		    		  if(key == rua){
		    			  $('.frm_rua').val(value);  
		    		  }else if(key == complemento){
		    			  $('frm_complemento').val(value);
		    		  }else if(key == bairro){
		    			  $('.frm_bairro').val(value);
		    		  }else if(key == estado){
		    			  $('.frm_estados').append($('<option>').text(value).val(value).attr('selected','selected')); 
		    		  }
		    		   
		    	  });
		      },
		      error: function(XMLHttpRequest, textStatus, errorThrown) {
		            console.error(errorThrown);
		        }
		 });
		});
  	});	
	
	


