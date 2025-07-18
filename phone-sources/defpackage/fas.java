package defpackage;

import android.os.SystemClock;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fas implements faf {
    private final ArrayDeque a;
    private final far b;
    private double c;
    private double d;

    public fas() {
        this(new fap(10L, 0));
    }

    @Override // defpackage.faf
    public final long a() {
        if (this.a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.c / this.d);
    }

    @Override // defpackage.faf
    public final void b(long j, long j2) {
        while (true) {
            far farVar = this.b;
            ArrayDeque arrayDeque = this.a;
            if (!farVar.a(arrayDeque)) {
                faq faqVar = new faq((j * 8000000) / j2, Math.sqrt(j), SystemClock.elapsedRealtime());
                arrayDeque.add(faqVar);
                double d = this.c;
                long j3 = faqVar.a;
                double d2 = faqVar.b;
                this.c = d + (j3 * d2);
                this.d += d2;
                return;
            }
            faq faqVar2 = (faq) arrayDeque.remove();
            double d3 = this.c;
            double d4 = faqVar2.a;
            double d5 = faqVar2.b;
            this.c = d3 - (d4 * d5);
            this.d -= d5;
        }
    }

    @Override // defpackage.faf
    public final void c() {
        this.a.clear();
        this.c = 0.0d;
        this.d = 0.0d;
    }

    public fas(far farVar) {
        this.a = new ArrayDeque();
        this.b = farVar;
    }
}
