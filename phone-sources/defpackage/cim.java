package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cim extends yiv {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ cxe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cim(cxe cxeVar, yih yihVar) {
        super(yihVar);
        this.d = cxeVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.H(null, this);
    }
}
