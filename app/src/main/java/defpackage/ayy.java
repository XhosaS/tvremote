package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.katniss.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ayy extends azx {
    private static int g;
    private static int h;
    private static int i;
    baq d;
    private ayp k;
    public boolean a = true;
    private int j = -1;
    public boolean b = true;
    public final HashMap c = new HashMap();

    private final void D(ayx ayxVar) {
        int i2;
        int paddingBottom = 0;
        if (ayxVar.n) {
            azt aztVar = ayxVar.i;
            if (aztVar != null) {
                azu azuVar = this.e;
                if (azuVar != null) {
                    View view = aztVar.g;
                    int paddingBottom2 = view.getPaddingBottom();
                    if (view instanceof TextView) {
                        Paint paint = azuVar.a;
                        TextView textView = (TextView) view;
                        if (paint.getTextSize() != textView.getTextSize()) {
                            paint.setTextSize(textView.getTextSize());
                        }
                        if (paint.getTypeface() != textView.getTypeface()) {
                            paint.setTypeface(textView.getTypeface());
                        }
                        paddingBottom = paddingBottom2 + ((int) paint.descent());
                    } else {
                        paddingBottom = paddingBottom2;
                    }
                } else {
                    paddingBottom = aztVar.g.getPaddingBottom();
                }
            }
            paddingBottom = (ayxVar.m ? h : ayxVar.c) - paddingBottom;
            i2 = i;
        } else if (ayxVar.m) {
            int i3 = ayxVar.d;
            int i4 = g;
            paddingBottom = i4 - i3;
            i2 = i4;
        } else {
            i2 = ayxVar.d;
        }
        ayxVar.a.setPadding(ayxVar.e, paddingBottom, ayxVar.f, i2);
    }

    private final void E(ayx ayxVar) {
        if (ayxVar.n && ayxVar.m) {
            HorizontalGridView horizontalGridView = ayxVar.a;
            ayo ayoVar = (ayo) horizontalGridView.k(horizontalGridView.getSelectedPosition(), false);
            l(ayxVar, ayoVar == null ? null : ayoVar.a, false);
        }
    }

    @Override // defpackage.azx
    protected azw b(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (g == 0) {
            g = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_selected_row_top_padding);
            h = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_selected_row_top_padding);
            i = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_row_no_hovercard_bottom_padding);
        }
        ayz ayzVar = new ayz(viewGroup.getContext());
        HorizontalGridView gridView = ayzVar.getGridView();
        if (this.j < 0) {
            TypedArray typedArrayObtainStyledAttributes = gridView.getContext().obtainStyledAttributes(atk.b);
            this.j = (int) typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        gridView.setFadingLeftEdgeLength(this.j);
        return new ayx(ayzVar, ayzVar.getGridView());
    }

    protected final void c(ayx ayxVar, View view) {
        baq baqVar = this.d;
        if (baqVar == null || !baqVar.b) {
            return;
        }
        int color = ayxVar.q.a.getColor();
        if (this.d.e) {
            ((bap) view).setOverlayColor(color);
            return;
        }
        Drawable foreground = view.getForeground();
        if (foreground instanceof ColorDrawable) {
            ((ColorDrawable) foreground).setColor(color);
        } else {
            view.setForeground(new ColorDrawable(color));
        }
    }

    @Override // defpackage.azx
    protected final void d(azw azwVar, boolean z) {
        awl awlVar;
        ayx ayxVar = (ayx) azwVar;
        HorizontalGridView horizontalGridView = ayxVar.a;
        ayo ayoVar = (ayo) horizontalGridView.k(horizontalGridView.getSelectedPosition(), false);
        if (ayoVar == null) {
            super.d(azwVar, z);
        } else {
            if (!z || (awlVar = azwVar.r) == null) {
                return;
            }
            awlVar.f(ayoVar.t, ayxVar, ayxVar.j);
        }
    }

    @Override // defpackage.azx
    public final void e(azw azwVar, boolean z) {
        HorizontalGridView horizontalGridView = ((ayx) azwVar).a;
        boolean z2 = !z;
        horizontalGridView.ad.bz(z2);
        horizontalGridView.aB(z2);
    }

    @Override // defpackage.azx
    protected final void f(azw azwVar) {
        super.f(azwVar);
        ayx ayxVar = (ayx) azwVar;
        Context context = azwVar.g.getContext();
        if (this.d == null) {
            boolean z = n() && this.f;
            boolean z2 = p() && this.a;
            boolean z3 = !auo.a(context).b && this.b;
            boolean z4 = auo.a(context).a;
            baq baqVar = new baq();
            baqVar.b = z;
            baqVar.c = z3;
            baqVar.d = z2;
            if (z3) {
                baqVar.f = context.getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius);
            }
            if (!baqVar.d) {
                baqVar.a = 1;
                baqVar.e = baqVar.b;
            } else if (z4) {
                baqVar.a = 2;
                baqVar.e = true;
            } else {
                baqVar.a = 3;
                Resources resources = context.getResources();
                baqVar.h = resources.getDimension(R.dimen.lb_material_shadow_focused_z);
                baqVar.g = resources.getDimension(R.dimen.lb_material_shadow_normal_z);
                baqVar.e = baqVar.b;
            }
            this.d = baqVar;
            if (baqVar.e) {
                this.k = new ayr(baqVar);
            }
        }
        ayxVar.b = new ayw(this, ayxVar);
        ayxVar.b.d = this.k;
        baq baqVar2 = this.d;
        HorizontalGridView horizontalGridView = ayxVar.a;
        if (baqVar2.a == 2) {
            horizontalGridView.setLayoutMode(1);
        }
        ayxVar.b.f = null;
        horizontalGridView.aC(this.d.a != 3);
        horizontalGridView.ad.X = new ayt(this, ayxVar);
        horizontalGridView.ae = new ayu();
        horizontalGridView.setNumRows(1);
    }

    @Override // defpackage.azx
    protected void g(azw azwVar, Object obj) {
        super.g(azwVar, obj);
        ayx ayxVar = (ayx) azwVar;
        ays aysVar = (ays) obj;
        ayxVar.b.s(aysVar.a);
        HorizontalGridView horizontalGridView = ayxVar.a;
        horizontalGridView.ag(ayxVar.b);
        horizontalGridView.setContentDescription(aysVar.dx());
    }

    @Override // defpackage.azx
    protected void h(azw azwVar, boolean z) {
        super.h(azwVar, z);
        ayx ayxVar = (ayx) azwVar;
        D(ayxVar);
        E(ayxVar);
    }

    @Override // defpackage.azx
    public void i(azw azwVar, boolean z) {
        super.i(azwVar, z);
        ayx ayxVar = (ayx) azwVar;
        D(ayxVar);
        E(ayxVar);
    }

    @Override // defpackage.azx
    protected final void j(azw azwVar) {
        super.j(azwVar);
        ayx ayxVar = (ayx) azwVar;
        HorizontalGridView horizontalGridView = ayxVar.a;
        int childCount = horizontalGridView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            c(ayxVar, horizontalGridView.getChildAt(i2));
        }
    }

    @Override // defpackage.azx
    protected final void k(azw azwVar) {
        ayx ayxVar = (ayx) azwVar;
        ayxVar.a.ag(null);
        ayxVar.b.s(null);
        super.k(azwVar);
    }

    final void l(ayx ayxVar, View view, boolean z) {
        awl awlVar;
        awl awlVar2;
        if (view == null) {
            if (!z || (awlVar = ayxVar.r) == null) {
                return;
            }
            awlVar.f(null, ayxVar, ayxVar.j);
            return;
        }
        if (ayxVar.m) {
            ayo ayoVar = (ayo) ayxVar.a.l(view);
            if (!z || (awlVar2 = ayxVar.r) == null) {
                return;
            }
            azk azkVar = ayoVar.t;
            Object obj = ayoVar.u;
            awlVar2.f(azkVar, ayxVar, ayxVar.j);
        }
    }

    @Override // defpackage.azx
    public final void m(azw azwVar, boolean z) {
        super.m(azwVar, z);
        ((ayx) azwVar).a.setChildrenVisibility(true != z ? 4 : 0);
    }

    public boolean n() {
        return true;
    }

    @Override // defpackage.azx
    public final boolean o() {
        return false;
    }

    public boolean p() {
        return true;
    }
}
