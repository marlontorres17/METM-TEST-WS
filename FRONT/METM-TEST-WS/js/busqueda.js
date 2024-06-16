document.addEventListener('DOMContentLoaded', function() {
    const formReserva = document.querySelector('.border:last-of-type form');
    const inputPasajeros = formReserva.querySelector('#pasajeros');
    const btnReservar = formReserva.querySelector('button[type="submit"]');
    
    formReserva.addEventListener('submit', function(event) {
        if (inputPasajeros.value.trim() === '') {
            alert('Por favor ingresa el número de pasajeros.');
            event.preventDefault();
        }
    });
    
    const checkboxSalida = document.getElementById('salida-visualizacion');
    const checkboxRegreso = document.getElementById('regreso-visualizacion');
    const tablaSalida = document.querySelector('.border:nth-of-type(2) table');
    const tablaRegreso = document.querySelector('.border:nth-of-type(3) table');
    
    function toggleDetallesVuelos() {
        tablaSalida.style.display = checkboxSalida.checked ? 'table' : 'none';
        tablaRegreso.style.display = checkboxRegreso.checked ? 'table' : 'none';
    }
    
    toggleDetallesVuelos();
    
    checkboxSalida.addEventListener('change', toggleDetallesVuelos);
    checkboxRegreso.addEventListener('change', toggleDetallesVuelos);
    
    const btnSalir = document.querySelector('.border:last-of-type button.btn-secondary');
    btnSalir.addEventListener('click', function() {
        if (confirm('¿Estás seguro que deseas salir?')) {
            window.location.href = 'https://www.otroLugar.com'; 
        }
    });
});
