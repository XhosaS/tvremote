package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtp extends yiv {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ dts e;
    int f;
    yyk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtp(dts dtsVar, yih yihVar) {
        super(yihVar);
        this.e = dtsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, null, this);
    }
}
