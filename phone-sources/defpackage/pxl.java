package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pxl extends yiv {
    Object a;
    boolean b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ pxn e;
    int f;
    pvi g;
    qen h;
    qdo i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxl(pxn pxnVar, yih yihVar) {
        super(yihVar);
        this.e = pxnVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, null, null, null, false, false, this);
    }
}
