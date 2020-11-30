package hibernate.classloader.impl;

import hibernate.classloader.HibernateClassLoader;

/**
 * For create multiple bean, object per db type.
 */
public class PostgresClassLoader extends HibernateClassLoader {

  /**
   * This constructor is used to set the parent ClassLoader
   *
   * @param parent
   */
  public PostgresClassLoader(ClassLoader parent) {
    super(parent);
  }
}
