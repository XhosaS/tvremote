package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class guc extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ gva b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public guc(gva gvaVar, agsw agswVar) {
        super(agswVar);
        this.b = gvaVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objF = this.b.f(null, this);
        return objF == agtg.a ? objF : new agpk(objF);
    }
}
