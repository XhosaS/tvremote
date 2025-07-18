package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqb {
    public int a;
    public boolean b;
    public final /* synthetic */ BottomSheetBehavior c;
    private final Runnable d = new slt(this, 6, null);

    public sqb(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    public final void a(int i) {
        BottomSheetBehavior bottomSheetBehavior = this.c;
        WeakReference weakReference = bottomSheetBehavior.C;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((View) bottomSheetBehavior.C.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
