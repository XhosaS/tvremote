package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwm extends Exception {
    private final ir a;

    public nwm(ir irVar) {
        this.a = irVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        ir irVar = this.a;
        boolean z = true;
        for (nxn nxnVar : irVar.keySet()) {
            nve nveVar = (nve) irVar.get(nxnVar);
            ocv.aF(nveVar);
            z &= !nveVar.c();
            arrayList.add(nxnVar.a() + ": " + nveVar.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
