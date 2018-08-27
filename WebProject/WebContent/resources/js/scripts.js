$(document).ready(function(){
	

		    $( "#modal-update" ).dialog({
		    		
		    		autoOpen: false,
					show:{
						effect:"fade",
					    duaration:200
					},
					hide:{
						effect:"fade",
						duration:200
					}
		    });
		 
	
	
	/*
	$('modal-update').dialog(
			
		/*autoOpen: false,
			show:{
				effect:"fade",
			    duaration:200
			},
			hide:{
				effect:"fade",
				duration:200
			}
		
			);
	*/
	
	
	$('#state-select').change(function(){
	
		var state = $(this).val();
		console.log(state);
		ajaxDropdown(state);
		
	});
	
	
	
	
	
});

function ajaxDropdown(stateId){
	
	
	
	
	$.get('/WebProject/GetCitiesServlet',{
		stateId: stateId
		
	},function(response){
		
		console.log(response);
		document.getElementById("city-select").options.length =0;
		$.each(response, function(key,value){
			
		  
			$("#city-select").append($("<option/>",{
		    	 value: key,
		    	 text: value.name
		    	 
		     }));	
		  
		});
		
	} );
	
	
	
	
}


function myFunctiondelete(person_id) {
	 console.log(person_id);
	 
	 $.post('/WebProject/HomeServlet',{
		 btn: "delete" ,
		 Id :person_id
		 
	 },function(response){
		 location.reload();
	 });	 		 	  
	};
	
	
	function update(){
	  var person_id = $("#id-name").val();
	  var name =$("#name").val();
	  var lastname =$("#lastname").val();
	  var email =$("#email").val();
	  var age =$("#age").val();
	  var address =$("#address").val();
	  var state =$("#state-select").val();
	  var city =$("#city").val();
	  var pasword =$("#password").val();

		 $.post('/WebProject/HomeServlet',{
			 btn: "update" ,
			 Id :person_id ,
			 name_id : name ,
			 lastname_id : lastname ,
			 email_id :email,
			 age_id : age,
			 address_id : address,
			 state_id: state ,
			 city_id : city ,
			 pasword_id : pasword 
		 },function(response){
			 location.reload();
		 });	
	  
	  console.log(person_id);
		
		console.log();
		
	};
	
	
	function myFunctionupdate(person_id){
		$('#modal-update').dialog("open")
		$("#id-name").val(person_id);
		 //document.getElementById("id-name").innerHTML = person_id;
		 console.log(person_id);
	
	};
	
	
	