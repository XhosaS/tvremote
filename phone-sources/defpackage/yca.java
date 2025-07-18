package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yca extends wbb {
    final /* synthetic */ yrz a;
    final /* synthetic */ upo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yca(yrz yrzVar, upo upoVar) {
        super(null);
        this.a = yrzVar;
        this.b = upoVar;
    }

    @Override // defpackage.wbb
    public final void a(xtk xtkVar, xsm xsmVar) {
        xtkVar.getClass();
        xsmVar.getClass();
        this.a.e(xtkVar.g() ? null : new xtl(xtkVar, xsmVar));
    }

    @Override // defpackage.wbb
    public final void d(Object obj) throws Throwable {
        Object objB = this.a.b(obj);
        if (objB instanceof ysc) {
            Throwable thB = ysd.b(objB);
            if (thB != null) {
                throw thB;
            }
            throw new AssertionError("onMessage should never be called until responses is ready");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yrz] */
    @Override // defpackage.wbb
    public final void e() throws Throwable {
        Object objB = this.b.a.b(ygi.a);
        if (objB instanceof ysc) {
            Throwable thB = ysd.b(objB);
            if (thB != null) {
                throw thB;
            }
            throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
        }
    }
}
