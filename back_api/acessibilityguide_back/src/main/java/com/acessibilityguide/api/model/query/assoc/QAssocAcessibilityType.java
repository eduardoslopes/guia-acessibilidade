package com.acessibilityguide.api.model.query.assoc;

import com.acessibilityguide.api.model.AcessibilityType;
import com.acessibilityguide.api.model.query.QAcessibilityType;
import org.avaje.ebean.typequery.PBoolean;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQAssocBean;
import org.avaje.ebean.typequery.TQProperty;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocAcessibilityType.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocAcessibilityType<R> extends TQAssocBean<AcessibilityType,R> {

  public PLong<R> id;
  public PString<R> name;
  public PBoolean<R> another;
  public QAssocMarker<R> markers;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QAcessibilityType>... properties) {
    return fetchProperties(properties);
  }

  public QAssocAcessibilityType(String name, R root) {
    super(name, root);
  }
}
