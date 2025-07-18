package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rte {
    public int a;
    public tst b;
    public byte c;
    public int d;

    public rte() {
        throw null;
    }

    public final rtf a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            rtf rtfVar = new rtf(i, this.a, this.b);
            sij.o(true, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
            return rtfVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = true != z ? 2 : 3;
    }

    public rte(byte[] bArr) {
        this.b = trk.a;
    }
}
