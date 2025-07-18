package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wir implements bbv {
    private final bco a;
    private final wua b;

    public wir(wua wuaVar, bco bcoVar) {
        this.a = bcoVar;
        this.b = wuaVar;
    }

    @Override // defpackage.bbv
    public final void b(bcl bclVar) {
        wwt wwtVarC = this.b.c();
        try {
            this.a.e(bce.ON_DESTROY);
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bbv
    public final void c(bcl bclVar) {
        wum.h();
        try {
            this.a.e(bce.ON_START);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bbv
    public final void d(bcl bclVar) {
        wum.h();
        try {
            this.a.e(bce.ON_STOP);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bbv
    public final void e() {
        wum.h();
        try {
            this.a.e(bce.ON_PAUSE);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bbv
    public final void eY(bcl bclVar) {
        wum.h();
        try {
            this.a.e(bce.ON_CREATE);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bbv
    public final void f() {
        wua wuaVar = this.b;
        try {
            wwt wwtVarC = wuaVar.c();
            try {
                this.a.e(bce.ON_RESUME);
                wwtVarC.close();
            } catch (Throwable th) {
                try {
                    wwtVarC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } finally {
            wuaVar.b = null;
            wuaVar.c = null;
        }
    }
}
