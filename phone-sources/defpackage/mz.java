package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mz implements bdy {
    public ne a;
    public long b;
    public long c;
    public boolean d;
    public final bhi e;
    private final bcb f;

    public mz(bhi bhiVar, Object obj, ne neVar, long j, long j2, boolean z) {
        this.e = bhiVar;
        this.f = new bci(obj, bcz.c);
        this.a = neVar != null ? hp.i(neVar) : hp.y(bhiVar, obj);
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.bdy
    public final Object a() {
        return this.f.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjv] */
    public final Object b() {
        return this.e.b.a(this.a);
    }

    public final void c(Object obj) {
        this.f.b(obj);
    }

    public final String toString() {
        return "AnimationState(value=" + a() + ", velocity=" + b() + ", isRunning=" + this.d + ", lastFrameTimeNanos=" + this.b + ", finishedTimeNanos=" + this.c + ')';
    }

    public /* synthetic */ mz(bhi bhiVar, Object obj, ne neVar, int i) {
        this(bhiVar, obj, (i & 4) != 0 ? null : neVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
