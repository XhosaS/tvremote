package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.tvsearch.results.searchlist.SearchItemDetailCardView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpg extends azm {
    private final hmb c;
    private final boolean d;
    private final hmc e;
    private hpe f;
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/results/searchlist/SearchItemDetailPresenter");
    public static final Duration a = Duration.ofHours(1);

    public hpg(hmb hmbVar, boolean z, hmc hmcVar) {
        this.c = hmbVar;
        this.d = z;
        this.e = hmcVar;
    }

    @Override // defpackage.azm
    public final azk q(ViewGroup viewGroup) {
        if (this.f == null) {
            this.f = new hpe(viewGroup.getResources());
        }
        return new hpf((SearchItemDetailCardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.global_search_browse_row_item, viewGroup, false), this.c, this.d, this.f);
    }

    @Override // defpackage.azm
    public final void s(azk azkVar, Object obj) {
        int iA;
        if (!(obj instanceof hkk)) {
            ((zdv) ((zdv) b.c()).q("com/google/android/apps/tvsearch/results/searchlist/SearchItemDetailPresenter", "onBindViewHolder", 105, "SearchItemDetailPresenter.java")).x("Wrong use of the item %s", obj);
            return;
        }
        hpf hpfVar = (hpf) azkVar;
        hkk hkkVar = (hkk) obj;
        hpfVar.o = hkkVar;
        View view = hpfVar.g;
        SearchItemDetailCardView searchItemDetailCardView = (SearchItemDetailCardView) view;
        searchItemDetailCardView.setCardType(true != hkkVar.w() ? 0 : 2);
        ConstraintLayout constraintLayout = hpfVar.c;
        Resources resources = view.getResources();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        float fB = hkkVar.b();
        float fA = hkkVar.a();
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.carousel_item_image_constant_height);
        float f = fB / fA;
        if (f > 1.555f) {
            layoutParams.width = resources.getDimensionPixelSize(R.dimen.carousel_item_image_landscape_16_9_width);
        } else if (f > 1.167f) {
            layoutParams.width = resources.getDimensionPixelSize(R.dimen.carousel_item_image_landscape_4_3_width);
        } else if (f > 0.833f) {
            layoutParams.width = resources.getDimensionPixelSize(R.dimen.carousel_item_image_square_width);
        } else {
            layoutParams.width = resources.getDimensionPixelSize(R.dimen.carousel_item_image_portrait_2_3_width);
        }
        constraintLayout.setLayoutParams(layoutParams);
        View view2 = hpfVar.i;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.width = layoutParams.width;
        view2.setLayoutParams(layoutParams2);
        hpfVar.c(hpfVar.h, hkkVar.q());
        ImageDownloadView imageDownloadView = hpfVar.d;
        imageDownloadView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (hkkVar.h()) {
            imageDownloadView.b(Uri.parse(hkkVar.g()), R.drawable.ic_search_default, hpfVar.a.k());
        } else {
            imageDownloadView.setImageResource(R.drawable.ic_search_default);
        }
        int iN = hkkVar.n();
        if (iN >= 0) {
            if (hpfVar.e == null) {
                hpfVar.e = (ProgressBar) LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.global_search_browse_progress_bar, (ViewGroup) constraintLayout, false);
                zr zrVar = (zr) hpfVar.e.getLayoutParams();
                zrVar.l = 0;
                constraintLayout.addView(hpfVar.e, zrVar);
            }
            ProgressBar progressBar = hpfVar.e;
            if (progressBar != null) {
                progressBar.setProgress(iN);
                hpfVar.e.setVisibility(0);
            }
        } else {
            ProgressBar progressBar2 = hpfVar.e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
        }
        TextView textView = hpfVar.f;
        textView.setText(hkkVar.f());
        textView.getText();
        View viewFindViewById = constraintLayout.findViewById(R.id.image_overlay);
        if (viewFindViewById != null) {
            constraintLayout.removeView(viewFindViewById);
        }
        int iC = hkkVar.C();
        List listV = hkkVar.v();
        if (iC != 1 && listV != null && !listV.isEmpty() && listV.size() <= 2) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(constraintLayout.getContext()).inflate(iC == 3 ? R.layout.search_item_overlay_youtube : R.layout.search_item_overlay_generic, (ViewGroup) constraintLayout, true).findViewById(R.id.image_overlay);
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.overlay_text_1);
            TextView textView3 = (TextView) viewGroup.findViewById(R.id.overlay_text_2);
            viewGroup.setVisibility(0);
            textView2.setVisibility(0);
            textView2.setText((CharSequence) listV.get(0));
            if (listV.size() == 2 && textView3 != null) {
                textView3.setVisibility(0);
                textView3.setText((CharSequence) listV.get(1));
            }
            String strS = hkkVar.s();
            ImageDownloadView imageDownloadView2 = (ImageDownloadView) viewGroup.findViewById(R.id.overlay_image);
            if (!TextUtils.isEmpty(strS) && imageDownloadView2 != null) {
                imageDownloadView2.b(Uri.parse(strS), 0, hpfVar.a.k());
                imageDownloadView2.setVisibility(0);
            }
        }
        boolean zA = hkkVar.A();
        hpfVar.l = zA;
        if (zA) {
            if (hpfVar.k == null) {
                hpfVar.k = LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.global_search_browse_image_attribution, (ViewGroup) constraintLayout, false);
                zr zrVar2 = (zr) hpfVar.k.getLayoutParams();
                zrVar2.l = 0;
                constraintLayout.addView(hpfVar.k, zrVar2);
            }
            View view3 = hpfVar.k;
            if (view3 != null) {
                hpfVar.c((TextView) view3.findViewById(R.id.row_item_image_attribution_text), hkkVar.r());
            }
        }
        View view4 = hpfVar.k;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        Duration durationE = hkkVar.e();
        String str = durationE.compareTo(Duration.ZERO) > 0 ? durationE.compareTo(a) >= 0 ? String.format(Locale.getDefault(), "%d:%02d:%02d", Long.valueOf(durationE.toHours()), Integer.valueOf(durationE.toMinutesPart()), Integer.valueOf(durationE.toSecondsPart())) : String.format(Locale.getDefault(), "%d:%02d", Integer.valueOf(durationE.toMinutesPart()), Integer.valueOf(durationE.toSecondsPart())) : null;
        if (TextUtils.isEmpty(str)) {
            TextView textView4 = hpfVar.j;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            if (hpfVar.j == null) {
                hpfVar.j = (TextView) LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.global_search_browse_duration_text, (ViewGroup) constraintLayout, false);
                zr zrVar3 = (zr) hpfVar.j.getLayoutParams();
                zrVar3.l = 0;
                zrVar3.v = 0;
                constraintLayout.addView(hpfVar.j, zrVar3);
            }
            TextView textView5 = hpfVar.j;
            if (textView5 != null) {
                textView5.setVisibility(0);
                hpfVar.j.setText(str);
                if (hpfVar.b && hpfVar.a.m().isTouchExplorationEnabled()) {
                    hpfVar.j.setContentDescription(fep.b(hkkVar.e(), view.getResources()));
                }
            }
        }
        if (hkkVar.t() != null) {
            for (aeax aeaxVar : hkkVar.t()) {
                int iA2 = aeat.a(aeaxVar.g);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                int i = iA2 - 1;
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    if (hpfVar.n == null) {
                        hpfVar.n = new hmf(hpfVar.a.w());
                    }
                    hmf hmfVar = hpfVar.n;
                    if (hmfVar.a(aeaxVar, constraintLayout) != 3) {
                        if (hpfVar.m == null) {
                            hpfVar.m = new hmg(constraintLayout.getContext());
                            hpfVar.m.a = hpfVar.a.x();
                            zr zrVar4 = new zr(-1, -1);
                            zrVar4.l = 0;
                            constraintLayout.addView(hpfVar.m, zrVar4);
                        }
                        hpfVar.m.a(hmfVar);
                        int i2 = aeaxVar.g;
                        int iA3 = aeat.a(i2);
                        if ((iA3 != 0 && iA3 == 3) || ((iA = aeat.a(i2)) != 0 && iA == 4)) {
                            int i3 = hpfVar.a.w().d;
                            View view5 = hmfVar.b;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view5.getLayoutParams();
                            marginLayoutParams.bottomMargin = i3;
                            marginLayoutParams.setMarginStart(i3);
                            marginLayoutParams.setMarginEnd(i3);
                            view5.setLayoutParams(marginLayoutParams);
                        }
                    }
                }
            }
        }
        ArrayList arrayList = searchItemDetailCardView.f;
        arrayList.clear();
        TextView textView6 = hpfVar.j;
        if (textView6 != null && textView6.getVisibility() == 0) {
            arrayList.add(hpfVar.j);
        }
        hmg hmgVar = hpfVar.m;
        if (hmgVar != null) {
            arrayList.add(hmgVar);
        }
        paq.c(view, hkkVar.o());
    }

    @Override // defpackage.azm
    public final void u(azk azkVar) {
        if (azkVar instanceof hpf) {
            hpf hpfVar = (hpf) azkVar;
            hpfVar.o = null;
            hmg hmgVar = hpfVar.m;
            if (hmgVar != null) {
                hpfVar.c.removeView(hmgVar);
                hpfVar.m = null;
            }
        }
    }

    @Override // defpackage.azm
    public final void v(azk azkVar) {
        View view = azkVar.g;
        Object parent = view.getParent();
        View view2 = view;
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getId() == R.id.row_content) {
                view2.setActivated(viewGroup.isActivated());
                pan panVarA = paq.a(view);
                hmc hmcVar = this.e;
                if (hmcVar.E() && panVarA != null && (panVarA.a().b & 1) == 0) {
                    this.c.q().u(hmcVar.y(), view, (View) parent);
                    return;
                }
                return;
            }
            view2 = (View) parent;
            parent = view2.getParent();
        }
    }
}
