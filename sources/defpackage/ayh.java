package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayh implements atd {
    public final float a;
    private final int b;
    private final byg c;
    private final int d;

    public ayh() {
        throw null;
    }

    public static final ayg d() {
        ayg aygVar = new ayg(null);
        aygVar.a = 10;
        aygVar.b = 1.0f;
        aygVar.d = (byte) 3;
        aygVar.c = bxw.a;
        aygVar.e = 1;
        return aygVar;
    }

    @Override // defpackage.atd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.atd
    public final boolean b() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ayh)) {
            return false;
        }
        ayh ayhVar = (ayh) obj;
        int i = this.d;
        int i2 = ayhVar.d;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.b == ayhVar.b) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ayhVar.a) && this.c.equals(ayhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        ii.ac(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + ate.a(this.d) + ", rateLimitPerSecond=" + this.b + ", samplingProbability=" + this.a + ", perEventConfigurationFlags=" + String.valueOf(this.c) + "}";
    }

    public ayh(int i, int i2, float f, byg bygVar) {
        this.d = i;
        this.b = i2;
        this.a = f;
        this.c = bygVar;
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
