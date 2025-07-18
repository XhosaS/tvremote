package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.tvsearch.results.motion.BorderedTextView;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hnt extends hns {
    private final List P;

    public hnt(View view, hmb hmbVar, boolean z, hmc hmcVar) {
        super(view, hmbVar, z, hmcVar);
        this.P = new ArrayList();
        this.v.setTextAppearance(R.style.h3v3G200TextAppearance);
        this.y.setTextAppearance(R.style.b2v3G700TextAppearance);
        x(this.D);
        x(this.C);
        ((ViewGroup.MarginLayoutParams) this.D.getLayoutParams()).topMargin = this.a.getDimensionPixelSize(R.dimen.space_salmon);
        ((ViewGroup.MarginLayoutParams) this.x.getLayoutParams()).topMargin = this.a.getDimensionPixelSize(R.dimen.space_salmon);
    }

    @Override // defpackage.hns
    protected final int d() {
        return R.layout.entity_description_attribution_amati;
    }

    @Override // defpackage.hns
    protected final Drawable e() {
        return this.a.getDrawable(R.drawable.entity_detail_metadata_divider_amati, null);
    }

    @Override // defpackage.hns
    protected final TextView f(View view) {
        return (TextView) view;
    }

    @Override // defpackage.hns
    protected final hny g(ViewGroup viewGroup, hmb hmbVar, hmc hmcVar) {
        return new hob(viewGroup, hmbVar, hmcVar);
    }

    @Override // defpackage.hns
    public final void k(ViewGroup viewGroup, hoh hohVar) throws Resources.NotFoundException {
        List list = this.P;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.D.removeView((View) it.next());
            }
            list.clear();
        }
        List<adxg> listR = hohVar.r();
        if (listR != null && !listR.isEmpty()) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            for (adxg adxgVar : listR) {
                TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.entity_metadata_row_datum, viewGroup, false);
                textView.setText(this.a.getString(R.string.entity_fact, adxgVar.b, adxgVar.c).trim());
                viewGroup.addView(textView);
                list.add(textView);
            }
        }
        super.k(viewGroup, hohVar);
    }

    @Override // defpackage.hns
    protected final void r() {
        TextView textView = this.A;
        if (textView instanceof BorderedTextView) {
            BorderedTextView borderedTextView = (BorderedTextView) textView;
            borderedTextView.setBorderWidth(this.a.getDimensionPixelSize(R.dimen.description_attribution_border));
            borderedTextView.setBorderColor(0);
            borderedTextView.setShapeColor(0);
        }
    }

    @Override // defpackage.hns
    protected final void u() {
        if (this.b.r() == null || this.b.r().isEmpty()) {
            super.u();
        }
    }

    @Override // defpackage.hns
    public final boolean w(hoh hohVar) {
        return true;
    }

    final void x(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextAppearance(R.style.s2v3G200TextAppearance);
            } else if (childAt instanceof ViewGroup) {
                x((ViewGroup) childAt);
            }
        }
    }

    @Override // defpackage.hns
    protected final void h() {
    }

    @Override // defpackage.hns
    protected final void q() {
    }
}
