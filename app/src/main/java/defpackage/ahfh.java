package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahfh extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ ahfj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahfh(ahfj ahfjVar, agsw agswVar) {
        super(agswVar);
        this.b = ahfjVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = ahfj.e(this.b, this);
        return objE == agtg.a ? objE : new ahft(objE);
    }
}
