package hibernate.classloader.impl;

import hibernate.classloader.HibernateClassLoader;

public class MongoClassLoader extends HibernateClassLoader {

  /**
   * This constructor is used to set the parent ClassLoader
   *
   * @param parent
   */
  public MongoClassLoader(ClassLoader parent) {
    super(parent);
  }
}
