package constant;

public enum Type {
  POSTGRES("postgres"), MYSQL("mysql"), SQL("sql"), MONGODB("mongo"), ORACLE("oracle"), NEO4J("neo4j");
    Type(String name){
      this.value = name;
    }

    private String value;

    public String getName(){
      return this.value;
    }
  @Override
  public String toString() {
    return this.getName();
  }
}
