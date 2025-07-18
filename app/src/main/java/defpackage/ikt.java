package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ikt extends iks {
    public gph a;
    public ipg b;
    public irh c;

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.a == gph.a ? R.layout.setup_wait_amati : R.layout.setup_wait, viewGroup, false);
    }

    @Override // defpackage.bq
    public final void aa(View view, Bundle bundle) {
        if (this.c.g()) {
            view.setBackground(this.c.b(dZ()));
        }
    }

    @Override // defpackage.iks, defpackage.bq
    public final void ex(Context context) {
        super.ex(context);
        this.b.b("Loading");
        this.b.a();
    }
}
