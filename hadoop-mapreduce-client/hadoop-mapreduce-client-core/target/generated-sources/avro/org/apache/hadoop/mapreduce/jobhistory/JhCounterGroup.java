/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class JhCounterGroup extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"JhCounterGroup\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"counts\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"JhCounter\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"long\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence displayName;
  @Deprecated public java.util.List<org.apache.hadoop.mapreduce.jobhistory.JhCounter> counts;

  /**
   * Default constructor.
   */
  public JhCounterGroup() {}

  /**
   * All-args constructor.
   */
  public JhCounterGroup(java.lang.CharSequence name, java.lang.CharSequence displayName, java.util.List<org.apache.hadoop.mapreduce.jobhistory.JhCounter> counts) {
    this.name = name;
    this.displayName = displayName;
    this.counts = counts;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return displayName;
    case 2: return counts;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: displayName = (java.lang.CharSequence)value$; break;
    case 2: counts = (java.util.List<org.apache.hadoop.mapreduce.jobhistory.JhCounter>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'displayName' field.
   */
  public java.lang.CharSequence getDisplayName() {
    return displayName;
  }

  /**
   * Sets the value of the 'displayName' field.
   * @param value the value to set.
   */
  public void setDisplayName(java.lang.CharSequence value) {
    this.displayName = value;
  }

  /**
   * Gets the value of the 'counts' field.
   */
  public java.util.List<org.apache.hadoop.mapreduce.jobhistory.JhCounter> getCounts() {
    return counts;
  }

  /**
   * Sets the value of the 'counts' field.
   * @param value the value to set.
   */
  public void setCounts(java.util.List<org.apache.hadoop.mapreduce.jobhistory.JhCounter> value) {
    this.counts = value;
  }

  /** Creates a new JhCounterGroup RecordBuilder */
  public static org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder();
  }
  
  /** Creates a new JhCounterGroup RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder(other);
  }
  
  /** Creates a new JhCounterGroup RecordBuilder by copying an existing JhCounterGroup instance */
  public static org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder(other);
  }
  
  /**
   * RecordBuilder for JhCounterGroup instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<JhCounterGroup>
    implements org.apache.avro.data.RecordBuilder<JhCounterGroup> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence displayName;
    private java.util.List<org.apache.hadoop.mapreduce.jobhistory.JhCounter> counts;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing JhCounterGroup instance */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup other) {
            super(org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.displayName)) {
        this.displayName = data().deepCopy(fields()[1].schema(), other.displayName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.counts)) {
        this.counts = data().deepCopy(fields()[2].schema(), other.counts);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'displayName' field */
    public java.lang.CharSequence getDisplayName() {
      return displayName;
    }
    
    /** Sets the value of the 'displayName' field */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder setDisplayName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.displayName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'displayName' field has been set */
    public boolean hasDisplayName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'displayName' field */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder clearDisplayName() {
      displayName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'counts' field */
    public java.util.List<org.apache.hadoop.mapreduce.jobhistory.JhCounter> getCounts() {
      return counts;
    }
    
    /** Sets the value of the 'counts' field */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder setCounts(java.util.List<org.apache.hadoop.mapreduce.jobhistory.JhCounter> value) {
      validate(fields()[2], value);
      this.counts = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'counts' field has been set */
    public boolean hasCounts() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'counts' field */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounterGroup.Builder clearCounts() {
      counts = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public JhCounterGroup build() {
      try {
        JhCounterGroup record = new JhCounterGroup();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.displayName = fieldSetFlags()[1] ? this.displayName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.counts = fieldSetFlags()[2] ? this.counts : (java.util.List<org.apache.hadoop.mapreduce.jobhistory.JhCounter>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
