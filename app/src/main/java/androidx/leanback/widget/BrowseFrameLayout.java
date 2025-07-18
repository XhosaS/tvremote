package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.awm;
import defpackage.awn;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BrowseFrameLayout extends FrameLayout {
    public BrowseFrameLayout(Context context) {
        this(context, null, 0);
    }

    public awm getOnChildFocusListener() {
        return null;
    }

    public awn getOnFocusSearchListener() {
        return null;
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
