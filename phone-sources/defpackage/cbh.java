package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbh extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ cbi b;
    int c;
    je d;
    yrr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbh(cbi cbiVar, yih yihVar) {
        super(yihVar);
        this.b = cbiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(this);
    }
}
