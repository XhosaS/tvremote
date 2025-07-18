package defpackage;

import android.R;
import android.view.View;
import com.google.android.libraries.tv.widgets.card.textarea.ImageWithTextCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hoj extends hps {
    public hoj(View view, boolean z, hmb hmbVar, zyg zygVar, zyg zygVar2) {
        super(view, hmbVar, z, zygVar, zygVar2);
    }

    @Override // defpackage.hps
    public final void f(hkk hkkVar) {
        super.f(hkkVar);
        ImageWithTextCardView imageWithTextCardView = (ImageWithTextCardView) this.g;
        if (this.b.r() == gph.a) {
            imageWithTextCardView.e(3);
        } else {
            imageWithTextCardView.e(1);
        }
        imageWithTextCardView.d(true);
    }

    @Override // defpackage.hps, android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        hkk hkkVar = this.f;
        if (hkkVar != null) {
            hkkVar.d = z;
        }
        if (this.h && z) {
            h(0);
        } else {
            h(8);
        }
        ImageWithTextCardView imageWithTextCardView = (ImageWithTextCardView) this.g;
        if (z) {
            imageWithTextCardView.e(4);
            imageWithTextCardView.c(R.attr.state_selected);
        } else if (this.b.r() == gph.a) {
            imageWithTextCardView.e(3);
            imageWithTextCardView.c(new int[0]);
        } else {
            imageWithTextCardView.e(1);
            imageWithTextCardView.c(new int[0]);
        }
        imageWithTextCardView.a(z);
        this.d.onFocusChange(view, z);
        this.e.onFocusChange(view, z);
    }
}
