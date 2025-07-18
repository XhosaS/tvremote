package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cex {
    public final int a = 0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof cex)) {
            return false;
        }
        int i = ((cex) obj).a;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a.r(0, 0) ? "Polite" : a.r(0, 1) ? "Assertive" : "Unknown";
    }
}
