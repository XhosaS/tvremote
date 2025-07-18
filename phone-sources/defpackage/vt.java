package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vt extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ vx b;
    int c;
    yle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(vx vxVar, yih yihVar) {
        super(yihVar);
        this.b = vxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(0L, this);
    }
}
