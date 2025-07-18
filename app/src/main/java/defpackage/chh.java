package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: PG */
/* loaded from: classes.dex */
class chh {
    public static final String a = cbx.d("SystemJobInfoConverter");
    public final ComponentName b;

    public chh(Context context) {
        this.b = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
