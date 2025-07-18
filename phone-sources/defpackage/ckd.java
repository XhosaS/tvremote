package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class ckd {
    public final int a = 0;

    public static String a(int i) {
        return a.r(i, 0) ? "Unspecified" : a.r(i, 1) ? "Text" : a.r(i, 2) ? "Ascii" : a.r(i, 3) ? "Number" : a.r(i, 4) ? "Phone" : a.r(i, 5) ? "Uri" : a.r(i, 6) ? "Email" : a.r(i, 7) ? "Password" : a.r(i, 8) ? "NumberPassword" : a.r(i, 9) ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ckd)) {
            return false;
        }
        int i = ((ckd) obj).a;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a(0);
    }
}
