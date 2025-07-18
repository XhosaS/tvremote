package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pxt extends yiv {
    long a;
    int b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ pxu e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxt(pxu pxuVar, yih yihVar) {
        super(yihVar);
        this.e = pxuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
