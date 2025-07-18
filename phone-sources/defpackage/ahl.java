package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahl implements aho {
    private final ykc a;
    private final bhi c = new bhi((char[]) null, (byte[]) null, (byte[]) null);
    private final bcb b = new bci(null, bcz.c);

    public ahl(ykc ykcVar) {
        this.a = ykcVar;
    }

    public final ahj a() {
        return (ahj) this.b.a();
    }

    @Override // defpackage.aho
    public final Object b(ahn ahnVar, yih yihVar) {
        Object objK = yoz.k(new rx(rv.a, this.c, new ahk(this, new ahj(ahnVar), (yih) null, 0), null, 0, null), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    public final void c(yjk yjkVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(723898654);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            ahj ahjVarA = a();
            if (ahjVarA == null) {
                bcr bcrVarM = baoVarD.M();
                if (bcrVarM != null) {
                    bcrVarM.d = new qt(this, yjkVar, i, 11);
                    return;
                }
                return;
            }
            yjkVar2 = yjkVar;
            this.a.a(ahjVarA, ahjVarA.a, yjkVar2, baoVarD, Integer.valueOf((i2 << 6) & 896));
        } else {
            yjkVar2 = yjkVar;
            baoVarD.t();
        }
        bcr bcrVarM2 = baoVarD.M();
        if (bcrVarM2 != null) {
            bcrVarM2.d = new qt(this, yjkVar2, i, 12);
        }
    }

    public final void d(ahj ahjVar) {
        this.b.b(ahjVar);
    }
}
