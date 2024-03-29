/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package magicalpipelines;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class EntityLifeStages extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3070755094072858213L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EntityLifeStages\",\"namespace\":\"magicalpipelines\",\"fields\":[{\"name\":\"created_at\",\"type\":\"long\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"birth_date\",\"type\":\"long\"},{\"name\":\"login_number\",\"type\":\"int\"},{\"name\":\"life_stage\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EntityLifeStages> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EntityLifeStages> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EntityLifeStages> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EntityLifeStages> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EntityLifeStages> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EntityLifeStages to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EntityLifeStages from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EntityLifeStages instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EntityLifeStages fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long created_at;
  private java.lang.String name;
  private long birth_date;
  private int login_number;
  private java.lang.String life_stage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EntityLifeStages() {}

  /**
   * All-args constructor.
   * @param created_at The new value for created_at
   * @param name The new value for name
   * @param birth_date The new value for birth_date
   * @param login_number The new value for login_number
   * @param life_stage The new value for life_stage
   */
  public EntityLifeStages(java.lang.Long created_at, java.lang.String name, java.lang.Long birth_date, java.lang.Integer login_number, java.lang.String life_stage) {
    this.created_at = created_at;
    this.name = name;
    this.birth_date = birth_date;
    this.login_number = login_number;
    this.life_stage = life_stage;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return created_at;
    case 1: return name;
    case 2: return birth_date;
    case 3: return login_number;
    case 4: return life_stage;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: created_at = (java.lang.Long)value$; break;
    case 1: name = value$ != null ? value$.toString() : null; break;
    case 2: birth_date = (java.lang.Long)value$; break;
    case 3: login_number = (java.lang.Integer)value$; break;
    case 4: life_stage = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'created_at' field.
   * @return The value of the 'created_at' field.
   */
  public long getCreatedAt() {
    return created_at;
  }


  /**
   * Sets the value of the 'created_at' field.
   * @param value the value to set.
   */
  public void setCreatedAt(long value) {
    this.created_at = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'birth_date' field.
   * @return The value of the 'birth_date' field.
   */
  public long getBirthDate() {
    return birth_date;
  }


  /**
   * Sets the value of the 'birth_date' field.
   * @param value the value to set.
   */
  public void setBirthDate(long value) {
    this.birth_date = value;
  }

  /**
   * Gets the value of the 'login_number' field.
   * @return The value of the 'login_number' field.
   */
  public int getLoginNumber() {
    return login_number;
  }


  /**
   * Sets the value of the 'login_number' field.
   * @param value the value to set.
   */
  public void setLoginNumber(int value) {
    this.login_number = value;
  }

  /**
   * Gets the value of the 'life_stage' field.
   * @return The value of the 'life_stage' field.
   */
  public java.lang.String getLifeStage() {
    return life_stage;
  }


  /**
   * Sets the value of the 'life_stage' field.
   * @param value the value to set.
   */
  public void setLifeStage(java.lang.String value) {
    this.life_stage = value;
  }

  /**
   * Creates a new EntityLifeStages RecordBuilder.
   * @return A new EntityLifeStages RecordBuilder
   */
  public static magicalpipelines.EntityLifeStages.Builder newBuilder() {
    return new magicalpipelines.EntityLifeStages.Builder();
  }

  /**
   * Creates a new EntityLifeStages RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EntityLifeStages RecordBuilder
   */
  public static magicalpipelines.EntityLifeStages.Builder newBuilder(magicalpipelines.EntityLifeStages.Builder other) {
    if (other == null) {
      return new magicalpipelines.EntityLifeStages.Builder();
    } else {
      return new magicalpipelines.EntityLifeStages.Builder(other);
    }
  }

  /**
   * Creates a new EntityLifeStages RecordBuilder by copying an existing EntityLifeStages instance.
   * @param other The existing instance to copy.
   * @return A new EntityLifeStages RecordBuilder
   */
  public static magicalpipelines.EntityLifeStages.Builder newBuilder(magicalpipelines.EntityLifeStages other) {
    if (other == null) {
      return new magicalpipelines.EntityLifeStages.Builder();
    } else {
      return new magicalpipelines.EntityLifeStages.Builder(other);
    }
  }

  /**
   * RecordBuilder for EntityLifeStages instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EntityLifeStages>
    implements org.apache.avro.data.RecordBuilder<EntityLifeStages> {

    private long created_at;
    private java.lang.String name;
    private long birth_date;
    private int login_number;
    private java.lang.String life_stage;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(magicalpipelines.EntityLifeStages.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.created_at)) {
        this.created_at = data().deepCopy(fields()[0].schema(), other.created_at);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.birth_date)) {
        this.birth_date = data().deepCopy(fields()[2].schema(), other.birth_date);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.login_number)) {
        this.login_number = data().deepCopy(fields()[3].schema(), other.login_number);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.life_stage)) {
        this.life_stage = data().deepCopy(fields()[4].schema(), other.life_stage);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing EntityLifeStages instance
     * @param other The existing instance to copy.
     */
    private Builder(magicalpipelines.EntityLifeStages other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.created_at)) {
        this.created_at = data().deepCopy(fields()[0].schema(), other.created_at);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.birth_date)) {
        this.birth_date = data().deepCopy(fields()[2].schema(), other.birth_date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.login_number)) {
        this.login_number = data().deepCopy(fields()[3].schema(), other.login_number);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.life_stage)) {
        this.life_stage = data().deepCopy(fields()[4].schema(), other.life_stage);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'created_at' field.
      * @return The value.
      */
    public long getCreatedAt() {
      return created_at;
    }


    /**
      * Sets the value of the 'created_at' field.
      * @param value The value of 'created_at'.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder setCreatedAt(long value) {
      validate(fields()[0], value);
      this.created_at = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'created_at' field has been set.
      * @return True if the 'created_at' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'created_at' field.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder clearCreatedAt() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'birth_date' field.
      * @return The value.
      */
    public long getBirthDate() {
      return birth_date;
    }


    /**
      * Sets the value of the 'birth_date' field.
      * @param value The value of 'birth_date'.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder setBirthDate(long value) {
      validate(fields()[2], value);
      this.birth_date = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'birth_date' field has been set.
      * @return True if the 'birth_date' field has been set, false otherwise.
      */
    public boolean hasBirthDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'birth_date' field.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder clearBirthDate() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'login_number' field.
      * @return The value.
      */
    public int getLoginNumber() {
      return login_number;
    }


    /**
      * Sets the value of the 'login_number' field.
      * @param value The value of 'login_number'.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder setLoginNumber(int value) {
      validate(fields()[3], value);
      this.login_number = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'login_number' field has been set.
      * @return True if the 'login_number' field has been set, false otherwise.
      */
    public boolean hasLoginNumber() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'login_number' field.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder clearLoginNumber() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'life_stage' field.
      * @return The value.
      */
    public java.lang.String getLifeStage() {
      return life_stage;
    }


    /**
      * Sets the value of the 'life_stage' field.
      * @param value The value of 'life_stage'.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder setLifeStage(java.lang.String value) {
      validate(fields()[4], value);
      this.life_stage = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'life_stage' field has been set.
      * @return True if the 'life_stage' field has been set, false otherwise.
      */
    public boolean hasLifeStage() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'life_stage' field.
      * @return This builder.
      */
    public magicalpipelines.EntityLifeStages.Builder clearLifeStage() {
      life_stage = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EntityLifeStages build() {
      try {
        EntityLifeStages record = new EntityLifeStages();
        record.created_at = fieldSetFlags()[0] ? this.created_at : (java.lang.Long) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.birth_date = fieldSetFlags()[2] ? this.birth_date : (java.lang.Long) defaultValue(fields()[2]);
        record.login_number = fieldSetFlags()[3] ? this.login_number : (java.lang.Integer) defaultValue(fields()[3]);
        record.life_stage = fieldSetFlags()[4] ? this.life_stage : (java.lang.String) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EntityLifeStages>
    WRITER$ = (org.apache.avro.io.DatumWriter<EntityLifeStages>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EntityLifeStages>
    READER$ = (org.apache.avro.io.DatumReader<EntityLifeStages>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.created_at);

    out.writeString(this.name);

    out.writeLong(this.birth_date);

    out.writeInt(this.login_number);

    out.writeString(this.life_stage);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.created_at = in.readLong();

      this.name = in.readString();

      this.birth_date = in.readLong();

      this.login_number = in.readInt();

      this.life_stage = in.readString();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.created_at = in.readLong();
          break;

        case 1:
          this.name = in.readString();
          break;

        case 2:
          this.birth_date = in.readLong();
          break;

        case 3:
          this.login_number = in.readInt();
          break;

        case 4:
          this.life_stage = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










