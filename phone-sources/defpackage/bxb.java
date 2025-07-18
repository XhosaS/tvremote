package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxb extends bwp {
    public bxb() {
        super(null);
    }

    @Override // defpackage.bwp
    public final float a(bvc bvcVar, bvc bvcVar2) {
        long jH = bvcVar.h() & 4294967295L;
        return Float.intBitsToFloat((int) (bvcVar2.i(bvcVar, (Float.floatToRawIntBits(((int) jH) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.NaN) << 32)) >> 32));
    }

    public bxb(yjz yjzVar) {
        super(yjzVar);
    }
}
