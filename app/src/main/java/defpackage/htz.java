package defpackage;

import android.content.Intent;
import android.content.pm.ActivityInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htz {
    public final Intent a;
    public final CharSequence b;
    public final CharSequence c;

    public htz(ActivityInfo activityInfo, CharSequence charSequence, CharSequence charSequence2) {
        this.b = charSequence;
        this.c = charSequence2;
        this.a = new Intent("android.intent.action.MAIN").setClassName(activityInfo.packageName, activityInfo.name);
    }
}
