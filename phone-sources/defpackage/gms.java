package defpackage;

import android.R;
import android.support.v7.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gms extends gli {
    public RecyclerView.AdapterDataObserver a;
    public final /* synthetic */ ViewPager2 b;
    private final czc c;
    private final czc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gms(ViewPager2 viewPager2) {
        super(null);
        this.b = viewPager2;
        this.c = new gmq(this, 1);
        this.d = new gmq(this, 0);
    }

    public final void Y() {
        int itemCount;
        ViewPager2 viewPager2 = this.b;
        int i = R.id.accessibilityActionPageLeft;
        cww.n(viewPager2, R.id.accessibilityActionPageLeft);
        cww.n(viewPager2, R.id.accessibilityActionPageRight);
        cww.n(viewPager2, R.id.accessibilityActionPageUp);
        cww.n(viewPager2, R.id.accessibilityActionPageDown);
        if (viewPager2.c() == null || (itemCount = viewPager2.c().getItemCount()) == 0 || !viewPager2.f) {
            return;
        }
        int i2 = itemCount - 1;
        if (viewPager2.a() != 0) {
            if (viewPager2.a < i2) {
                cww.x(viewPager2, new cyp(R.id.accessibilityActionPageDown, (CharSequence) null), this.c);
            }
            if (viewPager2.a > 0) {
                cww.x(viewPager2, new cyp(R.id.accessibilityActionPageUp, (CharSequence) null), this.d);
                return;
            }
            return;
        }
        boolean zJ = viewPager2.j();
        int i3 = true != zJ ? 16908361 : 16908360;
        if (true == zJ) {
            i = 16908361;
        }
        if (viewPager2.a < i2) {
            cww.x(viewPager2, new cyp(i3, (CharSequence) null), this.c);
        }
        if (viewPager2.a > 0) {
            cww.x(viewPager2, new cyp(i, (CharSequence) null), this.d);
        }
    }

    public final void a(int i) {
        ViewPager2 viewPager2 = this.b;
        if (viewPager2.f) {
            viewPager2.g(i, true);
        }
    }

    @Override // defpackage.gli
    public final boolean f(int i) {
        return i == 8192 || i == 4096;
    }
}
