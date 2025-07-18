package defpackage;

import android.view.View;
import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes.dex */
public class elh {
    public static void a(dru druVar, int i, int i2, dxt dxtVar, ComponentTree componentTree, drq drqVar, boolean z, boolean z2) {
        if (z && (!z2 || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE)) {
            dzs dzsVarAA = dzt.aA(druVar);
            dzsVarAA.c(drqVar);
            dzsVarAA.R(View.MeasureSpec.getSize(i2));
            drqVar = dzsVarAA.a();
        }
        componentTree.t(drqVar, i, View.MeasureSpec.makeMeasureSpec(0, 0), dxtVar);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            dxtVar.b = Math.max(0, Math.min(View.MeasureSpec.getSize(i2), dxtVar.b));
        } else if (mode == 1073741824) {
            dxtVar.b = View.MeasureSpec.getSize(i2);
        }
        dxtVar.a = Math.max(0, dxtVar.a);
        dxtVar.b = Math.max(0, dxtVar.b);
    }
}
