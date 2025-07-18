package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahnb extends ahdb {
    private final String a;
    private final ahmx d;

    public ahnb(int i, int i2, long j, String str) {
        this.a = str;
        this.d = new ahmx(i, i2, j, str);
    }

    @Override // defpackage.ahbm
    public final void a(agte agteVar, Runnable runnable) {
        ahmx.e(this.d, runnable, false, 6);
    }

    public void close() {
        this.d.f();
    }

    @Override // defpackage.ahdb
    public final Executor e() {
        return this.d;
    }

    @Override // defpackage.ahbm
    public final void f(agte agteVar, Runnable runnable) {
        ahmx.e(this.d, runnable, true, 2);
    }

    public final void g(Runnable runnable, boolean z) {
        this.d.a(runnable, true, z);
    }
}
