package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbv implements tbm {
    private final /* synthetic */ int a;
    private final ViewGroup b;

    public tbv(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // defpackage.tbl
    public final void a(tbq tbqVar) throws Resources.NotFoundException {
        if (this.a != 0) {
            ((ViewPager) this.b).i(tbqVar.d);
        } else {
            ((ViewPager2) this.b).f(tbqVar.d, true);
        }
    }

    @Override // defpackage.tbl
    public final void b() {
    }

    @Override // defpackage.tbl
    public final void c() {
    }
}
