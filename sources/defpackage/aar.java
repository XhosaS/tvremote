package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aar {
    public final Context a;
    final aaq b;
    public boolean d;
    private final PackageManager g;
    private final ArrayList h = new ArrayList();
    public final BroadcastReceiver e = new aap(this);
    public final Runnable f = new ki(this, 18, null);
    public final Handler c = new Handler();

    public aar(Context context, aaq aaqVar) {
        this.a = context;
        this.b = aaqVar;
        this.g = context.getPackageManager();
    }

    public final void a() {
        if (this.d) {
            ArrayList<ServiceInfo> arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList2 = new ArrayList();
                Iterator<ResolveInfo> it = this.g.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().serviceInfo);
                }
                arrayList = arrayList2;
            }
            Iterator<ResolveInfo> it2 = this.g.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i = 0;
            while (true) {
                int i2 = -1;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if (zv.a != null && zv.a().p() && !arrayList.isEmpty()) {
                        for (ServiceInfo serviceInfo2 : arrayList) {
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    ArrayList arrayList3 = this.h;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        ComponentName componentName = ((aao) arrayList3.get(i3)).a;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                    if (i2 < 0) {
                        aao aaoVar = new aao(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        aaoVar.n = new byj(this);
                        aaoVar.n();
                        arrayList3.add(i, aaoVar);
                        ((yv) this.b).g(aaoVar, false);
                        i++;
                    } else if (i2 >= i) {
                        int i4 = i + 1;
                        aao aaoVar2 = (aao) arrayList3.get(i2);
                        aaoVar2.n();
                        if (aaoVar2.d == null && aaoVar2.q()) {
                            aaoVar2.o();
                            aaoVar2.f();
                        }
                        Collections.swap(arrayList3, i2, i);
                        i = i4;
                    }
                }
            }
            ArrayList arrayList4 = this.h;
            if (i < arrayList4.size()) {
                for (int size2 = arrayList4.size() - 1; size2 >= i; size2--) {
                    aao aaoVar3 = (aao) arrayList4.get(size2);
                    yv yvVar = (yv) this.b;
                    zt ztVarC = yvVar.c(aaoVar3);
                    if (ztVarC != null) {
                        aaoVar3.H(null);
                        aaoVar3.G(null);
                        yvVar.n(ztVarC, null);
                        yvVar.a.a(514, ztVarC);
                        yvVar.j.remove(ztVarC);
                    }
                    arrayList4.remove(aaoVar3);
                    aaoVar3.n = null;
                    if (aaoVar3.c) {
                        aaoVar3.c = false;
                        aaoVar3.p();
                    }
                }
            }
        }
    }
}
