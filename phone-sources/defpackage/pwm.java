package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pwm extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pwo b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwm(pwo pwoVar, yih yihVar) {
        super(yihVar);
        this.b = pwoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
