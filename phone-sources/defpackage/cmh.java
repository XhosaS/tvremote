package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cmh {
    public final long a;

    public /* synthetic */ cmh(long j) {
        this.a = j;
    }

    public static String a(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static boolean b(long j, Object obj) {
        return (obj instanceof cmh) && j == ((cmh) obj).a;
    }

    public final boolean equals(Object obj) {
        return b(this.a, obj);
    }

    public final int hashCode() {
        return a.k(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
