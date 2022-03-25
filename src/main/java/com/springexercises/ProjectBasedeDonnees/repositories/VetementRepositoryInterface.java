package com.springexercises.ProjectBasedeDonnees.repositories;

import com.springexercises.ProjectBasedeDonnees.beans.Vetement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetementRepositoryInterface extends JpaRepository<Vetement, String>{
}
