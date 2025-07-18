package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hid implements ServiceConnection {
    public final ttl a;
    public final int b = 0;
    public final /* synthetic */ hia c;
    private final ttl d;
    private final kmf e;

    public hid(hia hiaVar, kmf kmfVar) {
        this.c = hiaVar;
        this.a = new ttl(hiaVar.n);
        this.d = new ttl(hiaVar.n);
        this.e = kmfVar;
    }

    private final Long e(boolean z) {
        if (z) {
            ttl ttlVar = this.a;
            if (!ttlVar.a) {
                return null;
            }
            ttlVar.f();
            return Long.valueOf(ttlVar.a(TimeUnit.MILLISECONDS));
        }
        ttl ttlVar2 = this.d;
        if (!ttlVar2.a) {
            return null;
        }
        ttlVar2.f();
        return Long.valueOf(ttlVar2.a(TimeUnit.MILLISECONDS));
    }

    public final void a(boolean z) {
        try {
            Long lE = e(z);
            if (!z) {
                vtw vtwVarM = wdi.a.m();
                vtw vtwVarM2 = wda.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wda wdaVar = (wda) vtwVarM2.b;
                wdaVar.b |= 1;
                wdaVar.c = 0;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wdi wdiVar = (wdi) vtwVarM.b;
                wda wdaVar2 = (wda) vtwVarM2.r();
                wdaVar2.getClass();
                wdiVar.c = wdaVar2;
                wdiVar.b |= 1;
                if (lE != null) {
                    long jLongValue = lE.longValue();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    wdi wdiVar2 = (wdi) vtwVarM.b;
                    wdiVar2.b |= 2;
                    wdiVar2.d = jLongValue;
                }
                this.c.f.d((wdi) vtwVarM.r());
                return;
            }
            vtw vtwVarM3 = wcz.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            wcz wczVar = (wcz) vtwVarM3.b;
            wczVar.e = 5;
            wczVar.b |= 1;
            vtw vtwVarM4 = wdk.a.m();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vuc vucVar = vtwVarM4.b;
            wdk wdkVar = (wdk) vucVar;
            wdkVar.b |= 8;
            wdkVar.e = false;
            if (!vucVar.A()) {
                vtwVarM4.u();
            }
            wdk wdkVar2 = (wdk) vtwVarM4.b;
            wdkVar2.b |= 16;
            wdkVar2.f = 0;
            if (lE != null) {
                long jLongValue2 = lE.longValue();
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                wdk wdkVar3 = (wdk) vtwVarM4.b;
                wdkVar3.b |= 4;
                wdkVar3.d = jLongValue2;
            }
            hia hiaVar = this.c;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            wcz wczVar2 = (wcz) vtwVarM3.b;
            wdk wdkVar4 = (wdk) vtwVarM4.r();
            wdkVar4.getClass();
            wczVar2.d = wdkVar4;
            wczVar2.c = 3;
            hiaVar.j((wcz) vtwVarM3.r());
        } catch (Throwable th) {
            hiy.f("BillingClient", "Unable to log.", th);
        }
    }

    public final void b(hij hijVar) {
        hia hiaVar = this.c;
        synchronized (hiaVar.a) {
            if (hiaVar.b == 3) {
                return;
            }
            try {
                this.e.b(hijVar);
            } catch (Throwable th) {
                hiy.f("BillingClient", "Exception while calling onBillingSetupFinished.", th);
            }
        }
    }

    public final void c(Exception exc, boolean z) {
        hiy.f("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        int i = exc instanceof DeadObjectException ? 101 : exc instanceof RemoteException ? 100 : exc instanceof SecurityException ? R.styleable.AppCompatTheme_textAppearanceLargePopupMenu : 42;
        String strA = i == 42 ? hih.a(exc) : null;
        this.c.z(0);
        d(hia.d(exc), i, strA, z);
        b(hia.d(exc));
    }

    public final void d(hij hijVar, int i, String str, boolean z) {
        try {
            vtw vtwVarM = wda.a.m();
            int i2 = hijVar.a;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wda wdaVar = (wda) vucVar;
            wdaVar.b |= 1;
            wdaVar.c = i2;
            String str2 = hijVar.c;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wda wdaVar2 = (wda) vucVar2;
            str2.getClass();
            wdaVar2.b |= 2;
            wdaVar2.d = str2;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            vuc vucVar3 = vtwVarM.b;
            wda wdaVar3 = (wda) vucVar3;
            wdaVar3.e = i - 1;
            wdaVar3.b |= 4;
            if (str != null) {
                if (!vucVar3.A()) {
                    vtwVarM.u();
                }
                wda wdaVar4 = (wda) vtwVarM.b;
                wdaVar4.b |= 8;
                wdaVar4.f = str;
            }
            Long lE = e(z);
            if (!z) {
                vtw vtwVarM2 = wdi.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wdi wdiVar = (wdi) vtwVarM2.b;
                wda wdaVar5 = (wda) vtwVarM.r();
                wdaVar5.getClass();
                wdiVar.c = wdaVar5;
                wdiVar.b |= 1;
                if (lE != null) {
                    long jLongValue = lE.longValue();
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    wdi wdiVar2 = (wdi) vtwVarM2.b;
                    wdiVar2.b |= 2;
                    wdiVar2.d = jLongValue;
                }
                this.c.f.d((wdi) vtwVarM2.r());
                return;
            }
            vtw vtwVarM3 = wdk.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vuc vucVar4 = vtwVarM3.b;
            wdk wdkVar = (wdk) vucVar4;
            wdkVar.b |= 8;
            wdkVar.e = false;
            if (!vucVar4.A()) {
                vtwVarM3.u();
            }
            wdk wdkVar2 = (wdk) vtwVarM3.b;
            wdkVar2.b |= 16;
            wdkVar2.f = 0;
            if (lE != null) {
                long jLongValue2 = lE.longValue();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                wdk wdkVar3 = (wdk) vtwVarM3.b;
                wdkVar3.b |= 4;
                wdkVar3.d = jLongValue2;
            }
            hia hiaVar = this.c;
            vtw vtwVarM4 = wcy.a.m();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            wcy wcyVar = (wcy) vtwVarM4.b;
            wda wdaVar6 = (wda) vtwVarM.r();
            wdaVar6.getClass();
            wcyVar.f = wdaVar6;
            wcyVar.b |= 2;
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vuc vucVar5 = vtwVarM4.b;
            wcy wcyVar2 = (wcy) vucVar5;
            wcyVar2.e = 5;
            wcyVar2.b |= 1;
            if (!vucVar5.A()) {
                vtwVarM4.u();
            }
            wcy wcyVar3 = (wcy) vtwVarM4.b;
            wdk wdkVar4 = (wdk) vtwVarM3.r();
            wdkVar4.getClass();
            wcyVar3.d = wdkVar4;
            wcyVar3.c = 6;
            hiaVar.i((wcy) vtwVarM4.r());
        } catch (Throwable th) {
            hiy.f("BillingClient", "Unable to log.", th);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        hiy.e("BillingClient", "Billing service died.");
        try {
            hia hiaVar = this.c;
            if (hiaVar.n()) {
                hii hiiVar = hiaVar.f;
                vtw vtwVarM = wcy.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wcy wcyVar = (wcy) vtwVarM.b;
                wcyVar.e = 5;
                wcyVar.b |= 1;
                vtw vtwVarM2 = wda.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wda wdaVar = (wda) vtwVarM2.b;
                wdaVar.e = R.styleable.AppCompatTheme_windowFixedHeightMinor;
                wdaVar.b |= 4;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wcy wcyVar2 = (wcy) vtwVarM.b;
                wda wdaVar2 = (wda) vtwVarM2.r();
                wdaVar2.getClass();
                wcyVar2.f = wdaVar2;
                wcyVar2.b |= 2;
                vtw vtwVarM3 = wdk.a.m();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vuc vucVar = vtwVarM3.b;
                wdk wdkVar = (wdk) vucVar;
                wdkVar.b |= 8;
                wdkVar.e = false;
                if (!vucVar.A()) {
                    vtwVarM3.u();
                }
                wdk wdkVar2 = (wdk) vtwVarM3.b;
                wdkVar2.b |= 16;
                wdkVar2.f = 0;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wcy wcyVar3 = (wcy) vtwVarM.b;
                wdk wdkVar3 = (wdk) vtwVarM3.r();
                wdkVar3.getClass();
                wcyVar3.d = wdkVar3;
                wcyVar3.c = 6;
                hiiVar.a((wcy) vtwVarM.r());
            } else {
                hii hiiVar2 = hiaVar.f;
                wdb wdbVar = wdb.a;
                try {
                    vtw vtwVarM4 = wdh.a.m();
                    wde wdeVar = ((him) hiiVar2).b;
                    if (!vtwVarM4.b.A()) {
                        vtwVarM4.u();
                    }
                    vuc vucVar2 = vtwVarM4.b;
                    wdh wdhVar = (wdh) vucVar2;
                    wdeVar.getClass();
                    wdhVar.e = wdeVar;
                    wdhVar.b |= 1;
                    if (!vucVar2.A()) {
                        vtwVarM4.u();
                    }
                    wdh wdhVar2 = (wdh) vtwVarM4.b;
                    wdbVar.getClass();
                    wdhVar2.d = wdbVar;
                    wdhVar2.c = 7;
                    ((him) hiiVar2).c.a((wdh) vtwVarM4.r());
                } catch (Throwable th) {
                    hiy.f("BillingLogger", "Unable to log.", th);
                }
            }
        } catch (Throwable th2) {
            hiy.f("BillingClient", "Unable to log.", th2);
        }
        hia hiaVar2 = this.c;
        synchronized (hiaVar2.a) {
            if (hiaVar2.b != 3 && hiaVar2.b != 0) {
                hiaVar2.z(0);
                hiaVar2.m();
                try {
                    this.e.a();
                } catch (Throwable th3) {
                    hiy.f("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hjp hjpVar;
        int i = hiy.a;
        hia hiaVar = this.c;
        synchronized (hiaVar.a) {
            if (hiaVar.b == 3) {
                return;
            }
            if (iBinder == null) {
                hjpVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                hjpVar = iInterfaceQueryLocalInterface instanceof hjp ? (hjp) iInterfaceQueryLocalInterface : new hjp(iBinder);
            }
            hiaVar.o = hjpVar;
            if (hiaVar.g(new Callable() { // from class: hic
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    hjp hjpVar2;
                    hid hidVar = this.a;
                    hia hiaVar2 = hidVar.c;
                    Object obj = hiaVar2.a;
                    synchronized (obj) {
                        if (hiaVar2.b != 3) {
                            int i2 = 1;
                            boolean z = hiaVar2.b == 1;
                            String str = hiaVar2.k;
                            if (TextUtils.isEmpty(str)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", str);
                                hiy.g(bundle, hiaVar2.d, hiaVar2.l.longValue());
                            }
                            synchronized (obj) {
                                hjpVar2 = hiaVar2.o;
                            }
                            if (hjpVar2 == null) {
                                hia hiaVar3 = hidVar.c;
                                hiaVar3.z(0);
                                hij hijVar = hik.g;
                                hiaVar3.v(R.styleable.AppCompatTheme_windowActionModeOverlay, hijVar);
                                hidVar.b(hijVar);
                            } else {
                                hia hiaVar4 = hidVar.c;
                                String packageName = hiaVar4.e.getPackageName();
                                try {
                                    hiw hiwVar = hiaVar4.m;
                                    int i3 = 25;
                                    if (!his.a(hiaVar4.e)) {
                                        int i4 = hiwVar.a;
                                    } else if (hjpVar2.a(25, packageName, "inapp") == 0) {
                                        try {
                                            Boolean boolValueOf = Boolean.valueOf(z);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("callingPackage", hiaVar4.e.getPackageName());
                                            hiy.g(bundle2, hiaVar4.d, hiaVar4.l.longValue());
                                            if (hiaVar4.q != null) {
                                                bundle2.putBoolean("enablePendingPurchases", true);
                                            }
                                            String packageName2 = hiaVar4.e.getPackageName();
                                            hjo hjoVar = new hjo(hiaVar4, hidVar, boolValueOf);
                                            Parcel parcelK = hjpVar2.k();
                                            parcelK.writeInt(25);
                                            parcelK.writeString(packageName2);
                                            ifl.c(parcelK, bundle2);
                                            ifl.e(parcelK, hjoVar);
                                            hjpVar2.n(2101, parcelK);
                                        } catch (Exception e) {
                                            hiy.f("BillingClient", "Exception while invoking initialize AIDL method", e);
                                            hia hiaVar5 = hidVar.c;
                                            String strA = hih.a(e);
                                            hiaVar5.z(0);
                                            hidVar.d(hia.d(e), e instanceof DeadObjectException ? 141 : e instanceof RemoteException ? 143 : e instanceof SecurityException ? 142 : 140, strA, z);
                                            hidVar.b(hia.d(e));
                                        }
                                    }
                                    int iA = 3;
                                    int i5 = 25;
                                    while (true) {
                                        if (i5 < 3) {
                                            i5 = 0;
                                            break;
                                        }
                                        if (bundle == null) {
                                            try {
                                                iA = hjpVar2.a(i5, packageName, "subs");
                                            } catch (Exception e2) {
                                                hidVar.c(e2, z);
                                            }
                                        } else {
                                            iA = hjpVar2.b(i5, packageName, "subs", bundle);
                                        }
                                        if (iA == 0) {
                                            int i6 = hiy.a;
                                            break;
                                        }
                                        i5--;
                                    }
                                    hia hiaVar6 = hidVar.c;
                                    hiaVar6.h = i5 >= 5;
                                    hiaVar6.g = i5 >= 3;
                                    if (i5 < 3) {
                                        int i7 = hiy.a;
                                        i2 = 9;
                                    }
                                    while (true) {
                                        if (i3 < 3) {
                                            break;
                                        }
                                        iA = bundle == null ? hjpVar2.a(i3, packageName, "inapp") : hjpVar2.b(i3, packageName, "inapp", bundle);
                                        if (iA == 0) {
                                            hiaVar6.i = i3;
                                            int i8 = hiy.a;
                                            break;
                                        }
                                        i3--;
                                    }
                                    hiaVar6.k(hiaVar6.i);
                                    if (hiaVar6.i < 3) {
                                        hiy.e("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                        i2 = 36;
                                    }
                                    hiaVar6.l(iA);
                                    if (iA == 0) {
                                        hidVar.a(z);
                                        hidVar.b(hik.f);
                                    } else {
                                        hij hijVar2 = hik.a;
                                        hidVar.d(hijVar2, i2, null, z);
                                        hidVar.b(hijVar2);
                                    }
                                } catch (Exception e3) {
                                    hidVar.c(e3, z);
                                }
                            }
                        }
                    }
                    return null;
                }
            }, 30000L, new gfe(this, 12), hiaVar.b()) == null) {
                hij hijVarC = hiaVar.c();
                hiaVar.v(25, hijVarC);
                b(hijVarC);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        hiy.e("BillingClient", "Billing service disconnected.");
        try {
            hia hiaVar = this.c;
            if (hiaVar.n()) {
                hii hiiVar = hiaVar.f;
                vtw vtwVarM = wcy.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wcy wcyVar = (wcy) vtwVarM.b;
                wcyVar.e = 5;
                wcyVar.b |= 1;
                vtw vtwVarM2 = wda.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wda wdaVar = (wda) vtwVarM2.b;
                wdaVar.e = R.styleable.AppCompatTheme_windowFixedHeightMajor;
                wdaVar.b = 4 | wdaVar.b;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wcy wcyVar2 = (wcy) vtwVarM.b;
                wda wdaVar2 = (wda) vtwVarM2.r();
                wdaVar2.getClass();
                wcyVar2.f = wdaVar2;
                wcyVar2.b |= 2;
                vtw vtwVarM3 = wdk.a.m();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vuc vucVar = vtwVarM3.b;
                wdk wdkVar = (wdk) vucVar;
                wdkVar.b |= 8;
                wdkVar.e = false;
                if (!vucVar.A()) {
                    vtwVarM3.u();
                }
                wdk wdkVar2 = (wdk) vtwVarM3.b;
                wdkVar2.b |= 16;
                wdkVar2.f = 0;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wcy wcyVar3 = (wcy) vtwVarM.b;
                wdk wdkVar3 = (wdk) vtwVarM3.r();
                wdkVar3.getClass();
                wcyVar3.d = wdkVar3;
                wcyVar3.c = 6;
                hiiVar.a((wcy) vtwVarM.r());
            } else {
                hii hiiVar2 = hiaVar.f;
                wdj wdjVar = wdj.a;
                if (wdjVar != null) {
                    try {
                        vtw vtwVarM4 = wdh.a.m();
                        wde wdeVar = ((him) hiiVar2).b;
                        if (!vtwVarM4.b.A()) {
                            vtwVarM4.u();
                        }
                        vuc vucVar2 = vtwVarM4.b;
                        wdh wdhVar = (wdh) vucVar2;
                        wdeVar.getClass();
                        wdhVar.e = wdeVar;
                        wdhVar.b |= 1;
                        if (!vucVar2.A()) {
                            vtwVarM4.u();
                        }
                        wdh wdhVar2 = (wdh) vtwVarM4.b;
                        wdhVar2.d = wdjVar;
                        wdhVar2.c = 4;
                        ((him) hiiVar2).c.a((wdh) vtwVarM4.r());
                    } catch (Throwable th) {
                        hiy.f("BillingLogger", "Unable to log.", th);
                    }
                }
            }
        } catch (Throwable th2) {
            hiy.f("BillingClient", "Unable to log.", th2);
        }
        ttl ttlVar = this.d;
        ttlVar.d();
        ttlVar.e();
        hia hiaVar2 = this.c;
        synchronized (hiaVar2.a) {
            if (hiaVar2.b == 3) {
                return;
            }
            hiaVar2.z(0);
            try {
                this.e.a();
            } catch (Throwable th3) {
                hiy.f("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
            }
        }
    }
}
