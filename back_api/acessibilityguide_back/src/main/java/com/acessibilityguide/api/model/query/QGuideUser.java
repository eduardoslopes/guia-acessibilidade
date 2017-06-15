package com.acessibilityguide.api.model.query;

import com.acessibilityguide.api.model.GuideUser;
import com.avaje.ebean.EbeanServer;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQRootBean;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Query bean for GuideUser.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QGuideUser extends TQRootBean<GuideUser,QGuideUser> {

  private static final QGuideUser _alias = new QGuideUser(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QGuideUser alias() {
    return _alias;
  }

  public PLong<QGuideUser> id;
  public PString<QGuideUser> name;
  public PString<QGuideUser> cpf;
  public PString<QGuideUser> username;
  public PString<QGuideUser> password;


  /**
   * Construct with a given EbeanServer.
   */
  public QGuideUser(EbeanServer server) {
    super(GuideUser.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QGuideUser() {
    super(GuideUser.class);
  }

  /**
   * Construct for Alias.
   */
  private QGuideUser(boolean dummy) {
    super(dummy);
  }
}
