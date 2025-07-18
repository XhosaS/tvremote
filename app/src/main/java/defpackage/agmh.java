package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmh {
    final int a;
    final agmi[] b;
    long c;

    public agmh(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new agmi[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new agmi(threadFactory);
        }
    }

    public final agmi a() {
        int i = this.a;
        if (i == 0) {
            return agmj.e;
        }
        agmi[] agmiVarArr = this.b;
        long j = this.c;
        this.c = 1 + j;
        return agmiVarArr[(int) (j % i)];
    }

    public final void b() {
        int i = 0;
        while (true) {
            agmi[] agmiVarArr = this.b;
            if (i >= agmiVarArr.length) {
                return;
            }
            agmiVarArr[i].dispose();
            i++;
        }
    }
}
