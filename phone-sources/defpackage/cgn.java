package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgn {
    public static final long a = cmk.a;

    public static final cgm a(cgm cgmVar, int i, int i2, long j, clq clqVar, cgp cgpVar, clj cljVar, int i3, int i4, clr clrVar) {
        long j2;
        long j3;
        int i5 = i;
        int i6 = i2;
        clq clqVar2 = clqVar;
        clj cljVar2 = cljVar;
        int i7 = i3;
        int i8 = i4;
        clr clrVar2 = clrVar;
        if (a.r(i5, Integer.MIN_VALUE) || a.r(i5, cgmVar.a)) {
            if (cmk.b(j) == 0) {
                j2 = 0;
                j3 = j;
            } else {
                j2 = 0;
                j3 = j;
                if (a.s(j3, cgmVar.c)) {
                }
            }
            if ((clqVar2 == null || yks.e(clqVar2, cgmVar.d)) && ((a.r(i6, Integer.MIN_VALUE) || a.r(i6, cgmVar.b)) && ((cgpVar == null || yks.e(cgpVar, cgmVar.e)) && ((cljVar2 == null || yks.e(cljVar2, cgmVar.f)) && ((a.r(i7, 0) || a.r(i7, cgmVar.g)) && ((a.r(i8, Integer.MIN_VALUE) || a.r(i8, cgmVar.h)) && (clrVar2 == null || yks.e(clrVar2, cgmVar.i)))))))) {
                return cgmVar;
            }
        } else {
            j2 = 0;
            j3 = j;
        }
        if (cmk.b(j3) == j2) {
            j3 = cgmVar.c;
        }
        if (clqVar2 == null) {
            clqVar2 = cgmVar.d;
        }
        if (a.r(i5, Integer.MIN_VALUE)) {
            i5 = cgmVar.a;
        }
        if (a.r(i6, Integer.MIN_VALUE)) {
            i6 = cgmVar.b;
        }
        cgp cgpVar2 = cgmVar.e;
        if (cgpVar2 == null || cgpVar != null) {
            cgpVar2 = cgpVar;
        }
        if (cljVar2 == null) {
            cljVar2 = cgmVar.f;
        }
        if (a.r(i7, 0)) {
            i7 = cgmVar.g;
        }
        if (a.r(i8, Integer.MIN_VALUE)) {
            i8 = cgmVar.h;
        }
        if (clrVar2 == null) {
            clrVar2 = cgmVar.i;
        }
        return new cgm(i5, i6, j3, clqVar2, cgpVar2, cljVar2, i7, i8, clrVar2);
    }
}
