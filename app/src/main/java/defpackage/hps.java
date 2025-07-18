package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;
import com.google.android.libraries.tv.widgets.card.textarea.ImageWithTextCardView;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hps extends azk implements View.OnFocusChangeListener, hpz, hoz {
    public static final hpm a = new hpm();
    private final String A;
    private boolean B;
    public final hmb b;
    public final View c;
    public final utf d;
    public final utg e;
    public hkk f;
    public boolean h;
    public volatile boolean i;
    public zyd j;
    public zyd k;
    private final boolean l;
    private final ConstraintLayout m;
    private final ImageDownloadView n;
    private ProgressBar o;
    private TextView p;
    private ViewGroup q;
    private final ArrayList r;
    private final int s;
    private final int t;
    private hmg u;
    private final List v;
    private final agpc w;
    private int x;
    private boolean y;
    private boolean z;

    public hps(View view, hmb hmbVar, boolean z, zyg zygVar, zyg zygVar2) throws Resources.NotFoundException {
        super(view);
        this.b = hmbVar;
        this.l = z;
        View viewFindViewById = view.findViewById(R.id.image_container);
        viewFindViewById.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.m = constraintLayout;
        View viewFindViewById2 = view.findViewById(R.id.row_item_image);
        viewFindViewById2.getClass();
        ImageDownloadView imageDownloadView = (ImageDownloadView) viewFindViewById2;
        this.n = imageDownloadView;
        View viewFindViewById3 = view.findViewById(R.id.card_focusable_parent);
        viewFindViewById3.getClass();
        this.c = viewFindViewById3;
        this.r = new ArrayList();
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.amati_carousel_item_image_constant_height);
        this.s = dimensionPixelSize;
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.amati_carousel_item_image_constant_margin_bottom);
        this.t = dimensionPixelOffset;
        this.v = new ArrayList();
        this.w = new agpn(new agum() { // from class: hpj
            @Override // defpackage.agum
            public final Object a() {
                return new hmf(this.a.b.w());
            }
        });
        this.x = dimensionPixelSize;
        String string = view.getContext().getString(R.string.space_between_metadata_component);
        string.getClass();
        this.A = string;
        utq utqVar = new utq(utq.a(this.g.getContext()));
        imageDownloadView.d = new hpq(imageDownloadView, this, zygVar, zygVar2, utqVar);
        viewFindViewById3.setBackground(utqVar);
        viewFindViewById3.setOnFocusChangeListener(this);
        utk.b(constraintLayout);
        this.d = utf.c(viewFindViewById3, viewFindViewById3);
        utg utgVarC = utg.c(this.g, viewFindViewById3, 1.07f);
        this.e = utgVarC;
        viewFindViewById3.setOnKeyListener(utgVarC);
        ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        viewFindViewById3.setLayoutParams(marginLayoutParams);
    }

    private final void k(final xal xalVar, final Drawable[] drawableArr, final String[] strArr, final int i) {
        this.v.add(xt.a(new xq() { // from class: hpk
            @Override // defpackage.xq
            public final Object a(xo xoVar) {
                xal xalVar2 = xalVar;
                wke wkeVarK = this.a.b.k();
                String str = xalVar2.c;
                str.getClass();
                cyx cyxVarF = wkeVarK.a().f(Uri.parse(str));
                cyxVarF.p(new hpr(xoVar, xalVar2, drawableArr, i, strArr), cyxVarF, dqc.a);
                return "immediate true future";
            }
        }));
    }

    private final void l() {
        View view = this.g;
        view.getClass();
        ImageWithTextCardView imageWithTextCardView = (ImageWithTextCardView) view;
        if (!(this.y && this.z) && m()) {
            imageWithTextCardView.e(3);
        } else {
            imageWithTextCardView.e(4);
        }
        imageWithTextCardView.d(this.y);
    }

    private final boolean m() {
        return this.b.r() == gph.a && this.B;
    }

    @Override // defpackage.hpz
    public final View c() {
        return this.c;
    }

    @Override // defpackage.hpz
    public final void d(ColorFilter colorFilter) {
        colorFilter.getClass();
        this.n.setColorFilter(colorFilter);
    }

    @Override // defpackage.hpz
    public final void e(boolean z) {
        this.y = z;
        l();
        ArrayList arrayList = this.r;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((View) next).setVisibility(true != this.y ? 4 : 0);
        }
    }

    public void f(hkk hkkVar) {
        String str;
        List<aeax> listT;
        int iA;
        int i;
        int i2;
        String strG;
        final StringBuilder sb;
        int i3;
        final utx utxVar;
        final String string;
        List list;
        ImageWithTextCardView imageWithTextCardView;
        char c;
        hkkVar.getClass();
        this.f = hkkVar;
        this.B = hkkVar.B();
        this.c.setOnFocusChangeListener(this);
        l();
        View view = this.g;
        view.getClass();
        final ImageWithTextCardView imageWithTextCardView2 = (ImageWithTextCardView) view;
        imageWithTextCardView2.k(hkkVar.f());
        hkkVar.f();
        String strP = hkkVar.p();
        if (strP == null || strP.length() == 0) {
            this.n.setContentDescription(hkkVar.f());
        } else {
            this.n.setContentDescription(hkkVar.p());
        }
        if (hkkVar.w() && hkkVar.x() && !m()) {
            imageWithTextCardView2.j(hkkVar.q());
            hkkVar.q();
        }
        boolean z = hkkVar instanceof hly;
        int i4 = 1;
        if (!z && m() && hkkVar.y()) {
            List listU = hkkVar.u();
            final Drawable[] drawableArr = new Drawable[listU.size()];
            final String[] strArr = new String[listU.size()];
            xmm xmmVar = (xmm) listU.get(0);
            int i5 = xmmVar.b;
            if ((i5 & 1) != 0) {
                string = view.getContext().getString(R.string.icon_and_description, xmmVar.d);
                sb = new StringBuilder(string);
                xal xalVar = xmmVar.c;
                if (xalVar == null) {
                    xalVar = xal.a;
                }
                xalVar.getClass();
                k(xalVar, drawableArr, strArr, 0);
                i3 = 1;
                utxVar = null;
            } else {
                if ((i5 & 2) != 0) {
                    String str2 = xmmVar.d;
                    utx utxVarA = utv.a(str2);
                    sb = new StringBuilder(str2);
                    utxVar = utxVarA;
                    i3 = 0;
                } else {
                    sb = new StringBuilder();
                    i3 = 0;
                    utxVar = null;
                }
                string = null;
            }
            int size = listU.size();
            int i6 = 1;
            while (i6 < size) {
                if (sb.length() > 0) {
                    sb.append(this.A);
                }
                xmm xmmVar2 = (xmm) listU.get(i6);
                int i7 = i4;
                if ((xmmVar2.b & 1) != 0) {
                    Context context = view.getContext();
                    list = listU;
                    imageWithTextCardView = imageWithTextCardView2;
                    Object[] objArr = new Object[i7];
                    objArr[0] = xmmVar2.d;
                    c = 423;
                    sb.append(context.getString(R.string.icon_and_description, objArr));
                    xal xalVar2 = xmmVar2.c;
                    if (xalVar2 == null) {
                        xalVar2 = xal.a;
                    }
                    xalVar2.getClass();
                    k(xalVar2, drawableArr, strArr, i3);
                    i3++;
                } else {
                    list = listU;
                    imageWithTextCardView = imageWithTextCardView2;
                    c = 423;
                    sb.append(xmmVar2.d);
                }
                i6++;
                listU = list;
                imageWithTextCardView2 = imageWithTextCardView;
                i4 = 1;
            }
            vqi.c(zxn.a(this.v).a(wyo.i(new Callable() { // from class: hpi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.i = true;
                    Drawable[] drawableArr2 = drawableArr;
                    String[] strArr2 = strArr;
                    utx utxVarA2 = utxVar;
                    if (utxVarA2 == null) {
                        String str3 = string;
                        utxVarA2 = str3 != null ? hps.a.a(str3, drawableArr2, strArr2) : null;
                    }
                    imageWithTextCardView2.b(utxVarA2, hps.a.a(sb.toString(), drawableArr2, strArr2));
                    return agpu.a;
                }
            }), zwk.a), "Failed to load icons", new Object[0]);
        }
        int i8 = this.s;
        if (z) {
            this.n.setScaleType(ImageView.ScaleType.CENTER_CROP);
            i8 = ((hly) hkkVar).a;
        } else {
            this.n.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        ConstraintLayout constraintLayout = this.m;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (i8 != layoutParams.height) {
            layoutParams.height = i8;
            constraintLayout.setLayoutParams(layoutParams);
        }
        if (this.x != i8) {
            this.x = i8;
            j();
        }
        if (!hkkVar.h() || (strG = hkkVar.g()) == null || strG.length() <= 0) {
            this.n.setImageResource(R.drawable.ic_search_default);
        } else {
            ImageDownloadView imageDownloadView = this.n;
            String strG2 = hkkVar.g();
            imageDownloadView.b(strG2 != null ? Uri.parse(strG2) : null, R.drawable.ic_search_default, this.b.k());
        }
        int iN = hkkVar.n();
        if (iN > 0) {
            if (this.o != null) {
                i2 = 0;
            } else {
                i2 = 0;
                ProgressBar progressBar = (ProgressBar) LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.global_search_browse_progress_bar, (ViewGroup) constraintLayout, false);
                this.o = progressBar;
                ViewGroup.LayoutParams layoutParams2 = progressBar != null ? progressBar.getLayoutParams() : null;
                layoutParams2.getClass();
                zr zrVar = (zr) layoutParams2;
                zrVar.l = 0;
                constraintLayout.addView(this.o, zrVar);
            }
            ProgressBar progressBar2 = this.o;
            if (progressBar2 != null) {
                progressBar2.setProgress(iN);
            }
            ProgressBar progressBar3 = this.o;
            if (progressBar3 != null) {
                progressBar3.setVisibility(i2);
            }
        } else {
            ProgressBar progressBar4 = this.o;
            if (progressBar4 != null) {
                progressBar4.setVisibility(8);
            }
        }
        View viewFindViewById = constraintLayout.findViewById(R.id.image_overlay);
        if (viewFindViewById != null) {
            constraintLayout.removeView(viewFindViewById);
        }
        int iC = hkkVar.C();
        List listV = hkkVar.v();
        if (iC != 1 && listV != null && !listV.isEmpty() && listV.size() <= 2) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(constraintLayout.getContext()).inflate(z ? R.layout.amati_pivot_item_overlay : iC == 3 ? R.layout.search_item_overlay_youtube : R.layout.search_item_overlay_generic, (ViewGroup) constraintLayout, true).findViewById(R.id.image_overlay);
            TextView textView = (TextView) viewGroup.findViewById(R.id.overlay_text_1);
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.overlay_text_2);
            if (z) {
                viewGroup.setBackgroundResource(R.drawable.pivot_bg_gradient);
                viewGroup.setAlpha(2.1310996E9f);
            }
            viewGroup.setVisibility(0);
            textView.setVisibility(0);
            textView.setText((CharSequence) listV.get(0));
            if (listV.size() == 2 && textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) listV.get(1));
            } else if (z) {
                textView.setMaxLines(2);
            }
            String strS = hkkVar.s();
            ImageDownloadView imageDownloadView2 = (ImageDownloadView) viewGroup.findViewById(R.id.overlay_image);
            if (strS.length() > 0 && imageDownloadView2 != null) {
                imageDownloadView2.b(Uri.parse(strS), 0, this.b.k());
                imageDownloadView2.setVisibility(0);
            }
        }
        boolean zA = hkkVar.A();
        this.h = zA;
        if (zA) {
            if (this.q == null) {
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.global_search_browse_image_attribution, (ViewGroup) constraintLayout, false);
                this.q = viewGroup2;
                ViewGroup.LayoutParams layoutParams3 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
                layoutParams3.getClass();
                zr zrVar2 = (zr) layoutParams3;
                zrVar2.l = 0;
                constraintLayout.addView(this.q, zrVar2);
            }
            ViewGroup viewGroup3 = this.q;
            TextView textView3 = viewGroup3 != null ? (TextView) viewGroup3.findViewById(R.id.row_item_image_attribution_text) : null;
            String strR = hkkVar.r();
            if (textView3 != null) {
                if (strR.length() == 0) {
                    textView3.setText("");
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(0);
                    textView3.setText(strR);
                }
            }
        }
        h(8);
        Duration durationE = hkkVar.e();
        if (durationE.compareTo(Duration.ZERO) <= 0) {
            str = null;
        } else if (durationE.toHours() > 0) {
            str = String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(durationE.toHours()), Integer.valueOf(durationE.toMinutesPart()), Integer.valueOf(durationE.toSecondsPart())}, 3));
            str.getClass();
        } else {
            str = String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(durationE.toMinutesPart()), Integer.valueOf(durationE.toSecondsPart())}, 2));
            str.getClass();
        }
        if (str == null || str.length() == 0) {
            TextView textView4 = this.p;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            if (this.p != null) {
                i = 0;
            } else {
                i = 0;
                TextView textView5 = (TextView) LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.global_search_browse_duration_text, (ViewGroup) constraintLayout, false);
                this.p = textView5;
                ViewGroup.LayoutParams layoutParams4 = textView5 != null ? textView5.getLayoutParams() : null;
                layoutParams4.getClass();
                zr zrVar3 = (zr) layoutParams4;
                zrVar3.l = 0;
                zrVar3.v = 0;
                constraintLayout.addView(this.p, zrVar3);
            }
            TextView textView6 = this.p;
            if (textView6 != null) {
                textView6.setVisibility(i);
                textView6.setText(str);
                if (this.l && this.b.m().isTouchExplorationEnabled()) {
                    Duration durationE2 = hkkVar.e();
                    Resources resources = view.getResources();
                    resources.getClass();
                    textView6.setContentDescription(fep.b(durationE2, resources));
                }
            }
        }
        if (hkkVar.t() != null && (listT = hkkVar.t()) != null) {
            for (aeax aeaxVar : listT) {
                int iA2 = aeat.a(aeaxVar.g);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                int i9 = iA2 - 1;
                if (i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4 || i9 == 7) {
                    if (g().a(aeaxVar, constraintLayout) != 3) {
                        hmg hmgVar = this.u;
                        if (hmgVar == null) {
                            hmgVar = new hmg(constraintLayout.getContext());
                            hmgVar.a = this.b.x();
                            this.u = hmgVar;
                            zr zrVar4 = new zr(-1, -1);
                            zrVar4.l = 0;
                            constraintLayout.addView(hmgVar, zrVar4);
                        }
                        hmgVar.a(g());
                        int i10 = aeaxVar.g;
                        int iA3 = aeat.a(i10);
                        if ((iA3 != 0 && iA3 == 3) || ((iA = aeat.a(i10)) != 0 && iA == 4)) {
                            hmb hmbVar = this.b;
                            int i11 = hmbVar.w().d;
                            View view2 = g().b;
                            ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                            layoutParams5.getClass();
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5;
                            marginLayoutParams.bottomMargin = hmbVar.w().c;
                            marginLayoutParams.setMarginStart(i11);
                            marginLayoutParams.setMarginEnd(i11);
                            view2.setLayoutParams(marginLayoutParams);
                        }
                    }
                }
            }
        }
        ArrayList arrayList = this.r;
        arrayList.clear();
        TextView textView7 = this.p;
        if (textView7 != null && textView7.getVisibility() == 0) {
            arrayList.add(textView7);
        }
        hmg hmgVar2 = this.u;
        if (hmgVar2 != null) {
            arrayList.add(hmgVar2);
        }
    }

    public final hmf g() {
        return (hmf) this.w.a();
    }

    protected final void h(int i) {
        ViewGroup viewGroup = this.q;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
    }

    public final void i() {
        this.f = null;
        this.c.setOnFocusChangeListener(null);
        hmg hmgVar = this.u;
        if (hmgVar != null) {
            this.m.removeView(hmgVar);
            this.u = null;
        }
        View view = this.g;
        view.getClass();
        ImageWithTextCardView imageWithTextCardView = (ImageWithTextCardView) view;
        imageWithTextCardView.k(null);
        imageWithTextCardView.b(null, null);
        imageWithTextCardView.j(null);
        imageWithTextCardView.setContentDescription(null);
        uts utsVar = imageWithTextCardView.a;
        if (utsVar.e() && ImageWithTextCardView.h(imageWithTextCardView.f)) {
            imageWithTextCardView.invalidate();
        }
        uts utsVar2 = imageWithTextCardView.b;
        if (utsVar2.e() && ImageWithTextCardView.g(imageWithTextCardView.f)) {
            imageWithTextCardView.invalidate();
        }
        uts utsVar3 = imageWithTextCardView.c;
        if (utsVar3.e() && ImageWithTextCardView.f(imageWithTextCardView.f)) {
            imageWithTextCardView.invalidate();
        }
        boolean zD = utsVar.d();
        boolean zD2 = utsVar2.d();
        boolean zD3 = utsVar3.d();
        if (zD || zD2 || zD3) {
            imageWithTextCardView.requestLayout();
        }
        if (!this.i) {
            for (zyd zydVar : this.v) {
                if (!zydVar.isDone()) {
                    zydVar.cancel(false);
                }
            }
        }
        this.v.clear();
        this.i = false;
        zyd zydVar2 = this.j;
        if (zydVar2 != null) {
            if (!zydVar2.isDone()) {
                zydVar2.cancel(false);
            }
            this.j = null;
        }
        zyd zydVar3 = this.k;
        if (zydVar3 != null) {
            if (!zydVar3.isDone()) {
                zydVar3.cancel(false);
            }
            this.k = null;
        }
        this.B = false;
    }

    public final void j() {
        View view = this.g;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.x + this.t + ImageWithTextCardView.i(view.getContext());
        view.setLayoutParams(layoutParams);
    }

    public void onFocusChange(View view, boolean z) {
        view.getClass();
        hkk hkkVar = this.f;
        if (hkkVar != null) {
            hkkVar.d = z;
        }
        this.z = z;
        if (this.h && z) {
            h(0);
        } else {
            h(8);
        }
        View view2 = this.g;
        view2.getClass();
        ImageWithTextCardView imageWithTextCardView = (ImageWithTextCardView) view2;
        if (z) {
            imageWithTextCardView.c(android.R.attr.state_selected);
        } else {
            imageWithTextCardView.c(new int[0]);
        }
        l();
        imageWithTextCardView.a(z);
        this.d.onFocusChange(view, z);
        this.e.onFocusChange(view, z);
    }
}
