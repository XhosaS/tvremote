package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqv {
    public boolean c;
    private final bqs e;
    private final agum f;
    private boolean g;
    private Bundle h;
    public final bqw a = new bqw();
    public final Map b = new LinkedHashMap();
    public boolean d = true;

    public bqv(bqs bqsVar, agum agumVar) {
        this.e = bqsVar;
        this.f = agumVar;
    }

    public final Bundle a(String str) {
        if (!this.c) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.h;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = bundle.containsKey(str) ? bql.a(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            this.h = null;
        }
        return bundleA;
    }

    public final void b() {
        bqs bqsVar = this.e;
        if (bqsVar.ek().a() != bcf.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.g) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        bqq.b(((bqp) this.f).a);
        bqsVar.ek().b(new bcj() { // from class: bqu
            @Override // defpackage.bcj
            public final void a(bcl bclVar, bce bceVar) {
                boolean z;
                bqv bqvVar = this.a;
                if (bceVar == bce.ON_START) {
                    z = true;
                } else if (bceVar != bce.ON_STOP) {
                    return;
                } else {
                    z = false;
                }
                bqvVar.d = z;
            }
        });
        this.g = true;
    }

    public final void c(Bundle bundle) {
        if (!this.g) {
            b();
        }
        bqs bqsVar = this.e;
        if (bqsVar.ek().a().a(bcf.d)) {
            bcf bcfVarA = bqsVar.ek().a();
            Objects.toString(bcfVarA);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(bcfVarA)));
        }
        if (this.c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleA = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleA = bql.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        this.h = bundleA;
        this.c = true;
    }

    public final void d(Bundle bundle) {
        Bundle bundleA = ado.a((agpi[]) Arrays.copyOf(new agpi[0], 0));
        Bundle bundle2 = this.h;
        if (bundle2 != null) {
            bundleA.putAll(bundle2);
        }
        synchronized (this.a) {
            for (Map.Entry entry : this.b.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA2 = ((bqn) entry.getValue()).a();
                str.getClass();
                bundleA.putBundle(str, bundleA2);
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }
}
