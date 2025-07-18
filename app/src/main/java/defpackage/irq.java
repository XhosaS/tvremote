package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irq {
    private final gzu a;
    private final PackageManager b;

    public irq(gzu gzuVar, PackageManager packageManager) {
        gzuVar.getClass();
        this.a = gzuVar;
        this.b = packageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.lang.String r5, android.content.Intent r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            r4 = this;
            int r0 = r5.length()
            if (r0 <= 0) goto L18
            r6.setPackage(r5)
            java.lang.String r0 = "com.netflix.ninja"
            boolean r0 = defpackage.agvy.c(r5, r0)
            if (r0 == 0) goto L18
            java.lang.String r0 = "source"
            java.lang.String r1 = "4"
            r6.putExtra(r0, r1)
        L18:
            java.lang.String r0 = "com.google.android.videos"
            boolean r0 = defpackage.agvy.c(r5, r0)
            if (r0 == 0) goto L36
            android.content.pm.PackageManager r0 = r4.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            long r0 = defpackage.jj$$ExternalSyntheticApiModelOutline0.m(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            goto L2f
        L2d:
            r0 = -1
        L2f:
            r2 = 32800000(0x1f47d00, double:1.6205353E-316)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L3c
        L36:
            java.lang.String r0 = "android.intent.extra.START_PLAYBACK"
            r1 = 1
            r6.putExtra(r0, r1)
        L3c:
            java.lang.String r0 = "com.google.android.youtube.tv"
            boolean r5 = defpackage.agvy.c(r5, r0)
            if (r5 == 0) goto L93
            android.net.Uri r5 = r6.getData()
            if (r5 != 0) goto L4b
            goto L93
        L4b:
            android.net.Uri$Builder r5 = r5.buildUpon()
            java.lang.String r1 = "launch"
            java.lang.String r2 = "voice"
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r1, r2)
            java.lang.String r1 = "vs"
            java.lang.String r2 = "1"
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r1, r2)
            if (r7 == 0) goto L6c
            int r1 = r7.length()
            if (r1 == 0) goto L6c
            java.lang.String r1 = "clickTrackingParams"
            r5.appendQueryParameter(r1, r7)
        L6c:
            if (r8 == 0) goto L7b
            java.lang.String r7 = "android.intent.extra.user_query"
            java.lang.String r7 = r8.getString(r7)
            if (r7 == 0) goto L7b
            java.lang.String r1 = "vq"
            r5.appendQueryParameter(r1, r7)
        L7b:
            gzu r7 = r4.a
            java.lang.String r7 = r7.a
            boolean r7 = defpackage.agvy.c(r7, r0)
            if (r7 == 0) goto L8c
            java.lang.String r7 = "inApp"
            java.lang.String r0 = "true"
            r5.appendQueryParameter(r7, r0)
        L8c:
            android.net.Uri r5 = r5.build()
            r6.setData(r5)
        L93:
            if (r8 == 0) goto L98
            r6.putExtras(r8)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irq.c(java.lang.String, android.content.Intent, java.lang.String, android.os.Bundle):void");
    }

    public final Intent a(String str, Bundle bundle) throws URISyntaxException {
        try {
            Intent uri = Intent.parseUri(str, 1);
            if (bundle != null) {
                uri.putExtras(bundle);
            }
            return uri;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public final boolean b(String str, String str2, String str3, Bundle bundle, agux aguxVar) throws URISyntaxException {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        c(str, intent, str3, bundle);
        if (((Boolean) aguxVar.a(intent)).booleanValue()) {
            return true;
        }
        Intent intentA = a(str2, bundle);
        if (intentA != null && ((Boolean) aguxVar.a(intentA)).booleanValue()) {
            return true;
        }
        PackageManager packageManager = this.b;
        Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(str);
        if (leanbackLaunchIntentForPackage == null) {
            leanbackLaunchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        }
        if (leanbackLaunchIntentForPackage != null) {
            leanbackLaunchIntentForPackage.setData(Uri.parse(str2));
            c(str, leanbackLaunchIntentForPackage, str3, bundle);
        } else {
            leanbackLaunchIntentForPackage = null;
        }
        return leanbackLaunchIntentForPackage != null && ((Boolean) aguxVar.a(leanbackLaunchIntentForPackage)).booleanValue();
    }
}
