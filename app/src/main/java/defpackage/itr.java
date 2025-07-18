package defpackage;

import android.app.ActivityManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class itr implements ite {
    private static final zdy f = zdy.h("com/google/android/apps/tvsearch/statesync/monitors/foregroundapp/ForegroundAppMonitor");
    public final agow a;
    public final PackageManager b;
    public String c;
    public agux d;
    public agvc e;
    private final ActivityManager g;
    private final grl h;
    private final agow i;
    private final ztw j;
    private final ActivityManager.OnUidImportanceListener k;
    private final boolean l;
    private final ito m;

    public itr(ActivityManager activityManager, agow agowVar, PackageManager packageManager, grl grlVar, agow agowVar2, ztw ztwVar) {
        ActivityManager.OnUidImportanceListener onUidImportanceListener;
        activityManager.getClass();
        grlVar.getClass();
        ztwVar.getClass();
        this.g = activityManager;
        this.a = agowVar;
        this.b = packageManager;
        this.h = grlVar;
        this.i = agowVar2;
        this.j = ztwVar;
        this.m = new ito(this);
        try {
            onUidImportanceListener = new ActivityManager.OnUidImportanceListener() { // from class: itp
                public final void onUidImportance(int i, int i2) {
                    if (i2 != 100) {
                        return;
                    }
                    itr itrVar = this.a;
                    String nameForUid = itrVar.b.getNameForUid(i);
                    abxs abxsVar = ((acfo) itrVar.a.a()).b;
                    abxsVar.getClass();
                    if (abxsVar.contains(nameForUid)) {
                        itrVar.d.a(itrVar);
                    }
                }
            };
        } catch (Throwable th) {
            ((zdv) ((zdv) f.d()).p(th).q("com/google/android/apps/tvsearch/statesync/monitors/foregroundapp/ForegroundAppMonitor", "<init>", 97, "ForegroundAppMonitor.kt")).v("Failed to create onUidImportanceListener. SDK version is %d", Build.VERSION.SDK_INT);
            onUidImportanceListener = null;
        }
        this.k = onUidImportanceListener;
        Object objA = this.i.a();
        objA.getClass();
        acbh.b((abwf) objA).getClass();
        this.l = !r1.isNegative();
        this.d = new agux() { // from class: itq
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((ite) obj).getClass();
                return agpu.a;
            }
        };
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) throws PackageManager.NameNotFoundException {
        zdy zdyVar = f;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/statesync/monitors/foregroundapp/ForegroundAppMonitor", "getEvents$suspendImpl", 102, "ForegroundAppMonitor.kt")).u("#getEvents()");
        String strB = this.c;
        if (strB == null) {
            strB = ewj.b(this.g);
        }
        this.c = strB;
        if (strB == null || strB.length() == 0) {
            ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/statesync/monitors/foregroundapp/ForegroundAppMonitor", "getEvents$suspendImpl", 107, "ForegroundAppMonitor.kt")).u("Foreground package name is empty.");
            return agrd.a;
        }
        String str = this.c;
        PackageInfo packageInfo = null;
        if (str != null) {
            try {
                packageInfo = this.b.getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        iuw iuwVar = iuw.a;
        iuu iuuVar = new iuu();
        iuz iuzVar = iuz.a;
        iuy iuyVar = new iuy();
        Instant instantA = this.j.a();
        instantA.getClass();
        abzy abzyVarB = acbk.b(instantA);
        if ((iuyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            iuyVar.y();
        }
        iuz iuzVar2 = (iuz) iuyVar.b;
        iuzVar2.c = abzyVarB;
        iuzVar2.b |= 1;
        String str2 = this.c;
        if (str2 != null) {
            iur iurVar = iur.a;
            iuq iuqVar = new iuq();
            if ((iuqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                iuqVar.y();
            }
            iur iurVar2 = (iur) iuqVar.b;
            iurVar2.b |= 1;
            iurVar2.c = str2;
            if (packageInfo != null) {
                String str3 = packageInfo.versionName;
                if (str3 == null) {
                    str3 = "";
                }
                if ((iuqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    iuqVar.y();
                }
                iur iurVar3 = (iur) iuqVar.b;
                iurVar3.b |= 4;
                iurVar3.e = str3;
                long longVersionCode = packageInfo.getLongVersionCode();
                if ((iuqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    iuqVar.y();
                }
                iur iurVar4 = (iur) iuqVar.b;
                iurVar4.b |= 2;
                iurVar4.d = longVersionCode;
            }
            iur iurVar5 = (iur) iuqVar.v();
            if ((iuyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                iuyVar.y();
            }
            iuz iuzVar3 = (iuz) iuyVar.b;
            iurVar5.getClass();
            iuzVar3.d = iurVar5;
            iuzVar3.b |= 2;
        }
        if ((iuuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            iuuVar.y();
        }
        iuw iuwVar2 = (iuw) iuuVar.b;
        iuz iuzVar4 = (iuz) iuyVar.v();
        iuzVar4.getClass();
        iuwVar2.c = iuzVar4;
        iuwVar2.b = 1;
        List listSingletonList = Collections.singletonList(iuuVar.v());
        listSingletonList.getClass();
        return listSingletonList;
    }

    @Override // defpackage.ite
    public final /* synthetic */ Object f(agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.ite
    public final void g() {
        this.c = null;
    }

    @Override // defpackage.ite
    public final void h() {
        this.h.b(this.m);
        ActivityManager.OnUidImportanceListener onUidImportanceListener = this.k;
        if (onUidImportanceListener != null) {
            this.g.addOnUidImportanceListener(onUidImportanceListener, 100);
        }
        Object objA = this.i.a();
        objA.getClass();
        Duration durationB = acbh.b((abwf) objA);
        durationB.getClass();
        if (durationB.compareTo(Duration.ZERO) > 0) {
            agvc agvcVar = this.e;
            if (agvcVar == null) {
                agvy.b("updateStateAtFixedRate");
                agvcVar = null;
            }
            agvcVar.a(this, durationB, durationB);
            ((zdv) f.d().q("com/google/android/apps/tvsearch/statesync/monitors/foregroundapp/ForegroundAppMonitor", "onStart", 164, "ForegroundAppMonitor.kt")).x("#updateStateAtFixedRate; pulling foreground app state every %s.", durationB);
        }
    }

    @Override // defpackage.ite
    public final void i() {
        this.h.c(this.m);
        ActivityManager.OnUidImportanceListener onUidImportanceListener = this.k;
        if (onUidImportanceListener != null) {
            this.g.removeOnUidImportanceListener(onUidImportanceListener);
        }
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
        this.d = aguxVar;
    }

    @Override // defpackage.ite
    public final void l(agvc agvcVar) {
        this.e = agvcVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.l;
    }

    @Override // defpackage.ite
    public final void j(agux aguxVar) {
    }
}
