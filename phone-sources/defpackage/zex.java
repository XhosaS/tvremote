package defpackage;

import java.io.Closeable;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zex implements Closeable {
    public static final Logger a;
    public final zgm b;
    private final zew c;
    private final zeb d;

    static {
        Logger logger = Logger.getLogger(zee.class.getName());
        logger.getClass();
        a = logger;
    }

    public zex(zgm zgmVar) {
        zgmVar.getClass();
        this.b = zgmVar;
        zew zewVar = new zew(zgmVar);
        this.c = zewVar;
        this.d = new zeb(zewVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        throw new java.io.IOException("Header index too large " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List b(int r2, int r3, int r4, int r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zex.b(int, int, int, int):java.util.List");
    }

    private final void c() {
        zgm zgmVar = this.b;
        zgmVar.f();
        zgmVar.d();
        byte[] bArr = zcr.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x024f, code lost:
    
        throw new java.io.IOException(defpackage.a.cf(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04cb, code lost:
    
        if (r21 == 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04cd, code lost:
    
        r0.e(defpackage.zcr.b, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r21, defpackage.zem r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zex.a(boolean, zem):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
