package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uyz implements akd {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public uyz(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.akd
    public final boolean a(View view) {
        this.b.w(this.a);
        return true;
    }
}
