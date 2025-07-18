package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbz implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    final /* synthetic */ fcb b;

    public fbz(fcb fcbVar, DisplayManager displayManager) {
        this.b = fcbVar;
        this.a = displayManager;
    }

    public final Display a() {
        return this.a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.b.c(a());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
