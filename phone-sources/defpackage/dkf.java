package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkf extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ dki b;
    int c;
    dki d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkf(dki dkiVar, yih yihVar) {
        super(yihVar);
        this.b = dkiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return dki.g(this.b, null, null, this);
    }
}
