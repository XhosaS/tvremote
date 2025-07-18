package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yyc extends ypw {
    private final String a;
    private final yxz b;

    public yyc(int i, int i2, long j, String str) {
        this.a = str;
        this.b = new yxz(i, i2, j, str);
    }

    @Override // defpackage.yot
    public final void a(yil yilVar, Runnable runnable) {
        yxz.e(this.b, runnable, false, 6);
    }

    public void close() {
        this.b.close();
    }

    @Override // defpackage.ypw
    public final Executor e() {
        return this.b;
    }

    @Override // defpackage.yot
    public final void f(yil yilVar, Runnable runnable) {
        yxz.e(this.b, runnable, true, 2);
    }

    public final void h(Runnable runnable, boolean z) {
        this.b.a(runnable, true, z);
    }
}
