package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuh implements iwb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iuh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v39, types: [java.lang.Object, toe] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, toe] */
    @Override // defpackage.iwb
    public final void a(iwc iwcVar) {
        iui iuiVar;
        Context context;
        by byVarF;
        dve lifecycle;
        dvd dvdVarA;
        cr supportFragmentManager;
        iwu iwuVar;
        iwr iwrVar;
        iwu iwuVar2;
        wpm wpmVar;
        iwu iwuVar3;
        iwu iwuVar4;
        iul iulVar;
        Context context2;
        by byVarF2;
        dve lifecycle2;
        dvd dvdVarA2;
        cr supportFragmentManager2;
        iwu iwuVar5;
        iwr iwrVar2;
        int i = this.b;
        if (i == 0) {
            iwcVar.getClass();
            iwr iwrVar3 = (iwr) iwcVar;
            if (iwrVar3.e() == ivy.a || iwrVar3.e() == ivy.g || iwrVar3.e() == ivy.e) {
                ((iui) this.a).b();
            } else if (yks.e(iwrVar3.h(), false)) {
                ?? r13 = this.a;
                if (!iui.a && (byVarF = hju.F((context = (iuiVar = (iui) r13).b))) != null && (lifecycle = byVarF.getLifecycle()) != null && (dvdVarA = lifecycle.a()) != null && dvdVarA.a(dvd.e)) {
                    Bundle bundle = new Bundle();
                    itk itkVar = iuiVar.c;
                    ith ithVarE = itkVar.e();
                    bundle.putString("device_title", ithVarE != null ? ((iua) ithVarE).c : null);
                    ith ithVarE2 = itkVar.e();
                    bundle.putBoolean("incorrect_code", ithVarE2 == null || (iwuVar = ((iua) ithVarE2).j) == null || (iwrVar = iwuVar.e) == null || iwrVar.d() != 0);
                    iui.a = true;
                    tof tofVar = new tof();
                    tofVar.c = r13;
                    tofVar.setArguments(bundle);
                    by byVarF3 = hju.F(context);
                    if (byVarF3 != null && (supportFragmentManager = byVarF3.getSupportFragmentManager()) != null) {
                        at atVar = new at(supportFragmentManager);
                        atVar.r(tofVar, "AtvRemote.PairingFragment");
                        atVar.l();
                    }
                }
            }
            iui iuiVar2 = (iui) this.a;
            if (iuiVar2.d != null) {
                iuiVar2.h();
                return;
            }
            return;
        }
        if (i != 1) {
            iwcVar.getClass();
            iwr iwrVar4 = (iwr) iwcVar;
            if (iwrVar4.e() == ivy.a || iwrVar4.e() == ivy.g || iwrVar4.e() == ivy.e) {
                ((iul) this.a).b();
                return;
            }
            if (yks.e(iwrVar4.h(), false)) {
                ?? r132 = this.a;
                if (iul.a || (byVarF2 = hju.F((context2 = (iulVar = (iul) r132).b))) == null || (lifecycle2 = byVarF2.getLifecycle()) == null || (dvdVarA2 = lifecycle2.a()) == null || !dvdVarA2.a(dvd.e)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                itk itkVar2 = iulVar.c;
                ith ithVarE3 = itkVar2.e();
                bundle2.putString("device_title", ithVarE3 != null ? ((iua) ithVarE3).c : null);
                ith ithVarE4 = itkVar2.e();
                bundle2.putBoolean("incorrect_code", ithVarE4 == null || (iwuVar5 = ((iua) ithVarE4).j) == null || (iwrVar2 = iwuVar5.e) == null || iwrVar2.d() != 0);
                iul.a = true;
                tof tofVar2 = new tof();
                tofVar2.c = r132;
                tofVar2.setArguments(bundle2);
                by byVarF4 = hju.F(context2);
                if (byVarF4 == null || (supportFragmentManager2 = byVarF4.getSupportFragmentManager()) == null) {
                    return;
                }
                at atVar2 = new at(supportFragmentManager2);
                atVar2.r(tofVar2, "AtvRemote.PairingFragment");
                atVar2.l();
                return;
            }
            return;
        }
        iwcVar.getClass();
        iwr iwrVar5 = (iwr) iwcVar;
        ivy ivyVarE = iwrVar5.e();
        Object obj = this.a;
        ivy ivyVar = ivy.g;
        if (ivyVarE == ivyVar) {
            itv itvVar = (itv) obj;
            iua iuaVar = itvVar.n;
            if (iuaVar == null || (iwuVar4 = iuaVar.j) == null) {
                return;
            }
            if (!itvVar.l && yks.e(iwrVar5.i(), false)) {
                tkm tkmVar = iwuVar4.b.a;
                if ((tkmVar instanceof tkx) && ((tkx) tkmVar).d().booleanValue()) {
                    itvVar.h();
                    return;
                }
            }
        }
        if (yks.e(iwrVar5.i(), true)) {
            ((itv) obj).l = false;
        }
        if (iwrVar5.e() == ivy.h) {
            ((tug) itv.a.f().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteStateChanged$java_com_google_android_apps_googletv_app_device_impl_impl", 396, "MediaDeviceControllerImpl.kt")).s("The current device's virtual remote was lost. Removing from media device.");
            itv itvVar2 = (itv) obj;
            iua iuaVar2 = itvVar2.n;
            if (iuaVar2 == null || (iwuVar3 = iuaVar2.j) == null) {
                return;
            }
            itvVar2.v(iwuVar3.b);
            return;
        }
        if (iwrVar5.e() == ivy.a) {
            tui tuiVar = itv.a;
            ((tug) tuiVar.g().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteStateChanged$java_com_google_android_apps_googletv_app_device_impl_impl", 402, "MediaDeviceControllerImpl.kt")).s("The current device's virtual remote was disconnected.");
            if (yks.e(iwrVar5.h(), false)) {
                ((tug) tuiVar.g().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteStateChanged$java_com_google_android_apps_googletv_app_device_impl_impl", 406, "MediaDeviceControllerImpl.kt")).s("The virtual remote was lost during pairing. Switching to local device.");
                itv itvVar3 = (itv) obj;
                itvVar3.A(itvVar3.o, false);
                return;
            }
            return;
        }
        if (iwrVar5.e() == ivy.e) {
            ((tug) itv.a.g().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteStateChanged$java_com_google_android_apps_googletv_app_device_impl_impl", 413, "MediaDeviceControllerImpl.kt")).s("The pairing attempt was canceled by the TV. Disconnecting.");
            ((itv) obj).h();
            return;
        }
        if (iwrVar5.e() != ivyVar) {
            return;
        }
        itv itvVar4 = (itv) obj;
        iua iuaVar3 = itvVar4.n;
        if (iuaVar3 != null) {
            itvVar4.w(iuaVar3);
        }
        Boolean boolI = iwrVar5.i();
        if (yks.e(boolI, true)) {
            itvVar4.j.set(false);
        } else if (yks.e(boolI, false) && itvVar4.j.compareAndSet(true, false)) {
            iua iuaVar4 = itvVar4.n;
            if (iuaVar4 != null && (iwuVar2 = iuaVar4.j) != null) {
                iwuVar2.f();
            }
            itvVar4.r.c(true);
        }
        if (yks.e(iwrVar5.h(), true) && itvVar4.g.compareAndSet(false, true) && (wpmVar = itvVar4.i) != null) {
            ((tug) itv.a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteStateChanged$java_com_google_android_apps_googletv_app_device_impl_impl", 443, "MediaDeviceControllerImpl.kt")).s("Continuing deferred watch action now that all connections have been established.");
            itvVar4.i = null;
            itvVar4.m(wpmVar);
        }
    }
}
