package com.vtb.lessons;

public class BaseEntity {
    private Long id;

    public BaseEntity() {}

    public BaseEntity(Long id) {}

    public Long getId() {return id;} // Почему тут можем не писать this.id а писать просто id

    public void setId(Long id) {this.id = id;}

    public String toString(StringBuffer sb) {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    //Что делает? Зачем нужен?
    public boolean isNew() {
        return this.id == null;
    }

}
