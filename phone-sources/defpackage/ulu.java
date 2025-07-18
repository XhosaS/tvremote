package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ulu extends ulw {
    private final unj a;
    private final kwy b;

    public ulu(unj unjVar, kwy kwyVar) {
        this.a = unjVar;
        this.b = kwyVar;
    }

    @Override // defpackage.ulw
    public final void a(Status status, ulq ulqVar) {
        Bundle bundle;
        ujh ujhVar;
        ocv.aS(status, ulqVar == null ? null : new ulp(ulqVar), this.b);
        if (ulqVar == null || (bundle = ulqVar.a().getBundle("scionData")) == null || bundle.keySet() == null || (ujhVar = (ujh) this.a.a()) == null) {
            return;
        }
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            bundle.getBundle(it.next());
            ujhVar.a();
        }
    }
}
