/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package MYSCH2;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class columns extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"columns\",\"namespace\":\"MYSCH2\",\"fields\":[{\"name\":\"ID\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ID_isMissing\",\"type\":\"boolean\"},{\"name\":\"NAME\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"NAME_isMissing\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence ID;
  @Deprecated public boolean ID_isMissing;
  @Deprecated public java.lang.CharSequence NAME;
  @Deprecated public boolean NAME_isMissing;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public columns() {}

  /**
   * All-args constructor.
   */
  public columns(java.lang.CharSequence ID, java.lang.Boolean ID_isMissing, java.lang.CharSequence NAME, java.lang.Boolean NAME_isMissing) {
    this.ID = ID;
    this.ID_isMissing = ID_isMissing;
    this.NAME = NAME;
    this.NAME_isMissing = NAME_isMissing;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ID;
    case 1: return ID_isMissing;
    case 2: return NAME;
    case 3: return NAME_isMissing;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ID = (java.lang.CharSequence)value$; break;
    case 1: ID_isMissing = (java.lang.Boolean)value$; break;
    case 2: NAME = (java.lang.CharSequence)value$; break;
    case 3: NAME_isMissing = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ID' field.
   */
  public java.lang.CharSequence getID() {
    return ID;
  }

  /**
   * Sets the value of the 'ID' field.
   * @param value the value to set.
   */
  public void setID(java.lang.CharSequence value) {
    this.ID = value;
  }

  /**
   * Gets the value of the 'ID_isMissing' field.
   */
  public java.lang.Boolean getIDIsMissing() {
    return ID_isMissing;
  }

  /**
   * Sets the value of the 'ID_isMissing' field.
   * @param value the value to set.
   */
  public void setIDIsMissing(java.lang.Boolean value) {
    this.ID_isMissing = value;
  }

  /**
   * Gets the value of the 'NAME' field.
   */
  public java.lang.CharSequence getNAME() {
    return NAME;
  }

  /**
   * Sets the value of the 'NAME' field.
   * @param value the value to set.
   */
  public void setNAME(java.lang.CharSequence value) {
    this.NAME = value;
  }

  /**
   * Gets the value of the 'NAME_isMissing' field.
   */
  public java.lang.Boolean getNAMEIsMissing() {
    return NAME_isMissing;
  }

  /**
   * Sets the value of the 'NAME_isMissing' field.
   * @param value the value to set.
   */
  public void setNAMEIsMissing(java.lang.Boolean value) {
    this.NAME_isMissing = value;
  }

  /** Creates a new columns RecordBuilder */
  public static MYSCH2.columns.Builder newBuilder() {
    return new MYSCH2.columns.Builder();
  }
  
  /** Creates a new columns RecordBuilder by copying an existing Builder */
  public static MYSCH2.columns.Builder newBuilder(MYSCH2.columns.Builder other) {
    return new MYSCH2.columns.Builder(other);
  }
  
  /** Creates a new columns RecordBuilder by copying an existing columns instance */
  public static MYSCH2.columns.Builder newBuilder(MYSCH2.columns other) {
    return new MYSCH2.columns.Builder(other);
  }
  
  /**
   * RecordBuilder for columns instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<columns>
    implements org.apache.avro.data.RecordBuilder<columns> {

    private java.lang.CharSequence ID;
    private boolean ID_isMissing;
    private java.lang.CharSequence NAME;
    private boolean NAME_isMissing;

    /** Creates a new Builder */
    private Builder() {
      super(MYSCH2.columns.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(MYSCH2.columns.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ID)) {
        this.ID = data().deepCopy(fields()[0].schema(), other.ID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ID_isMissing)) {
        this.ID_isMissing = data().deepCopy(fields()[1].schema(), other.ID_isMissing);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.NAME)) {
        this.NAME = data().deepCopy(fields()[2].schema(), other.NAME);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.NAME_isMissing)) {
        this.NAME_isMissing = data().deepCopy(fields()[3].schema(), other.NAME_isMissing);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing columns instance */
    private Builder(MYSCH2.columns other) {
            super(MYSCH2.columns.SCHEMA$);
      if (isValidValue(fields()[0], other.ID)) {
        this.ID = data().deepCopy(fields()[0].schema(), other.ID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ID_isMissing)) {
        this.ID_isMissing = data().deepCopy(fields()[1].schema(), other.ID_isMissing);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.NAME)) {
        this.NAME = data().deepCopy(fields()[2].schema(), other.NAME);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.NAME_isMissing)) {
        this.NAME_isMissing = data().deepCopy(fields()[3].schema(), other.NAME_isMissing);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'ID' field */
    public java.lang.CharSequence getID() {
      return ID;
    }
    
    /** Sets the value of the 'ID' field */
    public MYSCH2.columns.Builder setID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ID = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'ID' field has been set */
    public boolean hasID() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'ID' field */
    public MYSCH2.columns.Builder clearID() {
      ID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'ID_isMissing' field */
    public java.lang.Boolean getIDIsMissing() {
      return ID_isMissing;
    }
    
    /** Sets the value of the 'ID_isMissing' field */
    public MYSCH2.columns.Builder setIDIsMissing(boolean value) {
      validate(fields()[1], value);
      this.ID_isMissing = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'ID_isMissing' field has been set */
    public boolean hasIDIsMissing() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'ID_isMissing' field */
    public MYSCH2.columns.Builder clearIDIsMissing() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'NAME' field */
    public java.lang.CharSequence getNAME() {
      return NAME;
    }
    
    /** Sets the value of the 'NAME' field */
    public MYSCH2.columns.Builder setNAME(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.NAME = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'NAME' field has been set */
    public boolean hasNAME() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'NAME' field */
    public MYSCH2.columns.Builder clearNAME() {
      NAME = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'NAME_isMissing' field */
    public java.lang.Boolean getNAMEIsMissing() {
      return NAME_isMissing;
    }
    
    /** Sets the value of the 'NAME_isMissing' field */
    public MYSCH2.columns.Builder setNAMEIsMissing(boolean value) {
      validate(fields()[3], value);
      this.NAME_isMissing = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'NAME_isMissing' field has been set */
    public boolean hasNAMEIsMissing() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'NAME_isMissing' field */
    public MYSCH2.columns.Builder clearNAMEIsMissing() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public columns build() {
      try {
        columns record = new columns();
        record.ID = fieldSetFlags()[0] ? this.ID : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ID_isMissing = fieldSetFlags()[1] ? this.ID_isMissing : (java.lang.Boolean) defaultValue(fields()[1]);
        record.NAME = fieldSetFlags()[2] ? this.NAME : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.NAME_isMissing = fieldSetFlags()[3] ? this.NAME_isMissing : (java.lang.Boolean) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
