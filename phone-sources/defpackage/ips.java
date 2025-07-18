package defpackage;

/* loaded from: classes2.dex */
public final class ips extends yiv {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ ipt d;
    Object e;
    Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ips(ipt iptVar, yih yihVar) {
        super(yihVar);
        this.d = iptVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
