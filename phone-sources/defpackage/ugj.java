package defpackage;

import com.google.common.collect.ImmutableCollection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugj extends ufq {
    private ugi b;

    public ugj(ImmutableCollection immutableCollection, boolean z, Executor executor, ufv ufvVar) {
        super(immutableCollection, z, false);
        this.b = new ugg(this, ufvVar, executor);
        v();
    }

    @Override // defpackage.ufq
    public final void j() {
        ugi ugiVar = this.b;
        if (ugiVar != null) {
            ugiVar.f();
        }
    }

    @Override // defpackage.ufb
    protected final void o() {
        ugi ugiVar = this.b;
        if (ugiVar != null) {
            ugiVar.h();
        }
    }

    @Override // defpackage.ufq
    public final void x(int i) {
        super.x(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public ugj(ImmutableCollection immutableCollection, boolean z, Executor executor, Callable callable) {
        super(immutableCollection, z, false);
        this.b = new ugh(this, callable, executor);
        v();
    }

    @Override // defpackage.ufq
    public final void h(int i, Object obj) {
    }
}
