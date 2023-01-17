package ru.db.entity;

import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("address")
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Address implements Serializable {

    @Id
    private String id;
    @NotNull
    @Field("street_name")
    private String streetName;
    @NotNull
    @Field("street_number")
    private String streetNumber;
    @Field("additional_info")
    private String additionalInfo;
    @NotNull
    @Field("zip_code")
    private String zipCode;
    @NotNull
    @Field("city")
    private String city;
    @Field("state")
    private String state;
    @NotNull
    @Field("country")
    private String country;

}
