package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ena {
    public static void a(dyt dytVar, List list, String str) {
        if (dytVar instanceof dyj) {
            dyj dyjVar = (dyj) dytVar;
            dyjVar.a();
            list.addAll(dyjVar.a);
        } else {
            if (dytVar == null) {
                throw new IllegalStateException(a.e(str, "[", "] Adding null to transition list is not allowed."));
            }
            list.add(dytVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(bounds.left, bounds.top, bounds.left + i, bounds.top + i2);
        if (drawable instanceof emz) {
            ((emz) drawable).c(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(i, i2, bounds.width() + i, bounds.height() + i2);
        if (drawable instanceof emz) {
            ((emz) drawable).g();
        }
    }

    public static void d(dyv dyvVar, dyt dytVar, eaf eafVar, dym dymVar) {
        int i = 0;
        if (dytVar instanceof dzd) {
            ArrayList arrayList = ((dzd) dytVar).a;
            int size = arrayList.size();
            while (i < size) {
                d(dyvVar, (dyt) arrayList.get(i), eafVar, dymVar);
                i++;
            }
            return;
        }
        if (!(dytVar instanceof dyr)) {
            if (!(dytVar instanceof dyj)) {
                throw new RuntimeException("Unhandled transition type: ".concat(String.valueOf(String.valueOf(dytVar))));
            }
            dyj dyjVar = (dyj) dytVar;
            dyjVar.a();
            ArrayList arrayList2 = dyjVar.a;
            int size2 = arrayList2.size();
            while (i < size2) {
                d(dyvVar, (dyt) arrayList2.get(i), eafVar, dymVar);
                i++;
            }
            return;
        }
        dyr dyrVar = (dyr) dytVar;
        dyi dyiVar = dyrVar.a;
        dyk dykVar = dyiVar.a;
        int i2 = dykVar.b;
        if (dyvVar.b.equals(dykVar.a)) {
            dyl dylVar = dyiVar.b;
            int i3 = dylVar.b;
            if (eafVar.equals(dylVar.a)) {
                dymVar.a = true;
                if (dyrVar.a()) {
                    dymVar.b = dyrVar;
                }
            }
        }
    }
}
