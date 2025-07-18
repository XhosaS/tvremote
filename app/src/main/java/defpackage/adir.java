package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adir implements abxh {
    public static final abxh a = new adir();

    private adir() {
    }

    @Override // defpackage.abxh
    public final boolean a(int i) {
        adis adisVar;
        switch (i) {
            case 0:
                adisVar = adis.LINEAR16;
                break;
            case 1:
                adisVar = adis.FLOAT32;
                break;
            case 2:
                adisVar = adis.FLAC;
                break;
            case 3:
                adisVar = adis.AMR;
                break;
            case 4:
                adisVar = adis.MULAW;
                break;
            case 5:
                adisVar = adis.SPEEX_NB;
                break;
            case 6:
                adisVar = adis.SPEEX_WB;
                break;
            case 7:
                adisVar = adis.OGG_VORBIS;
                break;
            case 8:
                adisVar = adis.ADTS_AAC;
                break;
            case 9:
                adisVar = adis.AMR_WB;
                break;
            case 10:
                adisVar = adis.OGG_OPUS;
                break;
            case 11:
                adisVar = adis.WEBM_OPUS;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                adisVar = adis.MKV;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                adisVar = adis.MP3;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                adisVar = adis.OPUS;
                break;
            case 15:
                adisVar = adis.ALAW;
                break;
            default:
                adisVar = null;
                break;
        }
        return adisVar != null;
    }
}
