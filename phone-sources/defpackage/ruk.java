package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruk implements rpf {
    public final float a;
    public final tst b;
    private final int c;
    private final int d;

    public ruk() {
        throw null;
    }

    public static final ruj d() {
        ruj rujVar = new ruj(null);
        rujVar.a = 10;
        rujVar.b = 1.0f;
        rujVar.d = (byte) 3;
        rujVar.c = trk.a;
        rujVar.e = 1;
        return rujVar;
    }

    @Override // defpackage.rpf
    public final int a() {
        return this.c;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ruk)) {
            return false;
        }
        ruk rukVar = (ruk) obj;
        int i = this.d;
        int i2 = rukVar.d;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.c == rukVar.c) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(rukVar.a) && this.b.equals(rukVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.bl(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + rpg.a(this.d) + ", rateLimitPerSecond=" + this.c + ", samplingProbability=" + this.a + ", perEventConfigurationFlags=" + String.valueOf(this.b) + "}";
    }

    public ruk(int i, int i2, float f, tst tstVar) {
        this.d = i;
        this.c = i2;
        this.a = f;
        this.b = tstVar;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
