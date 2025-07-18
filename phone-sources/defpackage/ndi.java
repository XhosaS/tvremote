package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndi extends ndk {
    public boolean a;

    public ndi(float f) {
        super(80.0f, f);
        this.a = true;
    }

    private static final float i(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    @Override // defpackage.ndj
    protected final float a() {
        float fA = super.a();
        if (Math.abs(fA) < 0.3926991f) {
            return fA;
        }
        float f = 6.2831855f + fA;
        if (Math.abs(f) >= 0.3926991f) {
            if (!this.a) {
                return fA > 0.3926991f ? fA - 6.2831855f : fA;
            }
            if (fA >= -0.3926991f) {
                return fA;
            }
        }
        return f;
    }

    public final void b(float f) {
        this.c = i(this.c + f);
        this.b = i(this.b + f);
    }

    @Override // defpackage.ndj
    public final void c(float f) {
        super.c(i(f));
    }

    @Override // defpackage.ndj
    public final void d(float f, float f2) {
        super.d(f, f2);
        this.c = i(this.c);
    }
}
