package defpackage;

import android.app.Application;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnu {
    private static String a;
    private static Boolean b;

    public static boolean a() {
        if (b == null) {
            b = Boolean.valueOf(Process.isApplicationUid(Process.myUid()));
        }
        return b.booleanValue();
    }

    public static String b() {
        String str = a;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        a = processName;
        return processName;
    }
}
