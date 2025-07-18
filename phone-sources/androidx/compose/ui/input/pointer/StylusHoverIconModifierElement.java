package androidx.compose.ui.input.pointer;

import defpackage.bko;
import defpackage.bsj;
import defpackage.bsn;
import defpackage.bsw;
import defpackage.btk;
import defpackage.byb;
import defpackage.bzi;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends bzi<btk> {
    private final bsw a;
    private final boolean b = false;
    private final byb c;

    public StylusHoverIconModifierElement(bsw bswVar, byb bybVar) {
        this.a = bswVar;
        this.c = bybVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new btk(this.a, this.c);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        btk btkVar = (btk) bkoVar;
        btkVar.f(this.a);
        ((bsn) btkVar).a = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        if (!yks.e(this.a, stylusHoverIconModifierElement.a)) {
            return false;
        }
        boolean z = stylusHoverIconModifierElement.b;
        return yks.e(this.c, stylusHoverIconModifierElement.c);
    }

    public final int hashCode() {
        bsw bswVar = this.a;
        return (((((bsj) bswVar).a * 31) + 1237) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false, touchBoundsExpansion=" + this.c + ')';
    }
}
