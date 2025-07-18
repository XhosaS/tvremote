package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bx extends cd implements csb, csc, dk, dl, dxd, fz, gu, ghe, cu, cve {
    final /* synthetic */ by a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(by byVar) {
        super(byVar, byVar, new Handler());
        this.a = byVar;
    }

    @Override // defpackage.cd, defpackage.ca
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.cve
    public final void addMenuProvider(cvk cvkVar, dvk dvkVar, dvd dvdVar) {
        throw null;
    }

    @Override // defpackage.csb
    public final void addOnConfigurationChangedListener(cuh<Configuration> cuhVar) {
        this.a.addOnConfigurationChangedListener(cuhVar);
    }

    @Override // defpackage.dk
    public final void addOnMultiWindowModeChangedListener(cuh<shy> cuhVar) {
        this.a.addOnMultiWindowModeChangedListener(cuhVar);
    }

    @Override // defpackage.dl
    public final void addOnPictureInPictureModeChangedListener(cuh<shy> cuhVar) {
        this.a.addOnPictureInPictureModeChangedListener(cuhVar);
    }

    @Override // defpackage.csc
    public final void addOnTrimMemoryListener(cuh<Integer> cuhVar) {
        this.a.addOnTrimMemoryListener(cuhVar);
    }

    @Override // defpackage.cd, defpackage.ca
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.cd
    public final LayoutInflater c() {
        by byVar = this.a;
        return byVar.getLayoutInflater().cloneInContext(byVar);
    }

    @Override // defpackage.cd
    public final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.cd
    public final void e() {
        this.a.invalidateMenu();
    }

    @Override // defpackage.cd
    public final boolean f(String str) {
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        by byVar = this.a;
        if (Build.VERSION.SDK_INT >= 32) {
            return byVar.shouldShowRequestPermissionRationale(str);
        }
        if (Build.VERSION.SDK_INT != 31) {
            return byVar.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(byVar.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return byVar.shouldShowRequestPermissionRationale(str);
        }
    }

    @Override // defpackage.cu
    public final void g(bv bvVar) {
        this.a.onAttachFragment(bvVar);
    }

    @Override // defpackage.gu
    public final gt getActivityResultRegistry() {
        return this.a.getActivityResultRegistry();
    }

    @Override // defpackage.dvk
    public final dve getLifecycle() {
        return this.a.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.fz
    public final fx getOnBackPressedDispatcher() {
        return this.a.getOnBackPressedDispatcher();
    }

    @Override // defpackage.ghe
    public final ghc getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override // defpackage.dxd
    public final dxc getViewModelStore() {
        return this.a.getViewModelStore();
    }

    @Override // defpackage.cd
    public final void h(PrintWriter printWriter, String[] strArr) {
        this.a.dump("  ", null, printWriter, strArr);
    }

    @Override // defpackage.cve
    public final void invalidateMenu() {
        throw null;
    }

    @Override // defpackage.cve
    public final void removeMenuProvider(cvk cvkVar) {
        this.a.removeMenuProvider(cvkVar);
    }

    @Override // defpackage.csb
    public final void removeOnConfigurationChangedListener(cuh<Configuration> cuhVar) {
        this.a.removeOnConfigurationChangedListener(cuhVar);
    }

    @Override // defpackage.dk
    public final void removeOnMultiWindowModeChangedListener(cuh<shy> cuhVar) {
        this.a.removeOnMultiWindowModeChangedListener(cuhVar);
    }

    @Override // defpackage.dl
    public final void removeOnPictureInPictureModeChangedListener(cuh<shy> cuhVar) {
        this.a.removeOnPictureInPictureModeChangedListener(cuhVar);
    }

    @Override // defpackage.csc
    public final void removeOnTrimMemoryListener(cuh<Integer> cuhVar) {
        this.a.removeOnTrimMemoryListener(cuhVar);
    }

    @Override // defpackage.cve
    public final void addMenuProvider(cvk cvkVar) {
        this.a.addMenuProvider(cvkVar);
    }
}
