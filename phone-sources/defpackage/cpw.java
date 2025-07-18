package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpw {
    public static int a;
    public Object b;
    public final List c;

    public cpw(List list, MotionEvent motionEvent) {
        this.c = list;
        this.b = motionEvent;
    }

    public final long a(cpq cpqVar, long j) {
        cpz cpzVar = cpqVar.d;
        if (cpzVar instanceof cpu) {
            return j;
        }
        List list = cpqVar.j;
        int size = list.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            cpo cpoVar = (cpo) list.get(i);
            if (cpoVar instanceof cpq) {
                cpq cpqVar2 = (cpq) cpoVar;
                if (cpqVar2.d != cpzVar) {
                    jMin = Math.min(jMin, a(cpqVar2, cpqVar2.e + j));
                }
            }
        }
        if (cpqVar != cpzVar.j) {
            return jMin;
        }
        long jA = cpzVar.a();
        long j2 = j - jA;
        return Math.min(Math.min(jMin, a(cpzVar.i, j2)), j2 - r10.e);
    }

    public final long b(cpq cpqVar, long j) {
        cpz cpzVar = cpqVar.d;
        if (cpzVar instanceof cpu) {
            return j;
        }
        List list = cpqVar.j;
        int size = list.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            cpo cpoVar = (cpo) list.get(i);
            if (cpoVar instanceof cpq) {
                cpq cpqVar2 = (cpq) cpoVar;
                if (cpqVar2.d != cpzVar) {
                    jMax = Math.max(jMax, b(cpqVar2, cpqVar2.e + j));
                }
            }
        }
        if (cpqVar != cpzVar.i) {
            return jMax;
        }
        long jA = cpzVar.a();
        long j2 = j + jA;
        return Math.max(Math.max(jMax, b(cpzVar.j, j2)), j2 - r10.e);
    }

    public cpw(cpz cpzVar) {
        this.b = null;
        this.c = new ArrayList();
        a++;
        this.b = cpzVar;
    }
}
