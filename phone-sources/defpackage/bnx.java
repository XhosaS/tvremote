package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class bnx {
    public final int a;

    public /* synthetic */ bnx(int i) {
        this.a = i;
    }

    public static boolean a(int i, Object obj) {
        return (obj instanceof bnx) && i == ((bnx) obj).a;
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a.r(i, 0) ? "Argb8888" : a.r(i, 1) ? "Alpha8" : a.r(i, 2) ? "Rgb565" : a.r(i, 3) ? "F16" : a.r(i, 4) ? "Gpu" : "Unknown";
    }
}
