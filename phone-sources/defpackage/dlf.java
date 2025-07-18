package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlf extends yiv {
    Object a;
    Object b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ dlj e;
    int f;
    djz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlf(dlj dljVar, yih yihVar) {
        super(yihVar);
        this.e = dljVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, 0, this);
    }
}
