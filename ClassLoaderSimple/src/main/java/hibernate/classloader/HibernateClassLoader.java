package hibernate.classloader;

import constant.Type;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class HibernateClassLoader extends ClassLoader {
  /**
   * This constructor is used to set the parent ClassLoader
   */
  public HibernateClassLoader(ClassLoader parent){
    super(parent);
  }

  /**
   *
   * @param type Postgres, Msql...
   * @param classNameType : Repository ,..
   * @return
   */
  public Object loadClass(Type type, Class classNameType)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    String className = classNameType.getSimpleName();
    String packageName = "impl.%s.%sImpl";
    switch (type){
      case POSTGRES:
        System.out.println("Load list class of POSTGRES");
        break;
      case MONGODB:
        System.out.println("Load list class of MONGODB");
        break;
      case MYSQL:
        System.out.println("Load list class of MYSQL");
        break;
      case SQL:
        System.out.println("Load list class of SQL");
        break;
      case ORACLE:
        System.out.println("Load list class of ORACLE");
        break;
      case NEO4J:
        System.out.println("Load list class of NEO4J");
        break;
      default:
        return null;
    }

    Class clas = this.getClass(String.format(packageName,type.toString(),className));

    if(clas==null){
      System.out.println("Can not get class.");
      return null;
    }
    System.out.println("Return object.");
    return clas.newInstance();

  }


  /**
   * Loads the class from the file system. The class file should be located in the file system. The name should be relative to get the file location.
   * @param name : Fully Classified name of the class, for example com.journaldev.Foo
   */
  private Class getClass (String name ) throws ClassNotFoundException{
    String file = name.replace('.', File.separatorChar)+".class";
    byte[] b = null;
    try{
      //This loads the byte code data from the file
      b = loadClassFileData(file);
      //define class is inherited from the classloader class
      //That converts byte array into a Class. DefineClass is Final
      //So we cannot override it.
      Class c = defineClass(name, b, 0, b.length);
      resolveClass(c);
      return c;
    }catch (IOException e){
      e.printStackTrace();
      return null;
    }
  }

  /**
   * Reads the file (.class) into a byte array. The file should be
   * accessible as a resource and make sure that it's not in Classpath to a void
   * any confustion.
   * @param name : file name
   */
  private byte[] loadClassFileData(String name) throws IOException{
    InputStream stream = getClass().getClassLoader().getResourceAsStream(name);
    int size = stream.available();
    byte[] buff = new byte[size];
    DataInputStream in = new DataInputStream(stream);
    in.readFully(buff);
    in.close();
    return  buff;
  }
}
