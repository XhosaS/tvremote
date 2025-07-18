package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyl extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ gyn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyl(gyn gynVar, yih yihVar) {
        super(yihVar);
        this.b = gynVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
