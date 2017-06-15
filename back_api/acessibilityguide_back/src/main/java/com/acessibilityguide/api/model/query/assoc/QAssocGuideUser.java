package com.acessibilityguide.api.model.query.assoc;

import com.acessibilityguide.api.model.GuideUser;
import com.acessibilityguide.api.model.query.QGuideUser;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQAssocBean;
import org.avaje.ebean.typequery.TQProperty;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocGuideUser.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocGuideUser<R> extends TQAssocBean<GuideUser,R> {

  public PLong<R> id;
  public PString<R> name;
  public PString<R> cpf;
  public PString<R> username;
  public PString<R> password;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QGuideUser>... properties) {
    return fetchProperties(properties);
  }

  public QAssocGuideUser(String name, R root) {
    super(name, root);
  }
}
