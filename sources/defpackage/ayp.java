package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayp implements atd {
    public final float a;
    private final int b;

    public ayp() {
        throw null;
    }

    public static final ayo d() {
        ayo ayoVar = new ayo();
        ayoVar.a = 0.5f;
        ayoVar.b = (byte) 1;
        ayoVar.c = 1;
        return ayoVar;
    }

    @Override // defpackage.atd
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.atd
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ayp)) {
            return false;
        }
        ayp aypVar = (ayp) obj;
        int i = this.b;
        int i2 = aypVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(aypVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        ii.ac(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + ate.a(this.b) + ", samplingProbability=" + this.a + "}";
    }

    public ayp(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
