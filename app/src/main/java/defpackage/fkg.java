package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkg extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fki b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkg(fki fkiVar, agsw agswVar) {
        super(agswVar);
        this.b = fkiVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
