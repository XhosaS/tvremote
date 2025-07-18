package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oxg extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ oxj d;
    int e;
    oxj f;
    oyd g;
    oyd h;
    oyd i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxg(oxj oxjVar, yih yihVar) {
        super(yihVar);
        this.d = oxjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
