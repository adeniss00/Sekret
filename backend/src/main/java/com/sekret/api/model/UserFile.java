package com.sekret.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserFile {

    @Id
    private String id ;
    private String name;
    private Long size;
    private String filePath;
    private String groupId;
    private String tokenId;

}
