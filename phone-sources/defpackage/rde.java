package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rde extends rbn {
    private final rcn a;
    private final rdb b;

    public rde(rcn rcnVar, rdb rdbVar) {
        this.a = rcnVar;
        this.b = rdbVar;
    }

    private static final void d(View view) {
        view.setBackground(null);
        view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
        view.setMinimumHeight(0);
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vre) obj2).getClass();
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, ttm] */
    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        goe goeVar = (goe) obj;
        vre vreVar = (vre) obj2;
        vreVar.getClass();
        if (yks.e(vreVar, goeVar.e)) {
            return;
        }
        goeVar.e = vreVar;
        ViewGroup viewGroup = (ViewGroup) goeVar.d;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            viewGroup.getChildAt(i).setVisibility(8);
            i++;
        }
        if (!(vreVar instanceof vrg)) {
            if (!(vreVar instanceof vrf)) {
                throw new yfu();
            }
            Object obj3 = goeVar.c.get();
            obj3.getClass();
            vvd vvdVar = (vvd) obj3;
            Object obj4 = vvdVar.d;
            ((ViewGroup) obj4).setVisibility(0);
            vrf vrfVar = (vrf) vreVar;
            d((View) obj4);
            c(vvdVar.a, vrfVar.a);
            c(vvdVar.b, vrfVar.b);
            Object obj5 = vvdVar.c;
            View view = (View) obj5;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(Integer.valueOf(rrx.ah(((ViewGroup) obj5).getResources().getDisplayMetrics(), vrfVar.c + (-1) == 0 ? 4 : 8)).intValue());
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        vrg vrgVar = (vrg) vreVar;
        if (vrgVar instanceof vri) {
            rdb rdbVar = this.b;
            Object obj6 = goeVar.b.get();
            Object obj7 = ((cb) obj6).a;
            ((TextView) obj7).setVisibility(0);
            d((View) obj7);
            obj6.getClass();
            rdbVar.c(obj6, ((vri) vrgVar).a);
            return;
        }
        if (!(vrgVar instanceof vrh)) {
            throw new yfu();
        }
        rcn rcnVar = this.a;
        Object obj8 = goeVar.a.get();
        cb cbVar = (cb) obj8;
        vrh vrhVar = (vrh) vrgVar;
        int i2 = vrhVar.b - 1;
        int i3 = i2 != 1 ? i2 != 2 ? 32 : 24 : 20;
        Object obj9 = cbVar.a;
        ImageView imageView = (ImageView) obj9;
        int iAh = rrx.ah(imageView.getResources().getDisplayMetrics(), i3);
        View view2 = (View) obj9;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.width = iAh;
        layoutParams3.height = iAh;
        view2.setLayoutParams(layoutParams3);
        imageView.setVisibility(0);
        obj8.getClass();
        rcnVar.c(obj8, vrhVar.a);
    }
}
