package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggb extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ggd c;
    int d;
    String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggb(ggd ggdVar, yih yihVar) {
        super(yihVar);
        this.c = ggdVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
