package br.com.fiap.mototrack_backend_java.controller;

import br.com.fiap.mototrack_backend_java.interfaces.IBaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T, ID> {

    protected final IBaseService<T, ID> service;

    public BaseController(IBaseService<T, ID> service) {
        this.service = service;
    }

    @GetMapping("/listar/todos")
    public List<T> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/listar/{id}")
    public T buscarPorId(@PathVariable ID id) {
        return service.buscarPorId(id);
    }

    @PostMapping("/salvar")
    public T salvar(@RequestBody T entity){
        return service.salvar(entity);
    }

    @PutMapping("atualizar/{id}")
    public T atualizar(@PathVariable ID id, @RequestBody T entity){
        return service.atualizar(id, entity);
    }

    @DeleteMapping("deletar/{id}")
    public String deletar(@PathVariable ID id) {
        return service.deletar(id);
    }
}
