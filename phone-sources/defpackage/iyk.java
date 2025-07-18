package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.videos.R;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyk extends scf {
    public boolean a;
    private final yfo b;
    private kjv c;
    private kjh d;
    private gbb e;

    public iyk(yfo yfoVar) {
        this.b = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.stream_layout;
    }

    public final void b(kjh kjhVar) {
        if (yks.e(this.d, kjhVar)) {
            return;
        }
        this.d = kjhVar;
        G(1);
    }

    public final void c(kjv kjvVar) {
        if (yks.e(this.c, kjvVar)) {
            return;
        }
        this.c = kjvVar;
        G(0);
    }

    public final void d(gbb gbbVar) {
        if (sfy.j(this.e, gbbVar)) {
            return;
        }
        this.e = gbbVar;
        G(2);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        iyk iykVar = (iyk) scfVar;
        long j = true != yks.e(this.c, iykVar.c) ? 1L : 0L;
        if (!yks.e(this.d, iykVar.d)) {
            j |= 2;
        }
        if (!sfy.j(this.e, iykVar.e)) {
            j |= 4;
        }
        if (!yks.e(null, null)) {
            j |= 8;
        }
        return !yks.e(Boolean.valueOf(this.a), Boolean.valueOf(iykVar.a)) ? j | 16 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new iyj();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.framework.stream.StreamViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) throws scr {
        sdi sdiVar;
        iyj iyjVar = (iyj) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                iyjVar.u(R.id.loading_indicator, this.c);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "loading_indicator", "com.google.android.apps.googletv.app.framework.stream.StreamViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                iyjVar.u(R.id.error_overlay, this.d);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "error_overlay", "com.google.android.apps.googletv.app.framework.stream.StreamViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            gbb gbbVar = this.e;
            View viewP = iyjVar.p(R.id.recycler_view);
            if (viewP instanceof RecyclerView) {
                iyjVar.v(R.id.recycler_view, gbbVar, R.layout.loading_indicator_view_layout);
            } else {
                if (!(viewP instanceof ViewPager)) {
                    throw new IllegalArgumentException("Only RecyclerView or ViewPager are supported by ModelListProp");
                }
                View viewP2 = iyjVar.p(R.id.recycler_view);
                if (!(viewP2 instanceof ViewPager)) {
                    Class<?> cls = viewP2.getClass();
                    Objects.toString(cls);
                    throw new IllegalArgumentException("Expected ViewPager to bind model list. Found ".concat(String.valueOf(cls)));
                }
                if (gbbVar == null) {
                    ((ViewPager) viewP2).setVisibility(8);
                    Map map = iyjVar.v;
                    Integer numValueOf = Integer.valueOf(R.id.recycler_view);
                    scb scbVar = (scb) map.get(numValueOf);
                    if (scbVar != null) {
                        scbVar.b();
                    }
                    map.remove(numValueOf);
                } else {
                    Map map2 = iyjVar.v;
                    Integer numValueOf2 = Integer.valueOf(R.id.recycler_view);
                    Object obj = map2.get(numValueOf2);
                    if (obj == null) {
                        scq scqVar = iyjVar.w;
                        scqVar.getClass();
                        ViewPager viewPager = (ViewPager) viewP2;
                        viewPager.getClass();
                        gll gllVar = viewPager.b;
                        if (gllVar == null) {
                            sdiVar = new sdi(scqVar.b, viewPager);
                        } else {
                            if (!(gllVar instanceof sdj)) {
                                int i = ylg.a;
                                ykl yklVar = new ykl(sdj.class);
                                yklVar.toString();
                                throw new IllegalArgumentException("ViewPager adapter is expected to be of type ".concat(yklVar.toString()));
                            }
                            sdiVar = ((sdj) gllVar).e;
                            if (sdiVar == null) {
                                sdiVar = new sdi(scqVar.b, viewPager);
                            }
                        }
                        obj = sdiVar;
                        map2.put(numValueOf2, obj);
                    }
                    ((scb) obj).a(gbbVar);
                    ((ViewPager) viewP2).setVisibility(0);
                }
            }
        }
        if (j == 0 || (8 & j) != 0) {
            View viewA = iyjVar.a();
            if (viewA instanceof RecyclerView) {
            }
        }
        if (j == 0 || (16 & j) != 0) {
            boolean z = this.a;
            View viewA2 = iyjVar.a();
            RecyclerView recyclerView = viewA2 instanceof RecyclerView ? (RecyclerView) viewA2 : null;
            if (recyclerView != null) {
                recyclerView.setOverScrollMode(z ? 2 : recyclerView.getOverScrollMode());
            }
        }
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.c, this.d, this.e, null, Boolean.valueOf(this.a));
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("StreamViewModel{loadingIndicator=%s, error=%s, stream=%s, runOnPost=%s, moreItemsAvailable=%s}", this.c, this.d, this.e, null, Boolean.valueOf(this.a));
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
