package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoh extends anx {
    public aoh() {
        super(aco.COMPONENT_ENABLED_SETTING_FIX, 0L);
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

    @Override // defpackage.anx
    public final aod a(aod aodVar, byg bygVar) {
        if (!bygVar.f() || ((adb) bygVar.b()).b != 8) {
            throw new IllegalArgumentException();
        }
        adb adbVar = (adb) bygVar.b();
        acq acqVar = adbVar.b == 8 ? (acq) adbVar.c : acq.a;
        HashSet hashSet = new HashSet();
        Iterator it = acqVar.b.iterator();
        while (it.hasNext()) {
            if (!hashSet.add(((acp) it.next()).b)) {
                throw new IllegalArgumentException("Duplicate componentName in config");
            }
        }
        Context context = aodVar.b;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList = new ArrayList();
            for (acp acpVar : acqVar.b) {
                ComponentName componentNameC = c(context, acpVar.b);
                int iX = qm.x(acpVar.c);
                if (iX == 0) {
                    iX = 1;
                }
                arrayList.add(new PackageManager.ComponentEnabledSetting(componentNameC, d(iX), 1));
            }
            context.getPackageManager().setComponentEnabledSettings(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < acqVar.b.size()) {
                try {
                    acp acpVar2 = (acp) acqVar.b.get(i);
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentNameC2 = c(context, acpVar2.b);
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentNameC2);
                    int iX2 = qm.x(acpVar2.c);
                    if (iX2 == 0) {
                        iX2 = 1;
                    }
                    packageManager.setComponentEnabledSetting(componentNameC2, d(iX2), 1);
                    arrayList2.add(Integer.valueOf(componentEnabledSetting));
                    i++;
                } catch (IllegalArgumentException e) {
                    PackageManager packageManager2 = context.getPackageManager();
                    while (true) {
                        i--;
                        if (i < 0) {
                            throw new IllegalArgumentException("Failed to set componentEnabled state.", e);
                        }
                        packageManager2.setComponentEnabledSetting(c(context, ((acp) acqVar.b.get(i)).b), ((Integer) arrayList2.get(i)).intValue(), 1);
                    }
                }
            }
        }
        if (acqVar.c) {
            return aodVar;
        }
        aoc aocVar = new aoc(aodVar);
        aocVar.c();
        return aocVar.a();
    }

    @Override // defpackage.anx
    public final String b() {
        return "COMPONENT_ENABLED_SETTING_FIX";
    }
}
