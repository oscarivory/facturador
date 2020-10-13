
package org.mybatis.cdi.samples;


public class User {

  private Integer id;
  private String name;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer value) {
    this.id = value;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String value) {
    this.name = value;
  }
}
