package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ceo extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ cep b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceo(cep cepVar, yih yihVar) {
        super(yihVar);
        this.b = cepVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0.0f, this);
    }
}
