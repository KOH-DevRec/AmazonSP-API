/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  _Note:_ The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains the business invoice tax information. Available only in the TR marketplace.
 */
@ApiModel(description = "Contains the business invoice tax information. Available only in the TR marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-26T17:43:23.871+09:00")
public class BuyerTaxInformation {
  @SerializedName("BuyerLegalCompanyName")
  private String buyerLegalCompanyName = null;

  @SerializedName("BuyerBusinessAddress")
  private String buyerBusinessAddress = null;

  @SerializedName("BuyerTaxRegistrationId")
  private String buyerTaxRegistrationId = null;

  @SerializedName("BuyerTaxOffice")
  private String buyerTaxOffice = null;

  public BuyerTaxInformation buyerLegalCompanyName(String buyerLegalCompanyName) {
    this.buyerLegalCompanyName = buyerLegalCompanyName;
    return this;
  }

   /**
   * Business buyer&#39;s company legal name.
   * @return buyerLegalCompanyName
  **/
  @ApiModelProperty(value = "Business buyer's company legal name.")
  public String getBuyerLegalCompanyName() {
    return buyerLegalCompanyName;
  }

  public void setBuyerLegalCompanyName(String buyerLegalCompanyName) {
    this.buyerLegalCompanyName = buyerLegalCompanyName;
  }

  public BuyerTaxInformation buyerBusinessAddress(String buyerBusinessAddress) {
    this.buyerBusinessAddress = buyerBusinessAddress;
    return this;
  }

   /**
   * Business buyer&#39;s address.
   * @return buyerBusinessAddress
  **/
  @ApiModelProperty(value = "Business buyer's address.")
  public String getBuyerBusinessAddress() {
    return buyerBusinessAddress;
  }

  public void setBuyerBusinessAddress(String buyerBusinessAddress) {
    this.buyerBusinessAddress = buyerBusinessAddress;
  }

  public BuyerTaxInformation buyerTaxRegistrationId(String buyerTaxRegistrationId) {
    this.buyerTaxRegistrationId = buyerTaxRegistrationId;
    return this;
  }

   /**
   * Business buyer&#39;s tax registration ID.
   * @return buyerTaxRegistrationId
  **/
  @ApiModelProperty(value = "Business buyer's tax registration ID.")
  public String getBuyerTaxRegistrationId() {
    return buyerTaxRegistrationId;
  }

  public void setBuyerTaxRegistrationId(String buyerTaxRegistrationId) {
    this.buyerTaxRegistrationId = buyerTaxRegistrationId;
  }

  public BuyerTaxInformation buyerTaxOffice(String buyerTaxOffice) {
    this.buyerTaxOffice = buyerTaxOffice;
    return this;
  }

   /**
   * Business buyer&#39;s tax office.
   * @return buyerTaxOffice
  **/
  @ApiModelProperty(value = "Business buyer's tax office.")
  public String getBuyerTaxOffice() {
    return buyerTaxOffice;
  }

  public void setBuyerTaxOffice(String buyerTaxOffice) {
    this.buyerTaxOffice = buyerTaxOffice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerTaxInformation buyerTaxInformation = (BuyerTaxInformation) o;
    return Objects.equals(this.buyerLegalCompanyName, buyerTaxInformation.buyerLegalCompanyName) &&
        Objects.equals(this.buyerBusinessAddress, buyerTaxInformation.buyerBusinessAddress) &&
        Objects.equals(this.buyerTaxRegistrationId, buyerTaxInformation.buyerTaxRegistrationId) &&
        Objects.equals(this.buyerTaxOffice, buyerTaxInformation.buyerTaxOffice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerLegalCompanyName, buyerBusinessAddress, buyerTaxRegistrationId, buyerTaxOffice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerTaxInformation {\n");
    
    sb.append("    buyerLegalCompanyName: ").append(toIndentedString(buyerLegalCompanyName)).append("\n");
    sb.append("    buyerBusinessAddress: ").append(toIndentedString(buyerBusinessAddress)).append("\n");
    sb.append("    buyerTaxRegistrationId: ").append(toIndentedString(buyerTaxRegistrationId)).append("\n");
    sb.append("    buyerTaxOffice: ").append(toIndentedString(buyerTaxOffice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

