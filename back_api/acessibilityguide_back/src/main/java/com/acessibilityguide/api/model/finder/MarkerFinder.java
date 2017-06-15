package com.acessibilityguide.api.model.finder;

import com.acessibilityguide.api.model.Marker;
import com.acessibilityguide.api.model.query.QMarker;
import com.avaje.ebean.Finder;

public class MarkerFinder extends Finder<Long,Marker> {

  /**
   * Construct using the default EbeanServer.
   */
  public MarkerFinder() {
    super(Marker.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public MarkerFinder(String serverName) {
    super(Marker.class, serverName);
  }

  /**
   * Start a new typed query.
   */
  protected QMarker where() {
     return new QMarker(db());
  }
}
