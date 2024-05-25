package com.hg.jdoodletest.dtos;

public record Response(String output, String statusCode, String memory, String cpuTime, boolean compilationStatus) {
}
