package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhz implements su {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public bhz(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.su
    public final boolean a(View view) throws Resources.NotFoundException {
        this.b.Z(this.a);
        return true;
    }
}
