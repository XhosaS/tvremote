package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfh extends dvs {
    public final gex g;
    public final yil i;
    private final gen j;
    private final yjv m;
    private final ghd n;
    public final AtomicBoolean h = new AtomicBoolean(true);
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final AtomicBoolean l = new AtomicBoolean(false);

    public gfh(gex gexVar, ghd ghdVar, String[] strArr, yjv yjvVar) {
        this.g = gexVar;
        this.n = ghdVar;
        this.j = new gff(strArr, this);
        this.i = gexVar.s() ? gexVar.k() : yim.a;
        this.m = yjvVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.dvs
    protected final void f() {
        this.n.b.add(this);
        ykr.q(this.g.l(), this.i, 0, new btr(this, (yih) null, 19, (byte[]) null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.dvs
    protected final void g() {
        this.n.b.remove(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[Catch: all -> 0x002c, Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x002f, blocks: (B:12:0x0027, B:40:0x00b8), top: B:59:0x0027, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #2 {all -> 0x002c, blocks: (B:12:0x0027, B:38:0x00b0, B:40:0x00b8, B:47:0x00d3, B:44:0x00c9, B:45:0x00d0), top: B:59:0x0027, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ae -> B:38:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e2 -> B:52:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.yih r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfh.n(yih):java.lang.Object");
    }
}
