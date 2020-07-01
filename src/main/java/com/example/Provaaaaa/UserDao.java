/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Provaaaaa;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Aspie96
 */
public interface UserDao {
    public Optional<UserE> findByUsername(String username);
}
