package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsd extends yiv {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ cb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsd(cb cbVar, yih yihVar) {
        super(yihVar);
        this.d = cbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.D(null, this);
    }
}
