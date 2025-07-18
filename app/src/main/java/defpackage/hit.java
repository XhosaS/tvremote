package defpackage;

import android.view.ViewGroup;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hit extends hhj {
    public hit(hmc hmcVar) {
        super(hmcVar, new his());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hvb
    /* renamed from: D */
    public final ayx b(ViewGroup viewGroup) {
        viewGroup.getClass();
        ayx ayxVarD = super.b(viewGroup);
        HorizontalGridView horizontalGridView = ayxVarD.a;
        horizontalGridView.setClipChildren(false);
        horizontalGridView.setClipToPadding(false);
        horizontalGridView.setHorizontalSpacing(viewGroup.getResources().getDimensionPixelSize(R.dimen.disclaimer_chip_spacing));
        return ayxVarD;
    }

    @Override // defpackage.hvb, defpackage.ayy, defpackage.azx
    public final /* bridge */ /* synthetic */ azw b(ViewGroup viewGroup) {
        return b(viewGroup);
    }

    @Override // defpackage.ayy
    public final boolean n() {
        return false;
    }

    @Override // defpackage.ayy
    public final boolean p() {
        return false;
    }
}
