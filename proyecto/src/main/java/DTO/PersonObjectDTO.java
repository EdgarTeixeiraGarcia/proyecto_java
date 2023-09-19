package DTO;

import java.time.LocalDateTime;

public class PersonObjectDTO {
    private Long id;
    private LocalDateTime time;
    private Boolean registerType;
    private Boolean error;

    public PersonObjectDTO(Long id, LocalDateTime time, Boolean registerType, Boolean error) {
        this.id = id;
        this.time = time;
        this.registerType = registerType;
        this.error = error;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Boolean registerType) {
        this.registerType = registerType;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}
