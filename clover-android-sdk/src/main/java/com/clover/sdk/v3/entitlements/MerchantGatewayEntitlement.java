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

package com.clover.sdk.v3.entitlements;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getName name}</li>
 * <li>{@link #getServiceEntitlementNumber serviceEntitlementNumber}</li>
 * <li>{@link #getServiceType serviceType}</li>
 * <li>{@link #getAlphaId alphaId}</li>
 * <li>{@link #getModifiedTime modifiedTime}</li>
 * <li>{@link #getDeletedTime deletedTime}</li>
 * <li>{@link #getPlanCodes planCodes}</li>
 * <li>{@link #getEntitlementConfigurations entitlementConfigurations}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class MerchantGatewayEntitlement extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Entitlement name (e.g. MASTERCARD, VISA, etc.)
   */
  public String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  public String getServiceEntitlementNumber() {
    return genClient.cacheGet(CacheKey.serviceEntitlementNumber);
  }

  public String getServiceType() {
    return genClient.cacheGet(CacheKey.serviceType);
  }

  /**
   * AlphaID for entitlements. Supplied by First Data.
   */
  public String getAlphaId() {
    return genClient.cacheGet(CacheKey.alphaId);
  }

  /**
   * Updated timestamp.
   */
  public Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }

  /**
   * Deleted timestamp.
   */
  public Long getDeletedTime() {
    return genClient.cacheGet(CacheKey.deletedTime);
  }

  public java.util.List<EntitlementPlanCode> getPlanCodes() {
    return genClient.cacheGet(CacheKey.planCodes);
  }

  public java.util.List<MerchantGatewayEntitlementConfiguration> getEntitlementConfigurations() {
    return genClient.cacheGet(CacheKey.entitlementConfigurations);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<MerchantGatewayEntitlement> {
    id {
      @Override
      public Object extractValue(MerchantGatewayEntitlement instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    name {
      @Override
      public Object extractValue(MerchantGatewayEntitlement instance) {
        return instance.genClient.extractOther("name", String.class);
      }
    },
    serviceEntitlementNumber {
      @Override
      public Object extractValue(MerchantGatewayEntitlement instance) {
        return instance.genClient.extractOther("serviceEntitlementNumber", String.class);
      }
    },
    serviceType {
      @Override
      public Object extractValue(MerchantGatewayEntitlement instance) {
        return instance.genClient.extractOther("serviceType", String.class);
      }
    },
    alphaId {
      @Override
      public Object extractValue(MerchantGatewayEntitlement instance) {
        return instance.genClient.extractOther("alphaId", String.class);
      }
    },
    modifiedTime {
      @Override
      public Object extractValue(MerchantGatewayEntitlement instance) {
        return instance.genClient.extractOther("modifiedTime", Long.class);
      }
    },
    deletedTime {
      @Override
      public Object extractValue(MerchantGatewayEntitlement instance) {
        return instance.genClient.extractOther("deletedTime", Long.class);
      }
    },
    planCodes {
      @Override
      public Object extractValue(MerchantGatewayEntitlement instance) {
        return instance.genClient.extractListRecord("planCodes", EntitlementPlanCode.JSON_CREATOR);
      }
    },
    entitlementConfigurations {
      @Override
      public Object extractValue(MerchantGatewayEntitlement instance) {
        return instance.genClient.extractListRecord("entitlementConfigurations", MerchantGatewayEntitlementConfiguration.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<MerchantGatewayEntitlement> genClient;

  /**
   * Constructs a new empty instance.
   */
  public MerchantGatewayEntitlement() {
    genClient = new GenericClient<MerchantGatewayEntitlement>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected MerchantGatewayEntitlement(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public MerchantGatewayEntitlement(String json) throws IllegalArgumentException {
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
  public MerchantGatewayEntitlement(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public MerchantGatewayEntitlement(MerchantGatewayEntitlement src) {
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

    genClient.validateNull(getName(), "name");
    genClient.validateLength(getName(), 128);

    genClient.validateLength(getServiceEntitlementNumber(), 128);

    genClient.validateLength(getServiceType(), 128);

    genClient.validateLength(getAlphaId(), 4);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'serviceEntitlementNumber' field is set and is not null */
  public boolean isNotNullServiceEntitlementNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.serviceEntitlementNumber);
  }

  /** Checks whether the 'serviceType' field is set and is not null */
  public boolean isNotNullServiceType() {
    return genClient.cacheValueIsNotNull(CacheKey.serviceType);
  }

  /** Checks whether the 'alphaId' field is set and is not null */
  public boolean isNotNullAlphaId() {
    return genClient.cacheValueIsNotNull(CacheKey.alphaId);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }

  /** Checks whether the 'deletedTime' field is set and is not null */
  public boolean isNotNullDeletedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.deletedTime);
  }

  /** Checks whether the 'planCodes' field is set and is not null */
  public boolean isNotNullPlanCodes() {
    return genClient.cacheValueIsNotNull(CacheKey.planCodes);
  }

  /** Checks whether the 'planCodes' field is set and is not null and is not empty */
  public boolean isNotEmptyPlanCodes() { return isNotNullPlanCodes() && !getPlanCodes().isEmpty(); }

  /** Checks whether the 'entitlementConfigurations' field is set and is not null */
  public boolean isNotNullEntitlementConfigurations() {
    return genClient.cacheValueIsNotNull(CacheKey.entitlementConfigurations);
  }

  /** Checks whether the 'entitlementConfigurations' field is set and is not null and is not empty */
  public boolean isNotEmptyEntitlementConfigurations() { return isNotNullEntitlementConfigurations() && !getEntitlementConfigurations().isEmpty(); }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'serviceEntitlementNumber' field has been set, however the value could be null */
  public boolean hasServiceEntitlementNumber() {
    return genClient.cacheHasKey(CacheKey.serviceEntitlementNumber);
  }

  /** Checks whether the 'serviceType' field has been set, however the value could be null */
  public boolean hasServiceType() {
    return genClient.cacheHasKey(CacheKey.serviceType);
  }

  /** Checks whether the 'alphaId' field has been set, however the value could be null */
  public boolean hasAlphaId() {
    return genClient.cacheHasKey(CacheKey.alphaId);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }

  /** Checks whether the 'deletedTime' field has been set, however the value could be null */
  public boolean hasDeletedTime() {
    return genClient.cacheHasKey(CacheKey.deletedTime);
  }

  /** Checks whether the 'planCodes' field has been set, however the value could be null */
  public boolean hasPlanCodes() {
    return genClient.cacheHasKey(CacheKey.planCodes);
  }

  /** Checks whether the 'entitlementConfigurations' field has been set, however the value could be null */
  public boolean hasEntitlementConfigurations() {
    return genClient.cacheHasKey(CacheKey.entitlementConfigurations);
  }


  /**
   * Sets the field 'id'.
   */
  public MerchantGatewayEntitlement setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public MerchantGatewayEntitlement setName(String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'serviceEntitlementNumber'.
   */
  public MerchantGatewayEntitlement setServiceEntitlementNumber(String serviceEntitlementNumber) {
    return genClient.setOther(serviceEntitlementNumber, CacheKey.serviceEntitlementNumber);
  }

  /**
   * Sets the field 'serviceType'.
   */
  public MerchantGatewayEntitlement setServiceType(String serviceType) {
    return genClient.setOther(serviceType, CacheKey.serviceType);
  }

  /**
   * Sets the field 'alphaId'.
   */
  public MerchantGatewayEntitlement setAlphaId(String alphaId) {
    return genClient.setOther(alphaId, CacheKey.alphaId);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public MerchantGatewayEntitlement setModifiedTime(Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }

  /**
   * Sets the field 'deletedTime'.
   */
  public MerchantGatewayEntitlement setDeletedTime(Long deletedTime) {
    return genClient.setOther(deletedTime, CacheKey.deletedTime);
  }

  /**
   * Sets the field 'planCodes'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public MerchantGatewayEntitlement setPlanCodes(java.util.List<EntitlementPlanCode> planCodes) {
    return genClient.setArrayRecord(planCodes, CacheKey.planCodes);
  }

  /**
   * Sets the field 'entitlementConfigurations'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public MerchantGatewayEntitlement setEntitlementConfigurations(java.util.List<MerchantGatewayEntitlementConfiguration> entitlementConfigurations) {
    return genClient.setArrayRecord(entitlementConfigurations, CacheKey.entitlementConfigurations);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'serviceEntitlementNumber' field, the 'has' method for this field will now return false */
  public void clearServiceEntitlementNumber() {
    genClient.clear(CacheKey.serviceEntitlementNumber);
  }
  /** Clears the 'serviceType' field, the 'has' method for this field will now return false */
  public void clearServiceType() {
    genClient.clear(CacheKey.serviceType);
  }
  /** Clears the 'alphaId' field, the 'has' method for this field will now return false */
  public void clearAlphaId() {
    genClient.clear(CacheKey.alphaId);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
  }
  /** Clears the 'deletedTime' field, the 'has' method for this field will now return false */
  public void clearDeletedTime() {
    genClient.clear(CacheKey.deletedTime);
  }
  /** Clears the 'planCodes' field, the 'has' method for this field will now return false */
  public void clearPlanCodes() {
    genClient.clear(CacheKey.planCodes);
  }
  /** Clears the 'entitlementConfigurations' field, the 'has' method for this field will now return false */
  public void clearEntitlementConfigurations() {
    genClient.clear(CacheKey.entitlementConfigurations);
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
  public MerchantGatewayEntitlement copyChanges() {
    MerchantGatewayEntitlement copy = new MerchantGatewayEntitlement();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(MerchantGatewayEntitlement src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new MerchantGatewayEntitlement(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<MerchantGatewayEntitlement> CREATOR = new android.os.Parcelable.Creator<MerchantGatewayEntitlement>() {
    @Override
    public MerchantGatewayEntitlement createFromParcel(android.os.Parcel in) {
      MerchantGatewayEntitlement instance = new MerchantGatewayEntitlement(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public MerchantGatewayEntitlement[] newArray(int size) {
      return new MerchantGatewayEntitlement[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<MerchantGatewayEntitlement> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<MerchantGatewayEntitlement>() {
    @Override
    public MerchantGatewayEntitlement create(org.json.JSONObject jsonObject) {
      return new MerchantGatewayEntitlement(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 128;
    public static final boolean SERVICEENTITLEMENTNUMBER_IS_REQUIRED = false;
    public static final long SERVICEENTITLEMENTNUMBER_MAX_LEN = 128;
    public static final boolean SERVICETYPE_IS_REQUIRED = false;
    public static final long SERVICETYPE_MAX_LEN = 128;
    public static final boolean ALPHAID_IS_REQUIRED = false;
    public static final long ALPHAID_MAX_LEN = 4;
    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;
    public static final boolean DELETEDTIME_IS_REQUIRED = false;
    public static final boolean PLANCODES_IS_REQUIRED = false;
    public static final boolean ENTITLEMENTCONFIGURATIONS_IS_REQUIRED = false;

  }

}
