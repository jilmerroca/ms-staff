package com.codigo.clinica.msstaff.infraestrucrure.dao;

import com.codigo.clinica.msstaff.infraestrucrure.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
