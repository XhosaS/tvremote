package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkj extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ dkk b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkj(dkk dkkVar, yih yihVar) {
        super(yihVar);
        this.b = dkkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
