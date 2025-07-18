package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hrc extends hqz implements hhh {
    protected int aC;
    public hhh aD;
    public hhi aE;
    protected int aF;

    @Override // defpackage.hmc
    public final boolean A() {
        return false;
    }

    @Override // defpackage.hmc
    public final boolean B() {
        return true;
    }

    public boolean C() {
        return true;
    }

    @Override // defpackage.bq
    public final void Y() {
        this.P = true;
        this.aD = null;
    }

    @Override // defpackage.bq
    public void Z() {
        this.P = true;
        Object objEp = ep();
        if (objEp instanceof hhh) {
            this.aD = (hhh) objEp;
        } else if (feo.b(objEp, hhh.class)) {
            this.aD = (hhh) feo.a(objEp);
        }
        hhi hhiVar = this.aE;
        if (hhiVar != null) {
            aE(hhiVar.a);
        }
    }

    @Override // defpackage.hhh
    public final void aC(int i) {
        if (this.aD == null || !this.aK.x()) {
            return;
        }
        this.aD.aC(i);
    }

    @Override // defpackage.hhh
    public final void aE(int i) {
        if (this.aD == null || !this.aK.x()) {
            return;
        }
        this.aD.aE(i + this.aC);
    }

    protected int aL(Context context) {
        return context.getResources().getDimensionPixelSize(this.aQ == gph.a ? R.dimen.keyboard_search_rows_fragment_padding_top : R.dimen.top_padding_fullscreen);
    }

    @Override // defpackage.hrw
    protected void aS() {
        this.aK.s(new hhf(dZ().getResources().getDimensionPixelSize(this.aQ == gph.a ? R.dimen.search_bar_holder_vertical_height_amati : R.dimen.search_bar_holder_vertical_height_watson)));
    }

    @Override // defpackage.hrw, defpackage.atx, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        VerticalGridView verticalGridView = this.b;
        verticalGridView.setPadding(verticalGridView.getPaddingLeft(), this.aC, verticalGridView.getPaddingRight(), verticalGridView.getPaddingBottom());
        ba(verticalGridView);
    }

    protected void ba(VerticalGridView verticalGridView) {
        gph gphVar = this.aQ;
        gph gphVar2 = gph.a;
        if (gphVar == gphVar2) {
            verticalGridView.setWindowAlignment(1);
        }
        verticalGridView.setWindowAlignmentOffset(this.aQ == gphVar2 ? verticalGridView.getResources().getDimensionPixelSize(R.dimen.window_key_line) : verticalGridView.getResources().getDimensionPixelSize(R.dimen.keyboard_window_key_line_watson));
        verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
        verticalGridView.setItemAlignmentOffset(0);
        verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
    }

    @Override // defpackage.hrw
    protected final void bd(Bundle bundle) {
        super.bd(bundle);
        if (this.aE == null) {
            this.aE = new hrb(this, bundle, this);
        }
        this.b.y(this.aE);
    }

    @Override // defpackage.hrw
    protected final boolean es() {
        return false;
    }

    @Override // defpackage.hqz, defpackage.hra, defpackage.bq
    public void ex(Context context) {
        super.ex(context);
        Bundle bundle = this.n;
        this.aF = bundle != null ? bundle.getInt("search_bar_container_height") : 0;
        this.aC = aL(context);
    }

    @Override // defpackage.atn, defpackage.bq
    public final void g(Bundle bundle) {
        super.g(bundle);
        hhi hhiVar = this.aE;
        if (hhiVar != null) {
            bundle.putInt("y_offset_state", hhiVar.a);
        }
    }

    @Override // defpackage.hmc
    public final boolean z() {
        return false;
    }
}
