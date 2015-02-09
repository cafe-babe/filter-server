/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.zyx.filter.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * 关键字过滤行为类型
 */
public enum TBehaviorType implements org.apache.thrift.TEnum {
  NONE(0),
  /**
   * 不改变
   */
  REPLACE(1),
  /**
   * 替换
   */
  REMOVE(2);

  private final int value;

  private TBehaviorType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TBehaviorType findByValue(int value) { 
    switch (value) {
      case 0:
        return NONE;
      case 1:
        return REPLACE;
      case 2:
        return REMOVE;
      default:
        return null;
    }
  }
}
