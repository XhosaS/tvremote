package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class cxz extends cxy {
    public cxz(cyh cyhVar, WindowInsets windowInsets) {
        super(cyhVar, windowInsets);
    }

    @Override // defpackage.cxx, defpackage.cye
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxz)) {
            return false;
        }
        cxz cxzVar = (cxz) obj;
        return Objects.equals(this.a, cxzVar.a) && Objects.equals(this.b, cxzVar.b) && o(this.c, cxzVar.c);
    }

    @Override // defpackage.cye
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cye
    public cvb u() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new cvb(displayCutout);
    }

    @Override // defpackage.cye
    public cyh v() {
        return cyh.o(this.a.consumeDisplayCutout());
    }

    public cxz(cyh cyhVar, cxz cxzVar) {
        super(cyhVar, cxzVar);
    }
}
