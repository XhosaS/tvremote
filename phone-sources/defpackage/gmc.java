package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmc {
    public RecyclerView.AdapterDataObserver a;
    public dvi b;
    public ViewPager2 c;
    final /* synthetic */ gmd d;
    public gli e;
    private long f = -1;

    public gmc(gmd gmdVar) {
        this.d = gmdVar;
    }

    public static final ViewPager2 b(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        Objects.toString(parent);
        throw new IllegalStateException("Expected ViewPager2 instance. Got: ".concat(String.valueOf(parent)));
    }

    final void a(boolean z) {
        int i;
        bv bvVar;
        gmd gmdVar = this.d;
        if (!gmdVar.f() && this.c.b() == 0) {
            jn jnVar = gmdVar.c;
            if (jnVar.m() || gmdVar.getItemCount() == 0 || (i = this.c.a) >= gmdVar.getItemCount()) {
                return;
            }
            long j = i;
            if ((j != this.f || z) && (bvVar = (bv) jnVar.e(j)) != null && bvVar.isAdded()) {
                this.f = j;
                at atVar = new at(gmdVar.b);
                ArrayList arrayList = new ArrayList();
                bv bvVar2 = null;
                for (int i2 = 0; i2 < jnVar.b(); i2++) {
                    long jC = jnVar.c(i2);
                    bv bvVar3 = (bv) jnVar.g(i2);
                    if (bvVar3.isAdded()) {
                        if (jC != this.f) {
                            atVar.n(bvVar3, dvd.d);
                            arrayList.add(gmdVar.e.p());
                        } else {
                            bvVar2 = bvVar3;
                        }
                        bvVar3.setMenuVisibility(jC == this.f);
                    }
                }
                if (bvVar2 != null) {
                    atVar.n(bvVar2, dvd.e);
                    arrayList.add(gmdVar.e.p());
                }
                if (atVar.k()) {
                    return;
                }
                atVar.e();
                Collections.reverse(arrayList);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    cb.q((List) arrayList.get(i3));
                }
            }
        }
    }
}
