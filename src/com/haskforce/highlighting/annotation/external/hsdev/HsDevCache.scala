package com.haskforce.highlighting.annotation.external.hsdev

// TODO: We need TTLs on the cache fields.
final class HsDevCache {
  var installedModules: Option[Vector[HsDevModule]] = None
  var installedModulesMap: Option[Map[String, HsDevModule]] = None
  var symbols: Option[Map[String, Vector[HsDevSymbol]]] = None

  def clear(): Unit = {
    installedModules = None
  }
}
