/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ProductDeleteEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6352801932442290522L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductDeleteEvent\",\"fields\":[{\"name\":\"productId\",\"type\":\"long\"},{\"name\":\"productName\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ProductDeleteEvent> ENCODER =
      new BinaryMessageEncoder<ProductDeleteEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ProductDeleteEvent> DECODER =
      new BinaryMessageDecoder<ProductDeleteEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ProductDeleteEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ProductDeleteEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ProductDeleteEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ProductDeleteEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ProductDeleteEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ProductDeleteEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ProductDeleteEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ProductDeleteEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long productId;
   private java.lang.CharSequence productName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProductDeleteEvent() {}

  /**
   * All-args constructor.
   * @param productId The new value for productId
   * @param productName The new value for productName
   */
  public ProductDeleteEvent(java.lang.Long productId, java.lang.CharSequence productName) {
    this.productId = productId;
    this.productName = productName;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return productId;
    case 1: return productName;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: productId = (java.lang.Long)value$; break;
    case 1: productName = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'productId' field.
   * @return The value of the 'productId' field.
   */
  public long getProductId() {
    return productId;
  }


  /**
   * Sets the value of the 'productId' field.
   * @param value the value to set.
   */
  public void setProductId(long value) {
    this.productId = value;
  }

  /**
   * Gets the value of the 'productName' field.
   * @return The value of the 'productName' field.
   */
  public java.lang.CharSequence getProductName() {
    return productName;
  }


  /**
   * Sets the value of the 'productName' field.
   * @param value the value to set.
   */
  public void setProductName(java.lang.CharSequence value) {
    this.productName = value;
  }

  /**
   * Creates a new ProductDeleteEvent RecordBuilder.
   * @return A new ProductDeleteEvent RecordBuilder
   */
  public static ProductDeleteEvent.Builder newBuilder() {
    return new ProductDeleteEvent.Builder();
  }

  /**
   * Creates a new ProductDeleteEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProductDeleteEvent RecordBuilder
   */
  public static ProductDeleteEvent.Builder newBuilder(ProductDeleteEvent.Builder other) {
    if (other == null) {
      return new ProductDeleteEvent.Builder();
    } else {
      return new ProductDeleteEvent.Builder(other);
    }
  }

  /**
   * Creates a new ProductDeleteEvent RecordBuilder by copying an existing ProductDeleteEvent instance.
   * @param other The existing instance to copy.
   * @return A new ProductDeleteEvent RecordBuilder
   */
  public static ProductDeleteEvent.Builder newBuilder(ProductDeleteEvent other) {
    if (other == null) {
      return new ProductDeleteEvent.Builder();
    } else {
      return new ProductDeleteEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for ProductDeleteEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductDeleteEvent>
    implements org.apache.avro.data.RecordBuilder<ProductDeleteEvent> {

    private long productId;
    private java.lang.CharSequence productName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ProductDeleteEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.productName)) {
        this.productName = data().deepCopy(fields()[1].schema(), other.productName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing ProductDeleteEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(ProductDeleteEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.productName)) {
        this.productName = data().deepCopy(fields()[1].schema(), other.productName);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'productId' field.
      * @return The value.
      */
    public long getProductId() {
      return productId;
    }


    /**
      * Sets the value of the 'productId' field.
      * @param value The value of 'productId'.
      * @return This builder.
      */
    public ProductDeleteEvent.Builder setProductId(long value) {
      validate(fields()[0], value);
      this.productId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'productId' field has been set.
      * @return True if the 'productId' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'productId' field.
      * @return This builder.
      */
    public ProductDeleteEvent.Builder clearProductId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'productName' field.
      * @return The value.
      */
    public java.lang.CharSequence getProductName() {
      return productName;
    }


    /**
      * Sets the value of the 'productName' field.
      * @param value The value of 'productName'.
      * @return This builder.
      */
    public ProductDeleteEvent.Builder setProductName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.productName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'productName' field has been set.
      * @return True if the 'productName' field has been set, false otherwise.
      */
    public boolean hasProductName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'productName' field.
      * @return This builder.
      */
    public ProductDeleteEvent.Builder clearProductName() {
      productName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProductDeleteEvent build() {
      try {
        ProductDeleteEvent record = new ProductDeleteEvent();
        record.productId = fieldSetFlags()[0] ? this.productId : (java.lang.Long) defaultValue(fields()[0]);
        record.productName = fieldSetFlags()[1] ? this.productName : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ProductDeleteEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<ProductDeleteEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ProductDeleteEvent>
    READER$ = (org.apache.avro.io.DatumReader<ProductDeleteEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.productId);

    out.writeString(this.productName);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.productId = in.readLong();

      this.productName = in.readString(this.productName instanceof Utf8 ? (Utf8)this.productName : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.productId = in.readLong();
          break;

        case 1:
          this.productName = in.readString(this.productName instanceof Utf8 ? (Utf8)this.productName : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










