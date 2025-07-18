package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsq {
    public final ComponentName a;

    static {
        gpn.a("SystemJobInfoConverter");
    }

    public gsq(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
