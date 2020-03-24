package com.spring.mockbeanbug.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
public class Prog {
    @Id
    private String id;

    private String value;
}
