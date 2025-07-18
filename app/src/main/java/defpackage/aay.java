package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aay {
    public static int a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }
}
