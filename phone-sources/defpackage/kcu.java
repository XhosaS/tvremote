package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kcu extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ kcv b;
    int c;
    kcv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcu(kcv kcvVar, yih yihVar) {
        super(yihVar);
        this.b = kcvVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
