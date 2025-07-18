package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fks extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fkt b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fks(fkt fktVar, agsw agswVar) {
        super(agswVar);
        this.b = fktVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
