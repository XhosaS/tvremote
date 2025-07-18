package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abm {
    public final NotificationManager a;
    private final Context b;

    static {
        new HashSet();
    }

    public abm(Context context) {
        this.b = context;
        this.a = (NotificationManager) context.getSystemService("notification");
    }
}
