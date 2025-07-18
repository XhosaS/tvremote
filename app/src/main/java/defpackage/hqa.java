package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqa extends hhj {
    private final hmb g;
    private final hmc h;

    public hqa(hmc hmcVar, hmb hmbVar) {
        super(hmcVar, new hpx(hmcVar, hmbVar));
        this.g = hmbVar;
        this.h = hmcVar;
    }

    @Override // defpackage.hvb, defpackage.azx
    protected final void z(azw azwVar) {
        super.z(azwVar);
        HorizontalGridView horizontalGridView = ((ayx) y(azwVar)).a;
        for (Object parent = horizontalGridView.getParent(); parent instanceof ViewGroup; parent = ((View) parent).getParent()) {
            if (((ViewGroup) parent).getId() == R.id.container_list) {
                pan panVarA = paq.a(horizontalGridView);
                hmc hmcVar = this.h;
                if (hmcVar.E() && panVarA != null && (panVarA.a().b & 1) == 0) {
                    this.g.q().u(hmcVar.y(), horizontalGridView, (View) parent);
                    return;
                }
                return;
            }
        }
    }
}
