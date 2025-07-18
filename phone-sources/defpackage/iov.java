package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iov implements yow {
    private final ilf b;
    private final ilk c;
    private final ieh d;
    private final lie e;
    private final ino f;
    private final izo g;
    private final ihi h;
    private final yow i;
    private final kdj k;
    private final Set j = new LinkedHashSet();
    public final ysn a = vyf.T(this, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, new aki(this, (yih) null, 16), 13);

    public iov(kdj kdjVar, ilf ilfVar, ilk ilkVar, ieh iehVar, lie lieVar, ino inoVar, izo izoVar, ihi ihiVar, yow yowVar) {
        this.k = kdjVar;
        this.b = ilfVar;
        this.c = ilkVar;
        this.d = iehVar;
        this.e = lieVar;
        this.f = inoVar;
        this.g = izoVar;
        this.h = ihiVar;
        this.i = yowVar;
    }

    private final String g() {
        return ((ksn) ((ldy) this.d).a().g()).a;
    }

    private final synchronized List h() {
        return yfm.ak(this.j, 50);
    }

    private final synchronized void i(List list) {
        this.j.removeAll(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, java.util.List r10, defpackage.yih r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iov.a(long, java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[Catch: Exception -> 0x003f, TryCatch #1 {Exception -> 0x003f, blocks: (B:20:0x003a, B:35:0x00b0, B:36:0x00c0, B:38:0x00c6, B:40:0x00d1, B:41:0x00d5, B:42:0x00e4, B:44:0x00ea, B:46:0x00f4, B:48:0x00fb, B:47:0x00f9, B:49:0x0102), top: B:63:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea A[Catch: Exception -> 0x003f, TryCatch #1 {Exception -> 0x003f, blocks: (B:20:0x003a, B:35:0x00b0, B:36:0x00c0, B:38:0x00c6, B:40:0x00d1, B:41:0x00d5, B:42:0x00e4, B:44:0x00ea, B:46:0x00f4, B:48:0x00fb, B:47:0x00f9, B:49:0x0102), top: B:63:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [iov] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iov.b(yih):java.lang.Object");
    }

    @Override // defpackage.yow
    public final yil c() {
        return ((ywq) this.i).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113 A[PHI: r0 r4
  0x0113: PHI (r0v13 java.lang.Object) = (r0v12 java.lang.Object), (r0v1 java.lang.Object) binds: [B:60:0x0111, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r4v11 java.util.List) = (r4v22 java.util.List), (r4v23 java.util.List) binds: [B:60:0x0111, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r17, defpackage.yih r18) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iov.d(java.util.List, yih):java.lang.Object");
    }

    public final synchronized void e(List list) {
        this.j.addAll(list);
    }

    public final synchronized boolean f() {
        return !this.j.isEmpty();
    }
}
