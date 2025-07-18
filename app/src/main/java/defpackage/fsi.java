package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsi extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fsl b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsi(fsl fslVar, agsw agswVar) {
        super(agswVar);
        this.b = fslVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
