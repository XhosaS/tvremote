package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ick extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ icl b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ick(icl iclVar, yih yihVar) {
        super(yihVar);
        this.b = iclVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
