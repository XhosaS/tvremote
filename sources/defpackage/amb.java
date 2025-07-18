package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amb implements amj {
    public final Object a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public amb(Executor executor, alx alxVar, amn amnVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = alxVar;
        this.a = amnVar;
    }

    @Override // defpackage.amj
    public final void c(ami amiVar) {
        int i = this.d;
        if (i == 0) {
            if (((amn) amiVar).c) {
                synchronized (this.a) {
                }
                this.c.execute(new ama(this, 0));
                return;
            }
            return;
        }
        if (i == 1) {
            this.c.execute(new bb(this, amiVar, 19, (short[]) null));
            return;
        }
        if (i == 2) {
            synchronized (this.a) {
            }
            this.c.execute(new ame(this, amiVar, 1));
        } else {
            if (i != 3) {
                if (amiVar.d()) {
                    synchronized (this.a) {
                    }
                    this.c.execute(new ame(this, amiVar, 2));
                    return;
                }
                return;
            }
            if (amiVar.d() || ((amn) amiVar).c) {
                return;
            }
            synchronized (this.a) {
            }
            this.c.execute(new ame(this, amiVar, 0));
        }
    }

    public amb(Executor executor, Object obj, int i) {
        this.d = i;
        this.a = new Object();
        this.c = executor;
        this.b = obj;
    }
}
