package cn.bdqn.tangcco.entity;

public class Directionary {
    private Integer directionaryId;

    private String name;

    private String type;

    private Integer number;

    public Integer getDirectionaryId() {
        return directionaryId;
    }

    public void setDirectionaryId(Integer directionaryId) {
        this.directionaryId = directionaryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}