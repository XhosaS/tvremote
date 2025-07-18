package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class djd implements diz {
    public int b;
    public final boolean c;
    public final List d;

    public djd() {
        this(0, 0 == true ? 1 : 0, 3);
    }

    protected final String d() {
        return ylh.q(yfm.ax(this.d, ",\n", null, null, null, 62), "  ");
    }

    public /* synthetic */ djd(int i, boolean z, int i2) {
        this.b = 1 == (i2 & 1) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : i;
        this.c = ((i2 & 2) == 0) & z;
        this.d = new ArrayList();
    }
}
