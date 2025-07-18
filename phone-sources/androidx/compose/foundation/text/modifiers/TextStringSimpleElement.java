package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.alv;
import defpackage.bko;
import defpackage.bns;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.chc;
import defpackage.esn;
import defpackage.fh;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends bzi<alv> {
    private final String a;
    private final chc b;
    private final int c;
    private final boolean d;
    private final int e;
    private final int f;
    private final bns h;
    private final esn i;

    public TextStringSimpleElement(String str, chc chcVar, esn esnVar, int i, boolean z, int i2, int i3, bns bnsVar) {
        this.a = str;
        this.b = chcVar;
        this.i = esnVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.h = bnsVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new alv(this.a, this.b, this.i, this.c, this.d, this.e, this.f, this.h);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        alv alvVar = (alv) bkoVar;
        bns bnsVar = alvVar.g;
        bns bnsVar2 = this.h;
        boolean zE = yks.e(bnsVar2, bnsVar);
        alvVar.g = bnsVar2;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = (zE && this.b.t(alvVar.b)) ? false : true;
        String str = this.a;
        if (!yks.e(alvVar.a, str)) {
            alvVar.a = str;
            alvVar.l();
            z = true;
        }
        chc chcVar = this.b;
        int i = this.f;
        int i2 = this.e;
        boolean z4 = this.d;
        esn esnVar = this.i;
        int i3 = this.c;
        boolean z5 = !alvVar.b.u(chcVar);
        alvVar.b = chcVar;
        if (alvVar.f != i) {
            alvVar.f = i;
            z5 = true;
        }
        if (alvVar.e != i2) {
            alvVar.e = i2;
            z5 = true;
        }
        if (alvVar.d != z4) {
            alvVar.d = z4;
            z5 = true;
        }
        if (!yks.e(alvVar.j, esnVar)) {
            alvVar.j = esnVar;
            z5 = true;
        }
        if (a.r(alvVar.c, i3)) {
            z2 = z5;
        } else {
            alvVar.c = i3;
        }
        if (z || z2) {
            alvVar.i().f(alvVar.a, alvVar.b, alvVar.j, alvVar.c, alvVar.d, alvVar.e);
        }
        if (alvVar.A) {
            if (z || (z3 && alvVar.h != null)) {
                cbp.M(alvVar);
            }
            if (z || z2) {
                cbp.Y(alvVar);
                fh.D(alvVar);
            }
            if (z3) {
                fh.D(alvVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return yks.e(this.h, textStringSimpleElement.h) && yks.e(this.a, textStringSimpleElement.a) && yks.e(this.b, textStringSimpleElement.b) && yks.e(this.i, textStringSimpleElement.i) && a.r(this.c, textStringSimpleElement.c) && this.d == textStringSimpleElement.d && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.i.hashCode();
        bns bnsVar = this.h;
        return (((((((((iHashCode * 31) + this.c) * 31) + a.q(this.d)) * 31) + this.e) * 31) + this.f) * 31) + (bnsVar != null ? bnsVar.hashCode() : 0);
    }
}
