package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpy {
    static int a;
    public final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public cpy(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(cov covVar, int i) {
        int iO;
        int iO2;
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            return 0;
        }
        cpd cpdVar = ((cpd) arrayList.get(0)).V;
        covVar.k();
        cpdVar.b(covVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((cpd) arrayList.get(i2)).b(covVar, false);
        }
        if (i == 0) {
            cpe cpeVar = (cpe) cpdVar;
            if (cpeVar.au > 0) {
                cme.r(cpeVar, covVar, arrayList, 0);
            }
        }
        if (i == 1) {
            cpe cpeVar2 = (cpe) cpdVar;
            if (cpeVar2.av > 0) {
                cme.r(cpeVar2, covVar, arrayList, 1);
            }
        }
        try {
            covVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new cme((cpd) arrayList.get(i3)));
        }
        if (i == 0) {
            cpe cpeVar3 = (cpe) cpdVar;
            iO = cov.o(cpeVar3.K);
            iO2 = cov.o(cpeVar3.M);
            covVar.k();
        } else {
            cpe cpeVar4 = (cpe) cpdVar;
            iO = cov.o(cpeVar4.L);
            iO2 = cov.o(cpeVar4.N);
            covVar.k();
        }
        return iO2 - iO;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                cpy cpyVar = (cpy) arrayList.get(i);
                if (this.f == cpyVar.c) {
                    c(this.d, cpyVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, cpy cpyVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cpd cpdVar = (cpd) arrayList.get(i2);
            cpyVar.d(cpdVar);
            if (i == 0) {
                cpdVar.ap = cpyVar.c;
            } else {
                cpdVar.aq = cpyVar.c;
            }
        }
        this.f = cpyVar.c;
    }

    public final boolean d(cpd cpdVar) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(cpdVar)) {
            return false;
        }
        arrayList.add(cpdVar);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both");
        sb.append(" [");
        sb.append(this.c);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            string = string + " " + ((cpd) arrayList.get(i2)).aj;
        }
        return string.concat(" >");
    }
}
