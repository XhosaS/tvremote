package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class zj {
    public static int a;
    zn b;
    final ArrayList c = new ArrayList();

    public zj(zn znVar) {
        this.b = null;
        a++;
        this.b = znVar;
    }

    public final long a(zc zcVar, long j) {
        zn znVar = zcVar.d;
        if (znVar instanceof zh) {
            return j;
        }
        List list = zcVar.j;
        int size = list.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            za zaVar = (za) list.get(i);
            if (zaVar instanceof zc) {
                zc zcVar2 = (zc) zaVar;
                if (zcVar2.d != znVar) {
                    jMin = Math.min(jMin, a(zcVar2, zcVar2.e + j));
                }
            }
        }
        if (zcVar != znVar.j) {
            return jMin;
        }
        long jA = znVar.a();
        long j2 = j - jA;
        return Math.min(Math.min(jMin, a(znVar.i, j2)), j2 - r10.e);
    }

    public final long b(zc zcVar, long j) {
        zn znVar = zcVar.d;
        if (znVar instanceof zh) {
            return j;
        }
        List list = zcVar.j;
        int size = list.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            za zaVar = (za) list.get(i);
            if (zaVar instanceof zc) {
                zc zcVar2 = (zc) zaVar;
                if (zcVar2.d != znVar) {
                    jMax = Math.max(jMax, b(zcVar2, zcVar2.e + j));
                }
            }
        }
        if (zcVar != znVar.i) {
            return jMax;
        }
        long jA = znVar.a();
        long j2 = j + jA;
        return Math.max(Math.max(jMax, b(znVar.j, j2)), j2 - r10.e);
    }
}
