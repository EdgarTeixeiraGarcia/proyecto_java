package DTO;

public class ObjectDTO {
    private Long id;
    private String description;
    private String reason;
    private Boolean state;

    public ObjectDTO(Long id, String description, String reason, Boolean state) {
        this.id = id;
        this.description = description;
        this.reason = reason;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getStatus() {
        return state;
    }

    public void setStatus(Boolean status) {
        this.state = state;
    }

}
