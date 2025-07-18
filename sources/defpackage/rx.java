package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class rx extends rw {
    public rx(sf sfVar, WindowInsets windowInsets) {
        super(sfVar, windowInsets);
    }

    @Override // defpackage.rv, defpackage.sc
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx)) {
            return false;
        }
        rx rxVar = (rx) obj;
        return Objects.equals(this.a, rxVar.a) && Objects.equals(this.b, rxVar.b) && l(this.c, rxVar.c);
    }

    @Override // defpackage.sc
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.sc
    public po r() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new po(displayCutout);
    }

    @Override // defpackage.sc
    public sf s() {
        return sf.n(this.a.consumeDisplayCutout());
    }
}
