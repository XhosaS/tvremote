package defpackage;

import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vbr {
    static vbj a(int i) {
        return i != 1 ? new vbu() : new vbk();
    }

    public static void b(View view, vbq vbqVar) {
        uzy uzyVar = vbqVar.a.c;
        if (uzyVar == null || !uzyVar.b) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        vbo vboVar = vbqVar.a;
        if (vboVar.o != elevation) {
            vboVar.o = elevation;
            vbqVar.q();
        }
    }
}
