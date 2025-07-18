package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class brt {
    public final int a;

    public /* synthetic */ brt(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof brt) && this.a == ((brt) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a.r(i, 1) ? "Touch" : a.r(i, 2) ? "Keyboard" : "Error";
    }
}
