package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewm implements ezt {
    public final efw b;
    public long c;
    public fel e;
    public boolean f;
    final /* synthetic */ ewp g;
    private final Uri h;
    private final fdr i;
    private volatile boolean j;
    private final eux l;
    private final shx n;
    private final rsj m = new rsj();
    private boolean k = true;
    public final long a = evq.a();
    public eey d = b(0);

    public ewm(ewp ewpVar, Uri uri, ees eesVar, eux euxVar, fdr fdrVar, shx shxVar) {
        this.g = ewpVar;
        this.h = uri;
        this.b = new efw(eesVar);
        this.l = euxVar;
        this.i = fdrVar;
        this.n = shxVar;
    }

    private final eey b(long j) {
        eex eexVar = new eex();
        eexVar.a = this.h;
        eexVar.f = j;
        eexVar.h = this.g.c;
        eexVar.i = 6;
        eexVar.e = ewp.a;
        return eexVar.a();
    }

    public final void a(long j, long j2) {
        this.m.a = j;
        this.c = j2;
        this.k = true;
        this.f = false;
    }

    @Override // defpackage.ezt
    public final void c() {
        this.j = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:13|(2:15|16)|17|18|(5:20|121|21|22|(16:24|25|123|33|(1:35)(1:36)|37|(1:39)(1:40)|41|(1:43)(1:44)|45|(1:47)(1:48)|49|(4:51|115|52|(14:54|55|(1:62)|63|(1:68)(1:67)|69|(1:76)|77|(1:79)|80|(1:(3:129|82|(5:127|84|85|(3:137|87|140)(1:139)|138)(2:136|90))(1:135))|(3:95|(1:97)|98)|99|(2:133|141)(1:134))(6:117|56|60|(0)|63|(11:65|68|69|(3:71|74|76)|77|(0)|80|(2:(0)(0)|138)|(0)|99|(0)(0))(0)))(4:60|(0)|63|(0)(0))|(2:107|(1:109))|110|111)(3:26|119|27))(1:31)|32|123|33|(0)(0)|37|(0)(0)|41|(0)(0)|45|(0)(0)|49|(0)(0)|(0)|110|111) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[LOOP:0: B:3:0x0004->B:134:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c2 A[EDGE_INSN: B:135:0x01c2->B:93:0x01c2 BREAK  A[LOOP:1: B:81:0x0184->B:138:0x0184], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1 A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:33:0x0096, B:35:0x00a1, B:37:0x00ad, B:39:0x00b7, B:41:0x00c3, B:43:0x00cd, B:45:0x00d9, B:47:0x00e3, B:49:0x00f5, B:51:0x00ff, B:52:0x0105, B:62:0x0128, B:63:0x012f, B:65:0x0139, B:67:0x013d, B:69:0x0155, B:71:0x0166, B:74:0x016b, B:76:0x016f, B:77:0x0173, B:79:0x0177, B:56:0x010f, B:59:0x0118, B:27:0x0075, B:30:0x0082), top: B:123:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7 A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:33:0x0096, B:35:0x00a1, B:37:0x00ad, B:39:0x00b7, B:41:0x00c3, B:43:0x00cd, B:45:0x00d9, B:47:0x00e3, B:49:0x00f5, B:51:0x00ff, B:52:0x0105, B:62:0x0128, B:63:0x012f, B:65:0x0139, B:67:0x013d, B:69:0x0155, B:71:0x0166, B:74:0x016b, B:76:0x016f, B:77:0x0173, B:79:0x0177, B:56:0x010f, B:59:0x0118, B:27:0x0075, B:30:0x0082), top: B:123:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:33:0x0096, B:35:0x00a1, B:37:0x00ad, B:39:0x00b7, B:41:0x00c3, B:43:0x00cd, B:45:0x00d9, B:47:0x00e3, B:49:0x00f5, B:51:0x00ff, B:52:0x0105, B:62:0x0128, B:63:0x012f, B:65:0x0139, B:67:0x013d, B:69:0x0155, B:71:0x0166, B:74:0x016b, B:76:0x016f, B:77:0x0173, B:79:0x0177, B:56:0x010f, B:59:0x0118, B:27:0x0075, B:30:0x0082), top: B:123:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3 A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:33:0x0096, B:35:0x00a1, B:37:0x00ad, B:39:0x00b7, B:41:0x00c3, B:43:0x00cd, B:45:0x00d9, B:47:0x00e3, B:49:0x00f5, B:51:0x00ff, B:52:0x0105, B:62:0x0128, B:63:0x012f, B:65:0x0139, B:67:0x013d, B:69:0x0155, B:71:0x0166, B:74:0x016b, B:76:0x016f, B:77:0x0173, B:79:0x0177, B:56:0x010f, B:59:0x0118, B:27:0x0075, B:30:0x0082), top: B:123:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff A[Catch: all -> 0x01dc, TRY_LEAVE, TryCatch #4 {all -> 0x01dc, blocks: (B:33:0x0096, B:35:0x00a1, B:37:0x00ad, B:39:0x00b7, B:41:0x00c3, B:43:0x00cd, B:45:0x00d9, B:47:0x00e3, B:49:0x00f5, B:51:0x00ff, B:52:0x0105, B:62:0x0128, B:63:0x012f, B:65:0x0139, B:67:0x013d, B:69:0x0155, B:71:0x0166, B:74:0x016b, B:76:0x016f, B:77:0x0173, B:79:0x0177, B:56:0x010f, B:59:0x0118, B:27:0x0075, B:30:0x0082), top: B:123:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128 A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:33:0x0096, B:35:0x00a1, B:37:0x00ad, B:39:0x00b7, B:41:0x00c3, B:43:0x00cd, B:45:0x00d9, B:47:0x00e3, B:49:0x00f5, B:51:0x00ff, B:52:0x0105, B:62:0x0128, B:63:0x012f, B:65:0x0139, B:67:0x013d, B:69:0x0155, B:71:0x0166, B:74:0x016b, B:76:0x016f, B:77:0x0173, B:79:0x0177, B:56:0x010f, B:59:0x0118, B:27:0x0075, B:30:0x0082), top: B:123:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139 A[Catch: all -> 0x01dc, TryCatch #4 {all -> 0x01dc, blocks: (B:33:0x0096, B:35:0x00a1, B:37:0x00ad, B:39:0x00b7, B:41:0x00c3, B:43:0x00cd, B:45:0x00d9, B:47:0x00e3, B:49:0x00f5, B:51:0x00ff, B:52:0x0105, B:62:0x0128, B:63:0x012f, B:65:0x0139, B:67:0x013d, B:69:0x0155, B:71:0x0166, B:74:0x016b, B:76:0x016f, B:77:0x0173, B:79:0x0177, B:56:0x010f, B:59:0x0118, B:27:0x0075, B:30:0x0082), top: B:123:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177 A[Catch: all -> 0x01dc, TRY_LEAVE, TryCatch #4 {all -> 0x01dc, blocks: (B:33:0x0096, B:35:0x00a1, B:37:0x00ad, B:39:0x00b7, B:41:0x00c3, B:43:0x00cd, B:45:0x00d9, B:47:0x00e3, B:49:0x00f5, B:51:0x00ff, B:52:0x0105, B:62:0x0128, B:63:0x012f, B:65:0x0139, B:67:0x013d, B:69:0x0155, B:71:0x0166, B:74:0x016b, B:76:0x016f, B:77:0x0173, B:79:0x0177, B:56:0x010f, B:59:0x0118, B:27:0x0075, B:30:0x0082), top: B:123:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c5  */
    /* JADX WARN: Type inference failed for: r10v2, types: [fdp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [fdq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [fdp, java.lang.Object] */
    @Override // defpackage.ezt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewm.e():void");
    }
}
