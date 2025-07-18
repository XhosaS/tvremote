package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yad {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        switch (str.hashCode()) {
            case -1986416409:
                if (str.equals("NORMAL")) {
                    return 2;
                }
                break;
            case -1031784143:
                if (str.equals("CANCELLED")) {
                    return 5;
                }
                break;
            case -1003148468:
                if (str.equals("NORMAL_WITH_FOLLOW_ON")) {
                    return 3;
                }
                break;
            case -965128173:
                if (str.equals("BARGE_IN")) {
                    return 6;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    return 4;
                }
                break;
            case -571600400:
                if (str.equals("DEVICE_NOT_SELECTED")) {
                    return 9;
                }
                break;
            case -535128833:
                if (str.equals("NO_RESPONSE")) {
                    return 7;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return 1;
                }
                break;
            case 1463616543:
                if (str.equals("COMMUNICATION_ERROR")) {
                    return 8;
                }
                break;
        }
        throw new IllegalArgumentException();
    }
}
