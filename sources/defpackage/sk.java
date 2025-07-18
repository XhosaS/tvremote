package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sk extends ClickableSpan {
    private final int a;
    private final sm b;
    private final int c;

    public sk(int i, sm smVar, int i2) {
        this.a = i;
        this.b = smVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.b.performAction(this.c, bundle);
    }
}
