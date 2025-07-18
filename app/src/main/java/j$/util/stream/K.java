package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes3.dex */
public abstract class K extends CountedCompleter {
    public final InterfaceC0100s a;
    public final int b;

    public K(InterfaceC0100s interfaceC0100s) {
        this.a = interfaceC0100s;
        this.b = 0;
    }

    public abstract void a();

    public abstract K b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        K kB = this;
        while (kB.a.o() != 0) {
            kB.setPendingCount(kB.a.o() - 1);
            int i = 0;
            int iCount = 0;
            while (i < kB.a.o() - 1) {
                K kB2 = kB.b(i, kB.b + iCount);
                iCount = (int) (kB2.a.count() + iCount);
                kB2.fork();
                i++;
            }
            kB = kB.b(i, kB.b + iCount);
        }
        kB.a();
        kB.propagateCompletion();
    }

    public K(K k, InterfaceC0100s interfaceC0100s, int i) {
        super(k);
        this.a = interfaceC0100s;
        this.b = i;
    }
}
