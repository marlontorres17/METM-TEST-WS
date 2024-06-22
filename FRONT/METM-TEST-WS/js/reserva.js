document.getElementById('agregarPasajero').addEventListener('click', function() {
    const nombres = document.getElementById('nombres').value;
    const apellidos = document.getElementById('apellidos').value;
    const fechaNacimiento = document.getElementById('fechaNacimiento').value;
    const numeroPasaporte = document.getElementById('numeroPasaporte').value;
    const paisPasaporte = document.getElementById('paisPasaporte').value;
    const telefono = document.getElementById('telefono').value;
    const fotoPasaporte = document.getElementById('fotoPasaporte').files[0];
    
    // Validación básica
    if (!nombres || !apellidos || !fechaNacimiento || !numeroPasaporte || !paisPasaporte || !telefono || !fotoPasaporte) {
        alert('Todos los campos son obligatorios');
        return;
    }

    const reader = new FileReader();
    reader.onload = function(e) {
        const fotoSrc = e.target.result;
        
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${nombres}</td>
            <td>${apellidos}</td>
            <td>${fechaNacimiento}</td>
            <td>${numeroPasaporte}</td>
            <td>${paisPasaporte}</td>
            <td>${telefono}</td>
            <td><img src="${fotoSrc}" class="img-fluid img-thumbnail"></td>
            <td><button class="btn btn-info btn-sm verPasaporte">Ver pasaporte</button></td>
            <td><button class="btn btn-danger btn-sm eliminarPasajero">Eliminar Pasajero</button></td>
        `;

        document.getElementById('listaPasajeros').appendChild(row);

        row.querySelector('.verPasaporte').addEventListener('click', function() {
            $('#nombrePasajero').text(`${nombres} ${apellidos}`);
            $('#imagenPasaporte').attr('src', fotoSrc); 
            $('#modalPasaporte').modal('show');
        });

        row.querySelector('.eliminarPasajero').addEventListener('click', function() {
            this.closest('tr').remove();
        });
    };

    reader.readAsDataURL(fotoPasaporte);

    // Limpiar formulario
    document.getElementById('passengerForm').reset();
});

document.getElementById('confirmarReserva').addEventListener('click', function() {
    $('#modalFacturacion').modal('show');
});

document.getElementById('emitirBoletos').addEventListener('click', function() {
    $('#modalFacturacion').modal('hide');
    $('#modalMensajeBoleto').modal('show');
    // Generar un número 
    const numeroBoleto = Math.floor(Math.random() * 100) + 1;
    document.getElementById('numeroBoletoGenerado').innerText = numeroBoleto;
});

document.querySelectorAll('.verPasaporte').forEach(function(button) {
    button.addEventListener('click', function() {
        let row = this.closest('tr');
        let nombrePasajero = row.cells[0].innerText + " " + row.cells[1].innerText;
        $('#nombrePasajero').text(nombrePasajero);
        $('#imagenPasaporte').attr('src', '#'); 
        $('#modalPasaporte').modal('show');
    });
});

document.querySelectorAll('.eliminarPasajero').forEach(function(button) {
    button.addEventListener('click', function() {
        this.closest('tr').remove();
    });
});
