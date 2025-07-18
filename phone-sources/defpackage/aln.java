package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aln extends bxw implements byl, byc, byd {
    public alo a;
    public final alt b;

    public aln(cfy cfyVar, chc chcVar, esn esnVar, yjv yjvVar, int i, boolean z, int i2, int i3, List list, yjv yjvVar2, alo aloVar, bns bnsVar) {
        this.a = aloVar;
        alt altVar = new alt(cfyVar, chcVar, esnVar, yjvVar, i, z, i2, i3, list, yjvVar2, this.a, bnsVar, null);
        O(altVar);
        this.b = altVar;
        if (this.a != null) {
            return;
        }
        wv.a("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new yfs();
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        return this.b.b(bvvVar, bvsVar, j);
    }

    @Override // defpackage.byd
    public final void bT(bvc bvcVar) {
        alo aloVar = this.a;
        if (aloVar != null) {
            aloVar.d = alr.a(aloVar.d, bvcVar, null, 2);
            aloVar.b.d();
        }
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        this.b.bU(byuVar);
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        return this.b.e(buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        return this.b.f(buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        return this.b.g(buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        return this.b.h(buzVar, buyVar, i);
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }
}
