package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class bfs {
    private static final Object d = new Object();
    private static bfs e;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();

    private bfs(Context context) {
        new bfp(this, context.getMainLooper());
    }

    public static bfs a(Context context) {
        bfs bfsVar;
        synchronized (d) {
            if (e == null) {
                e = new bfs(context.getApplicationContext());
            }
            bfsVar = e;
        }
        return bfsVar;
    }
}
