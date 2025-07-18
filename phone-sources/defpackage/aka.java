package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aka extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ akb b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aka(akb akbVar, yih yihVar) {
        super(yihVar);
        this.b = akbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.p(null, this);
    }
}
