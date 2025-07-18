package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkp extends yiv {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ qku d;
    int e;
    vmd f;
    qel g;
    yyk h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkp(qku qkuVar, yih yihVar) {
        super(yihVar);
        this.d = qkuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i(null, null, false, null, this);
    }
}
