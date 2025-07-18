package defpackage;

import android.content.pm.ApplicationInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzt {
    public static final boolean a(ApplicationInfo applicationInfo) {
        return applicationInfo != null && (applicationInfo.flags & 1) == 1;
    }
}
