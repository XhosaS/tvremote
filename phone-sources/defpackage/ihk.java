package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ihk extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ ihq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihk(ihq ihqVar, yih yihVar) {
        super(yihVar);
        this.b = ihqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
