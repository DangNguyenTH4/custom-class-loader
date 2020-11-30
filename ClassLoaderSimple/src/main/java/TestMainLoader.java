import constant.Type;
import hibernate.classloader.HibernateClassLoader;
import hibernate.classloader.impl.MongoClassLoader;
import hibernate.classloader.impl.MySqlClassLoader;
import hibernate.classloader.impl.PostgresClassLoader;
import wrap.Repository;
import wrap.TransactionManager;

public class TestMainLoader {

  public static void main(String[] args) {
    try {

//      Repository repository = (Repository)ob;
//      repository.findById(null);

      HibernateClassLoader hibernateClassLoader = new MongoClassLoader(TestMainLoader.class.getClassLoader());
      Object ob = hibernateClassLoader.loadClass(Type.MONGODB, Repository.class);
      Repository repository = (Repository)ob;
      repository.findById(null);
      System.out.println(repository.getClass().getClassLoader());

      ob = hibernateClassLoader.loadClass(Type.MONGODB, TransactionManager.class);
      TransactionManager transactionManager = (TransactionManager)ob;
      transactionManager.commit(null);
      System.out.println(transactionManager.getClass().getClassLoader());
/*
 *
 */
//      hibernateClassLoader.
      hibernateClassLoader = new MySqlClassLoader(TestMainLoader.class.getClassLoader());
      ob = hibernateClassLoader.loadClass(Type.MYSQL, Repository.class);
      repository = (Repository)ob;
      repository.findById(null);
      System.out.println(repository.getClass().getClassLoader());

      ob = hibernateClassLoader.loadClass(Type.MYSQL, TransactionManager.class);
      transactionManager = (TransactionManager)ob;
      transactionManager.commit(null);
      System.out.println(transactionManager.getClass().getClassLoader());


      hibernateClassLoader = new PostgresClassLoader(TestMainLoader.class.getClassLoader());
      ob = hibernateClassLoader.loadClass(Type.POSTGRES, Repository.class);
      repository = (Repository)ob;
      repository.findById(null);
      System.out.println(repository.getClass().getClassLoader());

      ob = hibernateClassLoader.loadClass(Type.POSTGRES, Repository.class);
      repository = (Repository)ob;
      repository.findById(null);
      System.out.println(repository.getClass().getClassLoader());

      ob = hibernateClassLoader.loadClass(Type.POSTGRES, TransactionManager.class);
      transactionManager = (TransactionManager)ob;
      transactionManager.commit(null);
      System.out.println(transactionManager.getClass().getClassLoader());

    }catch (Exception ex){
      System.out.println("Got ex");
      ex.printStackTrace();
    }
  }
}
