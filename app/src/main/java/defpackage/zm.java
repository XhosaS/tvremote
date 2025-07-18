package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zm {
    static int a;
    final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public zm(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(yc ycVar, int i) {
        int iA;
        int iA2;
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            return 0;
        }
        yn ynVar = ((yn) arrayList.get(0)).V;
        ycVar.k();
        ynVar.b(ycVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((yn) arrayList.get(i2)).b(ycVar, false);
        }
        if (i == 0) {
            yo yoVar = (yo) ynVar;
            if (yoVar.av > 0) {
                yk.a(yoVar, ycVar, arrayList, 0);
            }
        }
        if (i == 1) {
            yo yoVar2 = (yo) ynVar;
            if (yoVar2.aw > 0) {
                yk.a(yoVar2, ycVar, arrayList, 1);
            }
        }
        try {
            ycVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new zl((yn) arrayList.get(i3), ycVar));
        }
        if (i == 0) {
            yo yoVar3 = (yo) ynVar;
            iA = ycVar.a(yoVar3.K);
            iA2 = ycVar.a(yoVar3.M);
            ycVar.k();
        } else {
            yo yoVar4 = (yo) ynVar;
            iA = ycVar.a(yoVar4.L);
            iA2 = ycVar.a(yoVar4.N);
            ycVar.k();
        }
        return iA2 - iA;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                zm zmVar = (zm) arrayList.get(i);
                if (this.f == zmVar.c) {
                    c(this.d, zmVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, zm zmVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yn ynVar = (yn) arrayList.get(i2);
            zmVar.d(ynVar);
            if (i == 0) {
                ynVar.ap = zmVar.c;
            } else {
                ynVar.aq = zmVar.c;
            }
        }
        this.f = zmVar.c;
    }

    public final boolean d(yn ynVar) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(ynVar)) {
            return false;
        }
        arrayList.add(ynVar);
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
            string = string + " " + ((yn) arrayList.get(i2)).aj;
        }
        return string.concat(" >");
    }
}
