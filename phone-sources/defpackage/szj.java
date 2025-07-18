package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szj extends dhc {
    private final int a;

    public szj(int i) {
        this.a = i;
    }

    @Override // defpackage.dhc
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = szk.D;
        float[] fArr = ((szk) obj).A;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.dhc
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        szk szkVar = (szk) obj;
        int i = szk.D;
        float[] fArr = szkVar.A;
        if (fArr != null) {
            int i2 = this.a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                zft zftVar = szkVar.C;
                if (zftVar != null) {
                    float fT = szkVar.t() * 0.11f;
                    MaterialButton materialButton = (MaterialButton) zftVar.a;
                    int i3 = (int) fT;
                    if (materialButton.n != i3) {
                        materialButton.n = i3;
                        materialButton.s();
                        materialButton.invalidate();
                    }
                }
                szkVar.invalidateSelf();
            }
        }
    }
}
