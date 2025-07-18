package defpackage;

import com.google.android.apps.inputmethod.libs.tvvoice.api.KeyboardEventData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnu extends esg {
    final /* synthetic */ jnw a;

    public jnu(jnw jnwVar) {
        this.a = jnwVar;
    }

    @Override // defpackage.esh
    public final void I(KeyboardEventData keyboardEventData) {
        esk eskVar;
        if (keyboardEventData == null || (eskVar = keyboardEventData.a) == null) {
            return;
        }
        jnw jnwVar = this.a;
        synchronized (jnw.a) {
            int i = eskVar.b;
            int i2 = 1;
            int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
            if (i3 != 0) {
                i2 = i3;
            }
            jnwVar.e = i2;
        }
    }

    @Override // defpackage.esh
    public final void c(boolean z) {
        Object obj = jnw.a;
        jnw jnwVar = this.a;
        synchronized (obj) {
            jnwVar.c = z;
        }
    }
}
