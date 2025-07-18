package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhd {
    public static final bgz a(BackEvent backEvent) {
        return new bgz(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
