package com.generalbytes.batm.onfido.controller;

import lombok.Data;
import lombok.NonNull;

@Data
public class RegisterNewApplicantReq {
    @NonNull private String applicantId;
    @NonNull private String sdkToken;
    @NonNull private String serverUrl;
}
