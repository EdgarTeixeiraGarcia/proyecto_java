package Controller;

import DTO.ObjectDTO;
import Entity.Entities.Object;
import IService.IObjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Object")
public class ObjectController {

    @Autowired
    private IObjectsService service;

    @GetMapping()
    public List<ObjectDTO> all() {
        List<Object> objects = service.all();
        return objects.stream().map(Object::toDTO).collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public Optional<ObjectDTO> show(@PathVariable Long id){

        Optional<Object> op = service.findById(id);
        if(op.isEmpty()){
            System.out.println("No existe el id");
            return Optional.of(null);
        }else{
            return Optional.of(op.get().toDTO());
        }
    }

    @PostMapping("/save")
    public void save(Object object){
        service.save(object);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Object object) {
        service.update(id, object);
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/total/{idPersona}")
    public Integer totalObjectPerson(@PathVariable Long id){
       return service.getTotalObjectPerson(id);
    }

}
