package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdj extends gll {
    public final ViewPager c;
    public List d = yhb.a;
    public sdi e;
    public int f;

    public sdj(ViewPager viewPager) {
        this.c = viewPager;
    }

    @Override // defpackage.gll
    public final Parcelable a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", null);
        bundle.putInt("position", this.c.c);
        return bundle;
    }

    @Override // defpackage.gll
    public final Object c(ViewGroup viewGroup, int i) {
        scf scfVar = (scf) this.d.get(i);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(scfVar.a(), viewGroup, false);
        viewInflate.getClass();
        sdi sdiVar = this.e;
        if (sdiVar != null) {
            sdiVar.c(viewInflate).a(scfVar);
        }
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // defpackage.gll
    public final boolean e(View view, Object obj) {
        view.getClass();
        obj.getClass();
        return view == obj;
    }

    @Override // defpackage.gll
    public final void f(ViewGroup viewGroup, Object obj) {
        obj.getClass();
        sdi sdiVar = this.e;
        if (sdiVar != null) {
            sdiVar.c((View) obj).b();
        }
        viewGroup.removeView((View) obj);
    }

    @Override // defpackage.gll
    public final void h(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f = bundle.getInt("position");
            bundle.getParcelable("superState");
        }
    }

    @Override // defpackage.gll
    public final int j() {
        return this.d.size();
    }

    @Override // defpackage.gll
    public final int k(Object obj) {
        obj.getClass();
        return yfm.P(this.d, obj);
    }
}
