package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qxd extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ qxe c;
    int d;
    vrm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxd(qxe qxeVar, yih yihVar) {
        super(yihVar);
        this.c = qxeVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
