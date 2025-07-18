package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qye extends yiv {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    public psn d;
    final /* synthetic */ cb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qye(cb cbVar, yih yihVar) {
        super(yihVar);
        this.e = cbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.B(null, null, null, null, null, this);
    }
}
