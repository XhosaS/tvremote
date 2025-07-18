package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruw implements rpf {
    public final float a;
    private final int b;

    public ruw() {
        throw null;
    }

    public static final ruv d() {
        ruv ruvVar = new ruv();
        ruvVar.a = 0.5f;
        ruvVar.b = (byte) 1;
        ruvVar.c = 1;
        return ruvVar;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ruw)) {
            return false;
        }
        ruw ruwVar = (ruw) obj;
        int i = this.b;
        int i2 = ruwVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ruwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bl(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + rpg.a(this.b) + ", samplingProbability=" + this.a + "}";
    }

    public ruw(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
