package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gml extends gli {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gml(ViewPager2 viewPager2) {
        super(null);
        this.a = viewPager2;
    }

    @Override // defpackage.gli
    public final void U(int i) {
        if (i == 0) {
            this.a.i();
        }
    }

    @Override // defpackage.gli
    public final void W(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.a != i) {
            viewPager2.a = i;
            ((gms) viewPager2.h).Y();
        }
    }
}
