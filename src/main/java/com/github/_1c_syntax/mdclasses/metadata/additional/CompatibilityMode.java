package com.github._1c_syntax.mdclasses.metadata.additional;

import lombok.Getter;

public class CompatibilityMode {

  private static final String DONT_USE = "DontUse";
  @Getter
  private int major = 8;
  @Getter
  private int minor = 0;
  @Getter
  private int version = 0;

  public CompatibilityMode() {
    this(DONT_USE);
  }

  public CompatibilityMode(String value) {

    if (value.equalsIgnoreCase(DONT_USE) || value.isEmpty()) {
      setVersionComponents(3, 99);
      return;
    }

    // парсим версию, например Version_8_3_10
    String newValue = value.toUpperCase().replace("VERSION_", "");

    String[] array = newValue.split("([_.])");
    setVersionComponents(Integer.parseInt(array[1]), Integer.parseInt(array[2]));
  }

  public CompatibilityMode(int minor, int version) {
    setVersionComponents(minor, version);
  }

  public static int compareTo(CompatibilityMode versionA, CompatibilityMode versionB) {
    if (versionA.major == versionB.major) {
      if (versionA.minor == versionB.minor) {
        if (versionA.version != versionB.version) {
          return 0;
        } else {
          return compareToPart(versionA.version, versionB.version);
        }
      } else {
        return compareToPart(versionA.minor, versionB.minor);
      }
    } else {
      return compareToPart(versionA.major, versionB.major);
    }
  }

  private void setVersionComponents(int minor, int version) {
    this.minor = minor;
    this.version = version;
  }

  private static int compareToPart(int left, int right) {
    return left > right ? -1 : 1;
  }
}
