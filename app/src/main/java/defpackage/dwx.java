package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwx {
    public static boolean a(dww dwwVar, dww dwwVar2) {
        if (dwwVar == dwwVar2) {
            return true;
        }
        if (dwwVar2 != null && dwwVar.H == dwwVar2.H && drm.a(dwwVar.y, dwwVar2.y) && dwwVar.m == dwwVar2.m && drm.b(dwwVar.q, dwwVar2.q) && dwwVar.h == dwwVar2.h && dwwVar.i == dwwVar2.i && dwwVar.j == dwwVar2.j && drm.a(dwwVar.a, dwwVar2.a) && drm.b(null, null) && dwwVar.E == dwwVar2.E && drm.b(dwwVar.r, dwwVar2.r) && dwwVar.B == dwwVar2.B && drm.b(null, null) && drm.b(dwwVar.s, dwwVar2.s) && drm.b(null, null) && drm.b(dwwVar.z, dwwVar2.z) && drm.b(null, null) && drm.b(null, null) && drm.a(dwwVar.g, dwwVar2.g) && drm.b(dwwVar.A, dwwVar2.A) && dwwVar.n == dwwVar2.n && dwwVar.b() == dwwVar2.b() && dwwVar.k == dwwVar2.k && dwwVar.l == dwwVar2.l && dwwVar.o == dwwVar2.o && dwwVar.p == dwwVar2.p && dwwVar.F == dwwVar2.F && drm.b(null, null) && drm.b(null, null) && dwwVar.e == dwwVar2.e && dwwVar.f == dwwVar2.f && drm.b(dwwVar.w, dwwVar2.w) && drm.a(dwwVar.c, dwwVar2.c)) {
            SparseArray sparseArray = dwwVar.d;
            SparseArray sparseArray2 = dwwVar2.d;
            if (sparseArray != sparseArray2) {
                if (sparseArray != null && sparseArray2 != null && sparseArray.size() == sparseArray2.size()) {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        if (sparseArray.keyAt(i) == sparseArray2.keyAt(i) && drm.a(sparseArray.valueAt(i), sparseArray2.valueAt(i))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
