package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfg extends nez {
    private final nfc a;
    private int c = 1;

    public nfg(nfc nfcVar) {
        this.a = nfcVar;
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("seq");
        nfa nfaVar = this.b;
        int i = this.c + 1;
        this.c = i;
        nfaVar.f("seq", Integer.toString(i));
        this.b.g("fexp");
    }

    @Override // defpackage.nez
    protected final void i() {
        long j;
        int i;
        int i2;
        this.b.f("event", "streamingstats");
        nfc nfcVar = this.a;
        this.b.f("ns", nfcVar.c());
        this.b.f("docid", nfcVar.a());
        this.b.f("seq", Integer.toString(this.c));
        for (Long l : nfcVar.d()) {
            nfa nfaVar = this.b;
            long jLongValue = l.longValue();
            int i3 = 1;
            if (jLongValue >= 0) {
                j = -jLongValue;
                i = 0;
            } else {
                j = jLongValue;
                i = 1;
            }
            long j2 = -10;
            while (true) {
                if (i3 >= 19) {
                    i2 = i + 19;
                    break;
                } else if (j > j2) {
                    i2 = i3 + i;
                    break;
                } else {
                    j2 *= 10;
                    i3++;
                }
            }
            nfaVar.c("fexp", i2).append(jLongValue);
        }
    }
}
