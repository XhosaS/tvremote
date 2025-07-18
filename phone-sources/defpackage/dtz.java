package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class dtz {
    public final int a = 3;

    public static String a() {
        return a.r(3, 1) ? "Left" : a.r(3, 2) ? "Right" : a.r(3, 3) ? "Center" : a.r(3, 4) ? "Start" : a.r(3, 5) ? "End" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtz)) {
            return false;
        }
        int i = ((dtz) obj).a;
        return true;
    }

    public final int hashCode() {
        return 3;
    }

    public final String toString() {
        return a();
    }
}
