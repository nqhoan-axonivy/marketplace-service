package com.axonivy.market.entity;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

  private static final long serialVersionUID = -8770801877877277258L;
  private String key;
  private String name;
  private String version;
  private String shortDescript;
  private String logoUrl;
  private Boolean listed;
  private String type;
  private List<String> tags;
  private String vendor;
  private String vendorImage;
  private String vendorUrl;
  private String platformReview;
  private String cost;
  private String sourceUrl;
  private String statusBadgeUrl;
  private String language;
  private String industry;
  private String compatibility;
  private Boolean validate;
  private Boolean contactUs;
  private Integer installationCount;

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(key);
    return builder.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(key, ((Product) obj).getKey());
    return builder.isEquals();
  }

}