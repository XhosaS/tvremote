package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmb extends yiv {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ cwn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmb(cwn cwnVar, yih yihVar) {
        super(yihVar);
        this.e = cwnVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.q(null, 0, this);
    }
}
