package defpackage;

import android.os.Looper;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qo {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    static int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(b.e(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static ahi d(Object obj, Looper looper, String str) {
        qp.q(looper, "Looper must not be null");
        qp.q(str, "Listener type must not be null");
        return new ahi(looper, obj, str);
    }
}
