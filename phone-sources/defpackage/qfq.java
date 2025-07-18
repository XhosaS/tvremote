package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfq extends yiv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ qfx c;
    int d;
    vkt e;
    qfi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfq(qfx qfxVar, yih yihVar) {
        super(yihVar);
        this.c = qfxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
