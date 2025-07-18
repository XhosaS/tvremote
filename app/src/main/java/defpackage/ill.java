package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ill extends ilm {
    public final ini a;
    public final ilf b;
    public final irh c;
    public ayb d;
    public View e;
    public View f;
    public boolean g;

    public ill(ini iniVar, ilf ilfVar, irh irhVar) {
        irhVar.getClass();
        this.a = iniVar;
        this.b = ilfVar;
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
        Drawable drawable;
        Resources resourcesAY = this.b.aY();
        if (resourcesAY == null || (drawable = resourcesAY.getDrawable(R.drawable.quantum_gm_ic_error_white_24, null)) == null) {
            drawable = null;
        } else {
            drawable.setTint(resourcesAY.getColor(R.color.red400, null));
        }
        TextView textView = aybVar.t;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        TextView textView2 = aybVar.u;
        if (textView2 != null) {
            textView2.setText(str);
            textView2.setVisibility(0);
        }
        a().setVisibility(0);
    }
}
