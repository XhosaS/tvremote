package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdx implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public mdx(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    public static yil c(uhs uhsVar) {
        uhsVar.getClass();
        return new ypx(uhsVar);
    }

    public static yil d(uhs uhsVar) {
        uhsVar.getClass();
        return new ypx(uhsVar);
    }

    public final yil a() {
        switch (this.b) {
            case 0:
                Executor executor = (Executor) this.a.b();
                executor.getClass();
                return ylh.ai(executor);
            case 1:
                Executor executor2 = (Executor) this.a.b();
                executor2.getClass();
                return ylh.ai(executor2);
            case 2:
                Executor executor3 = (Executor) this.a.b();
                executor3.getClass();
                return ylh.ai(executor3);
            case 3:
                return ylh.ai(((kqt) this.a).a());
            case 4:
                return ylh.ai(((kqt) this.a).a());
            case 5:
                return c((uhs) this.a.b());
            case 6:
                uhs uhsVar = (uhs) this.a.b();
                uhsVar.getClass();
                return new ypx(uhsVar);
            default:
                return d((uhs) this.a.b());
        }
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
        }
        return a();
    }
}
