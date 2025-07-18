package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0151u0 extends CountedCompleter {
    public final H a;
    public final int b;

    public AbstractC0151u0(H h) {
        this.a = h;
        this.b = 0;
    }

    public abstract void a();

    public abstract AbstractC0151u0 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC0151u0 abstractC0151u0B = this;
        while (abstractC0151u0B.a.t() != 0) {
            abstractC0151u0B.setPendingCount(abstractC0151u0B.a.t() - 1);
            int i = 0;
            int iCount = 0;
            while (i < abstractC0151u0B.a.t() - 1) {
                AbstractC0151u0 abstractC0151u0B2 = abstractC0151u0B.b(i, abstractC0151u0B.b + iCount);
                iCount = (int) (abstractC0151u0B2.a.count() + iCount);
                abstractC0151u0B2.fork();
                i++;
            }
            abstractC0151u0B = abstractC0151u0B.b(i, abstractC0151u0B.b + iCount);
        }
        abstractC0151u0B.a();
        abstractC0151u0B.propagateCompletion();
    }

    public AbstractC0151u0(AbstractC0151u0 abstractC0151u0, H h, int i) {
        super(abstractC0151u0);
        this.a = h;
        this.b = i;
    }
}
