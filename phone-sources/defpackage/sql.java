package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sql extends dhc {
    @Override // defpackage.dhc
    public final /* synthetic */ float a(Object obj) {
        int i = MaterialButton.u;
        return ((MaterialButton) obj).s;
    }

    @Override // defpackage.dhc
    public final /* synthetic */ void b(Object obj, float f) {
        MaterialButton materialButton = (MaterialButton) obj;
        int i = MaterialButton.u;
        if (materialButton.s != f) {
            materialButton.s = f;
            materialButton.s();
            materialButton.invalidate();
            if (materialButton.getParent() instanceof sqq) {
                sqq sqqVar = (sqq) materialButton.getParent();
                int i2 = (int) materialButton.s;
                int iIndexOfChild = sqqVar.indexOfChild(materialButton);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonC = sqqVar.c(iIndexOfChild);
                MaterialButton materialButtonB = sqqVar.b(iIndexOfChild);
                if (materialButtonC == null && materialButtonB == null) {
                    return;
                }
                if (materialButtonC == null) {
                    materialButtonB.l(i2);
                }
                if (materialButtonB == null) {
                    materialButtonC.l(i2);
                }
                if (materialButtonC == null || materialButtonB == null) {
                    return;
                }
                materialButtonC.l(i2 / 2);
                materialButtonB.l((i2 + 1) / 2);
            }
        }
    }
}
