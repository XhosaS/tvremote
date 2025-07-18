package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yei implements Closeable {
    public final zgm a;
    public final yed b;
    private final yeg c;

    public yei(zgm zgmVar) {
        this.a = zgmVar;
        yeg yegVar = new yeg(zgmVar);
        this.c = yegVar;
        this.b = new yed(yegVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        throw new java.io.IOException("Header index too large " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(int r2, short r3, byte r4, int r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yei.a(int, short, byte, int):java.util.List");
    }

    public final void b() {
        zgm zgmVar = this.a;
        zgmVar.f();
        zgmVar.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
