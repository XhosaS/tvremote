package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pvc extends yiv {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ pvd d;
    int e;
    pvd f;
    qen g;
    yyk h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvc(pvd pvdVar, yih yihVar) {
        super(yihVar);
        this.d = pvdVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return pvd.d(this.d, null, false, this);
    }
}
