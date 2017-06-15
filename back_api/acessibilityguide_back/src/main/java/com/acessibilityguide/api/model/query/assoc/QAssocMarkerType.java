package com.acessibilityguide.api.model.query.assoc;

import com.acessibilityguide.api.model.MarkerType;
import com.acessibilityguide.api.model.query.QMarkerType;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQAssocBean;
import org.avaje.ebean.typequery.TQProperty;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocMarkerType.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocMarkerType<R> extends TQAssocBean<MarkerType,R> {

  public PLong<R> id;
  public PString<R> name;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QMarkerType>... properties) {
    return fetchProperties(properties);
  }

  public QAssocMarkerType(String name, R root) {
    super(name, root);
  }
}
