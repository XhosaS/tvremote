package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxb {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "UNKNOWN_CLOSING_FAILURE";
        }
        if (i == 301) {
            return "FAILED_CLOSING_BISTO_MIC_NOT_REGISTERED";
        }
        if (i == 303) {
            return "FAILED_CLOSING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA";
        }
        if (i == 402) {
            return "FAILED_CLOSING_GRPC_STOP_LISTENING_STATUS_NOT_RECEIVED";
        }
        if (i == 501) {
            return "FAILED_CLOSING_ERROR_RETRIEVING_STATUS";
        }
        if (i == 502) {
            return "FAILED_CLOSING_HOTWORD_ERROR_RETRIEVING_STATUS";
        }
        if (i == 601) {
            return "FAILED_CLOSING_NO_AUDIO_STREAM_IN_STORE";
        }
        if (i == 602) {
            return "FAILED_CLOSING_CONCURRENCY_CONFLICT";
        }
        switch (i) {
            case 101:
                return "FAILED_CLOSING_DUE_TO_INACTIVE_CLIENT";
            case 102:
                return "FAILED_CLOSING_DUE_TO_INACTIVE_SESSION";
            case 103:
                return "FAILED_CLOSING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING";
            case 104:
                return "FAILED_TO_KEEP_MIC_OPEN_FOR_SEAMLESS_HANDOVER";
            case 105:
                return "FAILED_CLOSING_NO_AUDIO_SOURCE";
            case 106:
                return "FAILED_CLOSING_NO_AUDIO_RECORD";
            case 107:
                return "FAILED_CLOSING_NO_AUDIO_URI_STREAM";
            case 108:
                return "FAILED_CLOSING_WAS_NOT_OPENED";
            case 109:
                return "FAILED_CLOSING_DUE_TO_FAILED_OPENING_AUDIO_SOURCE";
            case 110:
                return "FAILED_CLOSING_MICROPHONE_PERMISSION_DENIED";
            case 111:
                return "FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS";
            case 112:
                return "FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_STREAM";
            case 113:
                return "FAILED_CLOSING_NOT_ALLOWED_HOTWORD_SOURCE_USAGE";
            case 114:
                return "FAILED_CLOSING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION";
            case 115:
                return "FAILED_CLOSING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE";
            case 116:
                return "FAILED_CLOSING_OP_NOT_ALLOWED";
            case 117:
                return "FAILED_CLOSING_NOT_ALLOWED_ZERO_MIC_LATENCY_USAGE";
            case 118:
                return "FAILED_CLOSING_PERMISSION_CAPTURE_AUDIO_HOTWORD_DENIED";
            case 119:
                return "FAILED_CLOSING_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING";
            case 120:
                return "FAILED_CLOSING_NO_AUDIO_PFD_STREAM";
            case 121:
                return "FAILED_CLOSING_MIC_OCCUPIED";
            case 122:
                return "FAILED_CLOSING_VOICE_DSP_HOTWORD_MIC_AEC_IS_SET";
            case 123:
                return "FAILED_CLOSING_DUE_TO_INACTIVE_PARENT";
            default:
                switch (i) {
                    case 201:
                        return "FAILED_CLOSING_AUDIO_RECORD_ERROR";
                    case 202:
                        return "FAILED_CLOSING_AUDIO_URI_STREAM_ERROR";
                    case 203:
                        return "FAILED_CLOSING_AUDIO_PFD_STREAM_ERROR";
                    default:
                        switch (i) {
                            case 305:
                                return "FAILED_CLOSING_CALLED_WITHOUT_PRECACHED_BUFFER_ID";
                            case 306:
                                return "FAILED_CLOSING_CALLED_UNEXPECTED_PRECACHED_BUFFER_ID";
                            case 307:
                                return "FAILED_CLOSING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND";
                            case 308:
                                return "FAILED_CLOSING_NO_AUDIO_ADAPTER_FOUND";
                            default:
                                return "null";
                        }
                }
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 300) {
            return 301;
        }
        if (i == 302) {
            return 303;
        }
        if (i == 401) {
            return 402;
        }
        if (i == 500) {
            return 501;
        }
        if (i == 501) {
            return 502;
        }
        if (i == 600) {
            return 601;
        }
        if (i == 601) {
            return 602;
        }
        switch (i) {
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            default:
                switch (i) {
                    case 200:
                        return 201;
                    case 201:
                        return 202;
                    case 202:
                        return 203;
                    default:
                        switch (i) {
                            case 304:
                                return 305;
                            case 305:
                                return 306;
                            case 306:
                                return 307;
                            case 307:
                                return 308;
                            default:
                                return 0;
                        }
                }
        }
    }
}
