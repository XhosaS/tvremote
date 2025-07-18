package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywu extends ypi implements yiw, yih {
    public final yot a;
    public final yih b;
    public Object c;
    public final Object d;
    public final ynu f;

    public ywu(yot yotVar, yih yihVar) {
        super(-1);
        this.a = yotVar;
        this.b = yihVar;
        this.c = ywv.a;
        this.d = yxr.a(getContext());
        this.f = new ynu(null, ynv.a);
    }

    public final void a(yil yilVar, Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.f(yilVar, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yih, yiw] */
    @Override // defpackage.yiw
    public final yiw getCallerFrame() {
        return this.b;
    }

    @Override // defpackage.yih
    public final yil getContext() {
        return this.b.getContext();
    }

    @Override // defpackage.yiw
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.ypi
    public final Object l() {
        Object obj = this.c;
        boolean z = yoy.a;
        this.c = ywv.a;
        return obj;
    }

    @Override // defpackage.yih
    public final void resumeWith(Object obj) {
        Object objM = yks.m(obj);
        yot yotVar = this.a;
        if (ywv.c(yotVar, getContext())) {
            this.c = objM;
            this.e = 0;
            ywv.b(yotVar, getContext(), this);
            return;
        }
        boolean z = yoy.a;
        ThreadLocal threadLocal = yra.a;
        ypp yppVarA = yra.a();
        if (yppVarA.p()) {
            this.c = objM;
            this.e = 0;
            yppVarA.n(this);
            return;
        }
        yppVarA.o(true);
        try {
            yil context = getContext();
            Object objB = yxr.b(context, this.d);
            try {
                this.b.resumeWith(obj);
                while (yppVarA.r()) {
                }
            } finally {
                yxr.c(context, objB);
            }
        } catch (Throwable th) {
            try {
                E(th);
            } finally {
                yppVarA.m(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + yoz.c(this.b) + "]";
    }

    @Override // defpackage.ypi
    public final yih p() {
        return this;
    }
}
