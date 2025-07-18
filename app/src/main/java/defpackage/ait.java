package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class ait extends ais {
    public ait(ajc ajcVar, WindowInsets windowInsets) {
        super(ajcVar, windowInsets);
    }

    @Override // defpackage.air, defpackage.aiy
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ait)) {
            return false;
        }
        ait aitVar = (ait) obj;
        return Objects.equals(this.a, aitVar.a) && Objects.equals(this.b, aitVar.b) && l(this.c, aitVar.c);
    }

    @Override // defpackage.aiy
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aiy
    public afy r() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new afy(displayCutout);
    }

    @Override // defpackage.aiy
    public ajc s() {
        return ajc.g(this.a.consumeDisplayCutout(), null);
    }
}
