package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class irl extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ irn b;
    int c;
    wll d;
    wog e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irl(irn irnVar, yih yihVar) {
        super(yihVar);
        this.b = irnVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, this);
    }
}
