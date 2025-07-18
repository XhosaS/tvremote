package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwi implements xvm {
    public final xvm a;
    public volatile boolean b;
    public List c = new ArrayList();

    public xwi(xvm xvmVar) {
        this.a = xvmVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.xvm
    public final void a(xtk xtkVar, xvl xvlVar, xsm xsmVar) {
        b(new ejr((Object) this, xtkVar, xvlVar, xsmVar, 17));
    }

    @Override // defpackage.xvm
    public final void c(xsm xsmVar) {
        b(new utm(this, xsmVar, 17, (char[]) null));
    }

    @Override // defpackage.ybu
    public final void d() {
        if (this.b) {
            this.a.d();
        } else {
            b(new xwf(this, 8));
        }
    }

    @Override // defpackage.ybu
    public final void e(xzg xzgVar) {
        if (this.b) {
            this.a.e(xzgVar);
        } else {
            b(new utm((Object) this, (Object) xzgVar, 16, (byte[]) null));
        }
    }
}
