package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.afz;
import defpackage.aln;
import defpackage.alo;
import defpackage.alt;
import defpackage.bko;
import defpackage.bns;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.cfy;
import defpackage.chc;
import defpackage.esn;
import defpackage.yjv;
import defpackage.yks;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends bzi<aln> {
    private final cfy a;
    private final chc b;
    private final yjv c;
    private final int d;
    private final boolean e;
    private final int f;
    private final int h;
    private final List i;
    private final yjv j;
    private final alo k;
    private final bns l;
    private final afz m = null;
    private final esn n;

    public SelectableTextAnnotatedStringElement(cfy cfyVar, chc chcVar, esn esnVar, yjv yjvVar, int i, boolean z, int i2, int i3, List list, yjv yjvVar2, alo aloVar, bns bnsVar) {
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
        this.k = aloVar;
        this.l = bnsVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new aln(this.a, this.b, this.n, this.c, this.d, this.e, this.f, this.h, this.i, this.j, this.k, this.l);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        aln alnVar = (aln) bkoVar;
        alt altVar = alnVar.b;
        bns bnsVar = this.l;
        chc chcVar = this.b;
        yjv yjvVar = this.c;
        yjv yjvVar2 = this.j;
        alo aloVar = this.k;
        altVar.m(altVar.r(bnsVar, chcVar), altVar.s(this.a), altVar.t(chcVar, this.i, this.h, this.f, this.e, this.n, this.d), altVar.o(yjvVar, yjvVar2, aloVar, null));
        alnVar.a = aloVar;
        cbp.Y(alnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (!yks.e(this.l, selectableTextAnnotatedStringElement.l) || !yks.e(this.a, selectableTextAnnotatedStringElement.a) || !yks.e(this.b, selectableTextAnnotatedStringElement.b) || !yks.e(this.i, selectableTextAnnotatedStringElement.i) || !yks.e(this.n, selectableTextAnnotatedStringElement.n)) {
            return false;
        }
        afz afzVar = selectableTextAnnotatedStringElement.m;
        return yks.e(null, null) && this.c == selectableTextAnnotatedStringElement.c && a.r(this.d, selectableTextAnnotatedStringElement.d) && this.e == selectableTextAnnotatedStringElement.e && this.f == selectableTextAnnotatedStringElement.f && this.h == selectableTextAnnotatedStringElement.h && this.j == selectableTextAnnotatedStringElement.j && yks.e(this.k, selectableTextAnnotatedStringElement.k);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.n.hashCode();
        yjv yjvVar = this.c;
        int iHashCode2 = ((((((((((iHashCode * 31) + (yjvVar != null ? yjvVar.hashCode() : 0)) * 31) + this.d) * 31) + a.q(this.e)) * 31) + this.f) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        yjv yjvVar2 = this.j;
        int iHashCode4 = ((iHashCode3 + (yjvVar2 != null ? yjvVar2.hashCode() : 0)) * 31) + this.k.hashCode();
        bns bnsVar = this.l;
        return (iHashCode4 * 961) + (bnsVar != null ? bnsVar.hashCode() : 0);
    }
}
