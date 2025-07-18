package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qu implements Runnable {
    public OverScroller a;
    Interpolator b;
    final /* synthetic */ RecyclerView c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public qu(RecyclerView recyclerView) {
        this.c = recyclerView;
        Interpolator interpolator = RecyclerView.c;
        this.b = interpolator;
        this.f = false;
        this.g = false;
        this.a = new OverScroller(recyclerView.getContext(), interpolator);
    }

    private final void e() {
        RecyclerView recyclerView = this.c;
        recyclerView.removeCallbacks(this);
        int[] iArr = ahj.a;
        recyclerView.postOnAnimation(this);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.c;
        recyclerView.aj(2);
        this.e = 0;
        this.d = 0;
        Interpolator interpolator = this.b;
        Interpolator interpolator2 = RecyclerView.c;
        if (interpolator != interpolator2) {
            this.b = interpolator2;
            this.a = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    final void b() {
        if (this.f) {
            this.g = true;
        } else {
            e();
        }
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? this.c.getWidth() : this.c.getHeight();
            if (true != z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.c;
        }
        if (this.b != interpolator) {
            this.b = interpolator;
            this.a = new OverScroller(this.c.getContext(), interpolator);
        }
        this.e = 0;
        this.d = 0;
        this.c.aj(2);
        this.a.startScroll(0, 0, i, i2, i4);
        b();
    }

    public final void d() {
        this.c.removeCallbacks(this);
        this.a.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0191  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu.run():void");
    }
}
