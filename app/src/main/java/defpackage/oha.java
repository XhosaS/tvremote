package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oha {
    public static boolean a(Resources resources) {
        Configuration configuration;
        return (resources == null || (configuration = resources.getConfiguration()) == null || configuration.getLayoutDirection() != 1) ? false : true;
    }
}
