package defpackage;

import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.videos.R;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdw {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public mdw(lxp lxpVar, lfn lfnVar, kuw kuwVar, kuw kuwVar2, mbk mbkVar, ksn ksnVar, ImmutableList immutableList, Executor executor, jzs jzsVar) {
        this.d = lxpVar;
        this.c = lfnVar;
        this.g = kuwVar;
        this.h = kuwVar2;
        this.b = mbkVar;
        this.i = ksnVar;
        this.a = immutableList;
        this.e = executor;
        this.f = jzsVar;
    }

    private static final List A(wkc wkcVar, List list) {
        if (yks.e(wkcVar, wkc.a)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((wnu) obj).e <= wkcVar.f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, yil] */
    private final void B(fzx fzxVar, gbk gbkVar) {
        ykr.q(this.h, this.i, 0, new dkg(this, gbkVar, fzxVar, (yih) null, 4), 2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yow] */
    public static final yrz b(mdw mdwVar) {
        yrz yrzVarR = vyf.R(20, 0, 6);
        try {
            ykr.q(mdwVar.b, new yov("receiveChannel"), 0, new kbl(mdwVar, yrzVarR, (yih) null, 15), 2);
            return yrzVarR;
        } catch (CancellationException e) {
            krd.d("ReceiveChannel was cancelled.", e);
            yrzVarR.t(null);
            return yrzVarR;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r11v0, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, lfn] */
    public static void f(kuh kuhVar, lie lieVar, idf idfVar, lrq lrqVar, lfn lfnVar, lyz lyzVar, ContentResolver contentResolver, Executor executor, String str) throws lgq {
        byte[] bArr;
        mdw mdwVar = new mdw(kuhVar, lieVar, idfVar, lrqVar, lfnVar, lyzVar, contentResolver, executor, str);
        try {
            Object obj = mdwVar.i;
            String str2 = ((kuh) obj).b;
            krd.e(a.cr(str2, "Release "));
            kug kugVarT = ktw.t((lyz) mdwVar.d, (kuh) obj);
            if (kugVarT == null || kugVarT.k == null || (bArr = kugVarT.i) == null) {
                mdwVar.z(kugVarT, new lgq("Invalid license data"));
                return;
            }
            try {
                lhe lheVarA = lgn.a(((kuh) obj).a, str2, kugVarT.c ? ksy.h(str2) : ksy.i(str2), bArr, kugVarT.l, true, (lrq) mdwVar.e, mdwVar.b, mdwVar.a, mdwVar.f, (ContentResolver) mdwVar.c, (String) mdwVar.h);
                int i = lheVarA.c;
                int i2 = kugVarT.l;
                if (i2 > 0 && i2 != i) {
                    mdwVar.z(kugVarT, new lgq(a.ce(i, i2, "Security level mismatch: ", ", ")));
                    return;
                }
                try {
                    lheVarA.m(kugVarT.h);
                    mfl mflVar = new mfl();
                    lheVarA.d(kugVarT.j, kugVarT.k, null, mflVar);
                    ieg iegVarA = mflVar.a();
                    if (iegVarA.k()) {
                        mdwVar.z(kugVarT, iegVarA.i().getCause());
                    } else {
                        mfl mflVar2 = new mfl();
                        lheVarA.i(null, mflVar2);
                        ieg iegVarA2 = mflVar2.a();
                        if (iegVarA2.m()) {
                            mdwVar.y(kugVarT);
                        } else {
                            Throwable cause = iegVarA2.i().getCause();
                            if (!kwy.h(cause)) {
                                throw new lgq("License task failed " + mdwVar.i.toString(), cause);
                            }
                            mdwVar.z(kugVarT, cause);
                        }
                    }
                    lheVarA.c();
                    mdwVar.g.D(((kuh) mdwVar.i).b);
                } catch (Throwable th) {
                    lheVarA.c();
                    throw th;
                }
            } catch (eqc e) {
                mdwVar.z(kugVarT, e);
            }
        } catch (Exception e2) {
            throw new lgq("unexpected exception executing task ".concat(String.valueOf(mdwVar.getClass().getSimpleName())), e2);
        }
    }

    private static final void x(mdo mdoVar, CancellationException cancellationException) {
        krd.d(mdoVar.a().concat(" was cancelled."), cancellationException);
        yol yolVar = mdoVar.e;
        yolVar.t(cancellationException);
        yolVar.d(cancellationException);
    }

    private final void y(kug kugVar) {
        ContentValues contentValuesS = ktw.s();
        long j = kugVar == null ? 0L : kugVar.d;
        if (j != 0 && j != Long.MAX_VALUE) {
            contentValuesS.put("expiration_timestamp_seconds", Long.valueOf(j / 1000));
        }
        ktw.u((lyz) this.d, (kuh) this.i, contentValuesS);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lie] */
    private final void z(kug kugVar, Throwable th) {
        krd.c("Request impossible ".concat(String.valueOf(String.valueOf(th))));
        y(kugVar);
        this.g.E(((kuh) this.i).b, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yil] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ysm r13, defpackage.yih r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdw.a(ysm, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yft] */
    public final ysn c() {
        return (ysn) this.g.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yil] */
    public final void d(String str) {
        str.getClass();
        try {
            ykr.q(this.b, this.f, 0, new kbl(this, str, (yih) null, 16), 2);
        } catch (CancellationException e) {
            krd.d("Error clearing watchlist for user account.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final int e(ksy ksyVar, int i, lcr lcrVar, ImmutableMultimap immutableMultimap) {
        if (lcrVar.b.isEmpty() || immutableMultimap.containsEntry(ksyVar, Integer.valueOf(i))) {
            return 0;
        }
        Object obj = this.b;
        Uri uri = Uri.parse(lcrVar.b);
        mbk mbkVar = (mbk) obj;
        idf idfVar = (idf) mbkVar.c.b();
        idfVar.getClass();
        mem memVar = (mem) mbkVar.a.b();
        memVar.getClass();
        Object objB = mbkVar.d.b();
        mbk mbkVar2 = (mbk) mbkVar.b.b();
        mbkVar2.getClass();
        uri.getClass();
        final tju tjuVar = new tju(idfVar, memVar, (kuw) objB, mbkVar2, ksyVar, i, uri);
        this.e.execute(new Runnable() { // from class: mbd
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, lfn] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, mem] */
            /* JADX WARN: Type inference failed for: r9v10, types: [idf, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                tst tstVarI;
                String str;
                String str2;
                tju tjuVar2 = tjuVar;
                xqr xqrVarG = tjuVar2.b.g();
                if (!xqrVarG.j() || xqrVarG.i()) {
                    return;
                }
                Object obj2 = tjuVar2.f;
                Object obj3 = tjuVar2.c;
                int i2 = tjuVar2.a;
                kuw kuwVar = (kuw) obj2;
                long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - kuwVar.a.as();
                lyz lyzVar = (lyz) kuwVar.b;
                SQLiteDatabase sQLiteDatabaseA = lyzVar.a();
                try {
                    Cursor cursorQuery = sQLiteDatabaseA.query(true, "asset_images", new String[]{"images_uri", "images_etag", "images_last_modified"}, "images_asset_type = ? AND images_asset_id = ? AND images_category = ? AND images_last_update_seconds > ?", new String[]{Integer.toString(((ksy) obj3).a), ((ksy) obj3).b, Integer.toString(i2), Long.toString(jCurrentTimeMillis)}, null, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            tstVarI = tst.i(new lgb(mei.j(cursorQuery, 0), mei.j(cursorQuery, 1), mei.j(cursorQuery, 2)));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } else {
                            tstVarI = trk.a;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                        lyzVar.e(sQLiteDatabaseA, true);
                        if (tstVarI.g() && ((lgb) tstVarI.c()).a.equals(((Uri) tjuVar2.d).toString())) {
                            str = ((lgb) tstVarI.c()).b;
                            str2 = ((lgb) tstVarI.c()).c;
                        } else {
                            str = "";
                            str2 = "";
                        }
                        Object obj4 = tjuVar2.d;
                        mfn mfnVar = new mfn(mfp.a(((Uri) obj4).toString()), str, str2);
                        ieg iegVar = (ieg) tjuVar2.g.b(mfnVar);
                        if (!iegVar.m()) {
                            int i3 = tjuVar2.a;
                            Object obj5 = tjuVar2.c;
                            Object obj6 = tjuVar2.d;
                            krd.d("Failed to fetch image for " + i3 + " " + obj5.toString() + ", " + obj6.toString(), iegVar.i());
                            return;
                        }
                        if (((mfo) iegVar.g()).b) {
                            if (TextUtils.isEmpty(mfnVar.b) && TextUtils.isEmpty(mfnVar.c)) {
                                krd.c("Unexpected HTTP 304 response for ".concat(mfnVar.toString()));
                                return;
                            }
                            sQLiteDatabaseA = ((lyz) kuwVar.b).a();
                            try {
                                ContentValues contentValues = new ContentValues(1);
                                contentValues.put("images_last_update_seconds", Long.valueOf(System.currentTimeMillis() / 1000));
                                if (sQLiteDatabaseA.update("asset_images", contentValues, "images_asset_type = ? AND images_asset_id = ? AND images_category = ?", new String[]{Integer.toString(((ksy) obj3).a), ((ksy) obj3).b, Integer.toString(i2)}) <= 0) {
                                    krd.c("Failed to update image record for " + i2 + " " + obj3.toString());
                                    return;
                                }
                                return;
                            } finally {
                            }
                        }
                        mfo mfoVar = (mfo) iegVar.g();
                        byte[] bArr = (byte[]) ((mfq) mfoVar.c).b.c;
                        if (bArr == null) {
                            return;
                        }
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                        if (options.outWidth < 0) {
                            krd.c("Cannot decode image for " + i2 + " " + obj3.toString() + ", " + obj4.toString());
                            return;
                        }
                        Object obj7 = tjuVar2.e;
                        try {
                            Object obj8 = ((ttd) (i2 != 1 ? i2 != 2 ? i2 != 3 ? tst.i(((mbk) obj7).b) : tst.i(((mbk) obj7).a) : tst.i(((mbk) obj7).c) : tst.i(((mbk) obj7).d))).a;
                            String str3 = ((ksy) obj3).b;
                            mee meeVar = new mee(bArr);
                            Object obj9 = ((luq) obj8).a;
                            File file = new File((File) obj9, str3);
                            ((ReentrantReadWriteLock) ((luq) obj8).b).writeLock().lock();
                            try {
                                if (!((File) obj9).exists()) {
                                    ((File) obj9).mkdirs();
                                }
                                if (!((File) obj9).exists()) {
                                    throw new IOException("Failed to create directory: " + ((File) obj9).getAbsolutePath());
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                                try {
                                    fileOutputStream.write(meeVar.b, 0, meeVar.c);
                                    fileOutputStream.close();
                                    Object obj10 = tjuVar2.f;
                                    Object obj11 = tjuVar2.c;
                                    int i4 = tjuVar2.a;
                                    Object obj12 = tjuVar2.d;
                                    String str4 = mfoVar.d;
                                    String str5 = mfoVar.e;
                                    String string = ((Uri) obj12).toString();
                                    kuwVar = (kuw) obj10;
                                    sQLiteDatabaseA = ((lyz) kuwVar.b).a();
                                    try {
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("images_asset_type", Integer.valueOf(((ksy) obj11).a));
                                        contentValues2.put("images_asset_id", ((ksy) obj11).b);
                                        contentValues2.put("images_category", Integer.valueOf(i4));
                                        contentValues2.put("images_uri", string);
                                        contentValues2.put("images_etag", str4);
                                        contentValues2.put("images_last_modified", str5);
                                        contentValues2.put("images_last_update_seconds", Long.valueOf(System.currentTimeMillis() / 1000));
                                        long jInsertWithOnConflict = sQLiteDatabaseA.insertWithOnConflict("asset_images", null, contentValues2, 5);
                                        ((lyz) kuwVar.b).e(sQLiteDatabaseA, true);
                                        if (jInsertWithOnConflict <= 0) {
                                            krd.c("Failed to update image record for " + i4 + " " + obj11.toString());
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                ((ReentrantReadWriteLock) ((luq) obj8).b).writeLock().unlock();
                            }
                        } catch (IOException unused) {
                            krd.c("Failed to save image for " + tjuVar2.a + " " + tjuVar2.c.toString());
                        }
                    } finally {
                    }
                } finally {
                }
            }
        });
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r9.a(r2, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, yow] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(boolean r8, defpackage.yih r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.klr
            if (r0 == 0) goto L13
            r0 = r9
            klr r0 = (defpackage.klr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            klr r0 = new klr
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            r4 = 2
            r5 = 0
            r6 = 3
            if (r2 == 0) goto L40
            if (r2 == r3) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r6) goto L2e
            defpackage.ybn.f(r9)
            goto L86
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            wxd r8 = r0.c
            defpackage.ybn.f(r9)
            goto L6e
        L3c:
            defpackage.ybn.f(r9)
            goto L56
        L40:
            defpackage.ybn.f(r9)
            java.lang.Object r9 = r7.h
            jms r2 = new jms
            r2.<init>(r7, r8, r5, r6)
            r0.b = r3
            ywq r9 = (defpackage.ywq) r9
            yil r8 = r9.a
            java.lang.Object r9 = defpackage.ykr.l(r8, r2, r0)
            if (r9 == r1) goto L89
        L56:
            java.lang.Object r8 = r7.d
            wxd r9 = (defpackage.wxd) r9
            yil r8 = r8.c()
            ito r2 = new ito
            r2.<init>(r9, r7, r5, r4)
            r0.c = r9
            r0.b = r4
            java.lang.Object r8 = defpackage.ykr.l(r8, r2, r0)
            if (r8 == r1) goto L89
            r8 = r9
        L6e:
            java.lang.Object r9 = r7.c
            android.content.Context r9 = (android.content.Context) r9
            dbd r9 = defpackage.kln.a(r9)
            kci r2 = new kci
            r2.<init>(r8, r5, r6)
            r0.c = r5
            r0.b = r6
            java.lang.Object r8 = r9.a(r2, r0)
            if (r8 != r1) goto L86
            goto L89
        L86:
            ygi r8 = defpackage.ygi.a
            return r8
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdw.g(boolean, yih):java.lang.Object");
    }

    public final void h(boolean z) {
        shx shxVar;
        boolean z2;
        if (z) {
            shxVar = (shx) this.f;
            z2 = true;
        } else {
            shxVar = (shx) this.f;
            z2 = false;
        }
        shxVar.a = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ino, java.lang.Object] */
    public final wjz i() {
        if (!this.g.I()) {
            wjz wjzVar = wjz.a;
            wjzVar.getClass();
            return wjzVar;
        }
        wjz wjzVar2 = ((isi) this.h).i.r;
        if (wjzVar2 == null) {
            wjzVar2 = wjz.a;
        }
        wjzVar2.getClass();
        return wjzVar2;
    }

    public final wkc j() {
        wkc wkcVar = ((isi) this.h).i.p;
        if (wkcVar == null) {
            wkcVar = wkc.a;
        }
        wkcVar.getClass();
        return wkcVar;
    }

    public final wkc k() {
        wkc wkcVar = ((isi) this.h).i.q;
        if (wkcVar == null) {
            wkcVar = wkc.a;
        }
        wkcVar.getClass();
        return wkcVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ino, java.lang.Object] */
    public final ysx l() {
        return new ipi(this.g.z(), this, 2);
    }

    public final void m(by byVar, gi giVar, yjv yjvVar) {
        giVar.getClass();
        Context context = (Context) this.c;
        Executor executorE = czi.e(context);
        executorE.getClass();
        jbc jbcVar = new jbc(yjvVar);
        cr supportFragmentManager = byVar.getSupportFragmentManager();
        ic icVar = (ic) new dxa(byVar).a(ic.class);
        icVar.a = executorE;
        icVar.z = jbcVar;
        String string = byVar.getString(R.string.screen_lock_title);
        int iQ = q() - 1;
        if (iQ == 1) {
            if (Build.VERSION.SDK_INT >= 30) {
                hq.k(hq.l(string, null, byVar.getString(R.string.cancel), 255), supportFragmentManager);
                return;
            }
            return;
        }
        if (iQ == 2) {
            if (Build.VERSION.SDK_INT >= 30) {
                hq.k(hq.l(string, byVar.getString(R.string.screen_lock_subtitle), null, 32768), supportFragmentManager);
            }
        } else {
            if (iQ != 3) {
                return;
            }
            Object systemService = context.getSystemService("keyguard");
            systemService.getClass();
            KeyguardManager keyguardManager = (KeyguardManager) systemService;
            if (keyguardManager.isKeyguardSecure()) {
                Intent intentCreateConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(byVar.getString(R.string.screen_lock_title), byVar.getString(R.string.screen_lock_subtitle));
                intentCreateConfirmDeviceCredentialIntent.getClass();
                giVar.b(intentCreateConfirmDeviceCredentialIntent);
            }
        }
    }

    public final void n(boolean z) {
        ((isi) this.h).e(new jba(z, 1));
    }

    public final boolean o() {
        return ((isi) this.h).i.s;
    }

    public final boolean p() {
        return ((isi) this.h).i.t;
    }

    public final int q() {
        Context context = (Context) this.c;
        ajs ajsVarU = ajs.u(context);
        Object systemService = context.getSystemService("keyguard");
        systemService.getClass();
        KeyguardManager keyguardManager = (KeyguardManager) systemService;
        boolean z = false;
        boolean z2 = Build.VERSION.SDK_INT >= 30 && ajsVarU.p(255) == 0;
        if (Build.VERSION.SDK_INT >= 30 && ajsVarU.p(32768) == 0) {
            z = true;
        }
        if (z2) {
            return 2;
        }
        if (z) {
            return 3;
        }
        return keyguardManager.isKeyguardSecure() ? 4 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ino, java.lang.Object] */
    public final void r(wkc wkcVar, wkc wkcVar2) {
        Object obj;
        Object next;
        List arrayList;
        List arrayList2;
        wkcVar.getClass();
        wkcVar2.getClass();
        ?? r0 = this.g;
        Iterator it = r0.w().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iAs = a.as(((wnv) next).b);
            if (iAs != 0 && iAs == 3) {
                break;
            }
        }
        wnv wnvVar = (wnv) next;
        Iterator it2 = r0.w().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int iAs2 = a.as(((wnv) next2).b);
            if (iAs2 != 0 && iAs2 == 4) {
                obj = next2;
                break;
            }
        }
        wnv wnvVar2 = (wnv) obj;
        if (wnvVar == null && wnvVar2 == null) {
            return;
        }
        if (wnvVar != null) {
            vun vunVar = wnvVar.c;
            vunVar.getClass();
            List listA = A(wkcVar, vunVar);
            arrayList = new ArrayList(yfm.z(listA, 10));
            Iterator it3 = listA.iterator();
            while (it3.hasNext()) {
                arrayList.add(jbr.r((wnu) it3.next()));
            }
        } else {
            arrayList = yhb.a;
        }
        List list = arrayList;
        if (wnvVar2 != null) {
            vun vunVar2 = wnvVar2.c;
            vunVar2.getClass();
            List listA2 = A(wkcVar2, vunVar2);
            arrayList2 = new ArrayList(yfm.z(listA2, 10));
            Iterator it4 = listA2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(jbr.r((wnu) it4.next()));
            }
        } else {
            arrayList2 = yhb.a;
        }
        ((isi) this.h).e(new nw(wkcVar, wkcVar2, list, arrayList2, 9));
    }

    public final void s() {
        ((AtomicBoolean) this.e).set(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r3.isEmpty() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r3.isEmpty() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r8 = r8.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (r8 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        if (r8 != 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        throw new java.lang.IllegalStateException("Can only fetch more during append/prepend");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.fzx r8, defpackage.gbn r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdw.t(fzx, gbn):void");
    }

    public final void u() {
        gbc gbcVar = (gbc) this.c;
        Object obj = (!gbcVar.e || gbcVar.c > 0) ? ((gbn) yfm.W(gbcVar.a)).d : null;
        if (obj == null) {
            fzx fzxVar = fzx.c;
            gbn gbnVar = gbn.a;
            t(fzxVar, gez.f());
        } else {
            Object obj2 = this.f;
            fzx fzxVar2 = fzx.c;
            ((gba) obj2).a(fzxVar2, fzt.a);
            B(fzxVar2, new gbh(obj, 1));
        }
    }

    public final void v() {
        gbc gbcVar = (gbc) this.c;
        Object obj = (!gbcVar.e || gbcVar.b + gbcVar.d > 0) ? ((gbn) yfm.S(gbcVar.a)).c : null;
        if (obj == null) {
            fzx fzxVar = fzx.b;
            gbn gbnVar = gbn.a;
            t(fzxVar, gez.f());
        } else {
            Object obj2 = this.f;
            fzx fzxVar2 = fzx.b;
            ((gba) obj2).a(fzxVar2, fzt.a);
            B(fzxVar2, new gbi(obj, 1));
        }
    }

    public final boolean w() {
        return ((AtomicBoolean) this.e).get();
    }

    public mdw(hfx hfxVar, hfx hfxVar2, hfx hfxVar3, yow yowVar, yil yilVar, yil yilVar2, yil yilVar3, yil yilVar4) {
        hfxVar.getClass();
        hfxVar2.getClass();
        hfxVar3.getClass();
        this.a = hfxVar;
        this.h = hfxVar2;
        this.i = hfxVar3;
        this.b = yowVar;
        this.c = yilVar;
        this.d = yilVar2;
        this.e = yilVar3;
        this.f = yilVar4;
        this.g = new yga(new kih(this, 20));
    }

    public mdw(yow yowVar, tqr tqrVar, gbo gboVar, yot yotVar, yot yotVar2, fzf fzfVar, gbc gbcVar) {
        gboVar.getClass();
        this.h = yowVar;
        this.g = tqrVar;
        this.d = gboVar;
        this.a = yotVar;
        this.i = yotVar2;
        this.b = fzfVar;
        this.c = gbcVar;
        this.e = new AtomicBoolean(false);
        this.f = new gba(this);
    }

    public mdw(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, yfo yfoVar9, char[] cArr) {
        yfoVar.getClass();
        this.g = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.i = yfoVar3;
        yfoVar4.getClass();
        this.c = yfoVar4;
        yfoVar5.getClass();
        this.e = yfoVar5;
        yfoVar6.getClass();
        this.f = yfoVar6;
        yfoVar7.getClass();
        this.a = yfoVar7;
        yfoVar8.getClass();
        this.h = yfoVar8;
        yfoVar9.getClass();
        this.d = yfoVar9;
    }

    public mdw(lfz lfzVar, lys lysVar, iea ieaVar, Context context, isi isiVar, ino inoVar, kuw kuwVar, yow yowVar) {
        lfzVar.getClass();
        lysVar.getClass();
        isiVar.getClass();
        inoVar.getClass();
        yowVar.getClass();
        this.f = ieaVar;
        this.c = context;
        this.h = isiVar;
        this.g = inoVar;
        this.a = kuwVar;
        this.d = yowVar;
        ids idsVarD = hjt.d(ieaVar, isiVar.b(new iwg(10)), isiVar.b(new iwg(11)), isiVar.b(new iwg(12)));
        this.e = idsVarD;
        yuj yujVarE = yuq.e(0, 0, 0, 7);
        this.b = yujVarE;
        this.i = new yuk(yujVarE);
        idsVarD.ea(new itm(this, 9));
        yot yotVar = ypk.a;
        ykr.q(yoz.l(yxi.a), null, 0, new qf(this, (yih) null, 19), 3);
    }

    public mdw(xjk xjkVar, isy isyVar, shx shxVar, iyz iyzVar, yow yowVar, yow yowVar2, Context context, isy isyVar2, ldv ldvVar) {
        this.e = xjkVar;
        this.b = isyVar;
        this.f = shxVar;
        this.i = iyzVar;
        this.d = yowVar;
        this.h = yowVar2;
        this.c = context;
        this.g = isyVar2;
        this.a = yvd.a(false);
        ldvVar.v(new klo(this, 0));
    }

    private mdw(kuh kuhVar, lie lieVar, idf idfVar, lrq lrqVar, lfn lfnVar, lyz lyzVar, ContentResolver contentResolver, Executor executor, String str) {
        this.i = kuhVar;
        lieVar.getClass();
        this.g = lieVar;
        this.e = lrqVar;
        this.b = idfVar;
        this.f = lfnVar;
        this.d = lyzVar;
        this.c = contentResolver;
        this.a = executor;
        this.h = str;
    }

    public mdw(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, yfo yfoVar9, byte[] bArr) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.d = yfoVar3;
        yfoVar4.getClass();
        this.i = yfoVar4;
        yfoVar5.getClass();
        this.f = yfoVar5;
        yfoVar6.getClass();
        this.h = yfoVar6;
        yfoVar7.getClass();
        this.e = yfoVar7;
        yfoVar8.getClass();
        this.g = yfoVar8;
        yfoVar9.getClass();
        this.b = yfoVar9;
    }

    public mdw(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6, yfo yfoVar7, yfo yfoVar8, yfo yfoVar9) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.i = yfoVar2;
        yfoVar3.getClass();
        this.e = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.a = yfoVar5;
        yfoVar6.getClass();
        this.f = yfoVar6;
        yfoVar7.getClass();
        this.b = yfoVar7;
        yfoVar8.getClass();
        this.h = yfoVar8;
        yfoVar9.getClass();
        this.g = yfoVar9;
    }

    public mdw(kdh kdhVar, hfx hfxVar, hfx hfxVar2, kdh kdhVar2, kdh kdhVar3, hfx hfxVar3, hfx hfxVar4, kdh kdhVar4, ImmutableList immutableList) {
        this.d = kdhVar;
        this.a = hfxVar;
        this.b = hfxVar2;
        this.h = kdhVar2;
        this.f = kdhVar3;
        this.c = hfxVar3;
        this.i = hfxVar4;
        this.g = kdhVar4;
        int i = 3;
        this.e = FluentIterable.from(FluentIterable.from(immutableList).transform(new lsq(i)).toSet()).toMap(new nbb(immutableList, FluentIterable.from(immutableList).transform(new lsq(i)).toList(), 1, null));
    }
}
