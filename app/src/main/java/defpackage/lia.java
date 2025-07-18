package defpackage;

import android.content.Intent;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
class lia extends kuj {
    final /* synthetic */ lih b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lia(lih lihVar, lco lcoVar) {
        super(lcoVar);
        this.b = lihVar;
    }

    @Override // defpackage.kuj
    public final void b() {
        lih lihVar = this.b;
        lihVar.aC().g();
        String str = (String) lihVar.p.pollFirst();
        if (str != null) {
            lbk lbkVar = lihVar.l;
            kkk.k(lbkVar);
            lihVar.w = SystemClock.elapsedRealtime();
            lihVar.aB().k.b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            lih.P(lbkVar.a, intent);
        }
        lihVar.O();
    }
}
