package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfr extends yiv {
    Object a;
    Object b;
    Object c;
    long d;
    long e;
    /* synthetic */ Object f;
    final /* synthetic */ qfx g;
    int h;
    vku i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfr(qfx qfxVar, yih yihVar) {
        super(yihVar);
        this.g = qfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.i(null, null, 0L, 0L, this);
    }
}
