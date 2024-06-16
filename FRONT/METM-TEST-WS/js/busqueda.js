
    
  
    
  function loadAirports(){
    $.ajax({
        url: 'http://localhost:9000/session3/v1/api/airports',
        method: "GET",
        dataType: 'json',
        success: function(response) {
            if (response.status && Array.isArray(response.data)) {
                var airportss = response.data.map(function(airports) {
                    return {
                        label: airports.id, 
                        value: airports.id 
                    };
                });
                
                $('#airports').autocomplete({
                    source : function(request, response){
                        var results = $.ui.autocomplete.filter(airportss, request.term);
                        if (!results.length){
                            results = [{label : 'No se encontraron resultados', value: null}];
                        }
                        response(results);
                    },
                    select: function(event, ui){
                        $("#airports_id").val(ui.item.value);
                        $("#airports").val(ui.item.label);
                        console.log("ID de ventas: " + ui.item.value);
                        return false;
                    }
    });
  } else {
    console.error("No se obtuvo la lista de aiports.");
  }
        },
        error : function(error){
            console.error("Error de la solicitur: ",error);
        }
    });
  }
 
  
  
  
  
  
 
  
  function clearData(){
   
    $('#aiports').val('');
  }