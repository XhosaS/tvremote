package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gt {
    final /* synthetic */ fl g;
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    private final Map h = new LinkedHashMap();
    public final List c = new ArrayList();
    public final transient Map d = new LinkedHashMap();
    public final Map e = new LinkedHashMap();
    public final Bundle f = new Bundle();

    public gt(fl flVar) {
        this.g = flVar;
    }

    public static final Integer c() {
        ylw ylwVar = ylx.a;
        return Integer.valueOf(ylx.b.c() + 65536);
    }

    private final void h(String str) {
        if (((Integer) this.b.get(str)) == null) {
            Iterator itA = ykr.g(new ynb(new gf(3), new qyx(9), 1)).a();
            while (itA.hasNext()) {
                Number number = (Number) itA.next();
                if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                    d(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final gp a(String str, gx gxVar, go goVar) {
        str.getClass();
        h(str);
        this.d.put(str, new bhi(goVar, gxVar, (byte[]) null));
        Map map = this.e;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            goVar.a(obj);
        }
        Bundle bundle = this.f;
        gn gnVar = (gn) d.d(bundle, str, gn.class);
        if (gnVar != null) {
            bundle.remove(str);
            goVar.a(gxVar.a(gnVar.a, gnVar.b));
        }
        return new gs(this, str, gxVar);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    public final gp b(final String str, dvk dvkVar, final gx gxVar, final go goVar) {
        str.getClass();
        gxVar.getClass();
        goVar.getClass();
        dve lifecycle = dvkVar.getLifecycle();
        if (lifecycle.a().a(dvd.d)) {
            throw new IllegalStateException("LifecycleOwner " + dvkVar + " is attempting to register while current state is " + lifecycle.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        h(str);
        Map map = this.h;
        bhi bhiVar = (bhi) map.get(str);
        if (bhiVar == null) {
            bhiVar = new bhi(lifecycle);
        }
        dvi dviVar = new dvi() { // from class: gq
            @Override // defpackage.dvi
            public final void a(dvk dvkVar2, dvc dvcVar) {
                gt gtVar = this.a;
                String str2 = str;
                if (dvc.ON_START != dvcVar) {
                    if (dvc.ON_STOP == dvcVar) {
                        gtVar.d.remove(str2);
                        return;
                    } else {
                        if (dvc.ON_DESTROY == dvcVar) {
                            gtVar.e(str2);
                            return;
                        }
                        return;
                    }
                }
                gx gxVar2 = gxVar;
                go goVar2 = goVar;
                gtVar.d.put(str2, new bhi(goVar2, gxVar2, (byte[]) null));
                Map map2 = gtVar.e;
                if (map2.containsKey(str2)) {
                    Object obj = map2.get(str2);
                    map2.remove(str2);
                    goVar2.a(obj);
                }
                Bundle bundle = gtVar.f;
                gn gnVar = (gn) d.d(bundle, str2, gn.class);
                if (gnVar != null) {
                    bundle.remove(str2);
                    goVar2.a(gxVar2.a(gnVar.a, gnVar.b));
                }
            }
        };
        ((dve) bhiVar.b).c(dviVar);
        bhiVar.a.add(dviVar);
        map.put(str, bhiVar);
        return new gr(this, str, gxVar);
    }

    public final void d(int i, String str) {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.b.put(str, numValueOf);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void e(String str) {
        Integer num;
        if (!this.c.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.d.remove(str);
        Map map = this.e;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((gn) d.d(bundle, str, gn.class)));
            bundle.remove(str);
        }
        Map map2 = this.h;
        bhi bhiVar = (bhi) map2.get(str);
        if (bhiVar != null) {
            ?? r2 = bhiVar.a;
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                ((dve) bhiVar.b).d((dvi) it.next());
            }
            r2.clear();
            map2.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [go, java.lang.Object] */
    public final boolean f(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        bhi bhiVar = (bhi) this.d.get(str);
        if ((bhiVar != null ? bhiVar.b : null) != null) {
            List list = this.c;
            if (list.contains(str)) {
                bhiVar.b.a(((gx) bhiVar.a).a(i2, intent));
                list.remove(str);
                return true;
            }
        }
        this.e.remove(str);
        this.f.putParcelable(str, new gn(i2, intent));
        return true;
    }

    public final void g(int i, gx gxVar, Object obj) {
        Bundle bundleExtra;
        fl flVar = this.g;
        cb cbVarC = gxVar.c(flVar, obj);
        if (cbVarC != null) {
            new Handler(Looper.getMainLooper()).post(new fk(this, i, cbVarC, 1, (byte[]) null));
            return;
        }
        Intent intentB = gxVar.b(obj);
        if (intentB.getExtras() != null) {
            Bundle extras = intentB.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentB.setExtrasClassLoader(flVar.getClassLoader());
            }
        }
        if (intentB.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        int i2 = 0;
        if (!yks.e("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentB.getAction())) {
            if (!yks.e("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentB.getAction())) {
                flVar.startActivityForResult(intentB, i, bundle);
                return;
            }
            gw gwVar = (gw) intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                gwVar.getClass();
                flVar.startIntentSenderForResult(gwVar.a, i, gwVar.b, gwVar.c, gwVar.d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new fk(this, i, e, i2));
                return;
            }
        }
        String[] stringArrayExtra = intentB.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            int length = stringArrayExtra.length;
            if (i3 >= length) {
                int size = hashSet.size();
                String[] strArr = size > 0 ? new String[length - size] : stringArrayExtra;
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    int i4 = 0;
                    while (i2 < stringArrayExtra.length) {
                        if (!hashSet.contains(Integer.valueOf(i2))) {
                            strArr[i4] = stringArrayExtra[i2];
                            i4++;
                        }
                        i2++;
                    }
                }
                if (flVar instanceof by) {
                }
                flVar.requestPermissions(stringArrayExtra, i);
                return;
            }
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
            i3++;
        }
    }

    public gt() {
    }
}
