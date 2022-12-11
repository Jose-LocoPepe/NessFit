package cl.nessfit.web.repository;

import cl.nessfit.web.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ISolicitudRepository extends JpaRepository<Solicitud, String> {

    //SELECT * FROM solicitudes WHERE solicitudes.Id = Id;
    public Optional<Solicitud> findById(String Id);

    //SELECT * FROM solicitudes WHERE solicitudes.fecha BETWEEN inicio AND termino;
    public Optional<Solicitud> findSolicitudByfechaEmisionBetween(Date inicio, Date termino);

    //SELECT * FROM solicitudes WHERE solicitudes.fecha BETWEEN inicio AND termino;
    public List<Solicitud> findByFechaEmisionBetween(Date inicio, Date termino);


}
