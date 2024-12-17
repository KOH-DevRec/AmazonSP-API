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
import io.swagger.client.model.BusinessHours;
import io.swagger.client.model.ExceptionDates;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The time window when the delivery is preferred.
 */
@ApiModel(description = "The time window when the delivery is preferred.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-26T17:43:23.871+09:00")
public class PreferredDeliveryTime {
  @SerializedName("BusinessHours")
  private List<BusinessHours> businessHours = null;

  @SerializedName("ExceptionDates")
  private List<ExceptionDates> exceptionDates = null;

  public PreferredDeliveryTime businessHours(List<BusinessHours> businessHours) {
    this.businessHours = businessHours;
    return this;
  }

  public PreferredDeliveryTime addBusinessHoursItem(BusinessHours businessHoursItem) {
    if (this.businessHours == null) {
      this.businessHours = new ArrayList<BusinessHours>();
    }
    this.businessHours.add(businessHoursItem);
    return this;
  }

   /**
   * Business hours when the business is open for deliveries.
   * @return businessHours
  **/
  @ApiModelProperty(value = "Business hours when the business is open for deliveries.")
  public List<BusinessHours> getBusinessHours() {
    return businessHours;
  }

  public void setBusinessHours(List<BusinessHours> businessHours) {
    this.businessHours = businessHours;
  }

  public PreferredDeliveryTime exceptionDates(List<ExceptionDates> exceptionDates) {
    this.exceptionDates = exceptionDates;
    return this;
  }

  public PreferredDeliveryTime addExceptionDatesItem(ExceptionDates exceptionDatesItem) {
    if (this.exceptionDates == null) {
      this.exceptionDates = new ArrayList<ExceptionDates>();
    }
    this.exceptionDates.add(exceptionDatesItem);
    return this;
  }

   /**
   * Dates when the business is closed in the next 30 days.
   * @return exceptionDates
  **/
  @ApiModelProperty(value = "Dates when the business is closed in the next 30 days.")
  public List<ExceptionDates> getExceptionDates() {
    return exceptionDates;
  }

  public void setExceptionDates(List<ExceptionDates> exceptionDates) {
    this.exceptionDates = exceptionDates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreferredDeliveryTime preferredDeliveryTime = (PreferredDeliveryTime) o;
    return Objects.equals(this.businessHours, preferredDeliveryTime.businessHours) &&
        Objects.equals(this.exceptionDates, preferredDeliveryTime.exceptionDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessHours, exceptionDates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferredDeliveryTime {\n");
    
    sb.append("    businessHours: ").append(toIndentedString(businessHours)).append("\n");
    sb.append("    exceptionDates: ").append(toIndentedString(exceptionDates)).append("\n");
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

