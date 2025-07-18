package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snb {
    public final int a(sgo sgoVar) {
        int iB = sgn.b(sgoVar.b);
        if (iB == 0) {
            throw null;
        }
        switch (iB - 1) {
            case 0:
                return 1;
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
            case 11:
            case 17:
            case 25:
            case 27:
            case 29:
            case 32:
            case 33:
            case 37:
            case 38:
            case 40:
            default:
                throw new agpg();
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 10:
                return 11;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 26:
                return 27;
            case 28:
                return 29;
            case 30:
                return 31;
            case 31:
                return 32;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 39:
                return 40;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
        }
    }

    public final int b(rvw rvwVar) {
        switch (rvu.a(rvwVar.b)) {
            case BLUETOOTH_AUDIO_ROUTE:
                return 3;
            case BUILTIN_AUDIO_ROUTE:
                return 2;
            case DSP_AUDIO_ROUTE:
                return 4;
            case BISTO_AUDIO_ROUTE:
                return 5;
            case HANDOVER_ROUTE:
                return 7;
            case SODA_ROUTE:
                return 6;
            case CAR_AUDIO_ROUTE:
                return 8;
            case GACS_AUDIO_ROUTE:
                return 9;
            case AUDIOROUTE_NOT_SET:
                return 1;
            default:
                throw new agpg();
        }
    }
}
