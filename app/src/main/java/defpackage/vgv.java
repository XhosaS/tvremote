package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgv implements bbv {
    public final vrn a;
    public vgf b;
    private final wit c;
    private final List d;

    public vgv(wit witVar) {
        witVar.getClass();
        this.c = witVar;
        this.a = new vrn("KeepStateCallbacksHandler");
        this.d = new ArrayList();
        witVar.ek().b(this);
        witVar.en().a("tiktok_keep_state_callback_handler", new bqn() { // from class: vgu
            @Override // defpackage.bqn
            public final Bundle a() {
                Bundle bundle = new Bundle();
                vgv vgvVar = this.a;
                vgvVar.a.b(bundle);
                vgf vgfVar = vgvVar.b;
                if (vgfVar != null) {
                    bundle.putInt("KSCH$AC$callbacks_id", vgfVar.a);
                    bundle.putInt("KSCH$AC$callbacks_state", vgfVar.b);
                }
                return bundle;
            }
        });
    }

    @Override // defpackage.bbv
    public final void eY(bcl bclVar) {
        wit witVar = this.c;
        vgf vgfVar = null;
        Bundle bundleA = witVar.en().a.c ? witVar.en().a.a("tiktok_keep_state_callback_handler") : null;
        if (bundleA != null) {
            this.a.a(bundleA);
            if (bundleA.containsKey("KSCH$AC$callbacks_id")) {
                if (!bundleA.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
                vgfVar = new vgf(bundleA.getInt("KSCH$AC$callbacks_id"), bundleA.getInt("KSCH$AC$callbacks_state"));
            } else if (bundleA.containsKey("KSCH$AC$callbacks_state")) {
                throw new IllegalStateException("Check failed.");
            }
            this.b = vgfVar;
        }
        List<vgt> list = this.d;
        for (vgt vgtVar : list) {
            vrn vrnVar = this.a;
            uea.c();
            Class<?> cls = vgtVar.getClass();
            we weVar = vrnVar.c;
            if (weVar.containsKey(cls)) {
                Integer num = (Integer) weVar.get(cls);
                num.intValue();
                yqw.R(vrnVar.b.put(num, vgtVar) == null, "Attempted to register the callback class %s twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", cls);
            } else {
                Integer numValueOf = Integer.valueOf(vrn.a.getAndIncrement());
                weVar.put(cls, numValueOf);
                vrnVar.b.put(numValueOf, vgtVar);
            }
        }
        list.clear();
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void b(bcl bclVar) {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void c(bcl bclVar) {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void d(bcl bclVar) {
    }
}
