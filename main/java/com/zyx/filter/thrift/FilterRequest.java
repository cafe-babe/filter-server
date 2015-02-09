/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.zyx.filter.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 过滤请求
 */
public class FilterRequest implements org.apache.thrift.TBase<FilterRequest, FilterRequest._Fields>, java.io.Serializable, Cloneable, Comparable<FilterRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FilterRequest");

  private static final org.apache.thrift.protocol.TField BUSINESS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("business_name", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField FILTER_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("filterField", org.apache.thrift.protocol.TType.MAP, (short)11);
  private static final org.apache.thrift.protocol.TField FILTER_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("filterMap", org.apache.thrift.protocol.TType.MAP, (short)12);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FilterRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FilterRequestTupleSchemeFactory());
  }

  public String business_name; // optional
  public Map<String,String> filterField; // required
  public Map<String,TFilter> filterMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUSINESS_NAME((short)5, "business_name"),
    FILTER_FIELD((short)11, "filterField"),
    FILTER_MAP((short)12, "filterMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 5: // BUSINESS_NAME
          return BUSINESS_NAME;
        case 11: // FILTER_FIELD
          return FILTER_FIELD;
        case 12: // FILTER_MAP
          return FILTER_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.BUSINESS_NAME,_Fields.FILTER_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUSINESS_NAME, new org.apache.thrift.meta_data.FieldMetaData("business_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FILTER_FIELD, new org.apache.thrift.meta_data.FieldMetaData("filterField", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.FILTER_MAP, new org.apache.thrift.meta_data.FieldMetaData("filterMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TFilter.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FilterRequest.class, metaDataMap);
  }

  public FilterRequest() {
  }

  public FilterRequest(
    Map<String,String> filterField)
  {
    this();
    this.filterField = filterField;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FilterRequest(FilterRequest other) {
    if (other.isSetBusiness_name()) {
      this.business_name = other.business_name;
    }
    if (other.isSetFilterField()) {
      Map<String,String> __this__filterField = new HashMap<String,String>(other.filterField);
      this.filterField = __this__filterField;
    }
    if (other.isSetFilterMap()) {
      Map<String,TFilter> __this__filterMap = new HashMap<String,TFilter>(other.filterMap.size());
      for (Map.Entry<String, TFilter> other_element : other.filterMap.entrySet()) {

        String other_element_key = other_element.getKey();
        TFilter other_element_value = other_element.getValue();

        String __this__filterMap_copy_key = other_element_key;

        TFilter __this__filterMap_copy_value = new TFilter(other_element_value);

        __this__filterMap.put(__this__filterMap_copy_key, __this__filterMap_copy_value);
      }
      this.filterMap = __this__filterMap;
    }
  }

  public FilterRequest deepCopy() {
    return new FilterRequest(this);
  }

  @Override
  public void clear() {
    this.business_name = null;
    this.filterField = null;
    this.filterMap = null;
  }

  public String getBusiness_name() {
    return this.business_name;
  }

  public FilterRequest setBusiness_name(String business_name) {
    this.business_name = business_name;
    return this;
  }

  public void unsetBusiness_name() {
    this.business_name = null;
  }

  /** Returns true if field business_name is set (has been assigned a value) and false otherwise */
  public boolean isSetBusiness_name() {
    return this.business_name != null;
  }

  public void setBusiness_nameIsSet(boolean value) {
    if (!value) {
      this.business_name = null;
    }
  }

  public int getFilterFieldSize() {
    return (this.filterField == null) ? 0 : this.filterField.size();
  }

  public void putToFilterField(String key, String val) {
    if (this.filterField == null) {
      this.filterField = new HashMap<String,String>();
    }
    this.filterField.put(key, val);
  }

  public Map<String,String> getFilterField() {
    return this.filterField;
  }

  public FilterRequest setFilterField(Map<String,String> filterField) {
    this.filterField = filterField;
    return this;
  }

  public void unsetFilterField() {
    this.filterField = null;
  }

  /** Returns true if field filterField is set (has been assigned a value) and false otherwise */
  public boolean isSetFilterField() {
    return this.filterField != null;
  }

  public void setFilterFieldIsSet(boolean value) {
    if (!value) {
      this.filterField = null;
    }
  }

  public int getFilterMapSize() {
    return (this.filterMap == null) ? 0 : this.filterMap.size();
  }

  public void putToFilterMap(String key, TFilter val) {
    if (this.filterMap == null) {
      this.filterMap = new HashMap<String,TFilter>();
    }
    this.filterMap.put(key, val);
  }

  public Map<String,TFilter> getFilterMap() {
    return this.filterMap;
  }

  public FilterRequest setFilterMap(Map<String,TFilter> filterMap) {
    this.filterMap = filterMap;
    return this;
  }

  public void unsetFilterMap() {
    this.filterMap = null;
  }

  /** Returns true if field filterMap is set (has been assigned a value) and false otherwise */
  public boolean isSetFilterMap() {
    return this.filterMap != null;
  }

  public void setFilterMapIsSet(boolean value) {
    if (!value) {
      this.filterMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BUSINESS_NAME:
      if (value == null) {
        unsetBusiness_name();
      } else {
        setBusiness_name((String)value);
      }
      break;

    case FILTER_FIELD:
      if (value == null) {
        unsetFilterField();
      } else {
        setFilterField((Map<String,String>)value);
      }
      break;

    case FILTER_MAP:
      if (value == null) {
        unsetFilterMap();
      } else {
        setFilterMap((Map<String,TFilter>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BUSINESS_NAME:
      return getBusiness_name();

    case FILTER_FIELD:
      return getFilterField();

    case FILTER_MAP:
      return getFilterMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BUSINESS_NAME:
      return isSetBusiness_name();
    case FILTER_FIELD:
      return isSetFilterField();
    case FILTER_MAP:
      return isSetFilterMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FilterRequest)
      return this.equals((FilterRequest)that);
    return false;
  }

  public boolean equals(FilterRequest that) {
    if (that == null)
      return false;

    boolean this_present_business_name = true && this.isSetBusiness_name();
    boolean that_present_business_name = true && that.isSetBusiness_name();
    if (this_present_business_name || that_present_business_name) {
      if (!(this_present_business_name && that_present_business_name))
        return false;
      if (!this.business_name.equals(that.business_name))
        return false;
    }

    boolean this_present_filterField = true && this.isSetFilterField();
    boolean that_present_filterField = true && that.isSetFilterField();
    if (this_present_filterField || that_present_filterField) {
      if (!(this_present_filterField && that_present_filterField))
        return false;
      if (!this.filterField.equals(that.filterField))
        return false;
    }

    boolean this_present_filterMap = true && this.isSetFilterMap();
    boolean that_present_filterMap = true && that.isSetFilterMap();
    if (this_present_filterMap || that_present_filterMap) {
      if (!(this_present_filterMap && that_present_filterMap))
        return false;
      if (!this.filterMap.equals(that.filterMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(FilterRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBusiness_name()).compareTo(other.isSetBusiness_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusiness_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.business_name, other.business_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilterField()).compareTo(other.isSetFilterField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilterField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filterField, other.filterField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilterMap()).compareTo(other.isSetFilterMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilterMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filterMap, other.filterMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FilterRequest(");
    boolean first = true;

    if (isSetBusiness_name()) {
      sb.append("business_name:");
      if (this.business_name == null) {
        sb.append("null");
      } else {
        sb.append(this.business_name);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("filterField:");
    if (this.filterField == null) {
      sb.append("null");
    } else {
      sb.append(this.filterField);
    }
    first = false;
    if (isSetFilterMap()) {
      if (!first) sb.append(", ");
      sb.append("filterMap:");
      if (this.filterMap == null) {
        sb.append("null");
      } else {
        sb.append(this.filterMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (filterField == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'filterField' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FilterRequestStandardSchemeFactory implements SchemeFactory {
    public FilterRequestStandardScheme getScheme() {
      return new FilterRequestStandardScheme();
    }
  }

  private static class FilterRequestStandardScheme extends StandardScheme<FilterRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FilterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 5: // BUSINESS_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.business_name = iprot.readString();
              struct.setBusiness_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // FILTER_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.filterField = new HashMap<String,String>(2*_map8.size);
                for (int _i9 = 0; _i9 < _map8.size; ++_i9)
                {
                  String _key10;
                  String _val11;
                  _key10 = iprot.readString();
                  _val11 = iprot.readString();
                  struct.filterField.put(_key10, _val11);
                }
                iprot.readMapEnd();
              }
              struct.setFilterFieldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // FILTER_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map12 = iprot.readMapBegin();
                struct.filterMap = new HashMap<String,TFilter>(2*_map12.size);
                for (int _i13 = 0; _i13 < _map12.size; ++_i13)
                {
                  String _key14;
                  TFilter _val15;
                  _key14 = iprot.readString();
                  _val15 = new TFilter();
                  _val15.read(iprot);
                  struct.filterMap.put(_key14, _val15);
                }
                iprot.readMapEnd();
              }
              struct.setFilterMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, FilterRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.business_name != null) {
        if (struct.isSetBusiness_name()) {
          oprot.writeFieldBegin(BUSINESS_NAME_FIELD_DESC);
          oprot.writeString(struct.business_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.filterField != null) {
        oprot.writeFieldBegin(FILTER_FIELD_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.filterField.size()));
          for (Map.Entry<String, String> _iter16 : struct.filterField.entrySet())
          {
            oprot.writeString(_iter16.getKey());
            oprot.writeString(_iter16.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.filterMap != null) {
        if (struct.isSetFilterMap()) {
          oprot.writeFieldBegin(FILTER_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.filterMap.size()));
            for (Map.Entry<String, TFilter> _iter17 : struct.filterMap.entrySet())
            {
              oprot.writeString(_iter17.getKey());
              _iter17.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FilterRequestTupleSchemeFactory implements SchemeFactory {
    public FilterRequestTupleScheme getScheme() {
      return new FilterRequestTupleScheme();
    }
  }

  private static class FilterRequestTupleScheme extends TupleScheme<FilterRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FilterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.filterField.size());
        for (Map.Entry<String, String> _iter18 : struct.filterField.entrySet())
        {
          oprot.writeString(_iter18.getKey());
          oprot.writeString(_iter18.getValue());
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetBusiness_name()) {
        optionals.set(0);
      }
      if (struct.isSetFilterMap()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBusiness_name()) {
        oprot.writeString(struct.business_name);
      }
      if (struct.isSetFilterMap()) {
        {
          oprot.writeI32(struct.filterMap.size());
          for (Map.Entry<String, TFilter> _iter19 : struct.filterMap.entrySet())
          {
            oprot.writeString(_iter19.getKey());
            _iter19.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FilterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map20 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.filterField = new HashMap<String,String>(2*_map20.size);
        for (int _i21 = 0; _i21 < _map20.size; ++_i21)
        {
          String _key22;
          String _val23;
          _key22 = iprot.readString();
          _val23 = iprot.readString();
          struct.filterField.put(_key22, _val23);
        }
      }
      struct.setFilterFieldIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.business_name = iprot.readString();
        struct.setBusiness_nameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map24 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.filterMap = new HashMap<String,TFilter>(2*_map24.size);
          for (int _i25 = 0; _i25 < _map24.size; ++_i25)
          {
            String _key26;
            TFilter _val27;
            _key26 = iprot.readString();
            _val27 = new TFilter();
            _val27.read(iprot);
            struct.filterMap.put(_key26, _val27);
          }
        }
        struct.setFilterMapIsSet(true);
      }
    }
  }

}

