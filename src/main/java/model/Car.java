package model;

import java.io.Serializable;
import javax.validation.constraints.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car implements Serializable {
  @Id
  @Column(name="ID")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  @Column(name="name")
  private String name;
  
  @Column(name="price")
  private Long price;
  
  public Car() {
    
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id=id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }
}