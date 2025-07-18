package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtp implements rpf {
    public final tst a;
    public final tst b;
    private final int c;

    public rtp() {
        throw null;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return this.c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rtp)) {
            return false;
        }
        rtp rtpVar = (rtp) obj;
        int i = this.c;
        int i2 = rtpVar.c;
        if (i != 0) {
            return i2 == 1 && this.a.equals(rtpVar.a) && this.b.equals(rtpVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        a.bl(this.c);
        return 395873938;
    }

    public final String toString() {
        tst tstVar = this.b;
        return "StartupConfigurations{enablement=" + rpg.a(this.c) + ", metricExtensionProvider=" + String.valueOf(this.a) + ", customTimestampProvider=" + String.valueOf(tstVar) + "}";
    }

    public rtp(tst tstVar, tst tstVar2) {
        this.c = 1;
        this.a = tstVar;
        this.b = tstVar2;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
