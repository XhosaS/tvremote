package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ild extends ile {
    public final ing a;
    public final ikx b;
    public final irh c;
    public ayb d;
    public View e;
    public View f;
    public boolean g;

    public ild(ing ingVar, ikx ikxVar, irh irhVar) {
        irhVar.getClass();
        this.a = ingVar;
        this.b = ikxVar;
        this.c = irhVar;
    }

    public final View a() {
        View view = this.f;
        if (view != null) {
            return view;
        }
        agvy.b("errorBorder");
        return null;
    }

    public final void b(ayb aybVar, String str) {
        Resources resourcesAY = this.b.aY();
        if (resourcesAY != null) {
            Drawable drawable = resourcesAY.getDrawable(R.drawable.quantum_gm_ic_error_white_24, null);
            if (drawable != null) {
                drawable.setTint(resourcesAY.getColor(R.color.red400, null));
            }
            TextView textView = aybVar.t;
            if (textView != null) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
            TextView textView2 = aybVar.u;
            if (textView2 != null) {
                textView2.setText(str);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        a().setVisibility(0);
    }
}
