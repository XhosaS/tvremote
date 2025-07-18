package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhg extends azx {
    public hhg() {
        this.f = false;
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        return new azw(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_bar_holder, viewGroup, false));
    }

    @Override // defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        super.g(azwVar, obj);
        if (obj instanceof hhf) {
            View view = azwVar.g;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = ((hhf) obj).a;
            view.setLayoutParams(layoutParams);
        }
    }
}
