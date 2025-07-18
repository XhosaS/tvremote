package defpackage;

import android.content.res.Resources;
import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glt extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public glt(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() throws Resources.NotFoundException {
        this.a.e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() throws Resources.NotFoundException {
        this.a.e();
    }
}
