package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmm extends gli {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmm(ViewPager2 viewPager2) {
        super(null);
        this.a = viewPager2;
    }

    @Override // defpackage.gli
    public final void W(int i) {
        ViewPager2 viewPager2 = this.a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.d.requestFocus(2);
        }
    }
}
