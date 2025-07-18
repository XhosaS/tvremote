package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoo extends azx {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/searchgrid/AmatiSearchGridPresenter");
    private final azn b;
    private int c = 0;
    private int d = 0;
    private ViewGroup g;

    public hoo(hmb hmbVar) {
        this.f = false;
        this.e = null;
        this.b = hmbVar.o();
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        this.g = viewGroup;
        Resources resources = viewGroup.getResources();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amati_search_grid, viewGroup, false);
        GridLayout gridLayout = (GridLayout) viewGroup2.findViewById(R.id.grid_content);
        if (this.c == 0) {
            this.c = resources.getDimensionPixelSize(R.dimen.amati_carousel_item_image_constant_height);
            this.d = resources.getDimensionPixelSize(R.dimen.amati_carousel_item_image_constant_width);
        }
        return new hon(viewGroup2, gridLayout);
    }

    @Override // defpackage.azx
    protected final void g(azw azwVar, Object obj) throws Resources.NotFoundException {
        super.g(azwVar, obj);
        if (obj instanceof hoq) {
            hoq hoqVar = (hoq) obj;
            if (obj instanceof hhl) {
                hhl hhlVar = (hhl) obj;
                hon honVar = (hon) y(azwVar);
                int iL = hoqVar.l();
                int iF = hhlVar.f();
                GridLayout gridLayout = honVar.a;
                gridLayout.setUseDefaultMargins(false);
                gridLayout.setClipChildren(false);
                gridLayout.setColumnCount(iL);
                gridLayout.setRowCount(hoqVar.m());
                ayi[] ayiVarArr = new ayi[iF];
                ayj ayjVar = new ayj();
                View view = azwVar.g;
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.first_row_additional_offset);
                int i = 0;
                while (i < iF) {
                    azn aznVar = this.b;
                    ViewGroup viewGroup = this.g;
                    azm azmVar = ((bar) aznVar).a;
                    hoj hojVar = (hoj) azmVar.q(viewGroup);
                    View view2 = hojVar.g;
                    FrameLayout frameLayout = new FrameLayout(view2.getContext());
                    hkk hkkVarG = hhlVar.g(i);
                    azmVar.s(hojVar, hkkVarG);
                    hhl hhlVar2 = hhlVar;
                    hojVar.c.setOnClickListener(new hom(honVar, hojVar, hkkVarG));
                    frameLayout.addView(view2);
                    frameLayout.setClipChildren(false);
                    frameLayout.setId(i);
                    gridLayout.addView(frameLayout);
                    GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1.0f), GridLayout.spec(Integer.MIN_VALUE, 1.0f));
                    layoutParams.setGravity(1);
                    layoutParams.bottomMargin = view2.getContext().getResources().getDimensionPixelSize(R.dimen.image_grid_item_padding);
                    frameLayout.setLayoutParams(layoutParams);
                    ayi ayiVar = new ayi();
                    ayiVar.b = gridLayout.getChildAt(i).getId();
                    ayiVar.a(0.0f);
                    ayiVar.d = i < iL ? dimensionPixelSize : 0;
                    ayiVarArr[i] = ayiVar;
                    i++;
                    hhlVar = hhlVar2;
                }
                ayjVar.a(ayiVarArr);
                x(ayj.class, ayjVar);
                if (iF < iL) {
                    while (iF < iL) {
                        FrameLayout frameLayout2 = new FrameLayout(view.getContext());
                        GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1.0f), GridLayout.spec(Integer.MIN_VALUE, 1.0f));
                        layoutParams2.width = this.d;
                        frameLayout2.setLayoutParams(layoutParams2);
                        gridLayout.addView(frameLayout2);
                        iF++;
                    }
                    return;
                }
                return;
            }
        }
        ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/results/searchgrid/AmatiSearchGridPresenter", "onBindRowViewHolder", 65, "AmatiSearchGridPresenter.java")).u("Improper Object for binding to Grid Data Row views");
    }

    @Override // defpackage.azx
    protected final void k(azw azwVar) {
        super.k(azwVar);
        ((hon) y(azwVar)).a.removeAllViews();
    }
}
