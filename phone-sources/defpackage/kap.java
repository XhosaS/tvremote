package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kap extends kar {
    public wlf a;
    public int b;
    public jaf c;
    public xja d;
    public xhg e;
    public ihg f;
    public jzs g;
    public jwq h;
    private boolean i;
    private ViewPager2 j;
    private TabLayout k;
    private pku l;

    public final wlf a() {
        wlf wlfVar = this.a;
        if (wlfVar != null) {
            return wlfVar;
        }
        yks.c("destination");
        return null;
    }

    @Override // defpackage.kar
    public final boolean dS() {
        int i;
        if (this.i) {
            return false;
        }
        this.i = true;
        View view = getView();
        view.getClass();
        wmc wmcVar = a().i;
        if (wmcVar == null) {
            wmcVar = wmc.a;
        }
        if (wmcVar.c != 0) {
            wmc wmcVar2 = a().i;
            if (wmcVar2 == null) {
                wmcVar2 = wmc.a;
            }
            i = wmcVar2.c;
        } else {
            i = 129676;
        }
        jaf jafVar = this.c;
        if (jafVar == null) {
            yks.c("veLogger");
            jafVar = null;
        }
        wmc wmcVar3 = a().i;
        if (wmcVar3 == null) {
            wmcVar3 = wmc.a;
        }
        vtw vtwVar = (vtw) wmcVar3.a(5, null);
        vtwVar.x(wmcVar3);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        ((wmc) vtwVar.b).c = i;
        vuc vucVarR = vtwVar.r();
        vucVarR.getClass();
        jafVar.i(view, (wmc) vucVarR);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    @Override // defpackage.bv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kap.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.bv
    public final void onDestroyView() {
        super.onDestroyView();
        TabLayout tabLayout = this.k;
        if (tabLayout == null) {
            yks.c("tabbedLayout");
            tabLayout = null;
        }
        ViewPager2 viewPager2 = this.j;
        if (viewPager2 == null) {
            yks.c("viewPager");
            viewPager2 = null;
        }
        pku pkuVar = this.l;
        if (pkuVar == null) {
            yks.c("tabConfigurationStrategy");
            pkuVar = null;
        }
        tbw tbwVar = new tbw(tabLayout, viewPager2, pkuVar);
        if (tbwVar.d) {
            RecyclerView.Adapter adapter = tbwVar.c;
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(tbwVar.g);
                tbwVar.g = null;
            }
            tbwVar.a.j(tbwVar.f);
            tbwVar.b.n(tbwVar.e);
            tbwVar.f = null;
            tbwVar.e = null;
            tbwVar.c = null;
            tbwVar.d = false;
        }
        ViewPager2 viewPager22 = this.j;
        if (viewPager22 == null) {
            yks.c("viewPager");
            viewPager22 = null;
        }
        viewPager22.d(null);
    }
}
