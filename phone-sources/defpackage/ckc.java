package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class ckc {
    public final int a;

    public /* synthetic */ ckc(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return a.r(i, -1) ? "Unspecified" : a.r(i, 0) ? "None" : a.r(i, 1) ? "Characters" : a.r(i, 2) ? "Words" : a.r(i, 3) ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ckc) && this.a == ((ckc) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
