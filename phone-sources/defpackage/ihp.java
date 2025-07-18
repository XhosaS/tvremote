package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ihp extends yiv {
    Object a;
    Object b;
    long c;
    /* synthetic */ Object d;
    final /* synthetic */ ihq e;
    int f;
    ink g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihp(ihq ihqVar, yih yihVar) {
        super(yihVar);
        this.e = ihqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(null, null, null, this);
    }
}
