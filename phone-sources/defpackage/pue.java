package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pue extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pug b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pue(pug pugVar, yih yihVar) {
        super(yihVar);
        this.b = pugVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
