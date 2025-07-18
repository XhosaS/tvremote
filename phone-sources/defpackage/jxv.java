package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxv extends jxj {
    public jxu a;
    public View.OnClickListener b;
    public View.OnClickListener c;
    public hfw d;

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        jxu jxuVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (jxuVar = (jxu) arguments.getParcelable("CONFIRMATION_DIALOG_FRAGMENT_MODEL_KEY")) == null) {
            return;
        }
        this.a = jxuVar;
    }

    @Override // defpackage.jxj
    public final View onCreateDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.confirmation_dialog_container, viewGroup, false);
        sfy.q(this, new isg(this, viewInflate, 15, null));
        viewInflate.getClass();
        return viewInflate;
    }
}
