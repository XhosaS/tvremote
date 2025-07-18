package defpackage;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import com.google.android.libraries.tv.widgets.card.textarea.ImageWithTextCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsr extends azk implements View.OnFocusChangeListener, hpz, hoz {
    final View a;
    public hkk b;
    private final utf c;
    private final utg d;

    public hsr(View view) throws Resources.NotFoundException {
        super(view);
        View viewFindViewById = view.findViewById(R.id.card_focusable_parent);
        this.a = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_container);
        viewFindViewById.setBackground(new utq(utq.a(this.g.getContext())));
        viewFindViewById.setOnFocusChangeListener(this);
        utk.b(viewFindViewById2);
        this.c = utf.c(viewFindViewById, viewFindViewById);
        utg utgVarC = utg.c(this.g, viewFindViewById, 1.07f);
        this.d = utgVarC;
        viewFindViewById.setOnKeyListener(utgVarC);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams.bottomMargin = view.getResources().getDimensionPixelOffset(R.dimen.amati_carousel_item_image_constant_margin_bottom);
        viewFindViewById.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.hpz
    public final View c() {
        return this.a;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        hkk hkkVar = this.b;
        if (hkkVar != null) {
            hkkVar.d = z;
        }
        ((ImageWithTextCardView) this.g).a(z);
        this.c.onFocusChange(view, z);
        this.d.onFocusChange(view, z);
    }

    @Override // defpackage.hpz
    public final void d(ColorFilter colorFilter) {
    }

    @Override // defpackage.hpz
    public final void e(boolean z) {
    }
}
