package com.acessibilityguide.api.model.query.assoc;

import com.acessibilityguide.api.model.Marker;
import com.acessibilityguide.api.model.query.QMarker;
import org.avaje.ebean.typequery.PDouble;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQAssocBean;
import org.avaje.ebean.typequery.TQProperty;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocMarker.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocMarker<R> extends TQAssocBean<Marker,R> {

  public PLong<R> id;
  public PString<R> name;
  public PString<R> description;
  public PDouble<R> latitude;
  public PDouble<R> longitude;
  public QAssocMarkerType<R> markerType;
  public QAssocGuideUser<R> user;
  public QAssocComment<R> comments;
  public QAssocAcessibilityType<R> acessibilityTypes;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QMarker>... properties) {
    return fetchProperties(properties);
  }

  public QAssocMarker(String name, R root) {
    super(name, root);
  }
}
