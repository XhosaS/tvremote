package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qac extends yiv {
    Object a;
    Object b;
    int c;
    /* synthetic */ Object d;
    final /* synthetic */ qad e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qac(qad qadVar, yih yihVar) {
        super(yihVar);
        this.e = qadVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return qad.h(this.e, null, this);
    }
}
