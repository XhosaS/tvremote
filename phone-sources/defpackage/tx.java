package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tx extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ ty b;
    int c;
    tn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(ty tyVar, yih yihVar) {
        super(yihVar);
        this.b = tyVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, this);
    }
}
