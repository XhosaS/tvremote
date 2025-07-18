package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tf extends bko implements bxu, byk {
    public uv a;
    public final vx b;
    public boolean c;
    public bvc d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final kw i = new kw((byte[]) null, (byte[]) null, (byte[]) null);
    public long g = 0;

    public tf(uv uvVar, vx vxVar, boolean z) {
        this.a = uvVar;
        this.b = vxVar;
        this.c = z;
    }

    private final tb o() {
        return (tb) fh.P(this, td.a);
    }

    public final float b(tb tbVar) {
        float f;
        Object obj;
        int iCompare;
        if (a.s(this.g, 0L)) {
            return 0.0f;
        }
        bfz bfzVar = (bfz) this.i.a;
        int i = bfzVar.b - 1;
        Object[] objArr = bfzVar.a;
        if (i < objArr.length) {
            obj = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                Object objA = ((te) objArr[i]).a.a();
                if (objA != null) {
                    long jE = ((bmy) objA).e();
                    long jY = clw.y(this.g);
                    f = 0.0f;
                    int iOrdinal = this.a.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE & 4294967295L)), Float.intBitsToFloat((int) (jY & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new yfu();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jY >> 32)));
                    }
                    if (iCompare <= 0) {
                        obj = objA;
                    } else if (obj == null) {
                        obj = objA;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            obj = null;
        }
        if (obj == null) {
            Object objF = this.e ? f() : null;
            if (objF == null) {
                return f;
            }
            obj = objF;
        }
        long jY2 = clw.y(this.g);
        int iOrdinal2 = this.a.ordinal();
        if (iOrdinal2 == 0) {
            bmy bmyVar = (bmy) obj;
            float f2 = bmyVar.c;
            return tbVar.a(f2, bmyVar.e - f2, Float.intBitsToFloat((int) (jY2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new yfu();
        }
        bmy bmyVar2 = (bmy) obj;
        float f3 = bmyVar2.b;
        return tbVar.a(f3, bmyVar2.d - f3, Float.intBitsToFloat((int) (jY2 >> 32)));
    }

    @Override // defpackage.byk
    public final void bX(long j) {
        long j2;
        long j3;
        bmy bmyVarF;
        long j4 = this.g;
        this.g = j;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            j2 = j & 4294967295L;
            j3 = 4294967295L & j4;
        } else {
            if (iOrdinal != 1) {
                throw new yfu();
            }
            j2 = j >> 32;
            j3 = j4 >> 32;
        }
        if (yks.a((int) j2, (int) j3) >= 0 || this.h || this.e || (bmyVarF = f()) == null || !l(bmyVarF, j4)) {
            return;
        }
        this.f = true;
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    public final long e(bmy bmyVar, long j) {
        long jFloatToRawIntBits;
        long j2;
        long jY = clw.y(j);
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            tb tbVarO = o();
            float f = bmyVar.c;
            float fA = tbVarO.a(f, bmyVar.e - f, Float.intBitsToFloat((int) (jY & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j2 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new yfu();
            }
            tb tbVarO2 = o();
            float f2 = bmyVar.b;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(tbVarO2.a(f2, bmyVar.d - f2, Float.intBitsToFloat((int) (jY >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = jFloatToRawIntBits3 << 32;
        }
        return j2 | (jFloatToRawIntBits & 4294967295L);
    }

    public final bmy f() {
        if (this.A) {
            bvc bvcVarG = fh.G(this);
            bvc bvcVar = this.d;
            if (bvcVar != null) {
                if (true != bvcVar.s()) {
                    bvcVar = null;
                }
                if (bvcVar != null) {
                    return bvcVarG.p(bvcVar, false);
                }
            }
        }
        return null;
    }

    public final void g() {
        tb tbVarO = o();
        if (this.h) {
            wv.d("launchAnimation called when previous animation was running");
        }
        ykr.q(F(), null, 4, new dkg(this, new wh(ta.a), tbVarO, (yih) null, 1), 1);
    }

    public final boolean l(bmy bmyVar, long j) {
        long jE = e(bmyVar, j);
        return Math.abs(Float.intBitsToFloat((int) (jE >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jE & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.byk
    public final /* synthetic */ void cj(bvc bvcVar) {
    }
}
