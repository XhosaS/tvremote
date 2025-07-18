package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vld extends zxc {
    final /* synthetic */ vle a;
    private final zyd b;

    public vld(vle vleVar, zyd zydVar) {
        this.a = vleVar;
        this.b = zydVar;
    }

    @Override // defpackage.zxc, defpackage.zyd
    public final void d(Runnable runnable, Executor executor) {
        if (isDone()) {
            this.b.d(runnable, executor);
        }
        this.b.d(runnable, new vla(this.a, executor));
    }

    @Override // defpackage.zxc
    protected final zyd eQ() {
        return this.b;
    }

    @Override // defpackage.zxc, defpackage.zxa
    protected final /* synthetic */ Future eR() {
        return this.b;
    }

    @Override // defpackage.zxa, defpackage.yxq
    protected final /* synthetic */ Object f() {
        return this.b;
    }
}
