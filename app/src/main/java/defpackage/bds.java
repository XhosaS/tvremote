package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bds {
    public static final bes a = new bdp();
    public static final bes b = new bdq();
    public static final bes c = new bdr();

    public static final bdl a(bet betVar) {
        bqs bqsVar = (bqs) betVar.a(a);
        if (bqsVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        bem bemVar = (bem) betVar.a(b);
        if (bemVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) betVar.a(c);
        String str = (String) betVar.a(bek.a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        bqn bqnVarC = bqsVar.en().c();
        Bundle bundle2 = null;
        bdu bduVar = bqnVarC instanceof bdu ? (bdu) bqnVarC : null;
        if (bduVar == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        Map map = b(bemVar).a;
        bdl bdlVar = (bdl) map.get(str);
        if (bdlVar != null) {
            return bdlVar;
        }
        bdk bdkVar = bdl.a;
        bduVar.b();
        Bundle bundle3 = bduVar.a;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = ado.a((agpi[]) Arrays.copyOf(new agpi[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                bduVar.a = null;
            }
            bundle2 = bundle4;
        }
        bdl bdlVarA = bdkVar.a(bundle2, bundle);
        map.put(str, bdlVarA);
        return bdlVarA;
    }

    public static final bdv b(bem bemVar) {
        bdo bdoVar = new bdo();
        bet betVarB = bfa.a.b(bemVar);
        betVarB.getClass();
        bek bekVar = new bek(bemVar.el(), bdoVar, betVarB);
        agwj agwjVar = agwi.a;
        return (bdv) bekVar.b.a(new agvq(bdv.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void c(bqs bqsVar) {
        bcf bcfVarA = bqsVar.ek().a();
        if (bcfVarA != bcf.b && bcfVarA != bcf.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (bqsVar.en().c() == null) {
            bdu bduVar = new bdu(bqsVar.en(), (bem) bqsVar);
            bqsVar.en().a("androidx.lifecycle.internal.SavedStateHandlesProvider", bduVar);
            bqsVar.ek().b(new bdm(bduVar));
        }
    }
}
