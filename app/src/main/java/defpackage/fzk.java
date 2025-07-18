package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzk extends agtq {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ fzw d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzk(fzw fzwVar, agsw agswVar) {
        super(agswVar);
        this.d = fzwVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objE = fzw.e(this.d, null, null, this);
        return objE == agtg.a ? objE : new agpk(objE);
    }
}
