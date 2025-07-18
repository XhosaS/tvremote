package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrg extends yxl {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public yrg(yil yilVar, yih yihVar) {
        yrh yrhVar = yrh.a;
        super(yilVar.get(yrhVar) == null ? yilVar.plus(yrhVar) : yilVar, yihVar);
        this.b = new ThreadLocal();
        if (yihVar.getContext().get(yii.k) instanceof yot) {
            return;
        }
        Object objB = yxr.b(yilVar, null);
        yxr.c(yilVar, objB);
        f(yilVar, objB);
    }

    private final void U() {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.b;
            yfw yfwVar = (yfw) threadLocal.get();
            if (yfwVar != null) {
                yxr.c((yil) yfwVar.a, yfwVar.b);
            }
            threadLocal.remove();
        }
    }

    public final boolean T() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.yxl
    public final void e() {
        U();
    }

    @Override // defpackage.yxl, defpackage.ynw
    protected final void eM(Object obj) {
        U();
        yih yihVar = this.e;
        Object objL = yks.l(obj, yihVar);
        yil context = yihVar.getContext();
        Object objB = yxr.b(context, null);
        yrg yrgVarC = objB != yxr.a ? yos.c(yihVar, context, objB) : null;
        try {
            yihVar.resumeWith(objL);
            if (yrgVarC == null || yrgVarC.T()) {
                yxr.c(context, objB);
            }
        } catch (Throwable th) {
            if (yrgVarC == null || yrgVarC.T()) {
                yxr.c(context, objB);
            }
            throw th;
        }
    }

    public final void f(yil yilVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new yfw(yilVar, obj));
    }
}
