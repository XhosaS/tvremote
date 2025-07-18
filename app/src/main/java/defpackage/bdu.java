package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdu implements bqn {
    public Bundle a;
    private final bqo b;
    private boolean c;
    private final agpc d;

    public bdu(bqo bqoVar, final bem bemVar) {
        this.b = bqoVar;
        this.d = new agpn(new agum() { // from class: bdt
            @Override // defpackage.agum
            public final Object a() {
                return bds.b(bemVar);
            }
        });
    }

    private final bdv c() {
        return (bdv) this.d.a();
    }

    @Override // defpackage.bqn
    public final Bundle a() {
        Bundle bundleA = ado.a((agpi[]) Arrays.copyOf(new agpi[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleA.putAll(bundle);
        }
        for (Map.Entry entry : c().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA2 = beq.a(((bep) ((bdl) entry.getValue()).b.a).a);
            if (!bundleA2.isEmpty()) {
                str.getClass();
                bundleA.putBundle(str, bundleA2);
            }
        }
        this.c = false;
        return bundleA;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        Bundle bundleA = this.b.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleA2 = ado.a((agpi[]) Arrays.copyOf(new agpi[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleA2.putAll(bundle);
        }
        if (bundleA != null) {
            bundleA2.putAll(bundleA);
        }
        this.a = bundleA2;
        this.c = true;
        c();
    }
}
