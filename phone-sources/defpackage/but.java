package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class but extends bwp {
    public but() {
        super(null);
    }

    @Override // defpackage.bwp
    public final float a(bvc bvcVar, bvc bvcVar2) {
        return Float.intBitsToFloat((int) (bvcVar2.i(bvcVar, (Float.floatToRawIntBits(((int) (bvcVar.h() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L)) & 4294967295L));
    }

    public but(yjz yjzVar) {
        super(yjzVar);
    }
}
