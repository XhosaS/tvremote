package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mdp extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ mdw b;
    int c;
    yrr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdp(mdw mdwVar, yih yihVar) {
        super(yihVar);
        this.b = mdwVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
