package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljp implements Runnable {
    private static final tui a = tui.l("com/google/android/apps/play/movies/common/service/pinning/NotificationsCallbackProcessingRunnable");
    private final Context b;
    private final BroadcastReceiver.PendingResult c;
    private final String d;
    private final ksn e;
    private final String f;
    private final String g;
    private final String h;
    private final String[] i;
    private final ljg j;

    public ljp(Context context, String str, ksn ksnVar, String str2, String[] strArr, String str3, String str4, ljg ljgVar, BroadcastReceiver.PendingResult pendingResult) {
        this.b = context;
        this.h = str2;
        this.i = strArr;
        this.j = ljgVar;
        this.c = pendingResult;
        this.d = str;
        this.f = str4;
        this.g = str3;
        this.e = ksnVar;
    }

    private final void a(boolean z) {
        Intent intentK;
        Intent intentL;
        String str = this.h;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.f) && TextUtils.isEmpty(this.g)) {
            Context context = this.b;
            context.startActivity(krb.g(context, this.e));
            return;
        }
        String str2 = this.g;
        if (TextUtils.isEmpty(str2)) {
            if (z) {
                Context context2 = this.b;
                ksn ksnVar = this.e;
                Uri.Builder builderC = krb.c(str, "notifications");
                krb.e(builderC);
                intentL = krb.f(context2, builderC.build(), ksnVar);
            } else {
                intentL = krb.l(this.b, this.e, str);
            }
            this.b.startActivity(intentL);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f;
            if (TextUtils.isEmpty(str3)) {
                Context context3 = this.b;
                context3.startActivity(krb.i(context3, this.e, str2));
                return;
            } else {
                Context context4 = this.b;
                context4.startActivity(krb.h(context4, this.e, str2, str3));
                return;
            }
        }
        if (z) {
            Context context5 = this.b;
            ksn ksnVar2 = this.e;
            Uri.Builder builderB = krb.b(str, this.f, str2, "notifications");
            krb.e(builderB);
            intentK = krb.f(context5, builderB.build(), ksnVar2);
        } else {
            intentK = krb.k(this.b, this.e, str2, this.f, str);
        }
        this.b.startActivity(intentK);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        String str = this.d;
        switch (str.hashCode()) {
            case 419134618:
                if (str.equals("com.google.android.videos.DOWNLOAD_ERROR_DELETED")) {
                    PinBroadcastReceiver.c(this.b, this.e, this.h);
                    break;
                }
                break;
            case 1239640611:
                if (str.equals("com.google.android.videos.DOWNLOAD_COMPLETED")) {
                    String[] strArr = this.i;
                    if (strArr.length != 0) {
                        this.j.c(this.e, strArr);
                        a(false);
                        break;
                    } else {
                        ((tug) ((tug) a.g()).j("com/google/android/apps/play/movies/common/service/pinning/NotificationsCallbackProcessingRunnable", "run", 70, "NotificationsCallbackProcessingRunnable.java")).s("Invalid intent: videoIds is empty");
                        break;
                    }
                }
                break;
            case 1347867987:
                if (str.equals("com.google.android.videos.DOWNLOAD_ONGOING")) {
                    a(false);
                    break;
                }
                break;
            case 1710881245:
                if (str.equals("com.google.android.videos.DOWNLOAD_COMPLETED_DELETED")) {
                    String[] strArr2 = this.i;
                    if (strArr2.length != 0) {
                        this.j.c(this.e, strArr2);
                        break;
                    } else {
                        krd.c("Invalid intent: videoIds is empty");
                        break;
                    }
                }
                break;
            case 1717434848:
                if (str.equals("com.google.android.videos.DOWNLOAD_ERROR")) {
                    this.j.c(this.e, this.h);
                    a(true);
                    break;
                }
                break;
        }
        this.c.finish();
    }
}
