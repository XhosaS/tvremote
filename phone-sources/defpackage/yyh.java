package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.content.res.AppCompatResources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyh {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public yyh(cb cbVar, aafi aafiVar, xzg xzgVar, cb cbVar2, xzg xzgVar2) {
        this.c = cbVar;
        this.e = aafiVar;
        this.b = xzgVar;
        this.d = cbVar2;
        this.a = xzgVar2;
    }

    public static final cyh h(View view, cyh cyhVar) throws Resources.NotFoundException {
        view.getClass();
        csr csrVarF = cyhVar.f(519);
        int iAh = rrx.ah(view.getContext().getResources().getDisplayMetrics(), 60);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.og_bento_menu_large_screen_bottom_margin);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = csrVarF.c + iAh;
        int i = csrVarF.e;
        if (i >= dimensionPixelSize) {
            dimensionPixelSize += i;
        }
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        view.setLayoutParams(marginLayoutParams);
        return cyh.a;
    }

    public static final void j(View view, View view2) {
        view2.addOnLayoutChangeListener(new fta(view, 4, null));
    }

    private static final Drawable o(Context context, int i, int i2, int i3) {
        return new LayerDrawable(new Drawable[]{rrx.aj(context, i2, i3), rrx.aj(context, R.drawable.card_exclamation_vd, i)});
    }

    private static final void p(View view, View view2) {
        cww.p(view, new rav(view2));
    }

    public final int a() {
        return ((yns) this.c).b - ((yns) this.d).b;
    }

    public final yyd b(yyd yydVar) {
        if (a() == 127) {
            return yydVar;
        }
        if (yydVar.h) {
            ((yns) this.e).c();
        }
        yns ynsVar = (yns) this.c;
        int i = 127 & ynsVar.b;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, yydVar);
                ynsVar.c();
                return null;
            }
            Thread.yield();
        }
    }

    public final yyd c() {
        yyd yydVar;
        while (true) {
            Object obj = this.d;
            Object obj2 = this.c;
            yns ynsVar = (yns) obj;
            int i = ynsVar.b;
            if (i - ((yns) obj2).b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (ynsVar.d(i, i + 1) && (yydVar = (yyd) ((AtomicReferenceArray) this.a).getAndSet(i2, null)) != null) {
                if (yydVar.h) {
                    ((yns) this.e).a();
                    boolean z = yoy.a;
                }
                return yydVar;
            }
        }
    }

    public final yyd d(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        int i2 = i & 127;
        yyd yydVar = (yyd) atomicReferenceArray.get(i2);
        if (yydVar != null && yydVar.h == z) {
            while (!atomicReferenceArray.compareAndSet(i2, yydVar, null)) {
                if (atomicReferenceArray.get(i2) != yydVar) {
                }
            }
            if (z) {
                ((yns) this.e).a();
            }
            return yydVar;
        }
        return null;
    }

    public final int e() {
        srp srpVar = (srp) this.b;
        return ((srn) this.c).a + 288 + ((srn) this.a).a + srpVar.a() + ((sro) srpVar.d).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yfo] */
    public final rqd f(Executor executor, xbw xbwVar, yfo yfoVar) {
        rqb rqbVar = (rqb) this.a.b();
        rqbVar.getClass();
        rne rneVar = (rne) this.c.b();
        rneVar.getClass();
        Object objB = this.b.b();
        executor.getClass();
        xbwVar.getClass();
        ?? r6 = this.e;
        return new rqd(rqbVar, this.d, rneVar, (unc) objB, r6, executor, xbwVar, yfoVar);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r11v63, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r11v71, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r11v85, types: [java.lang.Object, xbw] */
    public final Drawable g(Context context, vps vpsVar) {
        Drawable drawable;
        Drawable drawableAj;
        Drawable drawableAj2;
        Drawable drawableAj3;
        Drawable drawable2;
        Drawable drawableAj4;
        Drawable drawableAj5;
        drawable = null;
        Drawable drawable3 = null;
        if (!(vpsVar instanceof vpv)) {
            if (vpsVar instanceof vqh) {
                throw null;
            }
            if (!(vpsVar instanceof vqn)) {
                throw new yfu();
            }
            vot votVar = vpsVar instanceof vot ? (vot) vpsVar : null;
            if (votVar == null) {
                throw new IllegalArgumentException("TintAwareImage should be the only implementation of TintAwareImageInterface.");
            }
            if (votVar instanceof vor) {
                drawable = AppCompatResources.getDrawable(context, ((vor) votVar).a);
                drawable.getClass();
            } else {
                if (!(votVar instanceof voq)) {
                    throw new yfu();
                }
                drawable = ((voq) votVar).a;
            }
            if (!votVar.a()) {
                return drawable;
            }
            rrx.am(drawable, ((xzg) this.c.b()).c(vro.ON_SURFACE_VARIANT));
            drawable.getClass();
            return drawable;
        }
        int i = ((vpv) vpsVar).a - 1;
        int i2 = R.color.google_grey900;
        switch (i) {
            case 0:
                ?? r11 = this.c;
                if (true == ((xzg) r11.b()).e()) {
                    i2 = R.color.google_white;
                }
                return o(context, context.getColor(i2), R.drawable.card_alert_bg_vd, ((xzg) r11.b()).c(vro.ERROR));
            case 1:
                return o(context, context.getColor(R.color.google_grey900), R.drawable.card_alert_bg_vd, ((xzg) this.c.b()).c(vro.YELLOW));
            case 2:
                rad radVar = (rad) ((tst) this.d).f();
                if (radVar != null) {
                    Drawable drawable4 = AppCompatResources.getDrawable(context, ((xzg) this.c.b()).e() ? radVar.b() : radVar.a());
                    if (drawable4 != null) {
                        return drawable4;
                    }
                }
                throw new IllegalStateException("Missing build dependencies for Storage card resources.");
            case 3:
                raa raaVar = (raa) ((tst) this.e).f();
                if (raaVar == null || (drawableAj = rrx.aj(context, raaVar.c(), ((xzg) this.c.b()).c(vro.ON_SURFACE_VARIANT))) == null) {
                    throw new IllegalStateException("Missing build dependencies for BackupSync card resources.");
                }
                return drawableAj;
            case 4:
                raa raaVar2 = (raa) ((tst) this.e).f();
                if (raaVar2 == null || (drawableAj2 = rrx.aj(context, raaVar2.a(), ((xzg) this.c.b()).c(vro.STATIC_TERTIARY))) == null) {
                    throw new IllegalStateException("Missing build dependencies for BackupSync card resources.");
                }
                return drawableAj2;
            case 5:
                raa raaVar3 = (raa) ((tst) this.e).f();
                if (raaVar3 == null || (drawableAj3 = rrx.aj(context, raaVar3.b(), ((xzg) this.c.b()).c(vro.ON_SURFACE_VARIANT))) == null) {
                    throw new IllegalStateException("Missing build dependencies for BackupSync card resources.");
                }
                return drawableAj3;
            case 6:
                ?? r112 = this.c;
                Drawable drawableAj6 = rrx.aj(context, R.drawable.gs_add_vd_theme_24, ((xzg) r112.b()).c(vro.PRIMARY));
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(((xzg) r112.b()).c(vro.SURFACE_CONTAINER));
                return new LayerDrawable(new Drawable[]{shapeDrawable, drawableAj6});
            case 7:
                Drawable drawableAj7 = rrx.aj(context, true != qwt.b(context) ? R.drawable.gs_work_vd_theme_24 : R.drawable.gs_account_circle_vd_theme_24, ((xzg) this.c.b()).c(vro.PRIMARY));
                drawableAj7.getClass();
                return drawableAj7;
            case 8:
                Drawable drawableAj8 = rrx.aj(context, R.drawable.quantum_gm_ic_manage_accounts_vd_theme_24, ((xzg) this.c.b()).c(vro.ON_SURFACE_VARIANT));
                drawableAj8.getClass();
                return drawableAj8;
            case 9:
                Drawable drawableAj9 = rrx.aj(context, ((rae) ((tst) this.b).c()).a(), ((xzg) this.c.b()).c(vro.ON_SURFACE_VARIANT));
                drawableAj9.getClass();
                return drawableAj9;
            case 10:
                return o(context, context.getColor(R.color.gm3_ref_palette_neutral10), R.drawable.gs_shield_fill1_vd_theme_24, ((xzg) this.c.b()).c(vro.YELLOW));
            case 11:
                ?? r113 = this.c;
                int iC = ((xzg) r113.b()).c(vro.PRIMARY);
                int iC2 = ((xzg) r113.b()).c(vro.ON_SURFACE);
                int iAh = rrx.ah(context.getResources().getDisplayMetrics(), 24);
                ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_enabled}, new int[]{-16842910}}, new int[]{iC, iC2, iC2});
                Drawable drawable5 = AppCompatResources.getDrawable(context, R.drawable.gs_photo_camera_vd_theme_24);
                rrx.al(drawable5, colorStateList);
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[0] = new InsetDrawable(drawable5, iAh / 6);
                int iAk = rrx.ak(context);
                if (iAk != 0 && (drawable2 = context.getDrawable(iAk)) != null) {
                    if (drawable2 instanceof RippleDrawable) {
                        ((RippleDrawable) drawable2).setRadius(iAh / 2);
                    }
                    drawable3 = drawable2;
                }
                drawableArr[1] = drawable3;
                return new LayerDrawable(drawableArr);
            case 12:
                Drawable drawableAj10 = rrx.aj(context, R.drawable.googlelogo_standard_color_74x24_vd, ((xzg) this.c.b()).c(vro.ON_SURFACE));
                drawableAj10.getClass();
                return drawableAj10;
            case 13:
                tst tstVar = (tst) this.a;
                if (((rac) tstVar.f()) == null || (drawableAj4 = rrx.aj(context, ((rac) tstVar.c()).b(), ((xzg) this.c.b()).c(vro.ON_SURFACE_VARIANT))) == null) {
                    throw new IllegalStateException("Missing build dependencies for Incognito resources.");
                }
                return drawableAj4;
            case 14:
                tst tstVar2 = (tst) this.a;
                if (((rac) tstVar2.f()) == null || (drawableAj5 = rrx.aj(context, ((rac) tstVar2.c()).a(), ((xzg) this.c.b()).c(vro.ON_PRIMARY))) == null) {
                    throw new IllegalStateException("Missing build dependencies for Incognito resources.");
                }
                return drawableAj5;
            default:
                RoundRectShape roundRectShape = new RoundRectShape(null, null, null);
                PaintDrawable paintDrawable = new PaintDrawable(((xzg) this.c.b()).c(vro.SURFACE_VARIANT));
                paintDrawable.setShape(roundRectShape);
                paintDrawable.setIntrinsicWidth(-1);
                paintDrawable.setIntrinsicHeight(-1);
                return paintDrawable;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v4 */
    public final ray i(ViewGroup viewGroup) {
        final int dimensionPixelSize;
        int i;
        boolean z;
        int i2 = viewGroup.getResources().getConfiguration().smallestScreenWidthDp;
        int i3 = viewGroup.getResources().getConfiguration().orientation;
        boolean z2 = i2 >= 600;
        boolean z3 = z2 || i3 == 1;
        if (z3) {
            dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.toolbar_horizontal_padding_single_pane);
            i = R.layout.og_bento_content_single_pane;
        } else {
            dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.toolbar_horizontal_padding_two_panes);
            i = R.layout.og_bento_content_two_panes;
        }
        LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.og_bento_container_with_toolbar);
        final ViewGroup viewGroup2 = (ViewGroup) frameLayout.findViewById(R.id.og_bento_container);
        View viewFindViewById = viewGroup.findViewById(R.id.og_bento_disable_content_view);
        viewFindViewById.setOnClickListener(new ras(0));
        if (Build.VERSION.SDK_INT >= 26) {
            viewFindViewById.setFocusable(0);
        }
        viewFindViewById.setImportantForAccessibility(2);
        viewFindViewById.setAlpha(0.5f);
        viewFindViewById.setBackgroundColor(qtl.ac(R.dimen.gm3_sys_elevation_level2, viewFindViewById.getContext()));
        List listS = yfm.s(Integer.valueOf(R.id.og_bento_scroll_container), Integer.valueOf(R.id.og_bento_scroll_container_left_pane));
        ArrayList<NestedScrollView> arrayList = new ArrayList();
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewGroup2.findViewById(((Number) it.next()).intValue());
            if (nestedScrollView != null) {
                arrayList.add(nestedScrollView);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        for (NestedScrollView nestedScrollView2 : arrayList) {
            raw rawVar = new raw((xzg) this.b);
            nestedScrollView2.e = rawVar;
            rawVar.onScrollChange(nestedScrollView2, nestedScrollView2.getScrollX(), nestedScrollView2.getScrollY(), 0, 0);
            arrayList2.add(ygi.a);
        }
        if (Build.VERSION.SDK_INT <= 26) {
            viewGroup2.setFocusableInTouchMode(true);
            viewGroup2.setDescendantFocusability(131072);
            viewGroup2.requestFocus();
        }
        View viewFindViewById2 = viewGroup2.findViewById(R.id.og_bento_accounts_state_layout_container);
        viewFindViewById2.getClass();
        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById2;
        final FrameLayout frameLayout3 = (FrameLayout) frameLayout.findViewById(R.id.og_bento_toolbar);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.og_bento_product_space_container);
        FrameLayout frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.og_bento_account_card_container);
        FrameLayout frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.og_bento_storage_card_container);
        FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.og_bento_high_priority_storage_card_container);
        FrameLayout frameLayout7 = (FrameLayout) viewGroup.findViewById(R.id.og_bento_switch_profile_card_container);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.og_bento_main_scroll_content);
        viewGroup4.getClass();
        boolean z4 = z2;
        viewGroup4.addOnLayoutChangeListener(new rau(viewGroup4, viewGroup4, layoutTransition, 1));
        ViewGroup viewGroup5 = (ViewGroup) viewGroup.findViewById(R.id.og_bento_accounts_cards_footer_container);
        if (viewGroup5 != null) {
            z = 1;
            viewGroup5.addOnLayoutChangeListener(new rau(viewGroup5, viewGroup5, layoutTransition, 0));
        } else {
            z = 1;
        }
        frameLayout3.getClass();
        View viewInflate = LayoutInflater.from(frameLayout3.getContext()).inflate(R.layout.og_bento_toolbar, frameLayout3);
        viewInflate.getClass();
        View viewFindViewById3 = viewInflate.findViewById(R.id.og_bento_toolbar_selected_account_avatar);
        viewFindViewById3.getClass();
        FrameLayout frameLayout8 = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.og_bento_toolbar_close_button);
        viewFindViewById4.getClass();
        vvd vvdVar = new vvd(viewInflate, (ImageView) viewFindViewById4, rdd.o(frameLayout8), frameLayout8);
        FrameLayout frameLayout9 = (FrameLayout) viewGroup2.findViewById(R.id.og_bento_two_panes_account_menu_title_container);
        if (frameLayout9 == null) {
            View viewFindViewById5 = frameLayout3.findViewById(R.id.og_bento_single_pane_account_menu_title_container);
            viewFindViewById5.getClass();
            frameLayout9 = (FrameLayout) viewFindViewById5;
        }
        if (z4) {
            mqg mqgVar = new mqg(3);
            cyh cyhVarA = (Build.VERSION.SDK_INT >= 34 ? new cxv() : Build.VERSION.SDK_INT >= 31 ? new cxu() : Build.VERSION.SDK_INT >= 30 ? new cxt() : Build.VERSION.SDK_INT >= 29 ? new cxs() : new cxr()).a();
            cyhVarA.getClass();
            h(viewGroup, cyhVarA);
            int[] iArr = cww.a;
            cwm.l(viewGroup, mqgVar);
            viewGroup2.getClass();
            j(viewGroup2, frameLayout3);
        } else {
            viewGroup2.getClass();
            Integer numValueOf = Integer.valueOf(R.id.og_bento_main_scroll_content);
            Integer numValueOf2 = Integer.valueOf(R.id.og_bento_secondary_scroll_content);
            Integer[] numArr = new Integer[2];
            numArr[0] = numValueOf;
            numArr[z] = numValueOf2;
            List listS2 = yfm.s(numArr);
            final ArrayList arrayList3 = new ArrayList();
            Iterator it2 = listS2.iterator();
            while (it2.hasNext()) {
                View viewFindViewById6 = viewGroup2.findViewById(((Number) it2.next()).intValue());
                if (viewFindViewById6 != null) {
                    arrayList3.add(viewFindViewById6);
                }
            }
            cvq cvqVar = new cvq() { // from class: rat
                @Override // defpackage.cvq
                public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
                    view.getClass();
                    csr csrVarF = cyhVar.f(647);
                    int i4 = csrVarF.c;
                    int i5 = csrVarF.b;
                    int i6 = csrVarF.d;
                    int i7 = dimensionPixelSize;
                    View view2 = frameLayout3;
                    view2.setPadding(i7 + i5, i4, i7 + i6, view2.getPaddingBottom());
                    View view3 = viewGroup2;
                    view3.setPadding(i5, view3.getPaddingTop(), i6, view3.getPaddingBottom());
                    for (View view4 : arrayList3) {
                        view4.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), csrVarF.e);
                    }
                    yyh.j(view3, view2);
                    return cyh.a;
                }
            };
            cyh cyhVarA2 = (Build.VERSION.SDK_INT >= 34 ? new cxv() : Build.VERSION.SDK_INT >= 31 ? new cxu() : Build.VERSION.SDK_INT >= 30 ? new cxt() : Build.VERSION.SDK_INT >= 29 ? new cxs() : new cxr()).a();
            cyhVarA2.getClass();
            cvqVar.onApplyWindowInsets(viewGroup, cyhVarA2);
            int[] iArr2 = cww.a;
            cwm.l(viewGroup, cvqVar);
            rrx.aa(viewGroup);
            xzg xzgVar = (xzg) this.a;
            rrx.ab(viewGroup, z, xzgVar.e());
            boolean zE = xzgVar.e();
            if (Build.VERSION.SDK_INT >= 29) {
                viewGroup.setSystemUiVisibility(zE ? viewGroup.getSystemUiVisibility() | 16 : viewGroup.getSystemUiVisibility() & (-17));
            }
        }
        if (z3) {
            p(frameLayout9, (View) vvdVar.c);
        }
        p(viewGroup2, (View) vvdVar.c);
        View viewFindViewById7 = viewGroup2.findViewById(R.id.og_bento_scroll_container);
        viewFindViewById7.getClass();
        NestedScrollView nestedScrollView3 = (NestedScrollView) viewFindViewById7;
        LayoutInflater.from(frameLayout9.getContext()).inflate(R.layout.og_bento_account_menu_title, frameLayout9);
        View viewFindViewById8 = frameLayout9.findViewById(R.id.og_bento_account_menu_title_text);
        viewFindViewById8.getClass();
        cb cbVar = new cb((TextView) viewFindViewById8, (byte[]) null);
        View viewFindViewById9 = frameLayout9.findViewById(R.id.og_bento_account_menu_title_image);
        viewFindViewById9.getClass();
        rbi rbiVar = new rbi(cbVar, new cb((ImageView) viewFindViewById9, (byte[]) null));
        ttm ttmVarL = sij.l(new qoi(frameLayout2, 5));
        ttm ttmVarL2 = sij.l(new qoi(frameLayout2, 6));
        View viewFindViewById10 = viewGroup2.findViewById(R.id.og_bento_without_accounts_divider);
        View view = viewFindViewById10 != null ? viewFindViewById10 : null;
        frameLayout4.getClass();
        View view2 = view;
        ttm ttmVarL3 = sij.l(new evk(this, frameLayout4, 7));
        ttm ttmVarL4 = sij.l(new evk(this, viewGroup2, 8));
        View viewFindViewById11 = viewGroup2.findViewById(R.id.og_bento_policy_footer_container);
        viewFindViewById11.getClass();
        ViewGroup viewGroup6 = (ViewGroup) viewFindViewById11;
        Context context = viewGroup6.getContext();
        context.getClass();
        rbg rbgVar = new rbg(context);
        viewGroup6.addView(rbgVar);
        View viewFindViewById12 = rbgVar.findViewById(R.id.og_bento_privacy_policy_button);
        viewFindViewById12.getClass();
        View viewFindViewById13 = rbgVar.findViewById(R.id.og_bento_tos_button);
        viewFindViewById13.getClass();
        View viewFindViewById14 = rbgVar.findViewById(R.id.og_bento_custom_button);
        viewFindViewById14.getClass();
        vvd vvdVar2 = new vvd(rbgVar, (MaterialButton) viewFindViewById12, (MaterialButton) viewFindViewById13, (MaterialButton) viewFindViewById14);
        frameLayout5.getClass();
        ttm ttmVarL5 = sij.l(new evk(this, frameLayout5, 9));
        frameLayout6.getClass();
        ttm ttmVarL6 = sij.l(new evk(this, frameLayout6, 10));
        frameLayout7.getClass();
        ttm ttmVarL7 = sij.l(new evk(this, frameLayout7, 11));
        viewGroup3.getClass();
        ttm ttmVarL8 = sij.l(new evk(this, viewGroup3, 12));
        viewFindViewById.getClass();
        return new ray(viewGroup, viewGroup2, nestedScrollView3, rbiVar, vvdVar, frameLayout2, ttmVarL, ttmVarL2, view2, frameLayout4, ttmVarL3, ttmVarL4, vvdVar2, frameLayout5, ttmVarL5, frameLayout6, ttmVarL6, frameLayout7, ttmVarL7, viewGroup3, ttmVarL8, z3, viewFindViewById);
    }

    public final String k(vqe vqeVar, Context context) throws NumberFormatException {
        vqeVar.getClass();
        vpw vpwVar = vqeVar.a;
        if (vpwVar instanceof vqd) {
            return ((vqd) vpwVar).a;
        }
        if (vpwVar instanceof vpx) {
            throw null;
        }
        if (!(vpwVar instanceof vqc)) {
            throw new yfu();
        }
        vqc vqcVar = (vqc) vpwVar;
        vqa vqaVar = vqcVar.a;
        if (!(vqaVar instanceof vpy)) {
            if (!(vqaVar instanceof vpz)) {
                if (!(vqaVar instanceof vqb)) {
                    throw new yfu();
                }
                if (vqcVar.b == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            vpz vpzVar = (vpz) vqaVar;
            String str = vqcVar.b;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            switch (vpzVar.ordinal()) {
                case 0:
                    return new vru(new vrv(R.string.og_bento_greeting_hi_message_with_name), str).a(context);
                case 1:
                    return new vru(new vrv(R.string.og_signed_in_as_account), str).a(context);
                case 2:
                    return new vru(new vrv(R.string.og_bento_alert_greeting_with_name), str).a(context);
                case 3:
                    return new vru(new vrv(R.string.og_bento_more_from_product), str).a(context);
                case 4:
                    return ((rae) ((tst) this.c).c()).c().a(context);
                case 5:
                    raa raaVar = (raa) ((tst) this.e).c();
                    Integer.parseInt(str);
                    return raaVar.p().b(context);
                case 6:
                    raa raaVar2 = (raa) ((tst) this.e).c();
                    Integer.parseInt(str);
                    return raaVar2.n().b(context);
                case 7:
                    raa raaVar3 = (raa) ((tst) this.e).c();
                    Integer.parseInt(str);
                    return raaVar3.o().b(context);
                default:
                    throw new yfu();
            }
        }
        switch (((vpy) vqaVar).ordinal()) {
            case 0:
                return new vrv(R.string.og_bento_greeting_hi_message_without_name).a(context);
            case 1:
                return new vrv(R.string.og_choose_an_account_title).a(context);
            case 2:
                return new vrv(R.string.og_bento_switch_account).a(context);
            case 3:
                return new vrv(R.string.og_my_account_desc_long_length).a(context);
            case 4:
                return new vrv(R.string.og_my_account_desc_meduim_length).a(context);
            case 5:
                return new vrv(R.string.og_my_account_desc_short_length).a(context);
            case 6:
                return new vrv(R.string.og_bento_short_greeting_hi_message).a(context);
            case 7:
                return new vrv(R.string.og_privacy_policy).a(context);
            case 8:
                return new vrv(R.string.og_terms_of_service).a(context);
            case 9:
                return new vrv(R.string.og_manage_accounts).a(context);
            case 10:
                return new vrv(R.string.og_add_another_account).a(context);
            case 11:
                return new vrv(R.string.og_obake_feature_a11y).a(context);
            case 12:
                return new vrv(R.string.og_google_one_account_a11y).a(context);
            case 13:
                return new vrv(R.string.og_recommended_actions_entry_point).a(context);
            case 14:
                return new vrv(R.string.og_bento_alert_greeting_without_name).a(context);
            case 15:
                return new vrv(R.string.og_expand_account_list_a11y).a(context);
            case 16:
                return new vrv(R.string.og_collapse_account_list_a11y).a(context);
            case 17:
                return new vrv(R.string.og_account_list_expanded_a11y).a(context);
            case 18:
                return new vrv(R.string.og_account_list_collapsed_a11y).a(context);
            case 19:
                return new vrv(R.string.og_account_and_settings).a(context);
            case 20:
                return new vrv(R.string.og_account_particle_disc_no_accounts_available_a11y).a(context);
            case 21:
                return new vrv(R.string.og_bento_more_from_product_fallback).a(context);
            case 22:
                return new vrv(R.string.og_bento_a11y_dialog).a(context);
            case 23:
                return ((rac) ((tst) this.d).c()).d().a(context);
            case 24:
                return ((rac) ((tst) this.d).c()).e().a(context);
            case 25:
                return ((rae) ((tst) this.c).c()).b().a(context);
            case 26:
                return ((rac) ((tst) this.d).c()).c().a(context);
            case 27:
                return ((rab) ((tst) this.a).c()).a().a(context);
            case 28:
                return new vrv(R.string.og_bento_unicorn_account_header_title).a(context);
            case 29:
                return ((rad) ((tst) this.b).c()).d().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return ((raa) ((tst) this.e).c()).d().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return ((raa) ((tst) this.e).c()).l().a(context);
            case 32:
                return ((raa) ((tst) this.e).c()).e().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return ((rad) ((tst) this.b).c()).c().a(context);
            case 34:
                return ((rad) ((tst) this.b).c()).f().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return ((rad) ((tst) this.b).c()).e().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return ((raa) ((tst) this.e).c()).k().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return ((raa) ((tst) this.e).c()).j().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return ((raa) ((tst) this.e).c()).i().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return ((raa) ((tst) this.e).c()).m().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return ((raa) ((tst) this.e).c()).h().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return ((raa) ((tst) this.e).c()).g().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return ((raa) ((tst) this.e).c()).f().a(context);
            case android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return new vrv(R.string.og_bento_deactivated_label).a(context);
            default:
                throw new yfu();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yfo] */
    public final qta l(qsx qsxVar, String str, int i) {
        Context contextA = ((rgq) this.c).a();
        yil yilVarA = ((mdx) this.e).a();
        yil yilVarA2 = ((mdx) this.a).a();
        pvg pvgVar = (pvg) this.d.b();
        pvgVar.getClass();
        qps qpsVar = new qps();
        qoj qojVar = (qoj) this.b.b();
        qojVar.getClass();
        return new qta(contextA, yilVarA, yilVarA2, pvgVar, qpsVar, qojVar, qsxVar, str, i);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, qmt] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, qor] */
    public final qhs m(vhq vhqVar) {
        vhqVar.getClass();
        return new qhs(null, vhqVar, 0, null, (qei) this.a, (qig) this.d, this.b, this.c);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, qmt] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, qor] */
    public final qhs n(vie vieVar) {
        vieVar.getClass();
        return new qhs(vieVar, null, 0, null, (qei) this.a, (qig) this.d, this.b, this.c);
    }

    public yyh(tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4, tst tstVar5) {
        this.d = tstVar;
        this.c = tstVar2;
        this.a = tstVar3;
        this.b = tstVar4;
        this.e = tstVar5;
    }

    public yyh(unx unxVar, FrameLayout frameLayout, xrk xrkVar, Button button, xrk xrkVar2) {
        this.e = unxVar;
        this.a = frameLayout;
        this.d = xrkVar;
        this.b = button;
        this.c = xrkVar2;
    }

    public yyh(Context context, nmj nmjVar, noo nooVar) {
        String strE;
        if (nmjVar.b().isEmpty()) {
            strE = jys.C(nmjVar.d);
        } else {
            String str = nmjVar.d;
            List listB = nmjVar.b();
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (listB != null) {
                strE = new mru(str, listB).e();
            } else {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
        }
        this.e = new nnh(this, 0);
        ocv.aF(context);
        this.d = context.getApplicationContext();
        ocv.aD(strE);
        this.b = strE;
        this.c = nmjVar;
        this.a = nooVar;
    }

    public yyh(xbw xbwVar, tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4) {
        xbwVar.getClass();
        this.c = xbwVar;
        this.d = tstVar;
        this.a = tstVar2;
        this.b = tstVar3;
        this.e = tstVar4;
    }

    public yyh(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5) {
        yfoVar.getClass();
        this.a = yfoVar;
        this.d = yfoVar2;
        this.c = yfoVar3;
        this.b = yfoVar4;
        this.e = yfoVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yyh(defpackage.rxp r32, defpackage.rzg r33) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyh.<init>(rxp, rzg):void");
    }

    public yyh(qbr qbrVar, nsf nsfVar, yil yilVar, yil yilVar2, yil yilVar3) {
        qbrVar.getClass();
        nsfVar.getClass();
        this.c = qbrVar;
        this.d = nsfVar;
        this.b = yilVar;
        this.e = yilVar2;
        this.a = yilVar3;
    }

    public yyh(osk oskVar, qei qeiVar, qig qigVar, qmt qmtVar, qor qorVar) {
        oskVar.getClass();
        qeiVar.getClass();
        this.e = oskVar;
        this.a = qeiVar;
        this.d = qigVar;
        this.b = qmtVar;
        this.c = qorVar;
    }

    public yyh(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, byte[] bArr) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.e = yfoVar2;
        yfoVar3.getClass();
        this.a = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
        yfoVar5.getClass();
        this.b = yfoVar5;
    }

    public yyh(AppCompatActivity appCompatActivity, qwn qwnVar, SelectedAccountDisc selectedAccountDisc, qxn qxnVar) {
        sij.o(true, "Activity or Fragment should be non-null but not both");
        this.e = appCompatActivity;
        this.b = qwnVar;
        this.a = selectedAccountDisc;
        this.d = new qwb(selectedAccountDisc, qwnVar);
        this.c = qxnVar;
    }

    public yyh(rzi rziVar, rzg rzgVar) {
        vsz vszVar;
        String str;
        rzi.a.equals(rziVar);
        this.b = rziVar.c;
        this.c = rziVar.d;
        String str2 = rziVar.e;
        long j = rziVar.f;
        this.a = ImmutableSet.of();
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(rziVar.g.size() + 3);
        for (rzj rzjVar : rziVar.g) {
            int i = rzjVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                builderBuilderWithExpectedSize.put(rzjVar.e, Long.valueOf(i == 2 ? ((Long) rzjVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                builderBuilderWithExpectedSize.put(rzjVar.e, Boolean.valueOf(i == 3 ? ((Boolean) rzjVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                builderBuilderWithExpectedSize.put(rzjVar.e, Double.valueOf(i == 4 ? ((Double) rzjVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                String str3 = rzjVar.e;
                if (i == 5) {
                    str = (String) rzjVar.d;
                } else {
                    str = "";
                }
                builderBuilderWithExpectedSize.put(str3, str);
            } else if (i3 == 4) {
                String str4 = rzjVar.e;
                if (i == 6) {
                    vszVar = (vsz) rzjVar.d;
                } else {
                    vszVar = vsz.b;
                }
                builderBuilderWithExpectedSize.put(str4, vszVar.w());
            }
        }
        builderBuilderWithExpectedSize.put("__phenotype_server_token", rziVar.e);
        builderBuilderWithExpectedSize.put("__phenotype_snapshot_token", rziVar.c);
        builderBuilderWithExpectedSize.put("__phenotype_configuration_version", Long.valueOf(rziVar.f));
        this.e = builderBuilderWithExpectedSize.buildKeepingLast();
        this.d = rzgVar;
    }

    public yyh(zuw zuwVar, List list) {
        String[] strArr;
        int i;
        this.d = zuwVar;
        if (!list.isEmpty()) {
            int i2 = ((srk) list.get(0)).b;
            strArr = new String[i2];
            int i3 = 0;
            while (true) {
                i = i2 - 1;
                if (i3 >= i) {
                    break;
                }
                int i4 = i3 + 1;
                strArr[i3] = a.cf(i4, "?");
                i3 = i4;
            }
            strArr[i] = "color";
        } else {
            strArr = new String[0];
        }
        this.c = new srn(false, strArr);
        String[] strArr2 = new String[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            strArr2[i5] = ((srk) list.get(i5)).d;
        }
        this.a = new srn(true, strArr2);
        this.b = new srp(list);
        this.e = new srl((short) 512, (short) 288, e());
    }

    public yyh(SharedPreferences sharedPreferences, Executor executor) {
        this.c = new ArrayDeque();
        this.a = sharedPreferences;
        this.d = "topic_operation_queue";
        this.e = ",";
        this.b = executor;
    }

    public yyh() {
        this.a = new AtomicReferenceArray(128);
        ynv ynvVar = ynv.a;
        this.b = new ynu(null, ynvVar);
        this.c = new yns(0, ynvVar);
        this.d = new yns(0, ynvVar);
        this.e = new yns(0, ynvVar);
    }
}
