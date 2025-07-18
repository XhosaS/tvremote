package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrj implements rpf {
    public final String a;
    private final int b;

    public rrj() {
        throw null;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return this.b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rrj)) {
            return false;
        }
        rrj rrjVar = (rrj) obj;
        int i = this.b;
        int i2 = rrjVar.b;
        if (i != 0) {
            return i2 == 1 && this.a.equals(rrjVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        a.bl(this.b);
        return (this.a.hashCode() ^ (-722379962)) * 1000003;
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=" + rpg.a(this.b) + ", reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    public rrj(byte[] bArr) {
        this.b = 1;
        this.a = "";
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
