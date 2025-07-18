package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class urk {
    public final long a;
    public final long b;
    public final int c;
    private final xsm d;
    private final Object e;
    private final xsm f;

    public urk(xsm xsmVar, Object obj, xsm xsmVar2, long j, long j2, int i) {
        this.e = obj;
        this.d = xsmVar;
        this.f = xsmVar2;
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    final aafi a() {
        return new aafi(this.e, this.d, this.f);
    }
}
