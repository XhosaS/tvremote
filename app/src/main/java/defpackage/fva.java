package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fva extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fvb b;
    int c;
    agwe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fva(fvb fvbVar, agsw agswVar) {
        super(agswVar);
        this.b = fvbVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, 0, this);
    }
}
