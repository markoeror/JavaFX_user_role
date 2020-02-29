package com.eror.service.impl;

import com.eror.model.Role;
import com.eror.repository.RoleRepository;
import com.eror.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role save(Role entity) {
        return null;
    }

    @Override
    public Role update(Role entity) {
        return null;
    }

    @Override
    public void delete(Role entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void deleteInBatch(List<Role> entities) {

    }

    @Override
    public Role find(Long id) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
