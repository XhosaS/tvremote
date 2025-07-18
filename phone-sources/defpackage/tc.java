package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tc implements tb {
    @Override // defpackage.tb
    public final float a(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        if (fAbs <= f3 && f3 - f4 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }
}
