package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqt extends oqk {
    public oqt() {
        super(ngl.COMPONENT_ENABLED_SETTING_FIX, 0L);
    }

    private static ComponentName c(Context context, String str) {
        return new ComponentName(context.getPackageName(), str);
    }

    private static int d(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 1;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oqk
    public final oqp a(oqp oqpVar, tst tstVar) {
        if (!tstVar.g() || ((ngy) tstVar.c()).b != 8) {
            throw new IllegalArgumentException();
        }
        ngy ngyVar = (ngy) tstVar.c();
        ngn ngnVar = ngyVar.b == 8 ? (ngn) ngyVar.c : ngn.a;
        HashSet hashSet = new HashSet();
        Iterator<E> it = ngnVar.b.iterator();
        while (it.hasNext()) {
            if (!hashSet.add(((ngm) it.next()).b)) {
                throw new IllegalArgumentException("Duplicate componentName in config");
            }
        }
        Context context = oqpVar.b;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList = new ArrayList();
            for (ngm ngmVar : ngnVar.b) {
                ComponentName componentNameC = c(context, ngmVar.b);
                int iAQ = a.aQ(ngmVar.c);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                arrayList.add(new PackageManager.ComponentEnabledSetting(componentNameC, d(iAQ), 1));
            }
            context.getPackageManager().setComponentEnabledSettings(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < ngnVar.b.size()) {
                try {
                    ngm ngmVar2 = (ngm) ngnVar.b.get(i);
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentNameC2 = c(context, ngmVar2.b);
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentNameC2);
                    int iAQ2 = a.aQ(ngmVar2.c);
                    if (iAQ2 == 0) {
                        iAQ2 = 1;
                    }
                    packageManager.setComponentEnabledSetting(componentNameC2, d(iAQ2), 1);
                    arrayList2.add(Integer.valueOf(componentEnabledSetting));
                    i++;
                } catch (IllegalArgumentException e) {
                    PackageManager packageManager2 = context.getPackageManager();
                    while (true) {
                        i--;
                        if (i < 0) {
                            throw new IllegalArgumentException("Failed to set componentEnabled state.", e);
                        }
                        packageManager2.setComponentEnabledSetting(c(context, ((ngm) ngnVar.b.get(i)).b), ((Integer) arrayList2.get(i)).intValue(), 1);
                    }
                }
            }
        }
        if (ngnVar.c) {
            return oqpVar;
        }
        oqo oqoVar = new oqo(oqpVar);
        oqoVar.c();
        return oqoVar.a();
    }

    @Override // defpackage.oqk
    public final String b() {
        return "COMPONENT_ENABLED_SETTING_FIX";
    }
}
