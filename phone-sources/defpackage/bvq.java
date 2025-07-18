package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvq extends bwi {
    private final byz a;

    public bvq(byz byzVar) {
        this.a = byzVar;
    }

    @Override // defpackage.bwi, defpackage.clx
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.bwi, defpackage.cmd
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.bwi
    public final int m() {
        return this.a.w();
    }

    @Override // defpackage.bwi
    public final bvc n() {
        byz byzVar = this.a;
        bvc bvcVarI = byzVar.k ? null : byzVar.I();
        if (bvcVarI == null) {
            byzVar.K().u.f();
        }
        return bvcVarI;
    }

    @Override // defpackage.bwi
    public final cmi o() {
        return this.a.n();
    }

    @Override // defpackage.bwi
    public final float p(bwp bwpVar) {
        yjz yjzVar = bwpVar.a;
        if (yjzVar != null) {
            return ((Number) yjzVar.a(this, Float.valueOf(Float.NaN))).floatValue();
        }
        byz byzVar = this.a;
        if (byzVar.k) {
            return Float.NaN;
        }
        byz byzVar2 = byzVar;
        while (true) {
            cbp cbpVar = byzVar2.n;
            if (!Float.isNaN(Float.NaN)) {
                byzVar2.N(byzVar.K(), bwpVar);
                return bwpVar.a(byzVar2.I(), byzVar.I());
            }
            byz byzVarM = byzVar2.M();
            if (byzVarM == null) {
                byzVar2.N(byzVar.K(), bwpVar);
                return Float.NaN;
            }
            byzVar2 = byzVarM;
        }
    }
}
