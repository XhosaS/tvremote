package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kmr extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ kmt b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmr(kmt kmtVar, yih yihVar) {
        super(yihVar);
        this.b = kmtVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(this);
    }
}
