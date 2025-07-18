package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axz extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ ayd b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axz(ayd aydVar, yih yihVar) {
        super(yihVar);
        this.b = aydVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, this);
    }
}
