package androidx.compose.ui.draw;

import defpackage.a;
import defpackage.bkd;
import defpackage.bko;
import defpackage.blw;
import defpackage.bnr;
import defpackage.bqh;
import defpackage.buo;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.fh;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PainterElement extends bzi<blw> {
    private final bqh a;
    private final boolean b;
    private final bkd c;
    private final buo d;
    private final float e;
    private final bnr f;

    public PainterElement(bqh bqhVar, boolean z, bkd bkdVar, buo buoVar, float f, bnr bnrVar) {
        this.a = bqhVar;
        this.b = z;
        this.c = bkdVar;
        this.d = buoVar;
        this.e = f;
        this.f = bnrVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new blw(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        blw blwVar = (blw) bkoVar;
        boolean z = blwVar.b;
        boolean z2 = this.b;
        boolean z3 = true;
        if (z == z2 && (!z2 || a.s(blwVar.a.a(), this.a.a()))) {
            z3 = false;
        }
        blwVar.a = this.a;
        blwVar.b = z2;
        blwVar.c = this.c;
        blwVar.d = this.d;
        blwVar.e = this.e;
        blwVar.f = this.f;
        if (z3) {
            cbp.Y(blwVar);
        }
        fh.D(blwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return yks.e(this.a, painterElement.a) && this.b == painterElement.b && yks.e(this.c, painterElement.c) && yks.e(this.d, painterElement.d) && Float.compare(this.e, painterElement.e) == 0 && yks.e(this.f, painterElement.f);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + a.q(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e);
        bnr bnrVar = this.f;
        return (iHashCode * 31) + (bnrVar == null ? 0 : bnrVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }
}
