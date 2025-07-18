package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sg implements sd {
    private final /* synthetic */ int c;
    public static final sg b = new sg(1);
    public static final sg a = new sg(0);

    private sg(int i) {
        this.c = i;
    }

    @Override // defpackage.sd
    public final /* synthetic */ se a(View view) {
        return this.c != 0 ? new se(new Magnifier(view)) : new sf(new Magnifier(view));
    }
}
