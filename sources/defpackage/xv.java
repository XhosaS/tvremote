package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xv implements abj {
    public boolean a;
    public Bundle b;
    public final adx c;
    private final cry d;

    public xv(adx adxVar, yc ycVar) {
        this.c = adxVar;
        this.d = new csc(new kh(ycVar, 3));
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [abj, java.lang.Object] */
    @Override // defpackage.abj
    public final Bundle a() {
        Bundle bundleD = mo.D((csa[]) Arrays.copyOf(new csa[0], 0));
        Bundle bundle = this.b;
        if (bundle != null) {
            bundleD.putAll(bundle);
        }
        for (Map.Entry entry : b().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((auf) ((asv) entry.getValue()).a).e.a();
            if (!bundleA.isEmpty()) {
                abl.a(bundleD, str, bundleA);
            }
        }
        this.a = false;
        return bundleD;
    }

    public final xw b() {
        return (xw) this.d.a();
    }
}
