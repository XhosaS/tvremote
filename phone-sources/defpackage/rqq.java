package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqq implements rpf {
    public final float a;
    public final int b;
    public final tst c;
    private final int d;

    public rqq() {
        throw null;
    }

    public static final ruj d() {
        ruj rujVar = new ruj(null);
        rujVar.b = 100.0f;
        rujVar.a = 1;
        rujVar.e = 100;
        rujVar.d = (byte) 3;
        return rujVar;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        int i = this.d;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rqq)) {
            return false;
        }
        rqq rqqVar = (rqq) obj;
        int i = this.d;
        int i2 = rqqVar.d;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(rqqVar.a) && this.b == rqqVar.b && this.c.equals(rqqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.bl(i);
        return ((((((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ this.b) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        return "CrashConfigurations{enablement=" + rpg.a(this.d) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=null, crashLoopListener=" + String.valueOf(this.c) + "}";
    }

    public rqq(int i, float f, int i2, tst tstVar) {
        this.d = i;
        this.a = f;
        this.b = i2;
        this.c = tstVar;
    }

    @Override // defpackage.rpf
    public final void c() {
    }
}
