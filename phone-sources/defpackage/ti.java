package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ti implements vc {
    final /* synthetic */ tj a;

    public ti(tj tjVar) {
        this.a = tjVar;
    }

    @Override // defpackage.vc
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        tj tjVar = this.a;
        float fFloatValue = ((Number) tjVar.a.a(Float.valueOf(f))).floatValue();
        tjVar.d.b(Boolean.valueOf(fFloatValue > 0.0f));
        tjVar.e.b(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
