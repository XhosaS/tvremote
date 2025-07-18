package defpackage;

import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aahv implements aahs {
    public static volatile aahs a;
    final kqv b;

    public aahv(kqv kqvVar) {
        kkk.k(kqvVar);
        this.b = kqvVar;
        new ConcurrentHashMap();
    }

    @Override // defpackage.aahs
    public final void a(String str, Bundle bundle) {
        if (aahx.a() && !aahx.a.contains(str)) {
            yyk yykVar = aahx.b;
            int i = ((zcg) yykVar).d;
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                boolean zContainsKey = bundle.containsKey((String) yykVar.get(i3));
                i3++;
                if (zContainsKey) {
                    return;
                }
            }
            if ("_cmp".equals(str)) {
                if (!aahx.a()) {
                    return;
                }
                while (i2 < i) {
                    boolean zContainsKey2 = bundle.containsKey((String) yykVar.get(i2));
                    i2++;
                    if (zContainsKey2) {
                        return;
                    }
                }
                bundle.putString("_cis", "fcm_integration");
            }
            this.b.a.d("fcm", str, bundle);
        }
    }

    @Override // defpackage.aahs
    public final void b(Object obj) {
        if (aahx.a()) {
            ksp kspVar = this.b.a;
            kspVar.c(new krm(kspVar, obj));
        }
    }
}
