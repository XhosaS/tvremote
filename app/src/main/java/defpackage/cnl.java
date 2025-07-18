package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnl {
    static {
        cbx.d("ProcessUtils");
    }

    public static final boolean a(Context context, cak cakVar) {
        context.getClass();
        cakVar.getClass();
        String processName = Application.getProcessName();
        processName.getClass();
        return agvy.c(processName, context.getApplicationInfo().processName);
    }
}
