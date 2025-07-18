package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdp implements Closeable {
    public final ahwz a;
    public final agdk b;
    private final agdn c;

    public agdp(ahwz ahwzVar) {
        this.a = ahwzVar;
        agdn agdnVar = new agdn(ahwzVar);
        this.c = agdnVar;
        this.b = new agdk(agdnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        throw new java.io.IOException("Header index too large " + r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(int r5, short r6, byte r7, int r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agdp.a(int, short, byte, int):java.util.List");
    }

    public final void b() {
        ahwz ahwzVar = this.a;
        ahwzVar.e();
        ahwzVar.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
