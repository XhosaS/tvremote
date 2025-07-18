package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruc implements rpf {
    public final tst a;
    private final int b;

    public ruc() {
        throw null;
    }

    public static final rub d() {
        rub rubVar = new rub((byte[]) null);
        rubVar.a = (byte) 1;
        rubVar.c = trk.a;
        rubVar.b = 1;
        return rubVar;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ruc)) {
            return false;
        }
        ruc rucVar = (ruc) obj;
        int i = this.b;
        int i2 = rucVar.b;
        if (i != 0) {
            return i == i2 && this.a.equals(rucVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.bl(i);
        return (((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + rpg.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    public ruc(int i, tst tstVar) {
        this.b = i;
        this.a = tstVar;
    }

    @Override // defpackage.rpf
    public final void c() {
    }
}
