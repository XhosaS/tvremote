package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqp extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ kw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqp(kw kwVar, yih yihVar) {
        super(yihVar);
        this.c = kwVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.y(this);
    }
}
