package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class isp extends yiv {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ isr c;
    int d;
    wll e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isp(isr isrVar, yih yihVar) {
        super(yihVar);
        this.c = isrVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, false, this);
    }
}
