package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.support.v7.appcompat.R;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hif extends hia {
    public final Context r;
    public volatile int s;
    public volatile kpv t;
    private volatile ScheduledExecutorService u;
    private volatile itp v;

    public hif(String str, shy shyVar, Context context, pku pkuVar, hhz hhzVar) {
        super(str, shyVar, context, pkuVar, hhzVar);
        this.s = 0;
        this.r = context;
    }

    public static final boolean B(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int H(uhp uhpVar) {
        try {
            return ((Integer) uhpVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            D(R.styleable.AppCompatTheme_tooltipForegroundColor, 28, hik.B);
            hiy.f("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
            return 0;
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            D(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 28, hik.B);
            hiy.f("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
            return 0;
        }
    }

    private final synchronized ScheduledExecutorService I() {
        if (this.u == null) {
            this.u = Executors.newSingleThreadScheduledExecutor();
        }
        return this.u;
    }

    private final synchronized void J() {
        E(27);
        try {
            try {
                if (this.v != null && this.t != null) {
                    int i = hiy.a;
                    this.r.unbindService(this.v);
                    this.v = new itp(this, 1);
                }
                this.t = null;
                if (this.u != null) {
                    this.u.shutdownNow();
                    this.u = null;
                }
            } catch (RuntimeException e) {
                hiy.f("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
            }
        } finally {
            this.s = 3;
        }
    }

    private final synchronized void K() {
        if (A()) {
            int i = hiy.a;
            E(26);
            return;
        }
        int i2 = 1;
        if (this.s == 1) {
            hiy.e("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.s == 3) {
            hiy.e("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            D(38, 26, hik.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.s = 1;
        int i3 = hiy.a;
        this.v = new itp(this, 1);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.r;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i2 = 41;
        } else {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = resolveInfo.serviceInfo.packageName;
                String str2 = resolveInfo.serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    hiy.e("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.v, 1)) {
                        return;
                    } else {
                        hiy.e("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
                i2 = 39;
            }
        }
        this.s = 0;
        D(i2, 26, hik.a(2, "Billing Override Service unavailable on device."));
    }

    private final uhp L(int i) {
        if (!A()) {
            hiy.e("BillingClientTesting", "Billing Override Service is not ready.");
            D(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 28, hik.a(-1, "Billing Override Service connection is disconnected."));
            return sfy.C(0);
        }
        hie hieVar = new hie(this, i);
        hjj hjjVar = new hjj();
        hjm hjmVar = new hjm(hjjVar);
        hjjVar.b = hjmVar;
        hjjVar.a = hieVar.getClass();
        try {
            hif hifVar = hieVar.a;
            int i2 = hieVar.b;
            try {
                hifVar.t.getClass();
                kpv kpvVar = hifVar.t;
                String packageName = hifVar.r.getPackageName();
                String str = i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
                njq njqVar = new njq(hjjVar, 1);
                Parcel parcelK = kpvVar.k();
                parcelK.writeString(packageName);
                parcelK.writeString(str);
                ifl.e(parcelK, njqVar);
                kpvVar.n(1, parcelK);
            } catch (Exception e) {
                hifVar.D(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 28, hik.B);
                hiy.f("BillingClientTesting", "An error occurred while retrieving billing override.", e);
                hjjVar.a(0);
            }
            hjjVar.a = "billingOverrideService.getBillingOverride";
        } catch (Exception e2) {
            hjmVar.a(e2);
        }
        return hjmVar;
    }

    public final synchronized boolean A() {
        if (this.s == 2 && this.t != null) {
            if (this.v != null) {
                return true;
            }
        }
        return false;
    }

    public final hij C(int i, int i2) {
        hij hijVarA = hik.a(i2, "Billing override value was set by a license tester.");
        D(R.styleable.AppCompatTheme_textAppearanceListItemSmall, i, hijVarA);
        return hijVarA;
    }

    public final void D(int i, int i2, hij hijVar) {
        wcy wcyVarB = hih.b(i, i2, hijVar);
        wcyVarB.getClass();
        this.f.a(wcyVarB);
    }

    public final void E(int i) {
        wcz wczVarF = hih.f(i);
        wczVarF.getClass();
        this.f.c(wczVarF);
    }

    public final /* synthetic */ void F(hfx hfxVar, kmf kmfVar) {
        super.w(hfxVar, kmfVar);
    }

    public final /* synthetic */ hij G(Activity activity, ydo ydoVar) {
        return super.x(activity, ydoVar);
    }

    @Override // defpackage.hia
    public final void h() {
        J();
        super.h();
    }

    @Override // defpackage.hia
    public final void p(kmf kmfVar) {
        K();
        super.p(kmfVar);
    }

    @Override // defpackage.hia
    public final void w(hfx hfxVar, kmf kmfVar) {
        sfy.K(sfy.I(L(7), 28500L, TimeUnit.MILLISECONDS, I()), new uum(this, new bw(kmfVar, 8), new bd(this, hfxVar, kmfVar, 17, (int[]) null), 1), f());
    }

    @Override // defpackage.hia
    public final hij x(Activity activity, ydo ydoVar) {
        bw bwVar = new bw(this, 9);
        hbn hbnVar = new hbn(this, activity, ydoVar, 4, (short[]) null);
        int iH = H(L(2));
        if (B(iH)) {
            hij hijVarC = C(2, iH);
            bwVar.accept(hijVarC);
            return hijVarC;
        }
        try {
            return (hij) hbnVar.call();
        } catch (Exception e) {
            hij hijVar = hik.e;
            D(R.styleable.AppCompatTheme_tooltipFrameBackground, 2, hijVar);
            hiy.f("BillingClientTesting", "An internal error occurred.", e);
            return hijVar;
        }
    }

    public final /* synthetic */ void z(hij hijVar) {
        super.r(hijVar);
    }
}
