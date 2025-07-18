package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kbk extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ kbm c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbk(kbm kbmVar, yih yihVar) {
        super(yihVar);
        this.c = kbmVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
