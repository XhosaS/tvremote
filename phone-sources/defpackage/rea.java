package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rea extends rdv {
    public final int g;
    public ImageView h;

    public rea(ViewGroup viewGroup, Context context, rjg rjgVar) {
        super(viewGroup, context, rjgVar);
        this.g = rrx.at(context, R.attr.ogIconColor);
    }

    protected abstract void b(ViewGroup viewGroup);

    @Override // defpackage.rdv
    protected final void c(dvk dvkVar) {
        super.c(dvkVar);
        rdu rduVar = this.f;
        rduVar.getClass();
        rduVar.j.j(dvkVar);
    }

    @Override // defpackage.rdv
    protected final void d(ViewGroup viewGroup, ViewGroup viewGroup2) {
        View viewInflate = LayoutInflater.from(this.a).inflate(R.layout.og_icon_dynamic_card, viewGroup);
        this.h = (ImageView) viewInflate.findViewById(R.id.og_card_icon);
        b((ViewGroup) viewInflate.findViewById(R.id.og_card_view_container));
    }

    protected final void e(dvk dvkVar, rdu rduVar) {
        super.f(dvkVar, rduVar);
        rduVar.j.d(dvkVar, new hs(this, 12));
    }
}
