package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdv implements abxh {
    public static final abxh a = new sdv();

    private sdv() {
    }

    @Override // defpackage.abxh
    public final boolean a(int i) {
        sdw sdwVar;
        switch (i) {
            case 0:
                sdwVar = sdw.SOURCE_EMPTY;
                break;
            case 1:
                sdwVar = sdw.SOURCE_BUILTIN;
                break;
            case 2:
                sdwVar = sdw.SOURCE_ZLM;
                break;
            case 3:
                sdwVar = sdw.SOURCE_SYNC;
                break;
            case 4:
                sdwVar = sdw.SOURCE_DSP;
                break;
            case 5:
                sdwVar = sdw.SOURCE_SODA;
                break;
            case 6:
                sdwVar = sdw.SOURCE_BISTO;
                break;
            case 7:
                sdwVar = sdw.SOURCE_CAR;
                break;
            case 8:
                sdwVar = sdw.SOURCE_URI;
                break;
            case 9:
                sdwVar = sdw.SOURCE_PFD;
                break;
            case 10:
                sdwVar = sdw.SOURCE_VOICE_DSP_HOTWORD;
                break;
            case 11:
            default:
                sdwVar = null;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                sdwVar = sdw.SOURCE_GACS;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                sdwVar = sdw.SOURCE_HOTWORD;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                sdwVar = sdw.SOURCE_ECHO_REFERENCE;
                break;
            case 15:
                sdwVar = sdw.SOURCE_MEDIA_OUTPUT;
                break;
            case 16:
                sdwVar = sdw.SOURCE_VIRTUAL_AR;
                break;
        }
        return sdwVar != null;
    }
}
