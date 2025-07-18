package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class ksr implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ kst c;

    public ksr(kst kstVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = kstVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kst kstVar = this.c;
        kstVar.g();
        String str = this.a;
        kkk.h(str);
        Map map = kstVar.b;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            lbk lbkVar = kstVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        lbk lbkVar2 = kstVar.y;
        lfg lfgVar = lbkVar2.k;
        lbkVar2.n(lfgVar);
        lez lezVarJ = lfgVar.j(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        long j = this.b;
        map.remove(str);
        Map map2 = kstVar.a;
        Long l = (Long) map2.get(str);
        if (l == null) {
            lbk lbkVar3 = kstVar.y;
            lab labVar2 = lbkVar3.f;
            lbkVar3.o(labVar2);
            labVar2.c.a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            map2.remove(str);
            kstVar.d(str, jLongValue, lezVarJ);
        }
        if (map.isEmpty()) {
            long j2 = kstVar.c;
            if (j2 != 0) {
                kstVar.c(j - j2, lezVarJ);
                kstVar.c = 0L;
            } else {
                lbk lbkVar4 = kstVar.y;
                lab labVar3 = lbkVar4.f;
                lbkVar4.o(labVar3);
                labVar3.c.a("First ad exposure time was never set");
            }
        }
    }
}
