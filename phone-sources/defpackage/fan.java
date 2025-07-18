package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fan implements Comparable {
    public final long a;
    public final double b;

    public fan(long j, double d) {
        this.a = j;
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.a, ((fan) obj).a);
    }
}
