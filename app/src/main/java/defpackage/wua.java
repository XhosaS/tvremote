package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wua {
    public final bq a;
    public wyt b;
    public wyt c;
    private int d = 0;

    public wua(bq bqVar) {
        this.a = bqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i(wyt wytVar, bq bqVar, boolean z) {
        if (bqVar.s() != null) {
            for (bq bqVar2 : bqVar.eg().b.i()) {
                if (bqVar2 instanceof wwo) {
                    ((wwo) bqVar2).aN(wytVar, z);
                } else {
                    i(wytVar, bqVar2, z);
                }
            }
        }
    }

    public final wwt a(String str) {
        if (wum.t()) {
            return wzg.f(str, wwb.a, true);
        }
        bw bwVarEe = this.a.ee();
        bwVarEe.getClass();
        return wxj.a(bwVarEe).b(str, "com/google/apps/tiktok/tracing/FragmentCallbacksTraceManager", "begin", 44);
    }

    public final wwt b() {
        try {
            return c();
        } finally {
            this.b = null;
            this.c = null;
            this.d = 0;
        }
    }

    public final wwt c() {
        wyt wytVar = this.c;
        if (wytVar != null) {
            return wytVar.a();
        }
        wyt wytVar2 = this.b;
        return wytVar2 != null ? wytVar2.a() : wum.h();
    }

    public final void d(wyt wytVar, boolean z) {
        if (z) {
            if (wytVar == null) {
                int i = this.d - 1;
                if (i < 0) {
                    i = 0;
                }
                this.d = i;
                if (i == 0) {
                    this.b = null;
                    return;
                }
                return;
            }
            this.d++;
        }
        this.b = wytVar;
        i(wytVar, this.a, z);
    }

    public final void e(int i, int i2) {
        wum.h();
        if (i == 0 && i2 == 0) {
            return;
        }
        d(wyt.b(), true);
    }

    public final void f() {
        wum.h();
        if (this.d > 0) {
            d(wyt.b(), false);
        }
    }

    public final void g() {
        wum.p(true);
        if (this.d > 0) {
            d(wyt.b(), false);
        }
    }

    public final void h() {
        d(wyt.b(), true);
    }
}
