package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public abstract class u extends CountedCompleter {
    public final InterfaceC0025k a;
    public final int b;

    public u(InterfaceC0025k interfaceC0025k) {
        this.a = interfaceC0025k;
        this.b = 0;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        u tVar = this;
        while (tVar.a.g() != 0) {
            tVar.setPendingCount(tVar.a.g() - 1);
            int i = 0;
            int iCount = 0;
            while (i < tVar.a.g() - 1) {
                t tVar2 = (t) tVar;
                t tVar3 = new t(tVar2, tVar2.a.f(i), tVar.b + iCount);
                iCount = (int) (tVar3.a.count() + iCount);
                tVar3.fork();
                i++;
            }
            int i2 = tVar.b + iCount;
            t tVar4 = (t) tVar;
            tVar = new t(tVar4, tVar4.a.f(i), i2);
        }
        t tVar5 = (t) tVar;
        tVar5.a.a(tVar5.c, tVar5.b);
        tVar.propagateCompletion();
    }

    public u(t tVar, InterfaceC0025k interfaceC0025k, int i) {
        super(tVar);
        this.a = interfaceC0025k;
        this.b = i;
    }
}
