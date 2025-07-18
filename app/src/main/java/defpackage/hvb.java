package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hvb extends ayy {
    private int g;
    private int h;
    private int i;
    private int j;
    private final boolean k;
    private boolean l;
    private final agpc m = new agpn(new agum() { // from class: hva
        @Override // defpackage.agum
        public final Object a() {
            return new qk();
        }
    });

    public hvb(hmc hmcVar, azu azuVar) {
        this.k = hmcVar.B();
        this.e = azuVar;
        ((ayy) this).a = false;
        this.f = true;
        this.b = false;
    }

    private final void E(ayx ayxVar) {
        HorizontalGridView horizontalGridView = ayxVar.a;
        horizontalGridView.setPadding(horizontalGridView.getPaddingLeft(), this.j, horizontalGridView.getPaddingRight(), this.k ? this.g : this.h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayy, defpackage.azx
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public ayx b(ViewGroup viewGroup) {
        viewGroup.getClass();
        azw azwVarB = super.b(viewGroup);
        if (!this.l) {
            this.l = true;
            Resources resources = viewGroup.getResources();
            this.i = resources.getDimensionPixelSize(R.dimen.space_light_green);
            this.j = resources.getDimensionPixelSize(R.dimen.space_light_purple);
            this.h = resources.getDimensionPixelSize(R.dimen.carousel_bottom_padding);
            this.g = resources.getDimensionPixelSize(R.dimen.space_blue);
        }
        ayx ayxVar = (ayx) azwVarB;
        HorizontalGridView horizontalGridView = ayxVar.a;
        horizontalGridView.setClipChildren(false);
        horizontalGridView.setClipToPadding(false);
        horizontalGridView.setHorizontalSpacing(this.j);
        horizontalGridView.e.m((qk) this.m.a());
        B(azwVarB, false);
        return ayxVar;
    }

    @Override // defpackage.ayy, defpackage.azx
    protected final void h(azw azwVar, boolean z) {
        super.h(azwVar, z);
        E((ayx) azwVar);
    }

    @Override // defpackage.ayy, defpackage.azx
    public final void i(azw azwVar, boolean z) {
        super.i(azwVar, z);
        azwVar.g.setActivated(z);
        E((ayx) azwVar);
    }

    @Override // defpackage.azx
    protected void z(azw azwVar) {
        super.z(azwVar);
        View view = azwVar.g;
        view.setActivated(false);
        if (this.k) {
            return;
        }
        if ((view != null ? view.getParent() : null) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            parent.getClass();
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.i;
                viewGroup.requestLayout();
            }
        }
    }
}
