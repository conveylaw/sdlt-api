package com.redmonkeysoftware.sdlt.service;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class SdltIntegrationServiceTest {

    private final String applicationId = "69f3d5895cb624d10c7f61a718949273";
    private final String applicationSecret = "e787ebe21fe2c6303aff2163bcb1a8227bd7ee495bf1b4467c41b16bb5288a3d";
    private final String clientId = "b94a516ab74c6ea9bfa05d17f646b338";
    private final String clientSecret = "733c8368a29fd989ff1e0796fef34b0db02e3b862dba010d4815f771755b14df";

    @Test
    void testGetSdltUtrn() {
        SdltIntegrationService service = new SdltIntegrationService(applicationId, applicationSecret);
        var token = service.authenticateApplication(clientId, clientSecret);
        var sdltUtrn = service.getSdltUtrn(token, "1703017");
        assertThat(sdltUtrn, Matchers.equalTo("519835953MR"));
    }
}