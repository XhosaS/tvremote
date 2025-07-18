package defpackage;

import android.content.Context;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whc {
    public static final whb a = new whb();
    public final Context b;
    public final rnw c;
    public final Map d;
    public final zyg e;
    public final aehf f;
    public final agow g;
    public final agow h;
    public final boolean i;
    public final Map j;
    private final Map k;

    public whc(Context context, rnw rnwVar, Map map, Map map2, zyg zygVar, aehf aehfVar, agow agowVar, agow agowVar2) {
        context.getClass();
        zygVar.getClass();
        aehfVar.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        this.b = context;
        this.c = rnwVar;
        this.k = map;
        this.d = map2;
        this.e = zygVar;
        this.f = aehfVar;
        this.g = agowVar;
        this.h = agowVar2;
        if (!agqq.y(((yyr) map).keySet(), ((yyr) map2).keySet()).isEmpty()) {
            Set setY = agqq.y(((yyr) map).keySet(), ((yyr) map2).keySet());
            Objects.toString(setY);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(setY.toString()));
        }
        Boolean bool = false;
        bool.getClass();
        this.i = false;
        this.j = rnwVar.a() ? agrj.e(map, map2) : map2;
    }

    public final int a(RandomAccessFile randomAccessFile) throws IOException {
        int i;
        try {
            i = randomAccessFile.readInt();
        } catch (EOFException unused) {
            i = -1;
        } catch (Throwable th) {
            randomAccessFile.seek(0L);
            throw th;
        }
        randomAccessFile.seek(0L);
        return i;
    }

    public final void b(final boolean z) {
        wvx wvxVarE = wzg.e("StartupAfterPackageReplaced");
        try {
            zvh zvhVar = new zvh() { // from class: wgy
                /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[Catch: all -> 0x0095, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0095, blocks: (B:17:0x0060, B:22:0x006b), top: B:46:0x0060, outer: #0 }] */
                @Override // defpackage.zvh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final defpackage.zyd a() throws java.io.IOException {
                    /*
                        r7 = this;
                        whc r0 = r7.a
                        agow r1 = r0.h     // Catch: java.io.IOException -> Laa
                        java.lang.Object r1 = r1.a()     // Catch: java.io.IOException -> Laa
                        r1.getClass()     // Catch: java.io.IOException -> Laa
                        android.content.pm.PackageInfo r1 = (android.content.pm.PackageInfo) r1     // Catch: java.io.IOException -> Laa
                        int r2 = r1.versionCode     // Catch: java.io.IOException -> Laa
                        android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.io.IOException -> Laa
                        if (r1 == 0) goto La2
                        java.lang.String r1 = r1.dataDir     // Catch: java.io.IOException -> Laa
                        if (r1 == 0) goto La2
                        java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> Laa
                        java.lang.String r4 = "files"
                        r3.<init>(r1, r4)     // Catch: java.io.IOException -> Laa
                        java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> Laa
                        java.lang.String r4 = "tiktok"
                        r1.<init>(r3, r4)     // Catch: java.io.IOException -> Laa
                        r1.mkdirs()     // Catch: java.io.IOException -> Laa
                        java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> Laa
                        rnw r4 = r0.c     // Catch: java.io.IOException -> Laa
                        boolean r4 = r4.a()     // Catch: java.io.IOException -> Laa
                        r5 = 0
                        if (r4 == 0) goto L3a
                        whb r4 = defpackage.whc.a     // Catch: java.io.IOException -> Laa
                        java.lang.String r4 = r4.a(r5)     // Catch: java.io.IOException -> Laa
                        goto L44
                    L3a:
                        whb r4 = defpackage.whc.a     // Catch: java.io.IOException -> Laa
                        java.lang.String r6 = defpackage.rnu.b()     // Catch: java.io.IOException -> Laa
                        java.lang.String r4 = r4.a(r6)     // Catch: java.io.IOException -> Laa
                    L44:
                        r3.<init>(r1, r4)     // Catch: java.io.IOException -> Laa
                        boolean r1 = r3.createNewFile()     // Catch: java.io.IOException -> Laa
                        boolean r4 = r3.exists()     // Catch: java.io.IOException -> Laa
                        if (r4 == 0) goto L9a
                        boolean r4 = r3.isFile()     // Catch: java.io.IOException -> Laa
                        if (r4 == 0) goto L9a
                        java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> Laa
                        java.lang.String r6 = "rw"
                        r4.<init>(r3, r6)     // Catch: java.io.IOException -> Laa
                        if (r1 != 0) goto L6b
                        int r1 = r0.a(r4)     // Catch: java.lang.Throwable -> L95
                        if (r2 == r1) goto L67
                        goto L6b
                    L67:
                        r4.close()     // Catch: java.io.IOException -> Laa
                        goto L76
                    L6b:
                        whb r1 = defpackage.whc.a     // Catch: java.lang.Throwable -> L95
                        r3 = -1
                        r1.b(r4, r3)     // Catch: java.lang.Throwable -> L95
                        wha r5 = new wha     // Catch: java.lang.Throwable -> L95
                        r5.<init>()     // Catch: java.lang.Throwable -> L95
                    L76:
                        if (r5 != 0) goto L7b
                        zyd r0 = defpackage.zxy.a     // Catch: java.io.IOException -> Laa
                        return r0
                    L7b:
                        aehf r1 = r0.f     // Catch: java.io.IOException -> Laa
                        java.lang.Object r1 = r1.a()     // Catch: java.io.IOException -> Laa
                        vqi r1 = (defpackage.vqi) r1     // Catch: java.io.IOException -> Laa
                        zyg r2 = r0.e     // Catch: java.io.IOException -> Laa
                        java.util.concurrent.Callable r3 = defpackage.wyo.i(r5)     // Catch: java.io.IOException -> Laa
                        zyd r2 = defpackage.zxn.k(r3, r2)     // Catch: java.io.IOException -> Laa
                        java.lang.String r3 = defpackage.wzg.b()     // Catch: java.io.IOException -> Laa
                        r1.e(r2, r3)     // Catch: java.io.IOException -> Laa
                        return r2
                    L95:
                        r1 = move-exception
                        r4.close()     // Catch: java.io.IOException -> Laa
                        throw r1     // Catch: java.io.IOException -> Laa
                    L9a:
                        java.io.IOException r1 = new java.io.IOException     // Catch: java.io.IOException -> Laa
                        java.lang.String r2 = "Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup."
                        r1.<init>(r2)     // Catch: java.io.IOException -> Laa
                        throw r1     // Catch: java.io.IOException -> Laa
                    La2:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> Laa
                        java.lang.String r2 = "PackageInfo was invalid."
                        r1.<init>(r2)     // Catch: java.io.IOException -> Laa
                        throw r1     // Catch: java.io.IOException -> Laa
                    Laa:
                        r1 = move-exception
                        boolean r2 = r2
                        java.lang.String r3 = "StartupAfterPkgReplaced"
                        if (r2 == 0) goto Lc7
                        android.content.Context r2 = r0.b
                        boolean r4 = defpackage.mhv.h(r2)
                        if (r4 != 0) goto Lbe
                        java.lang.String r4 = "StartupAfterPackageReplaced failed, device was locked. Will reschedule."
                        android.util.Log.w(r3, r4, r1)
                    Lbe:
                        wgz r1 = new wgz
                        r1.<init>()
                        defpackage.mhv.d(r2, r1)
                        goto Lcc
                    Lc7:
                        java.lang.String r0 = "StartupAfterPackageReplaced failed, will try again next startup: "
                        android.util.Log.e(r3, r0, r1)
                    Lcc:
                        zyd r0 = defpackage.zxy.a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.wgy.a():zyd");
                }
            };
            zyd zydVarL = zxn.l(wyo.b(zvhVar), this.e);
            vqi vqiVar = (vqi) this.f.a();
            wvxVarE.a(zydVarL);
            vqiVar.f(zydVarL, 30L, TimeUnit.SECONDS);
            aguc.a(wvxVarE, null);
        } finally {
        }
    }
}
