package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzv extends agtq {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ fzw d;
    int e;
    ymk f;
    ylh g;
    ymk h;
    ylh i;
    acaw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzv(fzw fzwVar, agsw agswVar) {
        super(agswVar);
        this.d = fzwVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objI = fzw.i(this.d, null, null, null, this);
        return objI == agtg.a ? objI : new agpk(objI);
    }
}
