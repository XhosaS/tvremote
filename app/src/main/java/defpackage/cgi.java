package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgi extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ cgk b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgi(cgk cgkVar, agsw agswVar) {
        super(agswVar);
        this.b = cgkVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
