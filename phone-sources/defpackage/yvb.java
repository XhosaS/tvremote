package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yvb extends yiv {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ yvc e;
    int f;
    yve g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvb(yvc yvcVar, yih yihVar) {
        super(yihVar);
        this.e = yvcVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
