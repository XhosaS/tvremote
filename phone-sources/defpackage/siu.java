package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class siu extends sgm {
    public Integer b;

    public siu(sgp sgpVar) {
        super(sgpVar);
    }

    @Override // defpackage.sgm
    public final boolean equals(Object obj) {
        return super.equals(obj) && a.au(this.b, ((siu) obj).b) && a.au(null, null) && a.au(null, null);
    }

    @Override // defpackage.sgm
    public final int hashCode() {
        return sir.b(this.b, sir.b(null, sir.b(null, super.hashCode())));
    }

    @Override // defpackage.sgm
    public final String toString() {
        return String.format(Locale.US, "SendKitVisualElement {tag: %s, index: %d, intent class name: %s, first in flow: %b}", this.a, this.b, null, null);
    }
}
