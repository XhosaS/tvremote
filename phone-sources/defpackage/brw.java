package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class brw {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        return (obj instanceof brw) && yks.e(this.a, ((brw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
