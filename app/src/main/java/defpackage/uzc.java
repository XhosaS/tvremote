package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uzc implements Runnable {
    final /* synthetic */ uzd a;

    public uzc(uzd uzdVar) {
        this.a = uzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uzd uzdVar = this.a;
        uzdVar.b = false;
        BottomSheetBehavior bottomSheetBehavior = uzdVar.c;
        alp alpVar = bottomSheetBehavior.x;
        if (alpVar != null && alpVar.l()) {
            uzdVar.a(uzdVar.a);
        } else if (bottomSheetBehavior.w == 2) {
            bottomSheetBehavior.x(uzdVar.a);
        }
    }
}
