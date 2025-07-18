package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dke extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ dki d;
    int e;
    dml f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dke(dki dkiVar, yih yihVar) {
        super(yihVar);
        this.d = dkiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return dki.e(this.d, null, null, this);
    }
}
