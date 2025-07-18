package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmb {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 5;
    private static final /* synthetic */ int[] d = {a, b, c};

    public static /* synthetic */ int a(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static int b(int i) {
        if (i == 0) {
            return a;
        }
        if (i == 1) {
            return b;
        }
        if (i != 4) {
            return 0;
        }
        return c;
    }

    public static String toString$ar$edu(int i) {
        if (i != 0) {
            return Integer.toString(i - 1);
        }
        throw null;
    }

    public static int[] values$ar$edu$a5e00cd4_0() {
        return new int[]{a, b, c};
    }
}
