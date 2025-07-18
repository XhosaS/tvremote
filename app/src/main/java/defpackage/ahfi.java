package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahfi extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ ahfj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahfi(ahfj ahfjVar, agsw agswVar) {
        super(agswVar);
        this.b = ahfjVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objF = this.b.f(null, 0, 0L, this);
        return objF == agtg.a ? objF : new ahft(objF);
    }
}
