package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class clk {
    public final int a = 3;

    public static String a(int i) {
        return a.r(i, 1) ? "Left" : a.r(i, 2) ? "Right" : a.r(i, 3) ? "Center" : a.r(i, 4) ? "Justify" : a.r(i, 5) ? "Start" : a.r(i, 6) ? "End" : a.r(i, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof clk)) {
            return false;
        }
        int i = ((clk) obj).a;
        return true;
    }

    public final int hashCode() {
        return 3;
    }

    public final String toString() {
        return a(3);
    }
}
