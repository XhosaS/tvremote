package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView$Behavior;
import com.google.android.videos.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sys extends FrameLayout implements cqu, svi {
    private Map A;
    private int B;
    private final aafi C;
    final View a;
    final ClippableRoundedCornerLayout b;
    final View c;
    final View d;
    final FrameLayout e;
    final FrameLayout f;
    public final MaterialToolbar g;
    final Toolbar h;
    final TextView i;
    final LinearLayout j;
    public final EditText k;
    final ImageButton l;
    final View m;
    final TouchObserverFrameLayout n;
    public sym o;
    public boolean p;
    public boolean q;
    public boolean r;
    private final boolean s;
    private final syz t;
    private final boolean u;
    private final sst v;
    private final Set w;
    private int x;
    private boolean y;
    private final int z;

    public sys(Context context) {
        this(context, null);
    }

    private final void q() throws Resources.NotFoundException {
        float dimension;
        sym symVar = this.o;
        if (symVar != null) {
            szk szkVar = symVar.g;
            dimension = szkVar != null ? szkVar.u() : symVar.getElevation();
        } else {
            dimension = getResources().getDimension(R.dimen.m3_searchview_elevation);
        }
        r(dimension);
    }

    private final void r(float f) {
        View view;
        sst sstVar = this.v;
        if (sstVar == null || (view = this.c) == null) {
            return;
        }
        view.setBackgroundColor(sstVar.b(this.z, f));
    }

    private final void s(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.b.getId()) != null) {
                    s((ViewGroup) childAt, z);
                } else if (z) {
                    this.A.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map map = this.A;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.A.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    private final void t() {
        ImageButton imageButtonB = suz.b(this.g);
        if (imageButtonB == null) {
            return;
        }
        int i = this.b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableA = cry.a(imageButtonB.getDrawable());
        if (drawableA instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawableA).setProgress(i);
        }
        if (drawableA instanceof sue) {
            ((sue) drawableA).a(i);
        }
    }

    private final boolean u() {
        int i = this.B;
        if (i != 0) {
            return i == 2 || i == 1;
        }
        throw null;
    }

    private final void v(int i, boolean z) {
        int i2 = this.B;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == i) {
            return;
        }
        if (z) {
            x(i);
        }
        this.B = i;
        Iterator it = new LinkedHashSet(this.w).iterator();
        while (it.hasNext()) {
            ((syr) it.next()).a();
        }
        w(i);
        sym symVar = this.o;
        if (symVar == null || i != 2) {
            return;
        }
        symVar.sendAccessibilityEvent(8);
    }

    private final void w(int i) {
        if (this.o == null || !this.u) {
            return;
        }
        if (i == 0) {
            throw null;
        }
        if (i == 4) {
            this.C.p();
        } else if (i == 2) {
            this.C.q();
        }
    }

    private final void x(int i) {
        if (i == 4) {
            h(true);
        } else if (i == 2) {
            h(false);
        }
    }

    @Override // defpackage.svi
    public final void I() {
        if (u() || this.o == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        syz syzVar = this.t;
        syzVar.e.f(syzVar.g);
        AnimatorSet animatorSet = syzVar.f;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        syzVar.f = null;
    }

    @Override // defpackage.svi
    public final void K() {
        if (u()) {
            return;
        }
        syz syzVar = this.t;
        svq svqVar = syzVar.e;
        fd fdVarC = svqVar.c();
        if (Build.VERSION.SDK_INT < 34 || this.o == null || fdVarC == null) {
            e();
            return;
        }
        long totalDuration = syzVar.e().getTotalDuration();
        AnimatorSet animatorSetE = svqVar.e(syzVar.g);
        animatorSetE.setDuration(totalDuration);
        animatorSetE.start();
        svqVar.g();
        if (syzVar.f != null) {
            syzVar.b(false).start();
            syzVar.f.resume();
        }
        syzVar.f = null;
    }

    @Override // defpackage.svi
    public final void R(fd fdVar) {
        sym symVar;
        if (u() || (symVar = this.o) == null) {
            return;
        }
        symVar.f(this.k.getText().toString());
        syz syzVar = this.t;
        sym symVar2 = syzVar.g;
        svq svqVar = syzVar.e;
        svqVar.e = fdVar;
        float f = fdVar.a;
        View view = svqVar.a;
        svqVar.g = sil.i(view);
        if (symVar2 != null) {
            svqVar.h = sil.h(view, symVar2);
        }
        svqVar.f = f;
    }

    @Override // defpackage.svi
    public final void T(fd fdVar) {
        if (u() || this.o == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        syz syzVar = this.t;
        float f = fdVar.b;
        if (f > 0.0f) {
            svq svqVar = syzVar.e;
            sym symVar = syzVar.g;
            svqVar.h(fdVar, symVar, symVar.c());
            AnimatorSet animatorSet = syzVar.f;
            if (animatorSet != null) {
                animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
                return;
            }
            sys sysVar = syzVar.a;
            if (sysVar.o()) {
                sysVar.d();
            }
            if (sysVar.p) {
                syzVar.f = syzVar.a(false);
                syzVar.f.start();
                syzVar.f.pause();
            }
        }
    }

    @Override // defpackage.cqu
    public final cqv a() {
        return new SearchView$Behavior();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.s) {
            this.n.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    protected int b() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public final Editable c() {
        return this.k.getText();
    }

    public final void d() {
        this.k.post(new slt(this, 13));
    }

    public final void e() {
        int i = this.B;
        if (i == 0) {
            throw null;
        }
        if (i == 2 || i == 1) {
            return;
        }
        sym symVar = this.o;
        if (symVar == null || !symVar.isAttachedToWindow()) {
            this.t.e();
            return;
        }
        this.o.f(this.k.getText().toString());
        sym symVar2 = this.o;
        syz syzVar = this.t;
        syzVar.getClass();
        symVar2.post(new slt(syzVar, 10));
    }

    public final void f() {
        this.k.postDelayed(new slt(this, 11), 100L);
    }

    public final void g() {
        if (this.y) {
            f();
        }
    }

    public final void h(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.A = new HashMap(viewGroup.getChildCount());
        }
        s(viewGroup, z);
        if (z) {
            return;
        }
        this.A = null;
    }

    public final void i(boolean z) {
        this.d.setVisibility(true != z ? 8 : 0);
    }

    public final void j(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    public final void k(int i) {
        View view = this.d;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    public final void l(boolean z) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(true != z ? 8 : 0);
        t();
        v(z ? 4 : 2, z2 != z);
    }

    public final void m(sym symVar) throws Resources.NotFoundException {
        this.o = symVar;
        this.t.g = symVar;
        if (symVar != null) {
            symVar.setOnClickListener(new phn(this, 20));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    symVar.setHandwritingDelegatorCallback(new slt(this, 12));
                    this.k.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.g;
        if (materialToolbar != null && !(cry.a(materialToolbar.getNavigationIcon()) instanceof DrawerArrowDrawable)) {
            int iB = b();
            if (this.o == null) {
                materialToolbar.setNavigationIcon(iB);
            } else {
                Drawable drawableMutate = AppCompatResources.getDrawable(getContext(), iB).mutate();
                Integer num = materialToolbar.a;
                if (num != null) {
                    drawableMutate.setTint(num.intValue());
                }
                drawableMutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.setNavigationIcon(new sue(this.o.getNavigationIcon(), drawableMutate));
                t();
            }
        }
        q();
        w(this.B);
    }

    public final void n() {
        int i = this.B;
        if (i == 0) {
            throw null;
        }
        if (i == 4 || i == 3) {
            return;
        }
        syz syzVar = this.t;
        if (syzVar.g == null) {
            sys sysVar = syzVar.a;
            if (sysVar.o()) {
                sysVar.postDelayed(new slt(sysVar, 15), 150L);
            }
            ClippableRoundedCornerLayout clippableRoundedCornerLayout = syzVar.b;
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new slt(syzVar, 16));
            return;
        }
        sys sysVar2 = syzVar.a;
        if (sysVar2.o()) {
            sysVar2.g();
        }
        sysVar2.p(3);
        Toolbar toolbar = syzVar.c;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        int i2 = syzVar.g.f;
        if (i2 == -1 || !sysVar2.q) {
            toolbar.setVisibility(8);
        } else {
            toolbar.inflateMenu(i2);
            ActionMenuView actionMenuViewA = suz.a(toolbar);
            if (actionMenuViewA != null) {
                for (int i3 = 0; i3 < actionMenuViewA.getChildCount(); i3++) {
                    View childAt = actionMenuViewA.getChildAt(i3);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        EditText editText = syzVar.d;
        editText.setText(syzVar.g.e());
        editText.setSelection(editText.getText().length());
        ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = syzVar.b;
        clippableRoundedCornerLayout2.setVisibility(4);
        clippableRoundedCornerLayout2.post(new slt(syzVar, 14));
    }

    public final boolean o() {
        return this.x == 48;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        szg.e(this);
        int i = this.B;
        x(i);
        w(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h(false);
        this.C.q();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Activity activity;
        super.onFinishInflate();
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            this.x = window.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof syq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        syq syqVar = (syq) parcelable;
        super.onRestoreInstanceState(syqVar.getSuperState());
        j(syqVar.a);
        l(syqVar.b == 0);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        syq syqVar = new syq(super.onSaveInstanceState());
        Editable editableC = c();
        syqVar.a = editableC == null ? null : editableC.toString();
        syqVar.b = this.b.getVisibility();
        return syqVar;
    }

    final void p(int i) {
        v(i, true);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        r(f);
    }

    public sys(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public sys(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(tde.a(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        this.C = new aafi(this, this);
        this.w = new LinkedHashSet();
        this.x = 16;
        this.B = 2;
        Context context2 = getContext();
        TypedArray typedArrayA = suy.a(context2, attributeSet, syk.b, i, R.style.Widget_Material3_SearchView, new int[0]);
        this.z = typedArrayA.getColor(11, 0);
        int resourceId = typedArrayA.getResourceId(16, -1);
        int resourceId2 = typedArrayA.getResourceId(0, -1);
        String string = typedArrayA.getString(3);
        String string2 = typedArrayA.getString(4);
        String string3 = typedArrayA.getString(24);
        boolean z = typedArrayA.getBoolean(27, false);
        this.p = typedArrayA.getBoolean(8, true);
        this.q = typedArrayA.getBoolean(7, true);
        boolean z2 = typedArrayA.getBoolean(17, false);
        this.y = typedArrayA.getBoolean(9, true);
        this.u = typedArrayA.getBoolean(10, true);
        typedArrayA.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.s = true;
        this.a = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.b = clippableRoundedCornerLayout;
        this.c = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.d = viewFindViewById;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.e = frameLayout;
        this.f = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.g = materialToolbar;
        this.h = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        TextView textView = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.i = textView;
        this.j = (LinearLayout) findViewById(R.id.open_search_view_text_container);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.k = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.l = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.m = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.n = touchObserverFrameLayout;
        this.t = new syz(this);
        this.v = new sst(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new sqd(2));
        q();
        if (resourceId != -1) {
            frameLayout.addView(LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
        textView.setText(string3);
        textView.setVisibility(true != TextUtils.isEmpty(string3) ? 0 : 8);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z2) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new tbx((Object) this, 1));
            if (z) {
                DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
                drawerArrowDrawable.setColor(sip.c(this, R.attr.colorOnSurface));
                materialToolbar.setNavigationIcon(drawerArrowDrawable);
            }
        }
        imageButton.setOnClickListener(new phn(this, 19));
        editText.addTextChangedListener(new syp(this, 0));
        touchObserverFrameLayout.a = new jcd(this, 7);
        sil.n(materialToolbar, new svd() { // from class: syo
            @Override // defpackage.svd
            public final void a(View view, cyh cyhVar, sve sveVar) {
                MaterialToolbar materialToolbar2 = this.a.g;
                boolean zP = sil.p(materialToolbar2);
                int i2 = zP ? sveVar.c : sveVar.a;
                int i3 = zP ? sveVar.a : sveVar.c;
                csr csrVarF = cyhVar.f(647);
                materialToolbar2.setPadding(i2 + csrVarF.b, sveVar.b, i3 + csrVarF.d, sveVar.d);
            }
        });
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i2 = marginLayoutParams.leftMargin;
        final int i3 = marginLayoutParams.rightMargin;
        cvq cvqVar = new cvq() { // from class: syn
            @Override // defpackage.cvq
            public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
                csr csrVarF = cyhVar.f(647);
                int i4 = csrVarF.b;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i2 + i4;
                marginLayoutParams2.rightMargin = i3 + csrVarF.d;
                return cyhVar;
            }
        };
        int[] iArr = cww.a;
        cwm.l(viewFindViewById2, cvqVar);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        k(identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0);
        cwm.l(viewFindViewById, new czn(this, 16));
    }
}
