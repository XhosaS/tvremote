package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class afz {
    public final GestureDetector a;

    public afz(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new GestureDetector(context, onGestureListener, handler);
    }
}
