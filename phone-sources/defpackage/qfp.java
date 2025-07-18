package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfp extends yiv {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ qfx c;
    int d;
    qfi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfp(qfx qfxVar, yih yihVar) {
        super(yihVar);
        this.c = qfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, false, null, this);
    }
}
