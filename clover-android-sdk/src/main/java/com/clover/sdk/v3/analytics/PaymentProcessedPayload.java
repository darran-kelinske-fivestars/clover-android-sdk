/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.analytics;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getMerchant merchant}</li>
 * <li>{@link #getOrder order}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PaymentProcessedPayload extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.base.Reference getMerchant() {
    return genClient.cacheGet(CacheKey.merchant);
  }

  public com.clover.sdk.v3.order.Order getOrder() {
    return genClient.cacheGet(CacheKey.order);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PaymentProcessedPayload> {
    merchant {
      @Override
      public Object extractValue(PaymentProcessedPayload instance) {
        return instance.genClient.extractRecord("merchant", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    order {
      @Override
      public Object extractValue(PaymentProcessedPayload instance) {
        return instance.genClient.extractRecord("order", com.clover.sdk.v3.order.Order.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<PaymentProcessedPayload> genClient;

  /**
  * Constructs a new empty instance.
  */
  public PaymentProcessedPayload() {
    genClient = new GenericClient<PaymentProcessedPayload>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected PaymentProcessedPayload(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentProcessedPayload(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public PaymentProcessedPayload(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentProcessedPayload(PaymentProcessedPayload src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
  }

  /** Checks whether the 'merchant' field is set and is not null */
  public boolean isNotNullMerchant() {
    return genClient.cacheValueIsNotNull(CacheKey.merchant);
  }

  /** Checks whether the 'order' field is set and is not null */
  public boolean isNotNullOrder() {
    return genClient.cacheValueIsNotNull(CacheKey.order);
  }



  /** Checks whether the 'merchant' field has been set, however the value could be null */
  public boolean hasMerchant() {
    return genClient.cacheHasKey(CacheKey.merchant);
  }

  /** Checks whether the 'order' field has been set, however the value could be null */
  public boolean hasOrder() {
    return genClient.cacheHasKey(CacheKey.order);
  }


  /**
   * Sets the field 'merchant'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentProcessedPayload setMerchant(com.clover.sdk.v3.base.Reference merchant) {
    return genClient.setRecord(merchant, CacheKey.merchant);
  }

  /**
   * Sets the field 'order'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentProcessedPayload setOrder(com.clover.sdk.v3.order.Order order) {
    return genClient.setRecord(order, CacheKey.order);
  }


  /** Clears the 'merchant' field, the 'has' method for this field will now return false */
  public void clearMerchant() {
    genClient.clear(CacheKey.merchant);
  }
  /** Clears the 'order' field, the 'has' method for this field will now return false */
  public void clearOrder() {
    genClient.clear(CacheKey.order);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public PaymentProcessedPayload copyChanges() {
    PaymentProcessedPayload copy = new PaymentProcessedPayload();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentProcessedPayload src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PaymentProcessedPayload(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PaymentProcessedPayload> CREATOR = new android.os.Parcelable.Creator<PaymentProcessedPayload>() {
    @Override
    public PaymentProcessedPayload createFromParcel(android.os.Parcel in) {
      PaymentProcessedPayload instance = new PaymentProcessedPayload(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PaymentProcessedPayload[] newArray(int size) {
      return new PaymentProcessedPayload[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentProcessedPayload> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentProcessedPayload>() {
    @Override
    public PaymentProcessedPayload create(org.json.JSONObject jsonObject) {
      return new PaymentProcessedPayload(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean MERCHANT_IS_REQUIRED = false;
    public static final boolean ORDER_IS_REQUIRED = false;

  }

}