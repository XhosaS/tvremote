package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpl {
    final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final uof c = uof.g('/');
    private static final Pattern b = Pattern.compile("^(\\*[a-z]+\\*).*");

    static String a(String str) {
        List listD = c.d(str);
        if (listD.size() == 3) {
            return (String) listD.get(0);
        }
        ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 56, "HashingNameSanitizer.java")).v("malformed sync name: %s", str);
        return "MALFORMED";
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yze b(defpackage.rpk r17, defpackage.yze r18) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpl.b(rpk, yze):yze");
    }

    final yze c(yze yzeVar) {
        yyz yyzVar = yzeVar.e;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        if ((yyzVar.b & 1) == 0) {
            return yzeVar;
        }
        yyz yyzVar2 = yzeVar.e;
        if (yyzVar2 == null) {
            yyzVar2 = yyz.a;
        }
        vtw vtwVar = (vtw) yyzVar2.a(5, null);
        vtwVar.x(yyzVar2);
        Long l = (Long) this.a.get(Long.valueOf(((yyz) vtwVar.b).c));
        l.getClass();
        vtw vtwVar2 = (vtw) yzeVar.a(5, null);
        vtwVar2.x(yzeVar);
        long jLongValue = l.longValue();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        yyz yyzVar3 = (yyz) vtwVar.b;
        yyzVar3.b |= 1;
        yyzVar3.c = jLongValue;
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        yze yzeVar2 = (yze) vtwVar2.b;
        yyz yyzVar4 = (yyz) vtwVar.r();
        yyzVar4.getClass();
        yzeVar2.e = yyzVar4;
        yzeVar2.b |= 4;
        return (yze) vtwVar2.r();
    }
}
