package defpackage;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alo implements bda {
    public final long a;
    public final anh b;
    public final long c;
    public alr d;
    public final bkp e;
    public hw f;

    public /* synthetic */ alo(long j, anh anhVar, long j2) {
        alr alrVar = alr.a;
        this.a = j;
        this.b = anhVar;
        this.c = j2;
        this.d = alrVar;
        ajm ajmVar = new ajm(this, 14);
        alp alpVar = new alp(ajmVar, anhVar, j);
        alq alqVar = new alq(ajmVar, anhVar, j);
        amy amyVar = new amy(alqVar, alpVar, 0);
        bsr bsrVar = btm.a;
        this.e = new SuspendPointerInputElement(alqVar, alpVar, amyVar, 4).a(new PointerHoverIconModifierElement(bsv.b));
    }

    @Override // defpackage.bda
    public final void cb() {
        this.f = this.b.i();
    }

    @Override // defpackage.bda
    public final void dI() {
        if (this.f != null) {
            this.b.h();
            this.f = null;
        }
    }

    @Override // defpackage.bda
    public final void dJ() {
        if (this.f != null) {
            this.b.h();
            this.f = null;
        }
    }
}
