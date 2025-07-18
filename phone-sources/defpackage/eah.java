package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eah extends Exception {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public static final String e = edt.Z(4);
    public static final String f = edt.Z(5);
    public final int g;
    public final long h;
    public final Bundle i;

    protected eah(String str, Throwable th, int i, Bundle bundle, long j) {
        super(str, th);
        this.g = i;
        this.i = bundle;
        this.h = j;
    }

    public final String a() {
        int i = this.g;
        if (i == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case 1001:
                return "ERROR_CODE_REMOTE_ERROR";
            case 1002:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i) {
                    case 2000:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case 2001:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case 2002:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case 2003:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case 2004:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case 2006:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case 2008:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i) {
                            case 3001:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case 3003:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case 3004:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i) {
                                    case 4001:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case 4002:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case 4005:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    case 4006:
                                        return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                    default:
                                        switch (i) {
                                            case 5001:
                                                return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                            case 5002:
                                                return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                            case 5003:
                                                return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                            case 5004:
                                                return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                            default:
                                                switch (i) {
                                                    case 6000:
                                                        return "ERROR_CODE_DRM_UNSPECIFIED";
                                                    case 6001:
                                                        return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                    case 6002:
                                                        return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                    case 6003:
                                                        return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                    case 6004:
                                                        return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                    case 6005:
                                                        return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                    case 6006:
                                                        return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                    case 6007:
                                                        return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                    case 6008:
                                                        return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                    default:
                                                        return "invalid error code";
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
