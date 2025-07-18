package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qeu extends yiv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    /* synthetic */ Object f;
    final /* synthetic */ qew g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qeu(qew qewVar, yih yihVar) {
        super(yihVar);
        this.g = qewVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, null, 0L, this);
    }
}
