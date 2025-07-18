package androidx.compose.ui.focus;

import defpackage.bko;
import defpackage.bml;
import defpackage.bmo;
import defpackage.bzi;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusRequesterElement extends bzi<bmo> {
    private final bml a;

    public FocusRequesterElement(bml bmlVar) {
        this.a = bmlVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bmo(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        bmo bmoVar = (bmo) bkoVar;
        bmoVar.a.d.n(bmoVar);
        bmoVar.a = this.a;
        bmoVar.a.d.o(bmoVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && yks.e(this.a, ((FocusRequesterElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
