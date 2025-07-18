package androidx.compose.foundation.text.input.internal;

import defpackage.a;
import defpackage.afi;
import defpackage.afw;
import defpackage.ahu;
import defpackage.ajn;
import defpackage.ajq;
import defpackage.akb;
import defpackage.alg;
import defpackage.atx;
import defpackage.bko;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.kw;
import defpackage.lhr;
import defpackage.rf;
import defpackage.yih;
import defpackage.ykr;
import defpackage.yks;
import defpackage.yqe;
import defpackage.yuj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifier extends bzi<ajq> {
    private final akb a;
    private final alg b;
    private final boolean d;
    private final afw f;
    private final boolean h;
    private final yuj j;
    private final atx k;
    private final kw l;
    private final lhr m;
    private final ahu c = null;
    private final boolean e = false;
    private final boolean i = false;

    public TextFieldDecoratorModifier(akb akbVar, lhr lhrVar, alg algVar, boolean z, afw afwVar, atx atxVar, boolean z2, kw kwVar, yuj yujVar) {
        this.a = akbVar;
        this.m = lhrVar;
        this.b = algVar;
        this.d = z;
        this.f = afwVar;
        this.k = atxVar;
        this.h = z2;
        this.l = kwVar;
        this.j = yujVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ajq(this.a, this.m, this.b, this.d, this.f, this.k, this.h, this.l, this.j);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        yqe yqeVar;
        ajq ajqVar = (ajq) bkoVar;
        boolean z = ajqVar.c;
        akb akbVar = ajqVar.a;
        afw afwVar = ajqVar.d;
        alg algVar = ajqVar.b;
        kw kwVar = ajqVar.o;
        yuj yujVar = ajqVar.f;
        boolean z2 = this.d;
        yuj yujVar2 = this.j;
        kw kwVar2 = this.l;
        boolean z3 = this.h;
        atx atxVar = this.k;
        afw afwVar2 = this.f;
        alg algVar2 = this.b;
        lhr lhrVar = this.m;
        akb akbVar2 = this.a;
        ajqVar.a = akbVar2;
        ajqVar.p = lhrVar;
        ajqVar.b = algVar2;
        ajqVar.c = z2;
        ajqVar.d = afwVar2;
        ajqVar.m = atxVar;
        ajqVar.e = z3;
        ajqVar.o = kwVar2;
        ajqVar.f = yujVar2;
        if (z2 != z || !yks.e(akbVar2, akbVar) || !yks.e(afwVar2, afwVar) || !yks.e(yujVar2, yujVar)) {
            if (z2 && ajqVar.w()) {
                ajqVar.C();
            } else if (!z2) {
                ajqVar.e();
            }
        }
        if (z2 != z || !a.r(afwVar2.a(), afwVar.a())) {
            cbp.M(ajqVar);
        }
        if (!yks.e(algVar2, algVar)) {
            ajqVar.n.q();
            if (ajqVar.A) {
                algVar2.i = ajqVar.l;
                if (ajqVar.w() && (yqeVar = ajqVar.j) != null) {
                    yqeVar.t(null);
                    ajqVar.j = ykr.q(ajqVar.F(), null, 0, new ajn(algVar2, (yih) null, 3), 3);
                }
            }
            algVar2.h = new afi(ajqVar, 16);
        }
        if (!yks.e(kwVar2, kwVar)) {
            ajqVar.n.q();
            rf rfVar = ajqVar.g;
            if (rfVar.A) {
                rfVar.m(kwVar2);
            }
        }
        if (z2 != z) {
            if (!z2) {
                ajqVar.N(ajqVar.g);
                return;
            }
            rf rfVar2 = ajqVar.g;
            ajqVar.O(rfVar2);
            rfVar2.m(kwVar2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        if (!yks.e(this.a, textFieldDecoratorModifier.a) || !yks.e(this.m, textFieldDecoratorModifier.m) || !yks.e(this.b, textFieldDecoratorModifier.b)) {
            return false;
        }
        ahu ahuVar = textFieldDecoratorModifier.c;
        if (!yks.e(null, null) || this.d != textFieldDecoratorModifier.d) {
            return false;
        }
        boolean z = textFieldDecoratorModifier.e;
        if (!yks.e(this.f, textFieldDecoratorModifier.f) || !yks.e(this.k, textFieldDecoratorModifier.k) || this.h != textFieldDecoratorModifier.h || !yks.e(this.l, textFieldDecoratorModifier.l)) {
            return false;
        }
        boolean z2 = textFieldDecoratorModifier.i;
        return yks.e(this.j, textFieldDecoratorModifier.j);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.m.hashCode()) * 31) + this.b.hashCode()) * 961) + a.q(this.d)) * 31) + a.q(false)) * 31) + this.f.hashCode();
        atx atxVar = this.k;
        int iHashCode2 = ((((((((iHashCode * 31) + (atxVar == null ? 0 : atxVar.hashCode())) * 31) + a.q(this.h)) * 31) + this.l.hashCode()) * 31) + a.q(false)) * 31;
        yuj yujVar = this.j;
        return iHashCode2 + (yujVar != null ? yujVar.hashCode() : 0);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.a + ", textLayoutState=" + this.m + ", textFieldSelectionState=" + this.b + ", filter=null, enabled=" + this.d + ", readOnly=false, keyboardOptions=" + this.f + ", keyboardActionHandler=" + this.k + ", singleLine=" + this.h + ", interactionSource=" + this.l + ", isPassword=false, stylusHandwritingTrigger=" + this.j + ')';
    }
}
