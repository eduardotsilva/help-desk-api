package com.eduardo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.helpdesk.domain.Tecnico;


public interface TecnicoRepository  extends JpaRepository<Tecnico, Integer>{

}