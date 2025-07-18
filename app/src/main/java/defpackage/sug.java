package defpackage;

import android.content.Context;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sug {
    public static boolean a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
