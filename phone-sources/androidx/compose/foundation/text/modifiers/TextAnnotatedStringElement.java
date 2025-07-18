package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.alo;
import defpackage.alt;
import defpackage.bko;
import defpackage.bns;
import defpackage.bzi;
import defpackage.cfy;
import defpackage.chc;
import defpackage.esn;
import defpackage.yjv;
import defpackage.yks;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends bzi<alt> {
    private final cfy a;
    private final chc b;
    private final yjv c;
    private final int d;
    private final boolean e;
    private final int f;
    private final int h;
    private final List i;
    private final yjv j;
    private final alo k = null;
    private final bns l;
    private final yjv m;
    private final esn n;

    public TextAnnotatedStringElement(cfy cfyVar, chc chcVar, esn esnVar, yjv yjvVar, int i, boolean z, int i2, int i3, List list, yjv yjvVar2, bns bnsVar, yjv yjvVar3) {
        this.a = cfyVar;
        this.b = chcVar;
        this.n = esnVar;
        this.c = yjvVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.h = i3;
        this.i = list;
        this.j = yjvVar2;
        this.l = bnsVar;
        this.m = yjvVar3;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new alt(this.a, this.b, this.n, this.c, this.d, this.e, this.f, this.h, this.i, this.j, null, this.l, this.m);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        alt altVar = (alt) bkoVar;
        bns bnsVar = this.l;
        chc chcVar = this.b;
        altVar.m(altVar.r(bnsVar, chcVar), altVar.s(this.a), altVar.t(chcVar, this.i, this.h, this.f, this.e, this.n, this.d), altVar.o(this.c, this.j, null, this.m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (!yks.e(this.l, textAnnotatedStringElement.l) || !yks.e(this.a, textAnnotatedStringElement.a) || !yks.e(this.b, textAnnotatedStringElement.b) || !yks.e(this.i, textAnnotatedStringElement.i) || !yks.e(this.n, textAnnotatedStringElement.n) || this.c != textAnnotatedStringElement.c || this.m != textAnnotatedStringElement.m || !a.r(this.d, textAnnotatedStringElement.d) || this.e != textAnnotatedStringElement.e || this.f != textAnnotatedStringElement.f || this.h != textAnnotatedStringElement.h || this.j != textAnnotatedStringElement.j) {
            return false;
        }
        alo aloVar = textAnnotatedStringElement.k;
        return yks.e(null, null);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.n.hashCode();
        yjv yjvVar = this.c;
        int iHashCode2 = ((((((((((iHashCode * 31) + (yjvVar != null ? yjvVar.hashCode() : 0)) * 31) + this.d) * 31) + a.q(this.e)) * 31) + this.f) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        yjv yjvVar2 = this.j;
        int iHashCode4 = iHashCode3 + (yjvVar2 != null ? yjvVar2.hashCode() : 0);
        bns bnsVar = this.l;
        int iHashCode5 = ((iHashCode4 * 961) + (bnsVar != null ? bnsVar.hashCode() : 0)) * 31;
        yjv yjvVar3 = this.m;
        return iHashCode5 + (yjvVar3 != null ? yjvVar3.hashCode() : 0);
    }
}
