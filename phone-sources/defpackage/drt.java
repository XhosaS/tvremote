package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class drt {
    public final int a;

    public static String a(int i) {
        return "ContentScale(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof drt) && this.a == ((drt) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
