package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iyy extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ iyz b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyy(iyz iyzVar, yih yihVar) {
        super(yihVar);
        this.b = iyzVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
