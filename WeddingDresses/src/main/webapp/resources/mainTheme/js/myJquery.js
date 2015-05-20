$(document).ready(function(){
	
		$("#frm_cep").mask("99999-999");
	
	
	$('#btn_cep').click(function(){
		$cep = $('#frm_cep');
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
		    	  $('h1.head-endereco').show();
		    	  $('div.frm_rua').show();
		    	  $('div.frm_complemento').show();
		    	  $('div.frm_bairro').show();
		    	  $('div.frm_numero').show();
		    	  $('div.frm_estados').show();
		    	  $('div.frm_uf').show();
		    	  
		    	  $.each(data, function( key, value ) {
		    		  if(key == rua){
		    			  $('#frm_rua').val(value);  
		    		  }else if(key == complemento){
		    			  $('#frm_complemento').val(value);
		    		  }else if(key == bairro){
		    			  $('#frm_bairro').val(value);
		    		  }else if(key == estado){
		    			  	if($('#frm_estados option').size() < 2){
		    				   $('#frm_estados').append($('<option>').text(value).val(value).attr('selected','selected'));
		    			  	}
		    		  }else if(key == uf){
		    				if($('#frm_uf option').size() < 2){
		    					$('#frm_uf').append($('<option>').text(value).val(value).attr('selected','selected'));
		    				}	
		    		  }
		    		   
		    	  });
		      },
		      error: function(XMLHttpRequest, textStatus, errorThrown) {
		            console.error(errorThrown);
		        }
		 });
		});
  	});	
	
	

