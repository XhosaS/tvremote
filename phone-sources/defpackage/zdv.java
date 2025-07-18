package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zdv extends zdu {
    final /* synthetic */ zdy c;
    private final zce d;
    private long e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdv(zdy zdyVar, zce zceVar) {
        super(zdyVar);
        this.c = zdyVar;
        this.d = zceVar;
        this.e = -1L;
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0150, code lost:
    
        r6.b -= r9;
        r24.e = r7;
        r2 = defpackage.ylh.E(r19.p()).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0168, code lost:
    
        if (r24.e < r16) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016e, code lost:
    
        if (r2.length() <= 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0176, code lost:
    
        if (defpackage.ylh.ac(r2, ";") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017c, code lost:
    
        if (r24.e != r16) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017e, code lost:
    
        r24.f = false;
        r0.f = r0.e.b();
        r2 = r0.a;
        r2.getClass();
        r3 = r24.d;
        r0 = r0.f;
        r0.getClass();
        defpackage.zdo.a(r2.f, r3, r0);
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a0, code lost:
    
        if (r24.f == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ed, code lost:
    
        throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + r24.e + r2 + "\"");
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[Catch: NumberFormatException -> 0x01f4, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01f4, blocks: (B:16:0x002d, B:17:0x003a, B:20:0x0056, B:34:0x008d, B:37:0x009e, B:39:0x00a9, B:42:0x00b1, B:52:0x00cd, B:54:0x00d5, B:55:0x00e8, B:56:0x0102, B:46:0x00bc, B:51:0x00c9, B:64:0x012f, B:67:0x013d, B:71:0x0150, B:73:0x016a, B:75:0x0170, B:89:0x01cd, B:90:0x01ed, B:65:0x0139, B:60:0x0109, B:61:0x012a, B:91:0x01ee, B:92:0x01f3, B:31:0x0078, B:32:0x008a), top: B:98:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: NumberFormatException -> 0x01f4, TryCatch #0 {NumberFormatException -> 0x01f4, blocks: (B:16:0x002d, B:17:0x003a, B:20:0x0056, B:34:0x008d, B:37:0x009e, B:39:0x00a9, B:42:0x00b1, B:52:0x00cd, B:54:0x00d5, B:55:0x00e8, B:56:0x0102, B:46:0x00bc, B:51:0x00c9, B:64:0x012f, B:67:0x013d, B:71:0x0150, B:73:0x016a, B:75:0x0170, B:89:0x01cd, B:90:0x01ed, B:65:0x0139, B:60:0x0109, B:61:0x012a, B:91:0x01ee, B:92:0x01f3, B:31:0x0078, B:32:0x008a), top: B:98:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f A[Catch: NumberFormatException -> 0x01f4, TryCatch #0 {NumberFormatException -> 0x01f4, blocks: (B:16:0x002d, B:17:0x003a, B:20:0x0056, B:34:0x008d, B:37:0x009e, B:39:0x00a9, B:42:0x00b1, B:52:0x00cd, B:54:0x00d5, B:55:0x00e8, B:56:0x0102, B:46:0x00bc, B:51:0x00c9, B:64:0x012f, B:67:0x013d, B:71:0x0150, B:73:0x016a, B:75:0x0170, B:89:0x01cd, B:90:0x01ed, B:65:0x0139, B:60:0x0109, B:61:0x012a, B:91:0x01ee, B:92:0x01f3, B:31:0x0078, B:32:0x008a), top: B:98:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139 A[Catch: NumberFormatException -> 0x01f4, TryCatch #0 {NumberFormatException -> 0x01f4, blocks: (B:16:0x002d, B:17:0x003a, B:20:0x0056, B:34:0x008d, B:37:0x009e, B:39:0x00a9, B:42:0x00b1, B:52:0x00cd, B:54:0x00d5, B:55:0x00e8, B:56:0x0102, B:46:0x00bc, B:51:0x00c9, B:64:0x012f, B:67:0x013d, B:71:0x0150, B:73:0x016a, B:75:0x0170, B:89:0x01cd, B:90:0x01ed, B:65:0x0139, B:60:0x0109, B:61:0x012a, B:91:0x01ee, B:92:0x01f3, B:31:0x0078, B:32:0x008a), top: B:98:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008b A[SYNTHETIC] */
    @Override // defpackage.zdu, defpackage.zho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.zgk r25, long r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdv.a(zgk, long):long");
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.f && !zcr.z(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
