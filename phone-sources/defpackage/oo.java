package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oo extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ op c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo(op opVar, yih yihVar) {
        super(yihVar);
        this.c = opVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(this);
    }
}
