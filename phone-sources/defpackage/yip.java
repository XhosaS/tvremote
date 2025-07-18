package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yip extends yix {
    final /* synthetic */ yjz a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yip(yih yihVar, yjz yjzVar, Object obj) {
        super(yihVar);
        this.a = yjzVar;
        this.b = obj;
    }

    @Override // defpackage.yit
    protected final Object invokeSuspend(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            ybn.f(obj);
            return obj;
        }
        this.c = 1;
        ybn.f(obj);
        yjz yjzVar = this.a;
        ylh.d(yjzVar, 2);
        return yjzVar.a(this.b, this);
    }
}
