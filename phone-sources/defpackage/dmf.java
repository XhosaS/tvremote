package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmf {
    public static final int a;
    private static final Map b = yfm.h(new yfw(dmg.d, Integer.valueOf(R.layout.glance_text)), new yfw(dmg.e, Integer.valueOf(R.layout.glance_list)), new yfw(dmg.f, Integer.valueOf(R.layout.glance_check_box)), new yfw(dmg.g, Integer.valueOf(R.layout.glance_check_box_backport)), new yfw(dmg.h, Integer.valueOf(R.layout.glance_button)), new yfw(dmg.r, Integer.valueOf(R.layout.glance_swtch)), new yfw(dmg.s, Integer.valueOf(R.layout.glance_swtch_backport)), new yfw(dmg.i, Integer.valueOf(R.layout.glance_frame)), new yfw(dmg.t, Integer.valueOf(R.layout.glance_image_crop)), new yfw(dmg.w, Integer.valueOf(R.layout.glance_image_crop_decorative)), new yfw(dmg.u, Integer.valueOf(R.layout.glance_image_fit)), new yfw(dmg.x, Integer.valueOf(R.layout.glance_image_fit_decorative)), new yfw(dmg.v, Integer.valueOf(R.layout.glance_image_fill_bounds)), new yfw(dmg.y, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new yfw(dmg.j, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new yfw(dmg.k, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new yfw(dmg.l, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new yfw(dmg.m, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new yfw(dmg.n, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new yfw(dmg.o, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new yfw(dmg.p, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new yfw(dmg.q, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new yfw(dmg.z, Integer.valueOf(R.layout.glance_radio_button)), new yfw(dmg.A, Integer.valueOf(R.layout.glance_radio_button_backport)));
    private static final int c;

    static {
        int size = dle.f.size();
        c = size;
        a = Build.VERSION.SDK_INT >= 31 ? dle.h : dle.h / size;
    }

    public static final dma a(RemoteViews remoteViews, dmw dmwVar, dmg dmgVar, int i, djh djhVar, drm drmVar, drn drnVar) {
        int iIntValue;
        if (i > 10) {
            Objects.toString(dmgVar);
            Log.e("GlanceAppWidget", "Truncated " + dmgVar + " container from " + i + " to 10 elements", new IllegalArgumentException(String.valueOf(dmgVar).concat(" container cannot have more than 10 elements")));
        }
        int iK = ykn.k(i, 10);
        Integer numF = f(dmgVar, djhVar);
        if (numF != null) {
            iIntValue = numF.intValue();
        } else {
            dkp dkpVar = (dkp) dle.a.get(new dkq(dmgVar, iK, drmVar, drnVar));
            Integer numValueOf = dkpVar != null ? Integer.valueOf(dkpVar.a) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + dmgVar + " with " + i + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) dle.b.get(dmgVar);
        if (map == null) {
            Objects.toString(dmgVar);
            throw new IllegalArgumentException("Cannot find generated children for ".concat(String.valueOf(dmgVar)));
        }
        dma dmaVarE = e(remoteViews, dmwVar, iIntValue, djhVar);
        dma dmaVar = new dma(dmaVarE.a, dmaVarE.b, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(dmaVar.a);
        }
        return dmaVar;
    }

    public static final dma b(RemoteViews remoteViews, dmw dmwVar, dmg dmgVar, djh djhVar) {
        Integer numF = f(dmgVar, djhVar);
        if (numF != null || (numF = (Integer) b.get(dmgVar)) != null) {
            return e(remoteViews, dmwVar, numF.intValue(), djhVar);
        }
        Objects.toString(dmgVar);
        throw new IllegalArgumentException("Cannot use `insertView` with a container like ".concat(String.valueOf(dmgVar)));
    }

    public static final dmk c(dmw dmwVar, djh djhVar, int i) {
        czu czuVar;
        czu czuVar2;
        int i2 = Build.VERSION.SDK_INT;
        Context context = dmwVar.a;
        Integer numValueOf = Integer.valueOf(R.id.rootStubId);
        if (i2 >= 31) {
            int i3 = dle.h;
            if (i >= i3) {
                throw new IllegalArgumentException(a.ce(i, i3, "Index of the root view cannot be more than ", ", currently "));
            }
            dmt dmtVar = new dmt(1, 1);
            RemoteViews remoteViewsJ = cwo.j(dmwVar, dle.g + i);
            dsf dsfVar = (dsf) djhVar.b(null, anr.p);
            if (dsfVar != null) {
                cwk.m(context, remoteViewsJ, dsfVar, R.id.rootView);
            }
            dry dryVar = (dry) djhVar.b(null, anr.q);
            if (dryVar != null) {
                cwk.l(context, remoteViewsJ, dryVar, R.id.rootView);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                remoteViewsJ.removeAllViews(R.id.rootView);
            }
            return new dmk(remoteViewsJ, new dma(R.id.rootView, 0, Build.VERSION.SDK_INT >= 33 ? yhc.a : yfm.f(new yfw(0, yfm.f(new yfw(dmtVar, numValueOf)))), 2));
        }
        int i4 = c * i;
        int i5 = dle.h;
        if (i4 >= i5) {
            throw new IllegalArgumentException("Index of the root view cannot be more than " + (i5 >> 2) + ", currently " + i);
        }
        dsf dsfVar2 = (dsf) djhVar.b(null, anr.n);
        if (dsfVar2 != null) {
            czuVar = dsfVar2.a;
            d(czuVar, context);
        } else {
            czuVar = duk.a;
        }
        dry dryVar2 = (dry) djhVar.b(null, anr.o);
        if (dryVar2 != null) {
            czuVar2 = dryVar2.a;
            d(czuVar2, context);
        } else {
            czuVar2 = duk.a;
        }
        dui duiVar = dui.a;
        int i6 = true != yks.e(czuVar, duiVar) ? 1 : 4;
        int i7 = true == yks.e(czuVar2, duiVar) ? 4 : 1;
        dmt dmtVarI = i(i6, i7);
        Integer num = (Integer) dle.f.get(dmtVarI);
        if (num != null) {
            return new dmk(cwo.j(dmwVar, dle.g + i4 + num.intValue()), new dma(0, 0, yfm.f(new yfw(0, yfm.f(new yfw(dmtVarI, numValueOf)))), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + ((Object) cwn.p(i6)) + ", " + ((Object) cwn.p(i7)) + ']');
    }

    public static final void d(czu czuVar, Context context) {
        if (czuVar instanceof duj) {
            context.getResources();
            throw null;
        }
    }

    private static final dma e(RemoteViews remoteViews, dmw dmwVar, int i, djh djhVar) {
        Integer numValueOf;
        dsf dsfVar = (dsf) djhVar.b(null, anr.r);
        czu czuVar = dsfVar != null ? dsfVar.a : duk.a;
        dry dryVar = (dry) djhVar.b(null, anr.s);
        czu czuVar2 = dryVar != null ? dryVar.a : duk.a;
        boolean zC = djhVar.c(new cjp(10));
        int iA = android.R.id.background;
        if (zC) {
            numValueOf = null;
        } else {
            if (dmwVar.h.getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            numValueOf = Integer.valueOf(android.R.id.background);
        }
        int i2 = dmwVar.e;
        if (Build.VERSION.SDK_INT >= 33) {
            if (numValueOf != null) {
                numValueOf.intValue();
            } else {
                iA = dmwVar.a();
            }
            cwo.m(remoteViews, dmwVar.g.a, new RemoteViews(dmwVar.a.getPackageName(), i, iA), i2);
            return new dma(iA, 0, null, 6);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            duh duhVar = duh.a;
            return new dma(cwp.r(remoteViews, dmwVar, g(remoteViews, dmwVar, i2, true != yks.e(czuVar, duhVar) ? 1 : 3, true == yks.e(czuVar2, duhVar) ? 3 : 1), i, numValueOf), 0, null, 6);
        }
        Context context = dmwVar.a;
        d(czuVar, context);
        int iJ = j(czuVar);
        d(czuVar2, context);
        int iJ2 = j(czuVar2);
        int iG = g(remoteViews, dmwVar, i2, iJ, iJ2);
        if (iJ != 2 && iJ2 != 2) {
            return new dma(cwp.r(remoteViews, dmwVar, iG, i, numValueOf), 0, null, 6);
        }
        dmd dmdVar = (dmd) dle.e.get(new dmt(iJ, iJ2));
        if (dmdVar != null) {
            return new dma(cwp.r(remoteViews, dmwVar, R.id.glanceViewStub, i, numValueOf), cwp.r(remoteViews, dmwVar, iG, dmdVar.a, null), null, 4);
        }
        throw new IllegalArgumentException("Could not find complex layout for width=" + ((Object) cwn.p(iJ)) + ", height=" + ((Object) cwn.p(iJ2)));
    }

    private static final Integer f(dmg dmgVar, djh djhVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            djx djxVar = (djx) djhVar.b(null, anr.t);
            dsf dsfVar = (dsf) djhVar.b(null, dme.b);
            boolean zE = dsfVar != null ? yks.e(dsfVar.a, duh.a) : false;
            dry dryVar = (dry) djhVar.b(null, dme.a);
            boolean zE2 = dryVar != null ? yks.e(dryVar.a, duh.a) : false;
            if (djxVar != null) {
                dro droVar = djxVar.a;
                dmd dmdVar = (dmd) dle.c.get(new dkm(dmgVar, droVar.e, droVar.f));
                if (dmdVar != null) {
                    return Integer.valueOf(dmdVar.a);
                }
                throw new IllegalArgumentException(a.ck(droVar, dmgVar, "Cannot find ", " with alignment "));
            }
            if (!zE) {
                if (zE2) {
                    zE2 = true;
                }
            }
            dmd dmdVar2 = (dmd) dle.d.get(new dmm(dmgVar, zE, zE2));
            if (dmdVar2 != null) {
                return Integer.valueOf(dmdVar2.a);
            }
            throw new IllegalArgumentException(a.cj(dmgVar, "Cannot find ", " with defaultWeight set"));
        }
        return null;
    }

    private static final int g(RemoteViews remoteViews, dmw dmwVar, int i, int i2, int i3) {
        Map map = dmwVar.g.c;
        dmt dmtVarI = i(i2, i3);
        Map map2 = (Map) map.get(Integer.valueOf(i));
        if (map2 == null) {
            throw new IllegalStateException(a.cf(i, "Parent doesn't have child position "));
        }
        Integer num = (Integer) map2.get(dmtVarI);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i + " and size " + ((Object) cwn.p(i2)) + " x " + ((Object) cwn.p(i3)));
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map2.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cwp.r(remoteViews, dmwVar, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return iIntValue;
    }

    private static final int h(int i) {
        if (i == 2) {
            return 1;
        }
        return i;
    }

    private static final dmt i(int i, int i2) {
        return new dmt(h(i), h(i2));
    }

    private static final int j(czu czuVar) {
        if (czuVar instanceof duk) {
            return 1;
        }
        if (czuVar instanceof duh) {
            return 3;
        }
        if (czuVar instanceof dui) {
            return 4;
        }
        if ((czuVar instanceof dug) || (czuVar instanceof duj)) {
            return 2;
        }
        throw new yfu();
    }
}
