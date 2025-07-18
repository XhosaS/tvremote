package defpackage;

import com.google.apps.tiktok.account.AccountId;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tep {
    public static final zdy a = zdy.h("com/google/android/libraries/search/integrations/calypso/impl/ClientInstanceIdGeneratorImpl");
    public final vrf b;
    public final vrf c;
    public final vjo d;
    public final AccountId e;
    public final zyg f;
    public final ter g;

    public tep(vjo vjoVar, AccountId accountId, zyg zygVar, ter terVar) {
        this.d = vjoVar;
        this.e = accountId;
        this.f = zygVar;
        this.g = terVar;
        zvh zvhVar = new zvh() { // from class: tel
            @Override // defpackage.zvh
            public final zyd a() {
                final ter terVar2 = this.a.g;
                return wzx.g(terVar2.d.eN(wyo.i(new Callable() { // from class: teq
                    public final /* synthetic */ String b = "android_id";

                    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:5:0x001f, B:7:0x0025, B:10:0x002d, B:13:0x003a), top: B:29:0x001f, outer: #0 }] */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object call() {
                        /*
                            r11 = this;
                            java.lang.String r1 = "queryGServices"
                            java.lang.String r2 = "com/google/android/libraries/search/integrations/calypso/impl/GServicesReader"
                            ter r0 = r1
                            java.lang.String r3 = r11.b
                            java.lang.String r4 = "GServicesReader.java"
                            android.content.Context r0 = r0.c     // Catch: java.lang.SecurityException -> L64
                            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.SecurityException -> L64
                            android.net.Uri r6 = defpackage.ter.b     // Catch: java.lang.SecurityException -> L64
                            java.lang.String[] r9 = new java.lang.String[]{r3}     // Catch: java.lang.SecurityException -> L64
                            r10 = 0
                            r7 = 0
                            r8 = 0
                            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.SecurityException -> L64
                            if (r5 == 0) goto L3a
                            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L57
                            if (r0 == 0) goto L3a
                            int r0 = r5.getColumnCount()     // Catch: java.lang.Throwable -> L57
                            r6 = 2
                            if (r0 >= r6) goto L2d
                            goto L3a
                        L2d:
                            r0 = 1
                            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L57
                            j$.util.Optional r0 = j$.util.Optional.ofNullable(r0)     // Catch: java.lang.Throwable -> L57
                        L36:
                            r5.close()     // Catch: java.lang.SecurityException -> L64
                            return r0
                        L3a:
                            zdy r0 = defpackage.ter.a     // Catch: java.lang.Throwable -> L57
                            zeo r0 = r0.d()     // Catch: java.lang.Throwable -> L57
                            zdv r0 = (defpackage.zdv) r0     // Catch: java.lang.Throwable -> L57
                            r6 = 46
                            zeo r0 = r0.q(r2, r1, r6, r4)     // Catch: java.lang.Throwable -> L57
                            zdv r0 = (defpackage.zdv) r0     // Catch: java.lang.Throwable -> L57
                            java.lang.String r6 = "Failed to query key %s"
                            r0.x(r6, r3)     // Catch: java.lang.Throwable -> L57
                            j$.util.Optional r0 = j$.util.Optional.empty()     // Catch: java.lang.Throwable -> L57
                            if (r5 == 0) goto L56
                            goto L36
                        L56:
                            return r0
                        L57:
                            r0 = move-exception
                            r6 = r0
                            if (r5 == 0) goto L63
                            r5.close()     // Catch: java.lang.Throwable -> L5f
                            goto L63
                        L5f:
                            r0 = move-exception
                            r6.addSuppressed(r0)     // Catch: java.lang.SecurityException -> L64
                        L63:
                            throw r6     // Catch: java.lang.SecurityException -> L64
                        L64:
                            r0 = move-exception
                            zdy r5 = defpackage.ter.a
                            zeo r5 = r5.c()
                            zdv r5 = (defpackage.zdv) r5
                            zeo r0 = r5.p(r0)
                            zdv r0 = (defpackage.zdv) r0
                            r5 = 53
                            zeo r0 = r0.q(r2, r1, r5, r4)
                            zdv r0 = (defpackage.zdv) r0
                            java.lang.String r1 = "Error querying key %s"
                            r0.x(r1, r3)
                            j$.util.Optional r0 = j$.util.Optional.empty()
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.teq.call():java.lang.Object");
                    }
                }))).h(new yqi() { // from class: teo
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        String str = (String) ((Optional) obj).orElse(null);
                        return Optional.ofNullable(str != null ? String.format(Locale.US, "%016x", Long.valueOf(Long.parseLong(str) & (-2))) : null);
                    }
                }, zwk.a);
            }
        };
        zwk zwkVar = zwk.a;
        this.c = new vrf(zvhVar, zwkVar);
        this.b = new vrf(new zvh() { // from class: tem
            @Override // defpackage.zvh
            public final zyd a() {
                tep tepVar = this.a;
                final zyd zydVarB = tepVar.d.b(tepVar.e);
                final zyd zydVarB2 = tepVar.c.b();
                return wzx.g(wzz.a(zydVarB, zydVarB2).a.a(new Callable() { // from class: ten
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String str = (String) zxn.o(zydVarB);
                        Optional optional = (Optional) zxn.o(zydVarB2);
                        if (str == null) {
                            ((zdv) ((zdv) tep.a.d()).q("com/google/android/libraries/search/integrations/calypso/impl/ClientInstanceIdGeneratorImpl", "calculateClientInstanceId", 102, "ClientInstanceIdGeneratorImpl.java")).u("Couldn't calculate ClientInstanceId, no account name");
                        }
                        if (optional.isEmpty()) {
                            ((zdv) ((zdv) tep.a.d()).q("com/google/android/libraries/search/integrations/calypso/impl/ClientInstanceIdGeneratorImpl", "calculateClientInstanceId", 106, "ClientInstanceIdGeneratorImpl.java")).u("Couldn't calculate ClientInstanceId, no AndroidId");
                            return Optional.empty();
                        }
                        try {
                            String strA = mct.a(str, (String) optional.get());
                            if (strA != null) {
                                return Optional.of(strA);
                            }
                        } catch (Exception e) {
                            ((zdv) ((zdv) ((zdv) tep.a.c()).p(e)).q("com/google/android/libraries/search/integrations/calypso/impl/ClientInstanceIdGeneratorImpl", "calculateClientInstanceId", 'v', "ClientInstanceIdGeneratorImpl.java")).u("Couldn't calculate ClientInstanceId");
                        }
                        return Optional.empty();
                    }
                }, tepVar.f));
            }
        }, zwkVar);
    }
}
