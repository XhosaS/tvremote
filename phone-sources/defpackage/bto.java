package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bto extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ btq c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bto(btq btqVar, yih yihVar) {
        super(yihVar);
        this.c = btqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.r(0L, null, this);
    }
}
