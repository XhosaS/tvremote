package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcl extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ dcm b;
    int c;
    yyk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcl(dcm dcmVar, yih yihVar) {
        super(yihVar);
        this.b = dcmVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
