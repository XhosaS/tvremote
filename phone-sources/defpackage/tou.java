package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tou {
    SLOW(1),
    NORMAL(3),
    FAST(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);

    public final int d;

    tou(int i) {
        this.d = i;
    }
}
