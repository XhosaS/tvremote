package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfo extends yiv {
    boolean a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ qfx d;
    int e;
    qfi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfo(qfx qfxVar, yih yihVar) {
        super(yihVar);
        this.d = qfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.l(false, null, this);
    }
}
