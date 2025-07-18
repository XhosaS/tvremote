package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ref extends rer {
    public LinearProgressIndicator g;
    public View h;

    public ref(ViewGroup viewGroup, Context context, rjg rjgVar) {
        super(viewGroup, context, rjgVar);
    }

    @Override // defpackage.rer
    protected final View b(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.a).inflate(R.layout.og_progress_card_content, viewGroup);
        this.h = viewInflate;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) viewInflate.findViewById(R.id.og_card_progress_indicator);
        this.g = linearProgressIndicator;
        swu swuVar = linearProgressIndicator.a;
        if (swuVar.c != 0.5f) {
            swuVar.c = Math.min(0.5f, 0.5f);
            swuVar.d = true;
            linearProgressIndicator.invalidate();
        }
        LinearProgressIndicator linearProgressIndicator2 = this.g;
        swu swuVar2 = linearProgressIndicator2.a;
        if (swuVar2.i != 0) {
            swuVar2.i = 0;
            swuVar2.b();
            linearProgressIndicator2.invalidate();
        }
        LinearProgressIndicator linearProgressIndicator3 = this.g;
        sxz sxzVar = (sxz) linearProgressIndicator3.a;
        if (sxzVar.r != 0) {
            sxzVar.r = 0;
            sxzVar.b();
            linearProgressIndicator3.invalidate();
        }
        return this.h;
    }

    @Override // defpackage.rer, defpackage.rdv
    protected final void c(dvk dvkVar) {
        super.c(dvkVar);
        ((red) this.f).getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rer
    /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void f(dvk dvkVar, red redVar) {
        super.f(dvkVar, redVar);
        dvv dvvVar = redVar.a;
        throw null;
    }
}
