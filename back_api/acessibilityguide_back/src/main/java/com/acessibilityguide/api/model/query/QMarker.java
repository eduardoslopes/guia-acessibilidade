package com.acessibilityguide.api.model.query;

import com.acessibilityguide.api.model.Marker;
import com.acessibilityguide.api.model.query.assoc.QAssocAcessibilityType;
import com.acessibilityguide.api.model.query.assoc.QAssocComment;
import com.acessibilityguide.api.model.query.assoc.QAssocGuideUser;
import com.acessibilityguide.api.model.query.assoc.QAssocMarkerType;
import com.avaje.ebean.EbeanServer;
import org.avaje.ebean.typequery.PDouble;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQRootBean;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Marker.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QMarker extends TQRootBean<Marker,QMarker> {

  private static final QMarker _alias = new QMarker(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QMarker alias() {
    return _alias;
  }

  public PLong<QMarker> id;
  public PString<QMarker> name;
  public PString<QMarker> description;
  public PDouble<QMarker> latitude;
  public PDouble<QMarker> longitude;
  public QAssocMarkerType<QMarker> markerType;
  public QAssocGuideUser<QMarker> user;
  public QAssocComment<QMarker> comments;
  public QAssocAcessibilityType<QMarker> acessibilityTypes;


  /**
   * Construct with a given EbeanServer.
   */
  public QMarker(EbeanServer server) {
    super(Marker.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QMarker() {
    super(Marker.class);
  }

  /**
   * Construct for Alias.
   */
  private QMarker(boolean dummy) {
    super(dummy);
  }
}
