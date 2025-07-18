package defpackage;

import android.view.View;
import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbj {
    public static final cbj a = new cbj();

    private cbj() {
    }

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
