package defpackage;

import android.view.VelocityTracker;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qc {
    public static final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static qd a(VelocityTracker velocityTracker) {
        return (qd) a.get(velocityTracker);
    }
}
