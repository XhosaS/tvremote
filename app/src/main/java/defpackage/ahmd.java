package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahmd extends ahkx implements ahed {
    private final agzw a;
    public final long d;

    public ahmd(long j, ahmd ahmdVar, int i) {
        super(ahmdVar);
        this.d = j;
        this.a = new agzw(i << 16, agzz.a);
    }

    public abstract int a();

    public abstract void i(int i);

    @Override // defpackage.ahkx
    public final boolean m() {
        return this.a.c == a() && !n();
    }

    public final void o() {
        if (agzw.a.incrementAndGet(this.a) == a()) {
            l();
        }
    }

    public final boolean p() {
        return agzw.a.addAndGet(this.a, -65536) == a() && !n();
    }

    public final boolean q() {
        agzw agzwVar;
        int i;
        do {
            agzwVar = this.a;
            i = agzwVar.c;
            if (i == a() && !n()) {
                return false;
            }
        } while (!agzwVar.a(i, 65536 + i));
        return true;
    }
}
