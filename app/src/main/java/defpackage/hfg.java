package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfg {
    public final AnimatorSet a = new AnimatorSet();
    public final hmu b;
    public final FrameLayout c;
    public final int d;

    public hfg(hmu hmuVar, FrameLayout frameLayout, int i) {
        this.b = hmuVar;
        this.c = frameLayout;
        this.d = i;
    }

    public static View a(ViewGroup viewGroup) {
        hle hleVar = (hle) viewGroup.findViewById(R.id.fragment_view_wrapper);
        if (hleVar != null) {
            return hleVar.getFragmentView();
        }
        return null;
    }
}
