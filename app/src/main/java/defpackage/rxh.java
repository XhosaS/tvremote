package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rxh implements abxf {
    UNKNOWN_OPENING_FAILURE(0),
    FAILED_TO_OPEN_AUDIO_SOURCE(100),
    FAILED_OPENING_DUE_TO_INACTIVE_CLIENT(101),
    FAILED_OPENING_MICROPHONE_PERMISSION_DENIED(102),
    FAILED_OPENING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING(103),
    FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING(104),
    FAILED_OPENING_NOT_ALLOWED_HOTWORD_SOURCE_USAGE(105),
    FAILED_OPENING_DUE_TO_INACTIVE_SESSION(106),
    FAILED_OPENING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION(107),
    FAILED_OPENING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE(108),
    FAILED_OPENING_OP_NOT_ALLOWED(109),
    FAILED_OPENING_NOT_ALLOWED_ZERO_MIC_LATENCY_USAGE(110),
    FAILED_OPENING_PERMISSION_CAPTURE_AUDIO_HOTWORD_DENIED(111),
    FAILED_OPENING_MIC_OCCUPIED(113),
    FAILED_OPENING_NO_SOURCE_TO_COPY(114),
    FAILED_OPENING_DUE_TO_INACTIVE_PARENT(115),
    FAILED_OPENING_PERMISSION_CAPTURE_MEDIA_DENIED(116),
    FAILED_OPENING_ERROR_SETTING_PREFERRED_DEVICE(117),
    FAILED_OPENING_ERROR_INIT(200),
    FAILED_OPENING_ERROR_MODE_IN_CALL(201),
    FAILED_OPENING_ERROR_START_RECORDING(202),
    FAILED_OPENING_FILE_NOT_FOUND(203),
    FAILED_OPENING_FILE_SECURITY(204),
    FAILED_OPENING_FILE_DESCRIPTOR_ERROR(205),
    FAILED_OPENING_URI_AUTHORITY_ABSENT(206),
    FAILED_OPENING_CONTENT_PROVIDER_NOT_FOUND(207),
    FAILED_OPENING_INVALID_CAPTURE_SESSION_ID(208),
    FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_AUDIO_SOURCE(211),
    FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_CHANNEL_MASK(212),
    FAILED_OPENING_ZERO_LATENCY_MIC_REFLECTION_ERROR(213),
    FAILED_OPENING_ZERO_LATENCY_MIC_UNSUPPORTED_AUDIO_SDK(223),
    FAILED_OPENING_ZERO_LATENCY_MIC_HOTWORD_STREAM_UNSUPPORTED(224),
    FAILED_OPENING_MEDIA_SYNC_MIC_INVALID_AUDIO_SOURCE(214),
    FAILED_OPENING_INVALID_MEDIA_SYNC_EVENT(215),
    FAILED_OPENING_MISSING_ZERO_LATENCY_MIC_IMPLEMENTATION(216),
    FAILED_OPENING_MISSING_MEDIA_SYNC_MIC_IMPLEMENTATION(217),
    FAILED_OPENING_MISSING_SOURCE_ATTRIBUTION(218),
    FAILED_OPENING_SOURCE_ATTRIBUTION_EXCEPTION(219),
    FAILED_OPENING_SOURCE_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK(220),
    FAILED_OPENING_ID_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK(222),
    FAILED_OPENING_MISSING_DSP_MIC_IMPLEMENTATION(221),
    FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_INVALID_AUDIO_SOURCE(225),
    FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_INVALID_CHANNEL_MASK(226),
    FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_UNSUPPORTED_AUDIO_SDK(227),
    FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_HOTWORD_STREAM_UNSUPPORTED(228),
    FAILED_OPENING_MISSING_VOICE_DSP_HOTWORD_MIC_IMPLEMENTATION(229),
    FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_AEC_IS_SET(230),
    FAILED_OPENING_BUS_DEVICE(231),
    FAILED_OPENING_MISSING_HOTWORD_MIC_IMPLEMENTATION(233),
    FAILED_OPENING_INCORRECT_AUDIO_SOURCE_TYPE(234),
    FAILED_OPENING_MISSING_ECHO_REFERENCE_IMPLEMENTATION(235),
    FAILED_OPENING_CAPTURE_MEDIA_UNSUPPORTED_SDK(236),
    FAILED_OPENING_MISSING_CAPTURE_MEDIA_IMPLEMENTATION(237),
    FAILED_OPENING_CAPTURE_MEDIA_INVALID_CHANNEL_MASK(238),
    FAILED_OPENING_AUDIO_POLICY_ISSUE(239),
    FAILED_OPENING_MISSING_VIRTUAL_AR_MIC_IMPLEMENTATION(240),
    FAILED_OPENING_NO_VALID_PROJECTION_DEVICE(241),
    FAILED_OPENING_INVALID_WRITEABLE_AUDIO_BUFFER_DATA(300),
    FAILED_OPENING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA(303),
    FAILED_OPENING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND(307),
    FAILED_OPENING_NO_AUDIO_ADAPTER_FOUND(308),
    FAILED_OPENING_AUDIO_ADAPTER_ACCESSORY_INVOCATION_ONGOING(310),
    FAILED_OPENING_GRPC_START_LISTENING_STATUS_NOT_RECEIVED(400),
    FAILED_OPENING_ERROR_RETRIEVING_STATUS(500),
    FAILED_OPENING_ERROR_RETRIEVING_AUDIO_PARAMS(501),
    FAILED_OPENING_HOTWORD_ERROR_RETRIEVING_STATUS(502),
    FAILED_OPENING_NO_AUDIO_STREAM_IN_STORE(600),
    FAILED_OPENING_CONCURRENCY_CONFLICT(601);

    public final int aq;

    rxh(int i) {
        this.aq = i;
    }

    public static rxh b(int i) {
        if (i == 0) {
            return UNKNOWN_OPENING_FAILURE;
        }
        if (i == 300) {
            return FAILED_OPENING_INVALID_WRITEABLE_AUDIO_BUFFER_DATA;
        }
        if (i == 303) {
            return FAILED_OPENING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA;
        }
        if (i == 310) {
            return FAILED_OPENING_AUDIO_ADAPTER_ACCESSORY_INVOCATION_ONGOING;
        }
        if (i == 400) {
            return FAILED_OPENING_GRPC_START_LISTENING_STATUS_NOT_RECEIVED;
        }
        if (i == 307) {
            return FAILED_OPENING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND;
        }
        if (i == 308) {
            return FAILED_OPENING_NO_AUDIO_ADAPTER_FOUND;
        }
        if (i == 600) {
            return FAILED_OPENING_NO_AUDIO_STREAM_IN_STORE;
        }
        if (i == 601) {
            return FAILED_OPENING_CONCURRENCY_CONFLICT;
        }
        switch (i) {
            case 100:
                return FAILED_TO_OPEN_AUDIO_SOURCE;
            case 101:
                return FAILED_OPENING_DUE_TO_INACTIVE_CLIENT;
            case 102:
                return FAILED_OPENING_MICROPHONE_PERMISSION_DENIED;
            case 103:
                return FAILED_OPENING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING;
            case 104:
                return FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING;
            case 105:
                return FAILED_OPENING_NOT_ALLOWED_HOTWORD_SOURCE_USAGE;
            case 106:
                return FAILED_OPENING_DUE_TO_INACTIVE_SESSION;
            case 107:
                return FAILED_OPENING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION;
            case 108:
                return FAILED_OPENING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE;
            case 109:
                return FAILED_OPENING_OP_NOT_ALLOWED;
            case 110:
                return FAILED_OPENING_NOT_ALLOWED_ZERO_MIC_LATENCY_USAGE;
            case 111:
                return FAILED_OPENING_PERMISSION_CAPTURE_AUDIO_HOTWORD_DENIED;
            default:
                switch (i) {
                    case 113:
                        return FAILED_OPENING_MIC_OCCUPIED;
                    case 114:
                        return FAILED_OPENING_NO_SOURCE_TO_COPY;
                    case 115:
                        return FAILED_OPENING_DUE_TO_INACTIVE_PARENT;
                    case 116:
                        return FAILED_OPENING_PERMISSION_CAPTURE_MEDIA_DENIED;
                    case 117:
                        return FAILED_OPENING_ERROR_SETTING_PREFERRED_DEVICE;
                    default:
                        switch (i) {
                            case 200:
                                return FAILED_OPENING_ERROR_INIT;
                            case 201:
                                return FAILED_OPENING_ERROR_MODE_IN_CALL;
                            case 202:
                                return FAILED_OPENING_ERROR_START_RECORDING;
                            case 203:
                                return FAILED_OPENING_FILE_NOT_FOUND;
                            case 204:
                                return FAILED_OPENING_FILE_SECURITY;
                            case 205:
                                return FAILED_OPENING_FILE_DESCRIPTOR_ERROR;
                            case 206:
                                return FAILED_OPENING_URI_AUTHORITY_ABSENT;
                            case 207:
                                return FAILED_OPENING_CONTENT_PROVIDER_NOT_FOUND;
                            case 208:
                                return FAILED_OPENING_INVALID_CAPTURE_SESSION_ID;
                            default:
                                switch (i) {
                                    case 211:
                                        return FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_AUDIO_SOURCE;
                                    case 212:
                                        return FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_CHANNEL_MASK;
                                    case 213:
                                        return FAILED_OPENING_ZERO_LATENCY_MIC_REFLECTION_ERROR;
                                    case 214:
                                        return FAILED_OPENING_MEDIA_SYNC_MIC_INVALID_AUDIO_SOURCE;
                                    case 215:
                                        return FAILED_OPENING_INVALID_MEDIA_SYNC_EVENT;
                                    case 216:
                                        return FAILED_OPENING_MISSING_ZERO_LATENCY_MIC_IMPLEMENTATION;
                                    case 217:
                                        return FAILED_OPENING_MISSING_MEDIA_SYNC_MIC_IMPLEMENTATION;
                                    case 218:
                                        return FAILED_OPENING_MISSING_SOURCE_ATTRIBUTION;
                                    case 219:
                                        return FAILED_OPENING_SOURCE_ATTRIBUTION_EXCEPTION;
                                    case 220:
                                        return FAILED_OPENING_SOURCE_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK;
                                    case 221:
                                        return FAILED_OPENING_MISSING_DSP_MIC_IMPLEMENTATION;
                                    case 222:
                                        return FAILED_OPENING_ID_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK;
                                    case 223:
                                        return FAILED_OPENING_ZERO_LATENCY_MIC_UNSUPPORTED_AUDIO_SDK;
                                    case 224:
                                        return FAILED_OPENING_ZERO_LATENCY_MIC_HOTWORD_STREAM_UNSUPPORTED;
                                    case 225:
                                        return FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_INVALID_AUDIO_SOURCE;
                                    case 226:
                                        return FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_INVALID_CHANNEL_MASK;
                                    case 227:
                                        return FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_UNSUPPORTED_AUDIO_SDK;
                                    case 228:
                                        return FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_HOTWORD_STREAM_UNSUPPORTED;
                                    case 229:
                                        return FAILED_OPENING_MISSING_VOICE_DSP_HOTWORD_MIC_IMPLEMENTATION;
                                    case 230:
                                        return FAILED_OPENING_VOICE_DSP_HOTWORD_MIC_AEC_IS_SET;
                                    case 231:
                                        return FAILED_OPENING_BUS_DEVICE;
                                    default:
                                        switch (i) {
                                            case 233:
                                                return FAILED_OPENING_MISSING_HOTWORD_MIC_IMPLEMENTATION;
                                            case 234:
                                                return FAILED_OPENING_INCORRECT_AUDIO_SOURCE_TYPE;
                                            case 235:
                                                return FAILED_OPENING_MISSING_ECHO_REFERENCE_IMPLEMENTATION;
                                            case 236:
                                                return FAILED_OPENING_CAPTURE_MEDIA_UNSUPPORTED_SDK;
                                            case 237:
                                                return FAILED_OPENING_MISSING_CAPTURE_MEDIA_IMPLEMENTATION;
                                            case 238:
                                                return FAILED_OPENING_CAPTURE_MEDIA_INVALID_CHANNEL_MASK;
                                            case 239:
                                                return FAILED_OPENING_AUDIO_POLICY_ISSUE;
                                            case 240:
                                                return FAILED_OPENING_MISSING_VIRTUAL_AR_MIC_IMPLEMENTATION;
                                            case 241:
                                                return FAILED_OPENING_NO_VALID_PROJECTION_DEVICE;
                                            default:
                                                switch (i) {
                                                    case 500:
                                                        return FAILED_OPENING_ERROR_RETRIEVING_STATUS;
                                                    case 501:
                                                        return FAILED_OPENING_ERROR_RETRIEVING_AUDIO_PARAMS;
                                                    case 502:
                                                        return FAILED_OPENING_HOTWORD_ERROR_RETRIEVING_STATUS;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.aq;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.aq);
    }
}
