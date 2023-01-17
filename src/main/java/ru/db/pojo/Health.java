package ru.db.pojo;

import ru.db.enums.HealthStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Health {

    private HealthStatus healthStatus;

}
