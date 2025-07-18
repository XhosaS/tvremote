package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class atn extends bq {
    public azd a;
    public VerticalGridView b;
    public boolean e;
    final ayq c = new ayq();
    public int d = -1;
    final atm f = new atm(this);
    public final aze ah = new atl(this);

    @Override // defpackage.bq
    public View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.lb_rows_fragment, viewGroup, false);
        this.b = dP(viewInflate);
        if (this.e) {
            this.e = false;
            dR();
        }
        return viewInflate;
    }

    public void aB() {
        throw null;
    }

    public VerticalGridView dP(View view) {
        throw null;
    }

    public void dQ(qv qvVar, int i) {
        throw null;
    }

    public void dR() {
        throw null;
    }

    public void dS(int i) {
        throw null;
    }

    final void dT() {
        if (this.a == null) {
            return;
        }
        pq adapter = this.b.getAdapter();
        ayq ayqVar = this.c;
        if (adapter != ayqVar) {
            this.b.ag(ayqVar);
        }
        if (ayqVar.a() == 0 && this.d >= 0) {
            atm atmVar = this.f;
            atmVar.a = true;
            atmVar.b.c.a.registerObserver(atmVar);
        } else {
            int i = this.d;
            if (i >= 0) {
                this.b.setSelectedPosition(i);
            }
        }
    }

    @Override // defpackage.bq
    public void g(Bundle bundle) {
        bundle.putInt("currentSelectedPosition", this.d);
    }
}
