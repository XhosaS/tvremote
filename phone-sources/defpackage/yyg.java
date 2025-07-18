package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yyg extends yot {
    public static final yyg a = new yyg();

    private yyg() {
    }

    @Override // defpackage.yot
    public final void a(yil yilVar, Runnable runnable) {
        yyb.a.h(runnable, false);
    }

    @Override // defpackage.yot
    public final void f(yil yilVar, Runnable runnable) {
        yyb.a.h(runnable, true);
    }

    @Override // defpackage.yot
    public final yot g(int i) {
        wae.S(i);
        return i >= yyf.d ? this : super.g(i);
    }

    @Override // defpackage.yot
    public final String toString() {
        return "Dispatchers.IO";
    }
}
