package defpackage;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.onegoogle.accountmenu.cards.DynamicCardRootView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rdv extends RecyclerView.ViewHolder {
    public final Context a;
    public final rjg b;
    public final DynamicCardRootView c;
    public final View d;
    public final ViewGroup e;
    public rdu f;

    public rdv(ViewGroup viewGroup, Context context, rjg rjgVar) {
        super(LayoutInflater.from(context).inflate(R.layout.og_dynamic_card, viewGroup, false));
        this.a = context;
        this.b = rjgVar;
        DynamicCardRootView dynamicCardRootView = (DynamicCardRootView) this.itemView.findViewById(R.id.og_card);
        this.c = dynamicCardRootView;
        dynamicCardRootView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup viewGroup2 = (ViewGroup) dynamicCardRootView.findViewById(R.id.og_card_content_root);
        this.e = viewGroup2;
        View viewFindViewById = dynamicCardRootView.findViewById(R.id.og_loading_card_view);
        this.d = viewFindViewById;
        e(dynamicCardRootView, this.f);
        d(viewGroup2, dynamicCardRootView);
        ((ImageView) viewFindViewById.findViewById(R.id.og_loading_card_icon_placeholder)).setImageDrawable(b(new OvalShape()));
        ((ImageView) viewFindViewById.findViewById(R.id.og_loading_card_title_placeholder)).setImageDrawable(b(new RoundRectShape(null, null, null)));
        ((ImageView) viewFindViewById.findViewById(R.id.og_loading_card_progress_placeholder)).setImageDrawable(b(new RoundRectShape(null, null, null)));
        ((ImageView) viewFindViewById.findViewById(R.id.og_loading_card_progress_desc_placeholder)).setImageDrawable(b(new RoundRectShape(null, null, null)));
        viewFindViewById.setContentDescription(viewFindViewById.getResources().getString(R.string.og_card_loading_label_a11y));
    }

    private final PaintDrawable b(Shape shape) {
        Integer num = (Integer) ric.b(this.a).b.get(rib.COLOR_HAIRLINE);
        num.getClass();
        PaintDrawable paintDrawable = new PaintDrawable(num.intValue());
        paintDrawable.setShape(shape);
        paintDrawable.setIntrinsicWidth(-1);
        paintDrawable.setIntrinsicHeight(-1);
        return paintDrawable;
    }

    private static final void e(DynamicCardRootView dynamicCardRootView, rdu rduVar) {
        if (dynamicCardRootView != null) {
            dynamicCardRootView.j = rduVar != null ? tst.i(Integer.valueOf(rduVar.g)) : trk.a;
        }
    }

    /* renamed from: a */
    protected void f(dvk dvkVar, rdu rduVar) {
        this.f = rduVar;
        DynamicCardRootView dynamicCardRootView = this.c;
        e(dynamicCardRootView, rduVar);
        dynamicCardRootView.b(this.b);
        rduVar.b(dvkVar);
        rduVar.b.d(dvkVar, new hs(this, 9));
        rduVar.d.d(dvkVar, new hs(this, 10));
        rduVar.e.d(dvkVar, new hs(this, 11));
        dynamicCardRootView.post(new lke((Object) this, (Object) rduVar, (Object) dvkVar, 19, (char[]) null));
    }

    protected void c(dvk dvkVar) {
        this.c.e(this.b);
        rdu rduVar = this.f;
        rduVar.getClass();
        rduVar.g();
        this.f.b.j(dvkVar);
        this.f.d.j(dvkVar);
        this.f.e.j(dvkVar);
        this.f.f.j(dvkVar);
    }

    protected abstract void d(ViewGroup viewGroup, ViewGroup viewGroup2);
}
