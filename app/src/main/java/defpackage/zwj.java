package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwj extends zvc {
    public zwi c;

    public zwj(yxy yxyVar, boolean z, Executor executor, zvh zvhVar) {
        super(yxyVar, z, false);
        this.c = new zwg(this, zvhVar, executor);
        u();
    }

    @Override // defpackage.zvc
    public final void h() {
        zwi zwiVar = this.c;
        if (zwiVar != null) {
            zwiVar.f();
        }
    }

    @Override // defpackage.zum
    protected final void m() {
        zwi zwiVar = this.c;
        if (zwiVar != null) {
            zwiVar.h();
        }
    }

    @Override // defpackage.zvc
    public final void w(int i) {
        this.a = null;
        if (i == 1) {
            this.c = null;
        }
    }

    public zwj(yxy yxyVar, boolean z, Executor executor, Callable callable) {
        super(yxyVar, z, false);
        this.c = new zwh(this, callable, executor);
        u();
    }

    @Override // defpackage.zvc
    public final void f(int i, Object obj) {
    }
}
