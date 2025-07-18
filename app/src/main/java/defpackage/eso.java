package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eso {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "GENERIC";
            case 2:
                return "CANCELLED";
            case 3:
                return "MICROPHONE_UNAVAILABLE";
            case 4:
                return "MICROPHONE_AUDIO_BUFFER_OVERFLOW";
            case 5:
                return "NETWORK_REQUEST_BUILDING";
            case 6:
                return "GRPC_ERROR";
            case 7:
                return "S3_ERROR";
            case 8:
                return "NO_SPEECH_DETECTED";
            case 9:
                return "CREATE_RECORDING_FAILED";
            case 10:
                return "OFFLINE_RECOGNITION_UNAVAILABLE";
            case 11:
                return "SODA_ERROR";
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return "SODA_INITIALIZATION_ERROR";
            default:
                return "ONLINE_NO_PROGRESS";
        }
    }
}
