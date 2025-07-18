package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwn {
    public static final dxi a = new dwm();
    public static final dxi b = new dwm();
    public static final dxi c = new dwm();

    public static final dwi a(dxj dxjVar) {
        dxjVar.getClass();
        ghe gheVar = (ghe) dxjVar.a(a);
        if (gheVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        dxd dxdVar = (dxd) dxjVar.a(b);
        if (dxdVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) dxjVar.a(c);
        String str = (String) dxjVar.a(dxa.a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        ghb ghbVarD = gheVar.getSavedStateRegistry().d();
        Bundle bundle2 = null;
        dwo dwoVar = ghbVarD instanceof dwo ? (dwo) ghbVarD : null;
        if (dwoVar == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        Map map = b(dxdVar).a;
        dwi dwiVar = (dwi) map.get(str);
        if (dwiVar != null) {
            return dwiVar;
        }
        dwoVar.a();
        Bundle bundle3 = dwoVar.a;
        if (bundle3 != null && ggz.f(bundle3, str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                dwoVar.a = null;
            }
            bundle2 = bundle4;
        }
        dwi dwiVarB = dwf.b(bundle2, bundle);
        map.put(str, dwiVarB);
        return dwiVarB;
    }

    public static final dwp b(dxd dxdVar) {
        dwl dwlVar = new dwl();
        dxj dxjVarE = dhf.e(dxdVar);
        dxjVarE.getClass();
        iom iomVar = new dxa(dxdVar.getViewModelStore(), dwlVar, dxjVarE).b;
        int i = ylg.a;
        return (dwp) iomVar.F(new ykl(dwp.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void c(ghe gheVar) {
        dvd dvdVarA = gheVar.getLifecycle().a();
        if (dvdVarA != dvd.b && dvdVarA != dvd.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gheVar.getSavedStateRegistry().d() == null) {
            dwo dwoVar = new dwo(gheVar.getSavedStateRegistry(), (dxd) gheVar);
            gheVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider", dwoVar);
            gheVar.getLifecycle().c(new dwj(dwoVar, 0));
        }
    }
}
