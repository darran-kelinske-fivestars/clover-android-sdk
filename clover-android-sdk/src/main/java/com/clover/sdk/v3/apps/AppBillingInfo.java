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

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getAppSubscription appSubscription}</li>
 * <li>{@link #getIsInTrial isInTrial}</li>
 * <li>{@link #getBillable billable}</li>
 * <li>{@link #getAppBillable appBillable}</li>
 * <li>{@link #getBillingStartTime billingStartTime}</li>
 * <li>{@link #getStatus status}</li>
 * <li>{@link #getDaysLapsed daysLapsed}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class AppBillingInfo extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * App UUID
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Current subscription level of the merchant for this app
   */
  public com.clover.sdk.v3.apps.AppSubscription getAppSubscription() {
    return genClient.cacheGet(CacheKey.appSubscription);
  }

  /**
   * Returns true if the merchant is in trial for this app.  Only valid for paid apps that offer trials.  Trials apply to app metereds and app subscriptions
   */
  public java.lang.Boolean getIsInTrial() {
    return genClient.cacheGet(CacheKey.isInTrial);
  }

  /**
   * Returns false if there is an app suppression on this particular app for the merchant in context.
   */
  public java.lang.Boolean getBillable() {
    return genClient.cacheGet(CacheKey.billable);
  }

  /**
   * Returns false if all apps are non-billable for the merchant in context.
   */
  public java.lang.Boolean getAppBillable() {
    return genClient.cacheGet(CacheKey.appBillable);
  }

  /**
   * When the merchant's trial ends.  Only valid for paid apps that offer trials
   */
  public java.lang.Long getBillingStartTime() {
    return genClient.cacheGet(CacheKey.billingStartTime);
  }

  /**
   * Returns active if a merchant has a credit card on file, and if it's currently authorizing properly.  Returns lapsed if their card is absent or most recently declined
   */
  public com.clover.sdk.v3.apps.MerchantBillingStatus getStatus() {
    return genClient.cacheGet(CacheKey.status);
  }

  /**
   * If the merchant's account is lapsed (i.e. merchant is behind on paying), the number of days since it lapsed
   */
  public java.lang.Long getDaysLapsed() {
    return genClient.cacheGet(CacheKey.daysLapsed);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AppBillingInfo> {
    id {
      @Override
      public Object extractValue(AppBillingInfo instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    appSubscription {
      @Override
      public Object extractValue(AppBillingInfo instance) {
        return instance.genClient.extractRecord("appSubscription", com.clover.sdk.v3.apps.AppSubscription.JSON_CREATOR);
      }
    },
    isInTrial {
      @Override
      public Object extractValue(AppBillingInfo instance) {
        return instance.genClient.extractOther("isInTrial", java.lang.Boolean.class);
      }
    },
    billable {
      @Override
      public Object extractValue(AppBillingInfo instance) {
        return instance.genClient.extractOther("billable", java.lang.Boolean.class);
      }
    },
    appBillable {
      @Override
      public Object extractValue(AppBillingInfo instance) {
        return instance.genClient.extractOther("appBillable", java.lang.Boolean.class);
      }
    },
    billingStartTime {
      @Override
      public Object extractValue(AppBillingInfo instance) {
        return instance.genClient.extractOther("billingStartTime", java.lang.Long.class);
      }
    },
    status {
      @Override
      public Object extractValue(AppBillingInfo instance) {
        return instance.genClient.extractEnum("status", com.clover.sdk.v3.apps.MerchantBillingStatus.class);
      }
    },
    daysLapsed {
      @Override
      public Object extractValue(AppBillingInfo instance) {
        return instance.genClient.extractOther("daysLapsed", java.lang.Long.class);
      }
    },
    ;
  }

  private GenericClient<AppBillingInfo> genClient;

  /**
   * Constructs a new empty instance.
   */
  public AppBillingInfo() {
    genClient = new GenericClient<AppBillingInfo>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected AppBillingInfo(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppBillingInfo(String json) throws IllegalArgumentException {
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
  public AppBillingInfo(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppBillingInfo(AppBillingInfo src) {
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
    genClient.validateLength(getId(), 13);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'appSubscription' field is set and is not null */
  public boolean isNotNullAppSubscription() {
    return genClient.cacheValueIsNotNull(CacheKey.appSubscription);
  }

  /** Checks whether the 'isInTrial' field is set and is not null */
  public boolean isNotNullIsInTrial() {
    return genClient.cacheValueIsNotNull(CacheKey.isInTrial);
  }

  /** Checks whether the 'billable' field is set and is not null */
  public boolean isNotNullBillable() {
    return genClient.cacheValueIsNotNull(CacheKey.billable);
  }

  /** Checks whether the 'appBillable' field is set and is not null */
  public boolean isNotNullAppBillable() {
    return genClient.cacheValueIsNotNull(CacheKey.appBillable);
  }

  /** Checks whether the 'billingStartTime' field is set and is not null */
  public boolean isNotNullBillingStartTime() {
    return genClient.cacheValueIsNotNull(CacheKey.billingStartTime);
  }

  /** Checks whether the 'status' field is set and is not null */
  public boolean isNotNullStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.status);
  }

  /** Checks whether the 'daysLapsed' field is set and is not null */
  public boolean isNotNullDaysLapsed() {
    return genClient.cacheValueIsNotNull(CacheKey.daysLapsed);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'appSubscription' field has been set, however the value could be null */
  public boolean hasAppSubscription() {
    return genClient.cacheHasKey(CacheKey.appSubscription);
  }

  /** Checks whether the 'isInTrial' field has been set, however the value could be null */
  public boolean hasIsInTrial() {
    return genClient.cacheHasKey(CacheKey.isInTrial);
  }

  /** Checks whether the 'billable' field has been set, however the value could be null */
  public boolean hasBillable() {
    return genClient.cacheHasKey(CacheKey.billable);
  }

  /** Checks whether the 'appBillable' field has been set, however the value could be null */
  public boolean hasAppBillable() {
    return genClient.cacheHasKey(CacheKey.appBillable);
  }

  /** Checks whether the 'billingStartTime' field has been set, however the value could be null */
  public boolean hasBillingStartTime() {
    return genClient.cacheHasKey(CacheKey.billingStartTime);
  }

  /** Checks whether the 'status' field has been set, however the value could be null */
  public boolean hasStatus() {
    return genClient.cacheHasKey(CacheKey.status);
  }

  /** Checks whether the 'daysLapsed' field has been set, however the value could be null */
  public boolean hasDaysLapsed() {
    return genClient.cacheHasKey(CacheKey.daysLapsed);
  }


  /**
   * Sets the field 'id'.
   */
  public AppBillingInfo setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'appSubscription'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AppBillingInfo setAppSubscription(com.clover.sdk.v3.apps.AppSubscription appSubscription) {
    return genClient.setRecord(appSubscription, CacheKey.appSubscription);
  }

  /**
   * Sets the field 'isInTrial'.
   */
  public AppBillingInfo setIsInTrial(java.lang.Boolean isInTrial) {
    return genClient.setOther(isInTrial, CacheKey.isInTrial);
  }

  /**
   * Sets the field 'billable'.
   */
  public AppBillingInfo setBillable(java.lang.Boolean billable) {
    return genClient.setOther(billable, CacheKey.billable);
  }

  /**
   * Sets the field 'appBillable'.
   */
  public AppBillingInfo setAppBillable(java.lang.Boolean appBillable) {
    return genClient.setOther(appBillable, CacheKey.appBillable);
  }

  /**
   * Sets the field 'billingStartTime'.
   */
  public AppBillingInfo setBillingStartTime(java.lang.Long billingStartTime) {
    return genClient.setOther(billingStartTime, CacheKey.billingStartTime);
  }

  /**
   * Sets the field 'status'.
   */
  public AppBillingInfo setStatus(com.clover.sdk.v3.apps.MerchantBillingStatus status) {
    return genClient.setOther(status, CacheKey.status);
  }

  /**
   * Sets the field 'daysLapsed'.
   */
  public AppBillingInfo setDaysLapsed(java.lang.Long daysLapsed) {
    return genClient.setOther(daysLapsed, CacheKey.daysLapsed);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'appSubscription' field, the 'has' method for this field will now return false */
  public void clearAppSubscription() {
    genClient.clear(CacheKey.appSubscription);
  }
  /** Clears the 'isInTrial' field, the 'has' method for this field will now return false */
  public void clearIsInTrial() {
    genClient.clear(CacheKey.isInTrial);
  }
  /** Clears the 'billable' field, the 'has' method for this field will now return false */
  public void clearBillable() {
    genClient.clear(CacheKey.billable);
  }
  /** Clears the 'appBillable' field, the 'has' method for this field will now return false */
  public void clearAppBillable() {
    genClient.clear(CacheKey.appBillable);
  }
  /** Clears the 'billingStartTime' field, the 'has' method for this field will now return false */
  public void clearBillingStartTime() {
    genClient.clear(CacheKey.billingStartTime);
  }
  /** Clears the 'status' field, the 'has' method for this field will now return false */
  public void clearStatus() {
    genClient.clear(CacheKey.status);
  }
  /** Clears the 'daysLapsed' field, the 'has' method for this field will now return false */
  public void clearDaysLapsed() {
    genClient.clear(CacheKey.daysLapsed);
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
  public AppBillingInfo copyChanges() {
    AppBillingInfo copy = new AppBillingInfo();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppBillingInfo src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AppBillingInfo(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<AppBillingInfo> CREATOR = new android.os.Parcelable.Creator<AppBillingInfo>() {
    @Override
    public AppBillingInfo createFromParcel(android.os.Parcel in) {
      AppBillingInfo instance = new AppBillingInfo(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AppBillingInfo[] newArray(int size) {
      return new AppBillingInfo[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppBillingInfo> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppBillingInfo>() {
    @Override
    public AppBillingInfo create(org.json.JSONObject jsonObject) {
      return new AppBillingInfo(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean APPSUBSCRIPTION_IS_REQUIRED = false;
    public static final boolean ISINTRIAL_IS_REQUIRED = false;
    public static final boolean BILLABLE_IS_REQUIRED = false;
    public static final boolean APPBILLABLE_IS_REQUIRED = false;
    public static final boolean BILLINGSTARTTIME_IS_REQUIRED = false;
    public static final boolean STATUS_IS_REQUIRED = false;
    public static final boolean DAYSLAPSED_IS_REQUIRED = false;

  }

}
