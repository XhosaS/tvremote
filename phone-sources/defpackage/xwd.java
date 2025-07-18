package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwd extends wbb {
    public volatile boolean a;
    public List b;
    public final wbb c;

    public xwd(wbb wbbVar) {
        super(null);
        this.b = new ArrayList();
        this.c = wbbVar;
    }

    private final void f(Runnable runnable) {
        synchronized (this) {
            if (this.a) {
                runnable.run();
            } else {
                this.b.add(runnable);
            }
        }
    }

    @Override // defpackage.wbb
    public final void a(xtk xtkVar, xsm xsmVar) {
        f(new rvp(this, xtkVar, xsmVar, 18));
    }

    @Override // defpackage.wbb
    public final void c(xsm xsmVar) {
        if (this.a) {
            this.c.c(xsmVar);
        } else {
            f(new utm(this, xsmVar, 9, (char[]) null));
        }
    }

    @Override // defpackage.wbb
    public final void d(Object obj) {
        if (this.a) {
            this.c.d(obj);
        } else {
            f(new utm((Object) this, obj, 10, (byte[]) null));
        }
    }

    @Override // defpackage.wbb
    public final void e() {
        if (this.a) {
            this.c.e();
        } else {
            f(new ufx(this, 20, null));
        }
    }
}
