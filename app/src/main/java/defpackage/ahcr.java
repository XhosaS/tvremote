package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahcr extends ahbm {
    private long a;
    public agqi d;
    private boolean e;

    private final long e(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public void j() {
        throw null;
    }

    public long k() {
        throw null;
    }

    public final void l(boolean z) {
        long jE = this.a - e(z);
        this.a = jE;
        if (jE > 0) {
            return;
        }
        boolean z2 = ahbx.a;
        if (this.e) {
            j();
        }
    }

    public final void m(ahci ahciVar) {
        agqi agqiVar = this.d;
        if (agqiVar == null) {
            agqiVar = new agqi();
            this.d = agqiVar;
        }
        agqiVar.addLast(ahciVar);
    }

    public final void n(boolean z) {
        this.a += e(z);
        if (z) {
            return;
        }
        this.e = true;
    }

    public final boolean o() {
        return this.a >= e(true);
    }

    public final boolean p() {
        agqi agqiVar = this.d;
        if (agqiVar != null) {
            return agqiVar.isEmpty();
        }
        return true;
    }

    public final boolean q() {
        ahci ahciVar;
        agqi agqiVar = this.d;
        if (agqiVar == null || (ahciVar = (ahci) agqiVar.c()) == null) {
            return false;
        }
        ahciVar.run();
        return true;
    }
}
