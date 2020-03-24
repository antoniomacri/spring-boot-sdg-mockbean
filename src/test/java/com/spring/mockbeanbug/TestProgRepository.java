package com.spring.mockbeanbug;

import com.spring.mockbeanbug.repository.ProgRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class TestProgRepository {
    @MockBean
    private ProgRepository progRepositoryMock;

    @Test
    public void assertBla() {
        when(progRepositoryMock.findById(anyString())).thenReturn(Optional.empty());
        assertTrue(true);
    }
}