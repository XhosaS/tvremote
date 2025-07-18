package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rph implements rpf {
    private final int a;
    private final rrx b;

    public rph() {
        throw null;
    }

    public static final rub d() {
        rub rubVar = new rub((char[]) null);
        rubVar.c = new rrx();
        rubVar.b = 1;
        rubVar.a = (byte) 1;
        return rubVar;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return this.a == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rph)) {
            return false;
        }
        rph rphVar = (rph) obj;
        int i = this.a;
        int i2 = rphVar.a;
        if (i != 0) {
            return i == i2 && this.b.equals(rphVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.bl(i);
        return ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + rpg.a(this.a) + ", chargeCounterEnabled=false, metricExtensionProvider=" + String.valueOf(this.b) + "}";
    }

    public rph(int i, rrx rrxVar) {
        this.a = i;
        this.b = rrxVar;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
