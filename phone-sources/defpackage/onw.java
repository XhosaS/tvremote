package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onw implements ooa, onv, onu, onr {
    public final ooe a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public onw(Executor executor, Object obj, ooe ooeVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = obj;
        this.a = ooeVar;
    }

    @Override // defpackage.ooa
    public final void a() {
        if (this.d == 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ooa
    public final void b(onz onzVar) {
        if (this.d != 0) {
            this.c.execute(new non(this, onzVar, 13, (short[]) null));
        } else {
            this.c.execute(new non(this, onzVar, 17, (short[]) null));
        }
    }

    @Override // defpackage.onr
    public final void c() {
        if (this.d != 0) {
            this.a.v();
        } else {
            this.a.v();
        }
    }

    @Override // defpackage.onu
    public final void d(Exception exc) {
        if (this.d != 0) {
            this.a.s(exc);
        } else {
            this.a.s(exc);
        }
    }

    @Override // defpackage.onv
    public final void e(Object obj) {
        if (this.d != 0) {
            this.a.t(obj);
        } else {
            this.a.t(obj);
        }
    }
}
