package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uy extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ uz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(uz uzVar, yih yihVar) {
        super(yihVar);
        this.b = uzVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o(this);
    }
}
