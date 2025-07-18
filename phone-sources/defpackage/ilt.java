package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ilt extends yiv {
    Object a;
    boolean b;
    long c;
    /* synthetic */ Object d;
    int e;
    final /* synthetic */ ilx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilt(ilu iluVar, yih yihVar) {
        super(yihVar);
        this.f = (ilx) iluVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return ilu.d(this.f, null, null, false, 0L, this);
    }
}
