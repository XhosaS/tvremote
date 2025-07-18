package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwo implements ghb {
    public Bundle a;
    private final ghc b;
    private boolean c;
    private final yft d;

    public dwo(ghc ghcVar, dxd dxdVar) {
        ghcVar.getClass();
        this.b = ghcVar;
        this.d = new yga(new ddd(dxdVar, 5));
    }

    private final dwp b() {
        return (dwp) this.d.a();
    }

    public final void a() {
        if (this.c) {
            return;
        }
        Bundle bundleA = this.b.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleJ.putAll(bundle);
        }
        if (bundleA != null) {
            bundleJ.putAll(bundleA);
        }
        this.a = bundleJ;
        this.c = true;
        b();
    }

    @Override // defpackage.ghb
    public final Bundle saveState() {
        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleJ.putAll(bundle);
        }
        for (Map.Entry entry : b().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleSaveState = ((dwi) entry.getValue()).a().saveState();
            if (!bundleSaveState.isEmpty()) {
                ghf.a(bundleJ, str, bundleSaveState);
            }
        }
        this.c = false;
        return bundleJ;
    }
}
