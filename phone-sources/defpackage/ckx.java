package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckx extends ClickableSpan {
    private final cgf a;

    public ckx(cgf cgfVar) {
        this.a = cgfVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.b();
    }
}
