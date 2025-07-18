package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrx extends huz {
    private final hmc a;
    private final hmb b;

    public hrx(hmb hmbVar, hmc hmcVar) {
        super(hmcVar.B(), hmcVar.C(), null);
        this.b = hmbVar;
        this.a = hmcVar;
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.slim_entity_metadata_row, viewGroup, false);
        hmc hmcVar = this.a;
        if (!hmcVar.B()) {
            viewInflate.setFocusable(false);
        }
        return new hsh(viewInflate, this.b, hmcVar);
    }

    @Override // defpackage.azx
    protected final void g(azw azwVar, Object obj) throws Resources.NotFoundException {
        super.g(azwVar, obj);
        if (obj instanceof hsj) {
            hsh hshVar = (hsh) azwVar;
            hshVar.b = (hsj) obj;
            hshVar.b.h = hshVar;
            hshVar.n();
        }
    }

    @Override // defpackage.azx
    protected final void k(azw azwVar) {
        if (azwVar instanceof hsh) {
            ((hsh) azwVar).b.h = null;
        }
    }

    @Override // defpackage.huz, defpackage.huw, defpackage.azx
    protected final void z(azw azwVar) throws Resources.NotFoundException {
        View view = azwVar.g;
        Object parent = view.getParent();
        if ((parent instanceof RecyclerView ? view : (View) parent) != null) {
            Resources resources = view.getResources();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.space_salmon);
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
