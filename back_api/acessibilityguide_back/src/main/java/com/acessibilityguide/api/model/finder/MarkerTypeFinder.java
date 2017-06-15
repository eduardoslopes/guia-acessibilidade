package com.acessibilityguide.api.model.finder;

import com.acessibilityguide.api.model.MarkerType;
import com.acessibilityguide.api.model.query.QMarkerType;
import com.avaje.ebean.Finder;

public class MarkerTypeFinder extends Finder<Long,MarkerType> {

  /**
   * Construct using the default EbeanServer.
   */
  public MarkerTypeFinder() {
    super(MarkerType.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public MarkerTypeFinder(String serverName) {
    super(MarkerType.class, serverName);
  }

  /**
   * Start a new typed query.
   */
  protected QMarkerType where() {
     return new QMarkerType(db());
  }
}
