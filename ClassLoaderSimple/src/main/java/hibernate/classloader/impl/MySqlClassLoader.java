package hibernate.classloader.impl;

import hibernate.classloader.HibernateClassLoader;

public class MySqlClassLoader extends HibernateClassLoader {

  /**
   * This constructor is used to set the parent ClassLoader
   *
   * @param parent
   */
  public MySqlClassLoader(ClassLoader parent) {
    super(parent);
  }
}
