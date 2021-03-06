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

package com.clover.sdk.v3.billing;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getPrice price}</li>
 * <li>{@link #getDeviceCountInfo deviceCountInfo}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class DevicePriceInfo extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.Long getPrice() {
    return genClient.cacheGet(CacheKey.price);
  }

  public com.clover.sdk.v3.billing.DeviceCountInfo getDeviceCountInfo() {
    return genClient.cacheGet(CacheKey.deviceCountInfo);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<DevicePriceInfo> {
    price {
      @Override
      public Object extractValue(DevicePriceInfo instance) {
        return instance.genClient.extractOther("price", java.lang.Long.class);
      }
    },
    deviceCountInfo {
      @Override
      public Object extractValue(DevicePriceInfo instance) {
        return instance.genClient.extractRecord("deviceCountInfo", com.clover.sdk.v3.billing.DeviceCountInfo.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<DevicePriceInfo> genClient;

  /**
  * Constructs a new empty instance.
  */
  public DevicePriceInfo() {
    genClient = new GenericClient<DevicePriceInfo>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected DevicePriceInfo(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public DevicePriceInfo(String json) throws IllegalArgumentException {
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
  public DevicePriceInfo(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public DevicePriceInfo(DevicePriceInfo src) {
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

  /** Checks whether the 'price' field is set and is not null */
  public boolean isNotNullPrice() {
    return genClient.cacheValueIsNotNull(CacheKey.price);
  }

  /** Checks whether the 'deviceCountInfo' field is set and is not null */
  public boolean isNotNullDeviceCountInfo() {
    return genClient.cacheValueIsNotNull(CacheKey.deviceCountInfo);
  }



  /** Checks whether the 'price' field has been set, however the value could be null */
  public boolean hasPrice() {
    return genClient.cacheHasKey(CacheKey.price);
  }

  /** Checks whether the 'deviceCountInfo' field has been set, however the value could be null */
  public boolean hasDeviceCountInfo() {
    return genClient.cacheHasKey(CacheKey.deviceCountInfo);
  }


  /**
   * Sets the field 'price'.
   */
  public DevicePriceInfo setPrice(java.lang.Long price) {
    return genClient.setOther(price, CacheKey.price);
  }

  /**
   * Sets the field 'deviceCountInfo'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public DevicePriceInfo setDeviceCountInfo(com.clover.sdk.v3.billing.DeviceCountInfo deviceCountInfo) {
    return genClient.setRecord(deviceCountInfo, CacheKey.deviceCountInfo);
  }


  /** Clears the 'price' field, the 'has' method for this field will now return false */
  public void clearPrice() {
    genClient.clear(CacheKey.price);
  }
  /** Clears the 'deviceCountInfo' field, the 'has' method for this field will now return false */
  public void clearDeviceCountInfo() {
    genClient.clear(CacheKey.deviceCountInfo);
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
  public DevicePriceInfo copyChanges() {
    DevicePriceInfo copy = new DevicePriceInfo();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(DevicePriceInfo src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new DevicePriceInfo(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<DevicePriceInfo> CREATOR = new android.os.Parcelable.Creator<DevicePriceInfo>() {
    @Override
    public DevicePriceInfo createFromParcel(android.os.Parcel in) {
      DevicePriceInfo instance = new DevicePriceInfo(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public DevicePriceInfo[] newArray(int size) {
      return new DevicePriceInfo[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<DevicePriceInfo> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<DevicePriceInfo>() {
    @Override
    public DevicePriceInfo create(org.json.JSONObject jsonObject) {
      return new DevicePriceInfo(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean PRICE_IS_REQUIRED = false;
    public static final boolean DEVICECOUNTINFO_IS_REQUIRED = false;

  }

}
