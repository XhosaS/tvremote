package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enz {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "LEFT";
            case 2:
                return "TOP";
            case 3:
                return "RIGHT";
            case 4:
                return "BOTTOM";
            case 5:
                return "START";
            case 6:
                return "END";
            case 7:
                return "HORIZONTAL";
            case 8:
                return "VERTICAL";
            default:
                return "ALL";
        }
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                throw new IllegalArgumentException(a.b(i, "Unknown enum value: "));
        }
    }
}
