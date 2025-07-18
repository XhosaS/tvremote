package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ons implements ooa {
    public final Object a = new Object();
    public Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public ons(Executor executor, Object obj, int i) {
        this.d = i;
        this.c = executor;
        this.b = obj;
    }

    @Override // defpackage.ooa
    public final void a() {
        int i = this.d;
        if (i == 0) {
            synchronized (this.a) {
                this.b = null;
            }
        } else if (i == 1) {
            synchronized (this.a) {
                this.b = null;
            }
        } else if (i != 2) {
            synchronized (this.a) {
                this.b = null;
            }
        } else {
            synchronized (this.a) {
                this.b = null;
            }
        }
    }

    @Override // defpackage.ooa
    public final void b(onz onzVar) {
        int i = this.d;
        if (i == 0) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new non(this, onzVar, 14, (short[]) null));
                return;
            }
        }
        if (i == 1) {
            if (((ooe) onzVar).c) {
                synchronized (this.a) {
                    if (this.b == null) {
                        return;
                    }
                    this.c.execute(new nur(this, 10, null));
                    return;
                }
            }
            return;
        }
        if (i != 2) {
            if (onzVar.i()) {
                synchronized (this.a) {
                    if (this.b == null) {
                        return;
                    }
                    this.c.execute(new non(this, onzVar, 16, (short[]) null));
                    return;
                }
            }
            return;
        }
        if (onzVar.i() || ((ooe) onzVar).c) {
            return;
        }
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new non(this, onzVar, 15, (short[]) null));
        }
    }
}
