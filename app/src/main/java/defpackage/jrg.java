package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrg extends jrh {
    public jrg(float f) {
        super(80.0f, f);
    }

    private final float i(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    @Override // defpackage.jrh
    protected final float a() {
        float f = this.e - this.f;
        if (Math.abs(f) < 0.3926991f) {
            return f;
        }
        float f2 = 6.2831855f + f;
        if (Math.abs(f2) >= 0.3926991f) {
            if (!this.b) {
                return f > 0.3926991f ? f - 6.2831855f : f;
            }
            if (f >= -0.3926991f) {
                return f;
            }
        }
        return f2;
    }

    @Override // defpackage.jrh
    public final void b(float f) {
        this.f = i(this.f + f);
        this.e = i(this.e + f);
    }

    @Override // defpackage.jrh
    public final void c(float f) {
        super.c(i(f));
    }

    @Override // defpackage.jrh
    protected final void d(float f, float f2) {
        super.d(f, f2);
        this.f = i(this.f);
    }
}
