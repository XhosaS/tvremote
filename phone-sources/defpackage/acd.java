package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acd extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ ace b;
    int c;
    ylf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acd(ace aceVar, yih yihVar) {
        super(yihVar);
        this.b = aceVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
