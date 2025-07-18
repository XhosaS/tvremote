package defpackage;

import android.content.Context;
import android.support.v7.widget.ActivityChooserView;
import android.util.DisplayMetrics;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyz {
    private static final tui c = tui.l("com/google/android/apps/googletv/app/image/ImageManagerImpl");
    public final xjw a;
    public final File b;
    private final Context d;
    private final yow e;

    public iyz(Context context, xjw xjwVar, yow yowVar, File file) {
        this.d = context;
        this.a = xjwVar;
        this.e = yowVar;
        this.b = file;
    }

    public static final String e(String str) {
        if (str == null) {
            str = "";
        }
        String strE = krh.e(str);
        return strE == null ? "" : strE;
    }

    private final boolean g() {
        try {
            File file = this.b;
            if (file.exists()) {
                return true;
            }
            file.mkdirs();
            return true;
        } catch (SecurityException e) {
            ((tug) ((tug) c.f().h(tvo.a, "ImageManagerImpl")).i(e).j("com/google/android/apps/googletv/app/image/ImageManagerImpl", "createImageDirectory", 184, "ImageManagerImpl.kt")).s("Could not create image directory. Operation is not permitted");
            return false;
        }
    }

    public final File a(wlx wlxVar) {
        wlxVar.getClass();
        return b(e(d(wlxVar)));
    }

    public final File b(String str) throws IOException {
        File file = this.b;
        File file2 = new File(file, str);
        String canonicalPath = file2.getCanonicalPath();
        canonicalPath.getClass();
        String canonicalPath2 = file.getCanonicalPath();
        canonicalPath2.getClass();
        if (!ylh.ac(canonicalPath, canonicalPath2)) {
            throw new SecurityException("Access Denied");
        }
        if (!file2.exists()) {
            return null;
        }
        if (file2.isFile()) {
            return file2;
        }
        throw new SecurityException("Access Denied");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r12, defpackage.yih r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.iyy
            if (r0 == 0) goto L13
            r0 = r13
            iyy r0 = (defpackage.iyy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iyy r0 = new iyy
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.String r12 = r0.d
            defpackage.ybn.f(r13)     // Catch: java.lang.Exception -> L2a
            goto L78
        L2a:
            r0 = move-exception
            r13 = r0
            goto L84
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            defpackage.ybn.f(r13)
            if (r12 == 0) goto Lc0
            int r13 = r12.length()
            if (r13 != 0) goto L42
            goto Lc0
        L42:
            boolean r13 = r11.g()
            if (r13 == 0) goto Lc0
            java.lang.String r13 = e(r12)
            java.io.File r2 = r11.b
            java.io.File r8 = new java.io.File
            r8.<init>(r2, r13)
            boolean r13 = r8.exists()
            if (r13 != 0) goto Lb0
            android.content.Context r6 = r11.d     // Catch: java.lang.Exception -> L7f
            yow r13 = r11.e     // Catch: java.lang.Exception -> L7f
            r0.d = r12     // Catch: java.lang.Exception -> L7f
            r0.c = r4     // Catch: java.lang.Exception -> L7f
            ywq r13 = (defpackage.ywq) r13     // Catch: java.lang.Exception -> L7f
            yil r13 = r13.a     // Catch: java.lang.Exception -> L7f
            fzp r5 = new fzp     // Catch: java.lang.Exception -> L7f
            r9 = 0
            r10 = 5
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L7d
            java.lang.Object r12 = defpackage.ykr.l(r13, r5, r0)     // Catch: java.lang.Exception -> L7d
            if (r12 == r1) goto L75
            ygi r12 = defpackage.ygi.a     // Catch: java.lang.Exception -> L7d
        L75:
            if (r12 != r1) goto L78
            return r1
        L78:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        L7d:
            r0 = move-exception
            goto L81
        L7f:
            r0 = move-exception
            r7 = r12
        L81:
            r12 = r0
            r13 = r12
            r12 = r7
        L84:
            tui r0 = defpackage.iyz.c
            tuv r0 = r0.b()
            tuy r1 = defpackage.tvo.a
            java.lang.String r2 = "ImageManagerImpl"
            tuv r0 = r0.h(r1, r2)
            tug r0 = (defpackage.tug) r0
            tuv r13 = r0.i(r13)
            r0 = 71
            java.lang.String r1 = "ImageManagerImpl.kt"
            java.lang.String r2 = "com/google/android/apps/googletv/app/image/ImageManagerImpl"
            java.lang.String r4 = "blockingDownloadImageForOffline"
            tuv r13 = r13.j(r2, r4, r0, r1)
            tug r13 = (defpackage.tug) r13
            java.lang.String r0 = "Failed to download image for url=%s"
            r13.v(r0, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        Lb0:
            java.util.Calendar r12 = java.util.Calendar.getInstance()
            long r12 = r12.getTimeInMillis()
            r8.setLastModified(r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        Lc0:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyz.c(java.lang.String, yih):java.lang.Object");
    }

    public final String d(wlx wlxVar) {
        wlxVar.getClass();
        DisplayMetrics displayMetrics = this.d.getResources().getDisplayMetrics();
        int i = wlxVar.b;
        int iP = wbb.p(i);
        if (iP == 0) {
            throw null;
        }
        int i2 = iP - 1;
        if (i2 == 0) {
            return (i == 1 ? (wlu) wlxVar.c : wlu.a).b;
        }
        if (i2 == 2) {
            wlw wlwVar = i == 3 ? (wlw) wlxVar.c : wlw.a;
            wlwVar.getClass();
            int i3 = displayMetrics.heightPixels;
            int i4 = displayMetrics.widthPixels;
            vun vunVar = wlwVar.b;
            vunVar.getClass();
            Object objU = yfm.U(vunVar);
            vun<wlv> vunVar2 = wlwVar.b;
            vunVar2.getClass();
            int iAbs = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (wlv wlvVar : vunVar2) {
                int i5 = wlvVar.d * wlvVar.c;
                if (i5 != 0) {
                    int i6 = i5 - (i3 * i4);
                    if (Math.abs(i6) < iAbs) {
                        iAbs = Math.abs(i6);
                        objU = wlvVar;
                    }
                }
            }
            wlv wlvVar2 = (wlv) objU;
            if (wlvVar2 != null) {
                return wlvVar2.b;
            }
        }
        return null;
    }

    public final void f(String str) {
        if (str == null || str.length() == 0 || !g()) {
            return;
        }
        File file = new File(this.b, e(str));
        if (file.exists()) {
            file.setLastModified(Calendar.getInstance().getTimeInMillis());
        } else {
            hjr.c(this.d).d().f(str).l(new iyx(file));
        }
    }
}
