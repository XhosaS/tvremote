package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atl {
    private static final byl b = byl.b('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List listD = b.d(str);
        if (listD.size() == 3) {
            return (String) listD.get(0);
        }
        ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 56, "HashingNameSanitizer.java")).t("malformed sync name: %s", str);
        return "MALFORMED";
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.cws b(defpackage.atk r17, defpackage.cws r18) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atl.b(atk, cws):cws");
    }

    final cws c(cws cwsVar) {
        cwn cwnVar = cwsVar.e;
        if (cwnVar == null) {
            cwnVar = cwn.a;
        }
        if ((cwnVar.b & 1) == 0) {
            return cwsVar;
        }
        cwn cwnVar2 = cwsVar.e;
        if (cwnVar2 == null) {
            cwnVar2 = cwn.a;
        }
        clo cloVar = (clo) cwnVar2.a(5, null);
        cloVar.n(cwnVar2);
        Long l = (Long) this.a.get(Long.valueOf(((cwn) cloVar.b).c));
        l.getClass();
        clo cloVar2 = (clo) cwsVar.a(5, null);
        cloVar2.n(cwsVar);
        long jLongValue = l.longValue();
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        cwn cwnVar3 = (cwn) cloVar.b;
        cwnVar3.b |= 1;
        cwnVar3.c = jLongValue;
        if (!cloVar2.b.A()) {
            cloVar2.l();
        }
        cws cwsVar2 = (cws) cloVar2.b;
        cwn cwnVar4 = (cwn) cloVar.i();
        cwnVar4.getClass();
        cwsVar2.e = cwnVar4;
        cwsVar2.b |= 4;
        return (cws) cloVar2.i();
    }
}
