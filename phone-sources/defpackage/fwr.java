package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwr implements dvk, dxd, duz, ghe {
    public fxb a;
    public final Bundle b;
    public dvd c;
    public final String d;
    public final Bundle e;
    public final fyp f;
    public final fww g;
    private final cb h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fwr(fwr fwrVar, Bundle bundle) {
        this(fwrVar.h, fwrVar.a, bundle, fwrVar.c, fwrVar.g, fwrVar.d, fwrVar.e);
        fwrVar.getClass();
        fyp fypVar = this.f;
        dvd dvdVar = fwrVar.c;
        dvdVar.getClass();
        fypVar.b = dvdVar;
        fypVar.b(fwrVar.b());
    }

    public final Bundle a() {
        return this.f.a();
    }

    public final dvd b() {
        return this.f.g;
    }

    public final void c(dvd dvdVar) {
        dvdVar.getClass();
        this.f.b(dvdVar);
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof fwr)) {
            fwr fwrVar = (fwr) obj;
            if (yks.e(this.d, fwrVar.d) && yks.e(this.a, fwrVar.a) && yks.e(getLifecycle(), fwrVar.getLifecycle()) && yks.e(getSavedStateRegistry(), fwrVar.getSavedStateRegistry())) {
                Bundle bundle = this.b;
                if (yks.e(bundle, fwrVar.b)) {
                    return true;
                }
                if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                    return false;
                }
                if (setKeySet.isEmpty()) {
                    return true;
                }
                for (String str : setKeySet) {
                    Object obj2 = bundle.get(str);
                    Bundle bundle2 = fwrVar.b;
                    if (!yks.e(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    @Override // defpackage.duz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dxj getDefaultViewModelCreationExtras() {
        /*
            r5 = this;
            dxl r0 = new dxl
            r1 = 0
            r0.<init>(r1)
            fyp r2 = r5.f
            dxi r3 = defpackage.dwn.a
            fwr r4 = r2.a
            r0.b(r3, r4)
            dxi r3 = defpackage.dwn.b
            r0.b(r3, r4)
            android.os.Bundle r2 = r2.a()
            if (r2 == 0) goto L1f
            dxi r3 = defpackage.dwn.c
            r0.b(r3, r2)
        L1f:
            cb r2 = r5.h
            if (r2 == 0) goto L32
            java.lang.Object r2 = r2.a
            android.content.Context r2 = (android.content.Context) r2
            android.content.Context r2 = r2.getApplicationContext()
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L32
            android.app.Application r2 = (android.app.Application) r2
            goto L33
        L32:
            r2 = r1
        L33:
            r3 = 1
            boolean r4 = r2 instanceof android.app.Application
            if (r3 == r4) goto L39
            goto L3a
        L39:
            r1 = r2
        L3a:
            if (r1 == 0) goto L41
            dxi r2 = defpackage.dww.b
            r0.b(r2, r1)
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwr.getDefaultViewModelCreationExtras():dxj");
    }

    @Override // defpackage.duz
    public final dwx getDefaultViewModelProviderFactory() {
        return this.f.h;
    }

    @Override // defpackage.dvk
    public final dve getLifecycle() {
        return this.f.f;
    }

    @Override // defpackage.ghe
    public final ghc getSavedStateRegistry() {
        return (ghc) this.f.d.b;
    }

    @Override // defpackage.dxd
    public final dxc getViewModelStore() {
        fyp fypVar = this.f;
        if (!fypVar.e) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (fypVar.f.b == dvd.a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        fww fwwVar = fypVar.i;
        if (fwwVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = fypVar.c;
        Map map = fwwVar.a;
        dxc dxcVar = (dxc) map.get(str);
        if (dxcVar != null) {
            return dxcVar;
        }
        dxc dxcVar2 = new dxc();
        map.put(str, dxcVar2);
        return dxcVar2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        Bundle bundle = this.b;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final String toString() {
        return this.f.toString();
    }

    public fwr(cb cbVar, fxb fxbVar, Bundle bundle, dvd dvdVar, fww fwwVar, String str, Bundle bundle2) {
        this.h = cbVar;
        this.a = fxbVar;
        this.b = bundle;
        this.c = dvdVar;
        this.g = fwwVar;
        this.d = str;
        this.e = bundle2;
        this.f = new fyp(this);
    }
}
