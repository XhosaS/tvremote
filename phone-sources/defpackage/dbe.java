package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbe extends yiv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ dcm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbe(dcm dcmVar, yih yihVar) {
        super(yihVar);
        this.c = dcmVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
