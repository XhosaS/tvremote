package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrq implements rpf {
    private final int a;

    public rrq() {
        throw null;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rrq)) {
            return false;
        }
        int i = this.a;
        int i2 = ((rrq) obj).a;
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.bl(i);
        return i ^ (-721379959);
    }

    public final String toString() {
        return "CuiConfigurations{metricExtensionProvider=null, enablement=" + rpg.a(this.a) + "}";
    }

    public rrq(byte[] bArr) {
        this.a = 2;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
