package defpackage;

import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilt extends ayc {
    final /* synthetic */ ilv k;

    public ilt(ilv ilvVar) {
        this.k = ilvVar;
    }

    @Override // defpackage.ayc
    public final int a() {
        return this.k.b.g() ? R.layout.setup_guidedactions_item : R.layout.lb_guidedactions_item;
    }

    @Override // defpackage.ayc
    public final void e(ayb aybVar, axh axhVar) {
        aybVar.getClass();
        axhVar.getClass();
        super.e(aybVar, axhVar);
        TextView textView = aybVar.t;
        if (textView != null) {
            CharSequence charSequence = axhVar.b;
            int i = 8;
            if (charSequence != null && charSequence.length() != 0) {
                i = 0;
            }
            textView.setVisibility(i);
        }
        TextView textView2 = aybVar.u;
        if (textView2 != null) {
            textView2.setAlpha(aco.c(this.k.a.dZ().getResources()));
        }
        long j = axhVar.a;
        if (j == -100 || j == -101) {
            aybVar.a.setClickable(false);
        }
    }
}
