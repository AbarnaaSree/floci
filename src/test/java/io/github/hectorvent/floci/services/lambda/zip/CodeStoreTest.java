package io.github.hectorvent.floci.services.lambda.zip;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CodeStoreTest {

    @Test
    void sameFunctionNameUsesDifferentPathPerAccount() throws Exception {
        Path baseDir = Files.createTempDirectory("code-store-test");
        CodeStore codeStore = new CodeStore(baseDir);

        Path accountOnePath =
                codeStore.getCodePath("111111111111", "my-function");

        Path accountTwoPath =
                codeStore.getCodePath("222222222222", "my-function");

        assertNotEquals(accountOnePath, accountTwoPath);

        assertEquals(
                baseDir.resolve("111111111111").resolve("my-function"),
                accountOnePath);

        assertEquals(
                baseDir.resolve("222222222222").resolve("my-function"),
                accountTwoPath);
    }
}