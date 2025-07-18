package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vbp extends aql {
    private final int a;

    public vbp(int i) {
        this.a = i;
    }

    @Override // defpackage.aql
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = vbq.j;
        float[] fArr = ((vbq) obj).h;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.aql
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        int i = vbq.j;
        vbq vbqVar = (vbq) obj;
        float[] fArr = vbqVar.h;
        if (fArr != null) {
            int i2 = this.a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                uzg uzgVar = vbqVar.i;
                if (uzgVar != null) {
                    float fA = vbqVar.a() * 0.11f;
                    MaterialButton materialButton = uzgVar.a;
                    int i3 = (int) fA;
                    if (materialButton.d != i3) {
                        materialButton.d = i3;
                        materialButton.h();
                        materialButton.invalidate();
                    }
                }
                vbqVar.invalidateSelf();
            }
        }
    }
}
