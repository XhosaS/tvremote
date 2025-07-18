package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ced {
    public static final String a = cbx.d("Schedulers");

    public static void a(cak cakVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        cle cleVarD = workDatabase.D();
        workDatabase.m();
        workDatabase.n();
        try {
            List listD = cleVarD.d();
            ccn ccnVar = cakVar.i;
            b(cleVarD, listD);
            int i = cakVar.h;
            List listC = cleVarD.C();
            b(cleVarD, listC);
            if (listD != null) {
                listC.addAll(listD);
            }
            List listV = cleVarD.v();
            workDatabase.q();
            workDatabase.o();
            if (listC.size() > 0) {
                cld[] cldVarArr = (cld[]) listC.toArray(new cld[listC.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cea ceaVar = (cea) it.next();
                    if (ceaVar.d()) {
                        ceaVar.c(cldVarArr);
                    }
                }
            }
            if (listV.size() > 0) {
                cld[] cldVarArr2 = (cld[]) listV.toArray(new cld[listV.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    cea ceaVar2 = (cea) it2.next();
                    if (!ceaVar2.d()) {
                        ceaVar2.c(cldVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.o();
            throw th;
        }
    }

    private static void b(cle cleVar, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cleVar.x(((cld) it.next()).c, jCurrentTimeMillis);
            }
        }
    }
}
