package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdh {
    public static final cdh a = new cdh();

    private cdh() {
    }

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) < 2139095040;
    }
}
