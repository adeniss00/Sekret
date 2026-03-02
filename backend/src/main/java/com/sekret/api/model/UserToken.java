package com.sekret.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.OffsetDateTime;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserToken {

    @Id
    private String id ;
    private String token;
    private String userId;
    private TokenStatus tokenStatus;
    private OffsetDateTime expirationDate;

}
