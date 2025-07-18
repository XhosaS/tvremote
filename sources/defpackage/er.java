package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.leanback.widget.SearchBar;
import com.google.android.tv.remote.service.pairing.PairingCodeActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class er implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ er(PairingCodeActivity pairingCodeActivity, int i) {
        this.b = i;
        this.a = pairingCodeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            ((cy) this.a).f();
            return;
        }
        if (i == 1) {
            bp bpVar = (bp) this.a;
            bpVar.x.obtainMessage(1, bpVar.b).sendToTarget();
            return;
        }
        if (i == 2) {
            ((Toolbar) this.a).j();
            return;
        }
        if (i == 3) {
            ((SearchBar) this.a).b();
        } else {
            if (i == 4) {
                ((PairingCodeActivity) this.a).a();
                return;
            }
            PairingCodeActivity pairingCodeActivity = (PairingCodeActivity) this.a;
            pairingCodeActivity.a.removeCallbacksAndMessages(null);
            pairingCodeActivity.c();
        }
    }

    public er(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
