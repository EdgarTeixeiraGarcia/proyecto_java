package com.hackaboss.equipo4.Controller.Component;

import com.hackaboss.equipo4.DTO.Component.ApiResponseDTO;
import com.hackaboss.equipo4.Entity.Component.Auditoria;
import com.hackaboss.equipo4.IService.Component.IBaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T extends Auditoria, S extends IBaseService<T>> {
    protected S service;
    protected String entityName;

    protected BaseController(S service, String entityName) {
        this.service = service;
        this.entityName = entityName;
    }

    @GetMapping("{status}")
    public ResponseEntity<ApiResponseDTO<List<T>>> findByStateTrue() {
        try {
            return ResponseEntity.ok(new ApiResponseDTO<>("Datos obtenidos", service.findByStateTrue(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDTO<>(e.getMessage(), null, false));
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<ApiResponseDTO<T>> show(@PathVariable Long Id) {
        try {
            T entity = service.findById(Id);
            return ResponseEntity.ok(new ApiResponseDTO<T>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDTO<>(e.getMessage(), null, false));
        }
    }

    @PostMapping("{save}")
    public ResponseEntity<ApiResponseDTO<T>> save(@RequestBody T entity) {
        try {
            return ResponseEntity.ok(new ApiResponseDTO<T>("Datos guardados", service.save(entity), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDTO<T>(e.getMessage(), null, false));
        }
    }

    @PutMapping("{update}")
    public ResponseEntity<ApiResponseDTO<T>> update(@PathVariable Long id, @RequestBody T entity) {
        try {
            service.update(id, entity);
            return ResponseEntity.ok(new ApiResponseDTO<T>("Datos actualizados", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDTO<>(e.getMessage(), null, false));
        }
    }
}
