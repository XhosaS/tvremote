package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hx implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;

    public hx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5 A[Catch: all -> 0x00da, TryCatch #3 {, blocks: (B:27:0x0050, B:29:0x0057, B:31:0x0073, B:32:0x0079, B:33:0x0080, B:34:0x0081, B:35:0x008f, B:39:0x0099, B:41:0x00a4, B:42:0x00a9, B:46:0x00b5, B:48:0x00be, B:56:0x00d5, B:52:0x00c4, B:53:0x00c5, B:55:0x00d0, B:60:0x00d9, B:43:0x00aa, B:44:0x00b2, B:36:0x0090, B:37:0x0096), top: B:84:0x0050, inners: #0, #1 }] */
    /* JADX WARN: Type inference failed for: r0v13, types: [ezu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx.run():void");
    }

    public hx(hy hyVar, int i) {
        this.a = i;
        this.b = new WeakReference(hyVar);
    }

    public hx(ic icVar, int i) {
        this.a = i;
        this.b = new WeakReference(icVar);
    }

    public hx(ic icVar, int i, byte[] bArr) {
        this.a = i;
        this.b = new WeakReference(icVar);
    }
}
