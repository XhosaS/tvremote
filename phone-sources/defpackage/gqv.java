package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqv {
    public static final /* synthetic */ int a = 0;

    static {
        gpn.a("Schedulers");
    }

    public static void a(tae taeVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        gux guxVarD = workDatabase.D();
        workDatabase.o();
        try {
            List listD = guxVarD.d();
            Object obj = taeVar.e;
            b(guxVarD, listD);
            int i = taeVar.a;
            List listC = guxVarD.C();
            b(guxVarD, listC);
            if (listD != null) {
                listC.addAll(listD);
            }
            List listV = guxVarD.v();
            workDatabase.r();
            workDatabase.p();
            if (listC.size() > 0) {
                guw[] guwVarArr = (guw[]) listC.toArray(new guw[listC.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    gqt gqtVar = (gqt) it.next();
                    if (gqtVar.d()) {
                        gqtVar.c(guwVarArr);
                    }
                }
            }
            if (listV.size() > 0) {
                guw[] guwVarArr2 = (guw[]) listV.toArray(new guw[listV.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    gqt gqtVar2 = (gqt) it2.next();
                    if (!gqtVar2.d()) {
                        gqtVar2.c(guwVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.p();
            throw th;
        }
    }

    private static void b(gux guxVar, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                guxVar.x(((guw) it.next()).b, jCurrentTimeMillis);
            }
        }
    }
}
