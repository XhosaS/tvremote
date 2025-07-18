package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyo extends ClickableSpan {
    private final int a;
    private final cyq b;
    private final int c;

    public cyo(int i, cyq cyqVar, int i2) {
        this.a = i;
        this.b = cyqVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.b.performAction(this.c, bundle);
    }
}
