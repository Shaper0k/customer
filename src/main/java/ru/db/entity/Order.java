package ru.db.entity;

import ru.db.enums.OrderStatus;
import ru.db.enums.PaymentType;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "order")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    @Field("customer_id")
    private String customerId;
    @Field("create_at")
    @CreatedDate
    private Instant createAt;
    @Field("update_at")
    @LastModifiedDate
    private Instant updateAt;
    @Version
    public Integer version;
    @Field("status")
    private OrderStatus status = OrderStatus.CREATED;
    @Field("payment_status")
    private Boolean paymentStatus = Boolean.FALSE;
    @NotNull
    @Field("payment_method")
    private PaymentType paymentType;
    @NotNull
    @Field("payment_details")
    private String paymentDetails;
    @Field("shipping_address")
    private Address shippingAddress;

}
