package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfy {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int b = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public final List n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        nfx nfxVar = (nfx) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - nfxVar.g()) - i);
        this.b = Math.min(this.b, (view.getTop() - nfxVar.i()) - i2);
        this.c = Math.max(this.c, view.getRight() + nfxVar.h() + i3);
        this.d = Math.max(this.d, view.getBottom() + nfxVar.f() + i4);
    }
}
