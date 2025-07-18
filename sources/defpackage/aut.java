package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aut implements atd {
    public final float a;
    public final int b;
    public final byg c;
    private final int d;

    public aut() {
        throw null;
    }

    public static final ayg d() {
        ayg aygVar = new ayg(null);
        aygVar.b = 100.0f;
        aygVar.a = 1;
        aygVar.e = 100;
        aygVar.d = (byte) 3;
        return aygVar;
    }

    @Override // defpackage.atd
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.atd
    public final boolean b() {
        int i = this.d;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aut)) {
            return false;
        }
        aut autVar = (aut) obj;
        int i = this.d;
        int i2 = autVar.d;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(autVar.a) && this.b == autVar.b && this.c.equals(autVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        ii.ac(i);
        return ((((((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ this.b) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        return "CrashConfigurations{enablement=" + ate.a(this.d) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=null, crashLoopListener=" + String.valueOf(this.c) + "}";
    }

    public aut(int i, float f, int i2, byg bygVar) {
        this.d = i;
        this.a = f;
        this.b = i2;
        this.c = bygVar;
    }

    @Override // defpackage.atd
    public final void c() {
    }
}
