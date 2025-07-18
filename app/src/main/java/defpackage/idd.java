package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idd extends agtq {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ idg c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idd(idg idgVar, agsw agswVar) {
        super(agswVar);
        this.c = idgVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(false, null, this);
    }
}
