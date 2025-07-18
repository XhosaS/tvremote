package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rbh extends rbk {
    public final float a;
    private final int b;
    private final yqt c;
    private final int d;

    public rbh(int i, int i2, float f, yqt yqtVar) {
        this.d = i;
        this.b = i2;
        this.a = f;
        this.c = yqtVar;
    }

    @Override // defpackage.rbk, defpackage.qtl
    public final int a() {
        return this.b;
    }

    @Override // defpackage.rbk
    public final float d() {
        return this.a;
    }

    @Override // defpackage.rbk
    public final yqt e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rbk) {
            rbk rbkVar = (rbk) obj;
            if (this.d == rbkVar.f() && this.b == rbkVar.a() && Float.floatToIntBits(this.a) == Float.floatToIntBits(rbkVar.d()) && this.c.equals(rbkVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rbk
    public final int f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + qtm.a(this.d) + ", rateLimitPerSecond=" + this.b + ", samplingProbability=" + this.a + ", perEventConfigurationFlags=" + String.valueOf(this.c) + "}";
    }
}
