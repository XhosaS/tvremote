package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kaa extends kar {
    public kuw f;
    public kdj g;

    public abstract void b(bkp bkpVar, bao baoVar, int i);

    @Override // defpackage.kar
    public final boolean dS() {
        return true;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.compose_destination_fragment, viewGroup, false);
        ComposeView composeView = (ComposeView) viewInflate.findViewById(R.id.compose_view);
        composeView.i();
        composeView.b(new bhq(-1614541788, true, new azg(this, 11)));
        return viewInflate;
    }
}
