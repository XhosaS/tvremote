package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spy implements czc {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public spy(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.czc
    public final boolean a(View view) {
        this.b.P(this.a);
        return true;
    }
}
