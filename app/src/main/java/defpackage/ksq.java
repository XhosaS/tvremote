package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class ksq implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ kst c;

    public ksq(kst kstVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = kstVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        kst kstVar = this.c;
        kstVar.g();
        String str = this.a;
        kkk.h(str);
        long j = this.b;
        Map map = kstVar.b;
        if (map.isEmpty()) {
            kstVar.c = j;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        if (((wx) map).d < 100) {
            map.put(str, 1);
            kstVar.a.put(str, Long.valueOf(j));
        } else {
            lbk lbkVar = kstVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.a("Too many ads visible");
        }
    }
}
