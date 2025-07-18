package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewd {
    public static final ewd a = new ewd();

    private ewd() {
    }

    public final boolean a(DisplayManager displayManager) {
        displayManager.getClass();
        Display[] displays = displayManager.getDisplays();
        displays.getClass();
        for (Display display : displays) {
            if (display.getState() != 1) {
                return false;
            }
        }
        return true;
    }
}
