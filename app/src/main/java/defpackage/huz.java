package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class huz extends huw {
    private final boolean a;
    private final boolean b;

    public huz(boolean z, boolean z2, azu azuVar) {
        this.a = z;
        this.b = z2;
        this.e = azuVar;
        this.f = false;
    }

    @Override // defpackage.huw, defpackage.azx
    protected void z(azw azwVar) throws Resources.NotFoundException {
        super.z(azwVar);
        boolean z = this.a;
        boolean z2 = z && !this.b;
        View view = azwVar.g;
        if (!(view.getParent() instanceof RecyclerView)) {
            if (view.getParent() != null) {
                Object parent = view.getParent();
                parent.getClass();
                View view2 = (View) parent;
                if (z && z2) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getResources().getDimensionPixelSize(R.dimen.space_lime_yellow), view2.getPaddingRight(), view2.getResources().getDimensionPixelSize(R.dimen.space_blue));
                    return;
                } else if (z) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), view2.getResources().getDimensionPixelSize(R.dimen.space_blue));
                    return;
                } else {
                    int dimensionPixelSize = view2.getResources().getDimensionPixelSize(R.dimen.space_light_green);
                    view2.setPadding(view2.getPaddingLeft(), dimensionPixelSize, view2.getPaddingRight(), dimensionPixelSize);
                    return;
                }
            }
            return;
        }
        Resources resources = view.getResources();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z && z2) {
            marginLayoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.space_lime_yellow);
            marginLayoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.space_blue);
        } else if (z) {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.space_blue);
        } else {
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.space_light_green);
            marginLayoutParams.topMargin = dimensionPixelSize2;
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
