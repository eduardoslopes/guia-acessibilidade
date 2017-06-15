package com.acessibilityguide.api.model.query;

import com.acessibilityguide.api.model.MarkerType;
import com.avaje.ebean.EbeanServer;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQRootBean;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Query bean for MarkerType.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QMarkerType extends TQRootBean<MarkerType,QMarkerType> {

  private static final QMarkerType _alias = new QMarkerType(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QMarkerType alias() {
    return _alias;
  }

  public PLong<QMarkerType> id;
  public PString<QMarkerType> name;


  /**
   * Construct with a given EbeanServer.
   */
  public QMarkerType(EbeanServer server) {
    super(MarkerType.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QMarkerType() {
    super(MarkerType.class);
  }

  /**
   * Construct for Alias.
   */
  private QMarkerType(boolean dummy) {
    super(dummy);
  }
}
