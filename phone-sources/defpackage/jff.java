package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jff extends yiv {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ jkh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jff(jkh jkhVar, yih yihVar) {
        super(yihVar);
        this.e = jkhVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.l(this);
    }
}
