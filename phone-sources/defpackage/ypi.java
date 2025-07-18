package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ypi extends yyd {
    public int e;

    public ypi(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void E(Throwable th) {
        yks.k(p().getContext(), new yox(a.cj(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object l();

    public Throwable o(Object obj) {
        yon yonVar = obj instanceof yon ? (yon) obj : null;
        if (yonVar != null) {
            return yonVar.b;
        }
        return null;
    }

    public abstract yih p();

    /* JADX WARN: Type inference failed for: r1v2, types: [yih, yiw] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = yoy.a;
        try {
            ywu ywuVar = (ywu) p();
            ?? r1 = ywuVar.b;
            Object obj = ywuVar.d;
            yil context = r1.getContext();
            Object objB = yxr.b(context, obj);
            yqe yqeVar = null;
            yrg yrgVarC = objB != yxr.a ? yos.c(r1, context, objB) : null;
            try {
                yil context2 = r1.getContext();
                Object objL = l();
                Throwable thO = o(objL);
                if (thO == null && ylh.al(this.e)) {
                    yqeVar = (yqe) context2.get(yqe.c);
                }
                if (yqeVar != null && !yqeVar.u()) {
                    Throwable thQ = yqeVar.q();
                    B(thQ);
                    if (yoy.b) {
                        thQ = yxn.a(thQ, r1);
                    }
                    r1.resumeWith(ybn.e(thQ));
                } else if (thO != null) {
                    r1.resumeWith(ybn.e(thO));
                } else {
                    r1.resumeWith(k(objL));
                }
                if (yrgVarC != null && !yrgVarC.T()) {
                    return;
                }
                yxr.c(context, objB);
            } catch (Throwable th) {
                if (yrgVarC == null || yrgVarC.T()) {
                    yxr.c(context, objB);
                }
                throw th;
            }
        } catch (ypg e) {
            yks.k(p().getContext(), e.a);
        } catch (Throwable th2) {
            E(th2);
        }
    }

    public void B(Throwable th) {
    }

    public Object k(Object obj) {
        return obj;
    }
}
