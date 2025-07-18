package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pwr extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ pww d;
    int e;
    pvi f;
    qen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwr(pww pwwVar, yih yihVar) {
        super(yihVar);
        this.d = pwwVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, null, null, this);
    }
}
