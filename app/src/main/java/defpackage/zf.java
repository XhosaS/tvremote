package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zf {
    public static zm a(yn ynVar, int i, ArrayList arrayList, zm zmVar) {
        int i2;
        int i3 = i == 0 ? ynVar.ap : ynVar.aq;
        if (i3 != -1 && (zmVar == null || i3 != zmVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                zm zmVar2 = (zm) arrayList.get(i4);
                if (zmVar2.c == i3) {
                    if (zmVar != null) {
                        zmVar.c(i, zmVar2);
                        arrayList.remove(zmVar);
                    }
                    zmVar = zmVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return zmVar;
        }
        if (zmVar == null) {
            if (ynVar instanceof ys) {
                ys ysVar = (ys) ynVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= ysVar.at) {
                        i2 = -1;
                        break;
                    }
                    yn ynVar2 = ysVar.as[i5];
                    if (i == 0) {
                        i2 = ynVar2.ap;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = ynVar2.aq;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        zm zmVar3 = (zm) arrayList.get(i6);
                        if (zmVar3.c == i2) {
                            zmVar = zmVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (zmVar == null) {
                zmVar = new zm(i);
            }
            arrayList.add(zmVar);
        }
        if (zmVar.d(ynVar)) {
            if (ynVar instanceof yr) {
                yr yrVar = (yr) ynVar;
                yrVar.d.c(yrVar.as == 0 ? 1 : 0, arrayList, zmVar);
            }
            if (i == 0) {
                ynVar.ap = zmVar.c;
                ynVar.K.c(0, arrayList, zmVar);
                ynVar.M.c(0, arrayList, zmVar);
            } else {
                ynVar.aq = zmVar.c;
                ynVar.L.c(1, arrayList, zmVar);
                ynVar.O.c(1, arrayList, zmVar);
                ynVar.N.c(1, arrayList, zmVar);
            }
            ynVar.R.c(i, arrayList, zmVar);
        }
        return zmVar;
    }

    public static zm b(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zm zmVar = (zm) arrayList.get(i2);
            if (i == zmVar.c) {
                return zmVar;
            }
        }
        return null;
    }

    public static boolean c(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
