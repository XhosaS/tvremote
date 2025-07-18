package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qko extends yiv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    boolean g;
    int h;
    /* synthetic */ Object i;
    final /* synthetic */ qku j;
    int k;
    String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qko(qku qkuVar, yih yihVar) {
        super(yihVar);
        this.j = qkuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j(null, null, null, null, false, null, null, this);
    }
}
