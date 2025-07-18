package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcu {
    public final PackageManager a;
    private final agpc c = new agpn(new agum() { // from class: fcs
        @Override // defpackage.agum
        public final Object a() {
            List listB = this.a.b();
            ArrayList arrayList = new ArrayList();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = ((ResolveInfo) it.next()).serviceInfo;
                String str = serviceInfo != null ? serviceInfo.packageName : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
    });
    private final agpc d = new agpn(new agum() { // from class: fct
        @Override // defpackage.agum
        public final Object a() {
            fcu fcuVar = this.a;
            return fcuVar.a.queryIntentServices(fcuVar.b, 0);
        }
    });
    public final Intent b = new Intent("com.google.assistant.TV_OPERATOR_SERVICE");

    public fcu(PackageManager packageManager) {
        this.a = packageManager;
    }

    public final List a() {
        return (List) this.c.a();
    }

    public final List b() {
        Object objA = this.d.a();
        objA.getClass();
        return (List) objA;
    }

    public final boolean c(boolean z) {
        List listB = b();
        ArrayList<ApplicationInfo> arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = ((ResolveInfo) it.next()).serviceInfo;
            ApplicationInfo applicationInfo = serviceInfo != null ? serviceInfo.applicationInfo : null;
            if (applicationInfo != null) {
                arrayList.add(applicationInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (ApplicationInfo applicationInfo2 : arrayList) {
            if (applicationInfo2 != null && (applicationInfo2.flags & 1) == 1) {
                return true;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }
}
