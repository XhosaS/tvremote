package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtf implements rpf {
    public final int a;
    public final tst b;
    private final int c;

    public rtf() {
        throw null;
    }

    public static final rte d() {
        rte rteVar = new rte(null);
        rteVar.a = 50;
        rteVar.c = (byte) 3;
        rteVar.b = trk.a;
        rteVar.d = 1;
        return rteVar;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return this.c == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rtf)) {
            return false;
        }
        rtf rtfVar = (rtf) obj;
        int i = this.c;
        int i2 = rtfVar.c;
        if (i != 0) {
            return i == i2 && this.a == rtfVar.a && this.b.equals(rtfVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        a.bl(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "NetworkConfigurations{enablement=" + rpg.a(this.c) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=false, metricExtensionProvider=" + String.valueOf(this.b) + "}";
    }

    public rtf(int i, int i2, tst tstVar) {
        this.c = i;
        this.a = i2;
        this.b = tstVar;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
