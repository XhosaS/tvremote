package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imk extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ kdj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imk(kdj kdjVar, yih yihVar) {
        super(yihVar);
        this.c = kdjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return kdj.l(this.c, null, null, this);
    }
}
