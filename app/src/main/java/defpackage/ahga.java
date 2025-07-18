package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahga extends ahfj {
    private final int e;
    private final int f;

    public ahga(int i, int i2) {
        super(i);
        this.e = i;
        this.f = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new IllegalArgumentException(a.a(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
            return;
        }
        agwj agwjVar = agwi.a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new agvq(ahfj.class).c() + " instead");
    }

    private final Object A(Object obj) {
        ahfu ahfuVarP;
        int i;
        ahga ahgaVar;
        ahmg ahmgVar = ahfl.d;
        ahfu ahfuVar = (ahfu) this.c.a;
        while (true) {
            long andIncrement = agzx.a.getAndIncrement(this.a);
            long j = 1152921504606846975L & andIncrement;
            boolean zW = super.w(andIncrement, false);
            long j2 = ahfl.b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (ahfuVar.d != j3) {
                ahfuVarP = super.p(j3, ahfuVar);
                if (ahfuVarP != null) {
                    ahgaVar = this;
                    i = i2;
                } else if (zW) {
                    return new ahfr(m());
                }
            } else {
                ahfuVarP = ahfuVar;
                i = i2;
                ahgaVar = this;
            }
            Object obj2 = obj;
            int iA = super.a(ahfuVarP, i, obj2, j, ahmgVar, zW);
            ahfu ahfuVar2 = ahfuVarP;
            ahga ahgaVar2 = ahgaVar;
            ahfuVar = ahfuVar2;
            if (iA == 0) {
                ahfuVar.c.b(null);
                return agpu.a;
            }
            if (iA == 1) {
                return agpu.a;
            }
            if (iA == 2) {
                if (zW) {
                    ahfuVar.o();
                    return new ahfr(m());
                }
                q((ahfuVar.d * j2) + i);
                return agpu.a;
            }
            if (iA == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA == 4) {
                if (j < ahgaVar2.b.c) {
                    ahfuVar.c.b(null);
                }
                return new ahfr(m());
            }
            ahfuVar.c.b(null);
            obj = obj2;
        }
    }

    @Override // defpackage.ahfj, defpackage.ahgh
    public final Object g(Object obj, agsw agswVar) throws Throwable {
        Object objA = A(obj);
        if (!(objA instanceof ahfr)) {
            return agpu.a;
        }
        ahft.b(objA);
        throw m();
    }

    @Override // defpackage.ahfj, defpackage.ahgh
    public final Object i(Object obj) {
        return A(obj);
    }

    @Override // defpackage.ahfj
    protected final boolean z() {
        return this.f == 2;
    }
}
