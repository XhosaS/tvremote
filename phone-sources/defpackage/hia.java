package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hia {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private ExecutorService G;
    private volatile kmf H;
    private pku I;
    public final Object a;
    public volatile int b;
    public final String c;
    public final String d;
    public Context e;
    public hii f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public final String k;
    public final Long l;
    public final hiw m;
    public tts n;
    public volatile hjp o;
    public volatile qtx p;
    public shy q;
    private final Handler r;
    private volatile hid s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public hia() {
        throw null;
    }

    private final synchronized void A() {
        ExecutorService executorService = this.G;
        if (executorService != null) {
            executorService.shutdownNow();
            this.G = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean B(long j) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j = 0;
            }
            int i = ((hij) s().get(j, TimeUnit.MILLISECONDS)).a;
            if (i == 0) {
                int i2 = hiy.a;
            } else {
                hiy.e("BillingClient", a.cf(i, "Reconnection failed with result: "));
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            hiy.f("BillingClient", "Error during reconnection attempt: ", e);
        }
        return o();
    }

    private final String C() {
        if (TextUtils.isEmpty(null)) {
            return this.e.getPackageName();
        }
        return null;
    }

    private final void D(hij hijVar, int i, int i2) {
        wcz wczVar = null;
        wcy wcyVar = null;
        if (hijVar.a == 0) {
            int i3 = hih.a;
            try {
                vtw vtwVarM = wcz.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wcz wczVar2 = (wcz) vtwVarM.b;
                wczVar2.e = 4;
                wczVar2.b |= 1;
                vtw vtwVarM2 = wdf.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wdf wdfVar = (wdf) vtwVarM2.b;
                wdfVar.c = i2 - 1;
                wdfVar.b |= 1;
                wdf wdfVar2 = (wdf) vtwVarM2.r();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wcz wczVar3 = (wcz) vtwVarM.b;
                wdfVar2.getClass();
                wczVar3.d = wdfVar2;
                wczVar3.c = 2;
                wczVar = (wcz) vtwVarM.r();
            } catch (Exception e) {
                hiy.f("BillingLogger", "Unable to create logging payload", e);
            }
            j(wczVar);
            return;
        }
        int i4 = hih.a;
        try {
            vtw vtwVarM3 = wcy.a.m();
            vtw vtwVarM4 = wda.a.m();
            int i5 = hijVar.a;
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vuc vucVar = vtwVarM4.b;
            wda wdaVar = (wda) vucVar;
            wdaVar.b |= 1;
            wdaVar.c = i5;
            String str = hijVar.c;
            if (!vucVar.A()) {
                vtwVarM4.u();
            }
            vuc vucVar2 = vtwVarM4.b;
            wda wdaVar2 = (wda) vucVar2;
            str.getClass();
            wdaVar2.b |= 2;
            wdaVar2.d = str;
            if (!vucVar2.A()) {
                vtwVarM4.u();
            }
            wda wdaVar3 = (wda) vtwVarM4.b;
            wdaVar3.e = i - 1;
            wdaVar3.b |= 4;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            wcy wcyVar2 = (wcy) vtwVarM3.b;
            wda wdaVar4 = (wda) vtwVarM4.r();
            wdaVar4.getClass();
            wcyVar2.f = wdaVar4;
            wcyVar2.b |= 2;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            wcy wcyVar3 = (wcy) vtwVarM3.b;
            wcyVar3.e = 4;
            wcyVar3.b |= 1;
            vtw vtwVarM5 = wdf.a.m();
            if (!vtwVarM5.b.A()) {
                vtwVarM5.u();
            }
            wdf wdfVar3 = (wdf) vtwVarM5.b;
            wdfVar3.c = i2 - 1;
            wdfVar3.b |= 1;
            wdf wdfVar4 = (wdf) vtwVarM5.r();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            wcy wcyVar4 = (wcy) vtwVarM3.b;
            wdfVar4.getClass();
            wcyVar4.d = wdfVar4;
            wcyVar4.c = 4;
            wcyVar = (wcy) vtwVarM3.r();
        } catch (Exception e2) {
            hiy.f("BillingLogger", "Unable to create logging payload", e2);
        }
        i(wcyVar);
    }

    private void E(int i) {
        try {
            j(hih.f(i));
        } catch (Throwable th) {
            hiy.f("BillingClient", "Unable to log.", th);
        }
    }

    private final hij F() {
        int i = hiy.a;
        vtw vtwVarM = wcz.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wcz wczVar = (wcz) vtwVarM.b;
        wczVar.e = 5;
        wczVar.b |= 1;
        vtw vtwVarM2 = wdk.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        wdk wdkVar = (wdk) vucVar;
        wdkVar.b |= 2;
        wdkVar.c = true;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        vuc vucVar2 = vtwVarM2.b;
        wdk wdkVar2 = (wdk) vucVar2;
        wdkVar2.b |= 8;
        wdkVar2.e = false;
        if (!vucVar2.A()) {
            vtwVarM2.u();
        }
        wdk wdkVar3 = (wdk) vtwVarM2.b;
        wdkVar3.b |= 16;
        wdkVar3.f = 0;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wcz wczVar2 = (wcz) vtwVarM.b;
        wdk wdkVar4 = (wdk) vtwVarM2.r();
        wdkVar4.getClass();
        wczVar2.d = wdkVar4;
        wczVar2.c = 3;
        j((wcz) vtwVarM.r());
        return hik.f;
    }

    private final void G(wcy wcyVar, long j) {
        wde wdeVar;
        try {
            hii hiiVar = this.f;
            int i = this.i;
            try {
                wde wdeVar2 = ((him) hiiVar).b;
                vtw vtwVar = (vtw) wdeVar2.a(5, null);
                vtwVar.x(wdeVar2);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                wde wdeVar3 = (wde) vtwVar.b;
                wde wdeVar4 = wde.a;
                wdeVar3.b |= 8;
                wdeVar3.f = i;
                ((him) hiiVar).b = (wde) vtwVar.r();
                vtw vtwVar2 = (vtw) wcyVar.a(5, null);
                vtwVar2.x(wcyVar);
                wdg wdgVar = wcyVar.c == 7 ? (wdg) wcyVar.d : wdg.a;
                vtw vtwVar3 = (vtw) wdgVar.a(5, null);
                vtwVar3.x(wdgVar);
                if (!vtwVar3.b.A()) {
                    vtwVar3.u();
                }
                wdg wdgVar2 = (wdg) vtwVar3.b;
                wdg wdgVar3 = wdg.a;
                wdgVar2.b |= 2;
                wdgVar2.c = false;
                if (!vtwVar2.b.A()) {
                    vtwVar2.u();
                }
                wcy wcyVar2 = (wcy) vtwVar2.b;
                wdg wdgVar4 = (wdg) vtwVar3.r();
                wdgVar4.getClass();
                wcyVar2.d = wdgVar4;
                wcyVar2.c = 7;
                wcy wcyVar3 = (wcy) vtwVar2.r();
                if (j == 0) {
                    wdeVar = ((him) hiiVar).b;
                } else {
                    wde wdeVar5 = ((him) hiiVar).b;
                    vtw vtwVar4 = (vtw) wdeVar5.a(5, null);
                    vtwVar4.x(wdeVar5);
                    if (!vtwVar4.b.A()) {
                        vtwVar4.u();
                    }
                    wde wdeVar6 = (wde) vtwVar4.b;
                    wdeVar6.b |= 32;
                    wdeVar6.h = j;
                    wdeVar = (wde) vtwVar4.r();
                }
                ((him) hiiVar).e(wcyVar3, wdeVar);
            } catch (Throwable th) {
                hiy.f("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            hiy.f("BillingClient", "Unable to log.", th2);
        }
    }

    private final void H(int i, hij hijVar, String str, long j) {
        try {
            G(hih.d(i, 2, hijVar, str), j);
        } catch (Throwable th) {
            hiy.f("BillingClient", "Unable to log.", th);
        }
    }

    private final void I(int i, hij hijVar, long j) {
        wde wdeVar;
        try {
            wcy wcyVarB = hih.b(i, 2, hijVar);
            try {
                hii hiiVar = this.f;
                int i2 = this.i;
                try {
                    wde wdeVar2 = ((him) hiiVar).b;
                    vtw vtwVar = (vtw) wdeVar2.a(5, null);
                    vtwVar.x(wdeVar2);
                    if (!vtwVar.b.A()) {
                        vtwVar.u();
                    }
                    wde wdeVar3 = (wde) vtwVar.b;
                    wde wdeVar4 = wde.a;
                    wdeVar3.b |= 8;
                    wdeVar3.f = i2;
                    ((him) hiiVar).b = (wde) vtwVar.r();
                    if (j == 0) {
                        wdeVar = ((him) hiiVar).b;
                    } else {
                        wde wdeVar5 = ((him) hiiVar).b;
                        vtw vtwVar2 = (vtw) wdeVar5.a(5, null);
                        vtwVar2.x(wdeVar5);
                        if (!vtwVar2.b.A()) {
                            vtwVar2.u();
                        }
                        wde wdeVar6 = (wde) vtwVar2.b;
                        wdeVar6.b |= 32;
                        wdeVar6.h = j;
                        wdeVar = (wde) vtwVar2.r();
                    }
                    ((him) hiiVar).e(wcyVarB, wdeVar);
                } catch (Throwable th) {
                    hiy.f("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                hiy.f("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            hiy.f("BillingClient", "Unable to log.", th3);
        }
    }

    private final void J(int i, hij hijVar, long j) {
        try {
            G(hih.b(i, 2, hijVar), j);
        } catch (Throwable th) {
            hiy.f("BillingClient", "Unable to log.", th);
        }
    }

    private final rza K(hij hijVar, int i, String str, Exception exc) {
        hiy.f("BillingClient", str, exc);
        try {
            i(hih.d(i, 7, hijVar, hih.a(exc)));
        } catch (Throwable th) {
            hiy.f("BillingClient", "Unable to log.", th);
        }
        int i2 = hijVar.a;
        String str2 = hijVar.c;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        return new rza(i2, str2, arrayList);
    }

    public static hij d(Exception exc) {
        return exc instanceof DeadObjectException ? hik.g : hik.e;
    }

    public static uhp s() {
        int i = hiy.a;
        return sfy.C(hik.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i) {
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            int i2 = hiy.a;
            this.b = i;
        }
    }

    public final /* synthetic */ Bundle a(String str, String str2) {
        hjp hjpVar;
        try {
            synchronized (this.a) {
                hjpVar = this.o;
            }
            if (hjpVar == null) {
                return hiy.h(hik.g, R.styleable.AppCompatTheme_windowActionModeOverlay);
            }
            String packageName = this.e.getPackageName();
            Parcel parcelK = hjpVar.k();
            parcelK.writeInt(3);
            parcelK.writeString(packageName);
            parcelK.writeString(str);
            parcelK.writeString(str2);
            parcelK.writeString(null);
            Parcel parcelL = hjpVar.l(3, parcelK);
            Bundle bundle = (Bundle) ifl.a(parcelL, Bundle.CREATOR);
            parcelL.recycle();
            return bundle;
        } catch (DeadObjectException e) {
            return hiy.i(hik.g, hih.a(e));
        } catch (Exception e2) {
            return hiy.i(hik.e, hih.a(e2));
        }
    }

    public final Handler b() {
        return Looper.myLooper() == null ? this.r : new Handler(Looper.myLooper());
    }

    public final hij c() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return hik.g;
                }
            }
            return hik.e;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final hij e(String str) {
        if (!B(hil.a)) {
            hij hijVar = hik.g;
            if (hijVar.a != 0) {
                u(2, 5, hijVar);
                return hijVar;
            }
            E(5);
            return hijVar;
        }
        hij hijVar2 = hik.a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    hij hijVar3 = this.h ? hik.f : hik.j;
                    D(hijVar3, 10, 3);
                    return hijVar3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    hij hijVar4 = this.y ? hik.f : hik.l;
                    D(hijVar4, 31, 6);
                    return hijVar4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    hij hijVar5 = this.w ? hik.f : hik.p;
                    D(hijVar5, 30, 5);
                    return hijVar5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    hij hijVar6 = this.z ? hik.f : hik.m;
                    D(hijVar6, 19, 8);
                    return hijVar6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    hij hijVar7 = this.x ? hik.f : hik.n;
                    D(hijVar7, 21, 7);
                    return hijVar7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    hij hijVar8 = this.z ? hik.f : hik.m;
                    D(hijVar8, 61, 9);
                    return hijVar8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    hij hijVar9 = this.j ? hik.f : hik.o;
                    D(hijVar9, 20, 10);
                    return hijVar9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    hij hijVar10 = this.A ? hik.f : hik.u;
                    D(hijVar10, 32, 11);
                    return hijVar10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    hij hijVar11 = this.A ? hik.f : hik.v;
                    D(hijVar11, 33, 12);
                    return hijVar11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    hij hijVar12 = this.B ? hik.f : hik.y;
                    D(hijVar12, 60, 13);
                    return hijVar12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    hij hijVar13 = this.C ? hik.f : hik.z;
                    D(hijVar13, 66, 14);
                    return hijVar13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    hij hijVar14 = this.E ? hik.f : hik.w;
                    D(hijVar14, 130, 18);
                    return hijVar14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    hij hijVar15 = this.D ? hik.f : hik.q;
                    D(hijVar15, R.styleable.AppCompatTheme_viewInflaterClass, 19);
                    return hijVar15;
                }
                break;
            case 108237:
                if (str.equals("mmm")) {
                    hij hijVar16 = this.E ? hik.f : hik.r;
                    D(hijVar16, 128, 20);
                    return hijVar16;
                }
                break;
            case 109230:
                if (str.equals("nnn")) {
                    hij hijVar17 = this.F ? hik.f : hik.s;
                    D(hijVar17, 150, 21);
                    return hijVar17;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    hij hijVar18 = this.u ? hik.f : hik.k;
                    D(hijVar18, 35, 4);
                    return hijVar18;
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    hij hijVar19 = this.g ? hik.f : hik.i;
                    D(hijVar19, 9, 2);
                    return hijVar19;
                }
                break;
        }
        hiy.e("BillingClient", "Unsupported feature: ".concat(str));
        hij hijVar20 = hik.t;
        D(hijVar20, 34, 1);
        return hijVar20;
    }

    public final synchronized ExecutorService f() {
        if (this.G == null) {
            this.G = Executors.newFixedThreadPool(hiy.a, new ocy(1));
        }
        return this.G;
    }

    public final Future g(Callable callable, long j, Runnable runnable, Handler handler) {
        byte[] bArr = null;
        try {
            Future futureSubmit = f().submit(callable);
            handler.postDelayed(new gvj(futureSubmit, runnable, 3, bArr), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            hiy.f("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public void h() {
        E(12);
        synchronized (this.a) {
            try {
            } finally {
                try {
                    int i = hiy.a;
                    m();
                } catch (Throwable th) {
                    hiy.f("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                }
                try {
                    A();
                    z(3);
                } catch (Throwable th2) {
                    try {
                        hiy.f("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                        z(3);
                    } catch (Throwable th3) {
                        z(3);
                        this.H = null;
                        throw th3;
                    }
                }
                this.H = null;
            }
            if (this.p != null) {
                qtx qtxVar = this.p;
                Object obj = qtxVar.a;
                Object obj2 = qtxVar.d;
                ((hhy) obj).b((Context) obj2);
                ((hhy) qtxVar.e).b((Context) obj2);
                int i2 = hiy.a;
                m();
                A();
                z(3);
                this.H = null;
            } else {
                int i22 = hiy.a;
                m();
                A();
                z(3);
                this.H = null;
            }
        }
    }

    public final void i(wcy wcyVar) {
        try {
            hii hiiVar = this.f;
            int i = this.i;
            try {
                wde wdeVar = ((him) hiiVar).b;
                vtw vtwVar = (vtw) wdeVar.a(5, null);
                vtwVar.x(wdeVar);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                wde wdeVar2 = (wde) vtwVar.b;
                wde wdeVar3 = wde.a;
                wdeVar2.b |= 8;
                wdeVar2.f = i;
                ((him) hiiVar).b = (wde) vtwVar.r();
                ((him) hiiVar).a(wcyVar);
            } catch (Throwable th) {
                hiy.f("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            hiy.f("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(wcz wczVar) {
        try {
            hii hiiVar = this.f;
            int i = this.i;
            try {
                wde wdeVar = ((him) hiiVar).b;
                vtw vtwVar = (vtw) wdeVar.a(5, null);
                vtwVar.x(wdeVar);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                wde wdeVar2 = (wde) vtwVar.b;
                wde wdeVar3 = wde.a;
                wdeVar2.b |= 8;
                wdeVar2.f = i;
                ((him) hiiVar).b = (wde) vtwVar.r();
                ((him) hiiVar).c(wczVar);
            } catch (Throwable th) {
                hiy.f("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            hiy.f("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(int i) {
        this.i = i;
        this.F = i >= 26;
        this.E = i >= 24;
        this.D = i >= 23;
        this.C = i >= 21;
        this.B = i >= 20;
        this.A = i >= 18;
        this.j = i >= 17;
        this.z = i >= 16;
        this.y = i >= 15;
        this.x = i >= 14;
        this.w = i >= 12;
        this.v = i >= 9;
        this.u = i >= 8;
        this.t = i >= 6;
    }

    public final void l(int i) {
        if (i != 0) {
            z(0);
            return;
        }
        synchronized (this.a) {
            if (this.b == 3) {
                return;
            }
            z(2);
            qtx qtxVar = this.p != null ? this.p : null;
            if (qtxVar != null) {
                boolean z = this.C;
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                qtxVar.b = z;
                Object obj = qtxVar.e;
                Context context = (Context) qtxVar.d;
                ((hhy) obj).a(context, intentFilter2);
                if (qtxVar.b) {
                    ((hhy) qtxVar.a).c(context, intentFilter);
                } else {
                    ((hhy) qtxVar.a).a(context, intentFilter);
                }
            }
        }
    }

    public final void m() {
        synchronized (this.a) {
            if (this.s != null) {
                try {
                    this.e.unbindService(this.s);
                } catch (Throwable th) {
                    try {
                        hiy.f("BillingClient", "There was an exception while unbinding service!", th);
                        this.o = null;
                        this.s = null;
                    } finally {
                        this.o = null;
                        this.s = null;
                    }
                }
            }
        }
    }

    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            z = true;
            if (this.b != 1) {
                z = false;
            }
        }
        return z;
    }

    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b == 2 && this.o != null && this.s != null) {
                z = true;
            }
        }
        return z;
    }

    public void p(kmf kmfVar) {
        hij hijVarF;
        synchronized (this.a) {
            if (o()) {
                hijVarF = F();
            } else if (this.b == 1) {
                hiy.e("BillingClient", "Client is already in the process of connecting to billing service.");
                hijVarF = hik.c;
                v(37, hijVarF);
            } else if (this.b == 3) {
                hiy.e("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                hijVarF = hik.g;
                v(38, hijVarF);
            } else {
                z(1);
                this.H = kmfVar;
                m();
                int i = hiy.a;
                this.s = new hid(this, kmfVar);
                ttl ttlVar = this.s.a;
                ttlVar.d();
                ttlVar.e();
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                List<ResolveInfo> listQueryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 0);
                int i2 = 41;
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                    ResolveInfo resolveInfo = listQueryIntentServices.get(0);
                    if (resolveInfo.serviceInfo != null) {
                        String str = resolveInfo.serviceInfo.packageName;
                        String str2 = resolveInfo.serviceInfo.name;
                        if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                            hiy.e("BillingClient", "The device doesn't have valid Play Store.");
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            intent2.putExtra("playBillingLibraryVersion", this.c);
                            synchronized (this.a) {
                                if (this.b == 2) {
                                    hijVarF = F();
                                } else if (this.b != 1) {
                                    hiy.e("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                    hijVarF = hik.g;
                                    v(R.styleable.AppCompatTheme_windowActionBar, hijVarF);
                                } else {
                                    hid hidVar = this.s;
                                    if (this.e.bindService(intent2, hidVar, 1)) {
                                        hijVarF = null;
                                    } else {
                                        hiy.e("BillingClient", "Connection to Billing service is blocked.");
                                        i2 = 39;
                                    }
                                }
                            }
                        }
                    } else {
                        hiy.e("BillingClient", "The device doesn't have valid Play Store.");
                    }
                    i2 = 40;
                }
                z(0);
                hijVarF = hik.a;
                v(i2, hijVarF);
            }
        }
        if (hijVarF != null) {
            kmfVar.b(hijVarF);
        }
    }

    public final void r(hij hijVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.r.post(new gvj(this, hijVar, 2));
    }

    public final /* synthetic */ Bundle t(int i, String str, String str2, Bundle bundle) {
        hjp hjpVar;
        try {
            synchronized (this.a) {
                hjpVar = this.o;
            }
            if (hjpVar == null) {
                return hiy.h(hik.g, R.styleable.AppCompatTheme_windowActionModeOverlay);
            }
            String packageName = this.e.getPackageName();
            Parcel parcelK = hjpVar.k();
            parcelK.writeInt(i);
            parcelK.writeString(packageName);
            parcelK.writeString(str);
            parcelK.writeString(str2);
            parcelK.writeString(null);
            ifl.c(parcelK, bundle);
            Parcel parcelL = hjpVar.l(8, parcelK);
            Bundle bundle2 = (Bundle) ifl.a(parcelL, Bundle.CREATOR);
            parcelL.recycle();
            return bundle2;
        } catch (DeadObjectException e) {
            return hiy.i(hik.g, hih.a(e));
        } catch (Exception e2) {
            return hiy.i(hik.e, hih.a(e2));
        }
    }

    public final void u(int i, int i2, hij hijVar) {
        try {
            i(hih.b(i, i2, hijVar));
        } catch (Throwable th) {
            hiy.f("BillingClient", "Unable to log.", th);
        }
    }

    public final void v(int i, hij hijVar) {
        try {
            wcy wcyVarB = hih.b(i, 6, hijVar);
            vtw vtwVar = (vtw) wcyVarB.a(5, null);
            vtwVar.x(wcyVarB);
            vtw vtwVarM = wdk.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wdk wdkVar = (wdk) vucVar;
            wdkVar.b |= 8;
            wdkVar.e = false;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wdk wdkVar2 = (wdk) vtwVarM.b;
            wdkVar2.b |= 16;
            wdkVar2.f = 0;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wcy wcyVar = (wcy) vtwVar.b;
            wdk wdkVar3 = (wdk) vtwVarM.r();
            wcy wcyVar2 = wcy.a;
            wdkVar3.getClass();
            wcyVar.d = wdkVar3;
            wcyVar.c = 6;
            i((wcy) vtwVar.r());
        } catch (Throwable th) {
            hiy.f("BillingClient", "Unable to log.", th);
        }
    }

    public void w(hfx hfxVar, kmf kmfVar) {
        if (g(new hbn((Object) this, (Object) kmfVar, (Object) hfxVar, 3, (byte[]) null), 30000L, new gvj(this, kmfVar, 4), b()) == null) {
            hij hijVarC = c();
            u(25, 7, hijVarC);
            ImmutableList immutableListOf = ImmutableList.of();
            ImmutableList.of();
            kmfVar.c(hijVarC, new hfw(immutableListOf));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0258  */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r25v0, types: [hia, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [long] */
    /* JADX WARN: Type inference failed for: r5v25, types: [long] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r6v22, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [hio] */
    /* JADX WARN: Type inference failed for: r6v7, types: [hio] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.hij x(android.app.Activity r26, defpackage.ydo r27) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hia.x(android.app.Activity, ydo):hij");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final rza y(hfx hfxVar) throws JSONException {
        hjp hjpVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ?? r3 = hfxVar.a;
        int i = 0;
        Object obj = ((cvi) ((ImmutableList) r3).get(0)).a;
        int size = r3.size();
        int i2 = 0;
        List list = r3;
        while (i2 < size) {
            int i3 = i2 + 20;
            ArrayList arrayList3 = new ArrayList(list.subList(i2, i3 > size ? size : i3));
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList3.size();
            for (int i4 = i; i4 < size2; i4++) {
                arrayList4.add(((cvi) arrayList3.get(i4)).b);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            bundle.putString("playBillingLibraryVersion", this.c);
            try {
                synchronized (this.a) {
                    hjpVar = this.o;
                }
                if (hjpVar == null) {
                    return K(hik.g, R.styleable.AppCompatTheme_windowActionModeOverlay, "Service has been reset to null.", null);
                }
                C();
                String strC = C();
                int iContains = TextUtils.isEmpty(strC) ? i : hiw.b.contains(strC);
                C();
                String strC2 = C();
                int iContains2 = TextUtils.isEmpty(strC2) ? i : hiw.c.contains(strC2);
                int i5 = true != this.B ? 17 : 20;
                String packageName = this.e.getPackageName();
                String str = this.d;
                String str2 = this.k;
                List list2 = list;
                Object obj2 = obj;
                long jLongValue = this.l.longValue();
                int i6 = hiy.a;
                int i7 = size;
                Bundle bundle2 = new Bundle();
                hiy.g(bundle2, str, jLongValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                bundle2.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList(ImmutableList.of("subs", "inapp")));
                if (iContains != 0) {
                    bundle2.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList(ImmutableList.of("inapp")));
                }
                bundle2.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList(ImmutableList.of("inapp")));
                if (iContains2 != 0) {
                    bundle2.putStringArrayList("PRODUCT_TYPES_TO_RETURN_AUTOPAY_OFFERS", new ArrayList(ImmutableList.of("inapp")));
                }
                bundle2.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                int size3 = arrayList3.size();
                int i8 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i8 < size3) {
                    ArrayList arrayList8 = arrayList3;
                    cvi cviVar = (cvi) arrayList3.get(i8);
                    int i9 = size3;
                    arrayList5.add(null);
                    z |= !TextUtils.isEmpty(null);
                    arrayList7.add(null);
                    z2 |= !TextUtils.isEmpty(null);
                    int i10 = i8;
                    if (((String) cviVar.a).equals("first_party")) {
                        Object obj3 = cviVar.c;
                        obj3.getClass();
                        arrayList6.add(obj3);
                    }
                    i8 = i10 + 1;
                    size3 = i9;
                    arrayList3 = arrayList8;
                }
                ArrayList<cvi> arrayList9 = arrayList3;
                if (z) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                }
                if (!arrayList6.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle2.putString("accountName", str2);
                }
                if (z2) {
                    bundle2.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList7);
                }
                Parcel parcelK = hjpVar.k();
                parcelK.writeInt(i5);
                parcelK.writeString(packageName);
                parcelK.writeString((String) obj2);
                ifl.c(parcelK, bundle);
                ifl.c(parcelK, bundle2);
                Parcel parcelL = hjpVar.l(901, parcelK);
                Bundle bundle3 = (Bundle) ifl.a(parcelL, Bundle.CREATOR);
                parcelL.recycle();
                if (bundle3 == null) {
                    return K(hik.x, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundle3.containsKey("DETAILS_LIST")) {
                    int iA = hiy.a(bundle3, "BillingClient");
                    String strD = hiy.d(bundle3, "BillingClient");
                    return iA != 0 ? K(hik.a(iA, strD), 23, a.cf(iA, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : K(hik.a(6, strD), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                }
                ArrayList<String> stringArrayList = bundle3.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return K(hik.x, 46, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList10 = new ArrayList();
                int size4 = stringArrayList.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    try {
                        hip hipVar = new hip(stringArrayList.get(i11));
                        hipVar.toString();
                        arrayList10.add(hipVar);
                    } catch (JSONException e) {
                        return K(hik.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                    }
                }
                ArrayList<String> stringArrayList2 = bundle3.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList11 = new ArrayList();
                    if (stringArrayList2 != null) {
                        Iterator<String> it = stringArrayList2.iterator();
                        while (it.hasNext()) {
                            hit hitVar = new hit(it.next());
                            hitVar.toString();
                            arrayList11.add(hitVar);
                        }
                    } else {
                        for (cvi cviVar2 : arrayList9) {
                            Iterator it2 = arrayList10.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    hip hipVar2 = (hip) it2.next();
                                    if (((String) cviVar2.b).equals(hipVar2.a)) {
                                        if (((String) cviVar2.a).equals(hipVar2.b)) {
                                            Object obj4 = cviVar2.c;
                                            if (obj4 != null) {
                                                if (((String) obj4).equals(hipVar2.d)) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } else {
                                    JSONObject jSONObjectPut = new JSONObject().put("productId", cviVar2.b).put("type", cviVar2.a).put("statusCode", 0);
                                    Object obj5 = cviVar2.c;
                                    if (obj5 != null) {
                                        jSONObjectPut.put("serializedDocid", obj5);
                                    }
                                    arrayList11.add(new hit(jSONObjectPut.toString()));
                                }
                            }
                        }
                    }
                    arrayList.addAll(arrayList10);
                    arrayList2.addAll(arrayList11);
                    list = list2;
                    obj = obj2;
                    size = i7;
                    i2 = i3;
                    i = 0;
                } catch (JSONException e2) {
                    return K(hik.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                }
            } catch (DeadObjectException e3) {
                return K(hik.g, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
            } catch (Exception e4) {
                return K(hik.e, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e4);
            }
        }
        return new rza(0, "", arrayList);
    }

    public hia(String str, shy shyVar, Context context, pku pkuVar, hhz hhzVar) {
        uhp uhpVarB;
        this.a = new Object();
        this.b = 0;
        this.r = new Handler(Looper.getMainLooper());
        this.i = 0;
        this.l = Long.valueOf(new Random().nextLong());
        ImmutableSet immutableSet = hiw.b;
        this.m = hiv.a;
        this.n = trj.a;
        this.k = str;
        this.c = "8.0.0";
        String str2 = null;
        try {
            str2 = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
        }
        this.d = str2;
        this.e = context.getApplicationContext();
        vtw vtwVarM = wde.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wde wdeVar = (wde) vucVar;
        wdeVar.b |= 1;
        wdeVar.c = "8.0.0";
        if (str2 != null) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wde wdeVar2 = (wde) vtwVarM.b;
            wdeVar2.b |= 2;
            wdeVar2.d = str2;
        }
        String packageName = this.e.getPackageName();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wde wdeVar3 = (wde) vtwVarM.b;
        packageName.getClass();
        wdeVar3.b |= 4;
        wdeVar3.e = packageName;
        long jLongValue = this.l.longValue();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wde wdeVar4 = (wde) vtwVarM.b;
        wdeVar4.b |= 16;
        wdeVar4.g = jLongValue;
        boolean z = hhzVar.l;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wde wdeVar5 = (wde) vtwVarM.b;
        wdeVar5.b |= 64;
        wdeVar5.i = false;
        int i = Build.VERSION.SDK_INT;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wde wdeVar6 = (wde) vucVar2;
        wdeVar6.b |= 128;
        wdeVar6.j = i;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        wde wdeVar7 = (wde) vtwVarM.b;
        wdeVar7.b |= 512;
        wdeVar7.l = 780959806L;
        try {
            int i2 = this.e.getPackageManager().getPackageInfo(this.e.getPackageName(), 0).versionCode;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wde wdeVar8 = (wde) vtwVarM.b;
            wdeVar8.b |= 256;
            wdeVar8.k = i2;
        } catch (Throwable th) {
            hiy.f("BillingClient", "Error getting app version code.", th);
        }
        this.f = new him(this.e, (wde) vtwVarM.r());
        if (pkuVar == null) {
            hiy.e("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.p = new qtx(this.e, pkuVar, this.f);
        this.q = shyVar;
        this.I = pkuVar;
        this.e.getPackageName();
        Context context2 = this.e;
        try {
            rwv rwvVarA = rwv.a(context2);
            if (rwvVarA == null) {
                uhpVarB = uhl.a;
            } else {
                uhpVarB = ulp.aE(((omi) rwvVarA.f().a).d(xnv.a(context2), 1, new String[]{"PLAY_BILLING_LIBRARY"}));
            }
        } catch (RuntimeException e) {
            uhpVarB = sfy.B(e);
        }
        sfy.K(uhpVarB, new pjm(1), f());
        tts ttsVar = hhzVar.m;
        boolean z2 = hhzVar.l;
    }
}
