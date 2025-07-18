package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bli extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ blj b;
    int c;
    yrr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bli(blj bljVar, yih yihVar) {
        super(yihVar);
        this.b = bljVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
