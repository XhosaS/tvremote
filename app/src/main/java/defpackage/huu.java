package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huu extends azu {
    private final boolean c;
    private htv d;

    public huu(boolean z) {
        super(null);
        this.c = z;
    }

    @Override // defpackage.azu, defpackage.azm
    public final azk q(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.base_h4_row_header, viewGroup, false);
        viewInflate.getClass();
        huv huvVar = new huv(viewInflate);
        if (this.c) {
            htv htvVar = this.d;
            if (htvVar == null) {
                Context context = viewGroup.getContext();
                context.getClass();
                htvVar = new htv(context);
                this.d = htvVar;
            }
            View view = huvVar.g;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = htvVar.f;
            view.setLayoutParams(marginLayoutParams);
            view.setMinimumHeight(htvVar.b);
            TextView textView = huvVar.e;
            textView.setTypeface(htvVar.d);
            textView.setTextSize(0, htvVar.c);
            textView.setTextColor(htvVar.a);
        }
        return huvVar;
    }

    @Override // defpackage.azu, defpackage.azm
    public final void s(azk azkVar, Object obj) {
        azr azrVar;
        aye ayeVar;
        String str;
        if (azkVar instanceof huv) {
            if (!(obj instanceof azr) || (ayeVar = (azrVar = (azr) obj).b) == null || (str = ayeVar.a) == null || str.length() == 0) {
                ((huv) azkVar).c();
                return;
            }
            huv huvVar = (huv) azkVar;
            huvVar.e.setText(azrVar.b.a);
            huvVar.g.setVisibility(0);
        }
    }

    @Override // defpackage.azu, defpackage.azm
    public final void u(azk azkVar) {
        if (azkVar instanceof huv) {
            huv huvVar = (huv) azkVar;
            huvVar.e.setText("");
            huvVar.c();
        }
    }

    @Override // defpackage.azu
    protected final void b(azt aztVar) {
    }
}
