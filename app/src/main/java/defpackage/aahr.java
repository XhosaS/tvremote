package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aahr implements lep {
    final /* synthetic */ ksp a;

    public aahr(ksp kspVar) {
        this.a = kspVar;
    }

    @Override // defpackage.lep
    public final int a(String str) {
        kqw kqwVar = new kqw();
        ksp kspVar = this.a;
        kspVar.c(new kse(kspVar, str, kqwVar));
        Integer num = (Integer) kqwVar.d(kqwVar.c(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.lep
    public final long b() {
        kqw kqwVar = new kqw();
        ksp kspVar = this.a;
        kspVar.c(new kry(kspVar, kqwVar));
        Long l = (Long) kqwVar.d(kqwVar.c(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = kspVar.d + 1;
        kspVar.d = i;
        return jNextLong + i;
    }

    @Override // defpackage.lep
    public final String c() {
        kqw kqwVar = new kqw();
        ksp kspVar = this.a;
        kspVar.c(new krx(kspVar, kqwVar));
        return kqwVar.e(50L);
    }

    @Override // defpackage.lep
    public final String d() {
        kqw kqwVar = new kqw();
        ksp kspVar = this.a;
        kspVar.c(new ksa(kspVar, kqwVar));
        return kqwVar.e(500L);
    }

    @Override // defpackage.lep
    public final String e() {
        kqw kqwVar = new kqw();
        ksp kspVar = this.a;
        kspVar.c(new krz(kspVar, kqwVar));
        return kqwVar.e(500L);
    }

    @Override // defpackage.lep
    public final String f() {
        kqw kqwVar = new kqw();
        ksp kspVar = this.a;
        kspVar.c(new krw(kspVar, kqwVar));
        return kqwVar.e(500L);
    }

    @Override // defpackage.lep
    public final List g(String str, String str2) {
        kqw kqwVar = new kqw();
        ksp kspVar = this.a;
        kspVar.c(new krp(kspVar, str, str2, kqwVar));
        List list = (List) kqwVar.d(kqwVar.c(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // defpackage.lep
    public final Map h(String str, String str2, boolean z) {
        kqw kqwVar = new kqw();
        ksp kspVar = this.a;
        kspVar.c(new ksb(kspVar, str, str2, z, kqwVar));
        Bundle bundleC = kqwVar.c(5000L);
        if (bundleC == null || bundleC.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleC.size());
        for (String str3 : bundleC.keySet()) {
            Object obj = bundleC.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // defpackage.lep
    public final void i(String str) {
        ksp kspVar = this.a;
        kspVar.c(new krs(kspVar, str));
    }

    @Override // defpackage.lep
    public final void j(String str, String str2, Bundle bundle) {
        ksp kspVar = this.a;
        kspVar.c(new kro(kspVar, str, str2, bundle));
    }

    @Override // defpackage.lep
    public final void k(String str) {
        ksp kspVar = this.a;
        kspVar.c(new krt(kspVar, str));
    }

    @Override // defpackage.lep
    public final void l(String str, String str2, Bundle bundle) {
        this.a.d(str, str2, bundle);
    }

    @Override // defpackage.lep
    public final void m(Bundle bundle) {
        ksp kspVar = this.a;
        kspVar.c(new krn(kspVar, bundle));
    }
}
