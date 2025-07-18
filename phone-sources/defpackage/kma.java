package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kma extends yiv {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ kmb c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kma(kmb kmbVar, yih yihVar) {
        super(yihVar);
        this.c = kmbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(false, this);
    }
}
