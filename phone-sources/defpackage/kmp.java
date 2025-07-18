package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kmp extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ kmt b;
    int c;
    kmt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmp(kmt kmtVar, yih yihVar) {
        super(yihVar);
        this.b = kmtVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
