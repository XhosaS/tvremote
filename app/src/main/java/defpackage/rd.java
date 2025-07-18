package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rd {
    public static int a(qs qsVar, pg pgVar, View view, View view2, qd qdVar, boolean z) {
        if (qdVar.at() == 0 || qsVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(qdVar.aD(view) - qdVar.aD(view2)) + 1;
        }
        return Math.min(pgVar.k(), pgVar.a(view2) - pgVar.d(view));
    }

    public static int b(qs qsVar, pg pgVar, View view, View view2, qd qdVar, boolean z, boolean z2) {
        if (qdVar.at() == 0 || qsVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (qsVar.a() - Math.max(qdVar.aD(view), qdVar.aD(view2))) - 1) : Math.max(0, Math.min(qdVar.aD(view), qdVar.aD(view2)));
        if (!z) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(pgVar.a(view2) - pgVar.d(view)) / (Math.abs(qdVar.aD(view) - qdVar.aD(view2)) + 1))) + (pgVar.j() - pgVar.d(view)));
    }

    public static int c(qs qsVar, pg pgVar, View view, View view2, qd qdVar, boolean z) {
        if (qdVar.at() == 0 || qsVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return qsVar.a();
        }
        return (int) (((pgVar.a(view2) - pgVar.d(view)) / (Math.abs(qdVar.aD(view) - qdVar.aD(view2)) + 1)) * qsVar.a());
    }
}
