package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ny {
    public final bfz a = new bfz(new nv[16], 0);
    public long b;
    public final bcb c;
    private final bcb d;

    public ny() {
        bcz bczVar = bcz.c;
        this.d = new bci(false, bczVar);
        this.b = Long.MIN_VALUE;
        this.c = new bci(true, bczVar);
    }

    public final void a(bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-318043801);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(null, bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            if (((Boolean) this.c.a()).booleanValue() || ((Boolean) this.d.a()).booleanValue()) {
                baoVarD.x(-144783432);
                boolean zH = baoVarD.H(this);
                Object objT2 = basVar.T();
                if (zH || objT2 == obj) {
                    objT2 = new ibg(bcbVar, this, (yih) null, 1);
                    basVar.ae(objT2);
                }
                bbn.f(this, (yjz) objT2, baoVarD);
                basVar.aa();
            } else {
                baoVarD.x(-143396709);
                basVar.aa();
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(this, i, i4);
        }
    }

    public final void b(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }
}
