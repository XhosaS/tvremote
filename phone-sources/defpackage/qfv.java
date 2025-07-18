package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfv extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qfx b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfv(qfx qfxVar, yih yihVar) {
        super(yihVar);
        this.b = qfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, null, null, null, this);
    }
}
