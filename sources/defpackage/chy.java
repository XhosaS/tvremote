package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chy extends chn {
    private chx b;

    public chy(bzl bzlVar, boolean z, Executor executor, chs chsVar) {
        super(bzlVar, z, false);
        this.b = new chv(this, chsVar, executor);
        x();
    }

    @Override // defpackage.chn
    public final void i() {
        chx chxVar = this.b;
        if (chxVar != null) {
            chxVar.f();
        }
    }

    @Override // defpackage.cgx
    protected final void o() {
        chx chxVar = this.b;
        if (chxVar != null) {
            chxVar.h();
        }
    }

    @Override // defpackage.chn
    public final void z(int i) {
        super.z(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public chy(bzl bzlVar, boolean z, Executor executor, Callable callable) {
        super(bzlVar, z, false);
        this.b = new chw(this, callable, executor);
        x();
    }

    @Override // defpackage.chn
    public final void g(int i, Object obj) {
    }
}
