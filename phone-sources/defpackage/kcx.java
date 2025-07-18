package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kcx extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ kcy b;
    int c;
    kcy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcx(kcy kcyVar, yih yihVar) {
        super(yihVar);
        this.b = kcyVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
