package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cjf {
    public final int a = 65535;

    public static String a() {
        return a.r(65535, 0) ? "None" : a.r(65535, 1) ? "Weight" : a.r(65535, 2) ? "Style" : a.r(65535, 65535) ? "All" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cjf)) {
            return false;
        }
        int i = ((cjf) obj).a;
        return true;
    }

    public final int hashCode() {
        return 65535;
    }

    public final String toString() {
        return a();
    }
}
