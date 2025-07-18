package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baf {
    public Object a;
    public Object b;

    public baf(yjv yjvVar, yoe yoeVar) {
        this.a = yjvVar;
        this.b = yoeVar;
    }

    public final float a() {
        return ((Number) ((mz) this.a).a()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yqe] */
    public final void b(float f, clx clxVar, yow yowVar) {
        if (f <= clxVar.cr(1.0f)) {
            return;
        }
        bit bitVarT = bcm.t();
        yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
        bit bitVarU = bcm.u(bitVarT);
        try {
            float fFloatValue = ((Number) ((mz) this.a).a()).floatValue();
            ?? r4 = this.b;
            if (r4 != 0) {
                r4.t(null);
            }
            Object obj = this.a;
            if (((mz) obj).d) {
                this.a = hp.j((mz) obj, fFloatValue - f);
            } else {
                this.a = new mz(pm.a, Float.valueOf(-f), null, 60);
            }
            this.b = ykr.q(yowVar, null, 0, new qy(this, (yih) null, 15), 3);
        } finally {
            bcm.z(bitVarT, bitVarU, yjvVarI);
        }
    }

    public baf(byte[] bArr) {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yjv] */
    public baf() {
        bhi bhiVar = pm.a;
        Float fValueOf = Float.valueOf(0.0f);
        this.a = new mz(bhiVar, fValueOf, (ne) bhiVar.a.a(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
