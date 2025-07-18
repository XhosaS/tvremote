package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsl extends azx {
    public hsl() {
        this.e = null;
        this.f = false;
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        viewGroup.getClass();
        return new azw(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.logo_header_row, viewGroup, false));
    }
}
