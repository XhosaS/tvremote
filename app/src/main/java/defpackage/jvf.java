package defpackage;

import android.view.View;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jvf {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    float j;
    float k;
    public int l;
    int m;
    public int o;
    public int p;
    boolean q;
    boolean r;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    final List n = new ArrayList();

    public final void a(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - flexItem.g()) - i);
        this.b = Math.min(this.b, (view.getTop() - flexItem.i()) - i2);
        this.c = Math.max(this.c, view.getRight() + flexItem.h() + i3);
        this.d = Math.max(this.d, view.getBottom() + flexItem.f() + i4);
    }
}
