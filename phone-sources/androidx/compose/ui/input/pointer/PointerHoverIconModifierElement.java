package androidx.compose.ui.input.pointer;

import defpackage.bko;
import defpackage.bsj;
import defpackage.bsu;
import defpackage.bsw;
import defpackage.bzi;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends bzi<bsu> {
    private final bsw a;
    private final boolean b = false;

    public PointerHoverIconModifierElement(bsw bswVar) {
        this.a = bswVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bsu(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((bsu) bkoVar).f(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        if (!yks.e(this.a, pointerHoverIconModifierElement.a)) {
            return false;
        }
        boolean z = pointerHoverIconModifierElement.b;
        return true;
    }

    public final int hashCode() {
        return (((bsj) this.a).a * 31) + 1237;
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
