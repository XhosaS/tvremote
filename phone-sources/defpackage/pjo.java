package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjo {
    public final Context a;
    public final uhs b;
    public final yfo c;
    nsz d;
    nsz e;
    public volatile uho f;

    public pjo() {
        throw null;
    }

    public final synchronized nsz a(pjd pjdVar) {
        int i = pjdVar.b - 1;
        if (i == 0 || i == 1) {
            if (this.d == null) {
                Context context = this.a;
                List list = nsz.l;
                this.d = new nsu(context, "NOOP_LOG_SOURCE_NAME").a();
            }
            return this.d;
        }
        if (i != 2) {
            return null;
        }
        if (this.e == null) {
            this.e = nsz.i(this.a, "NOOP_LOG_SOURCE_NAME");
        }
        return this.e;
    }

    public final uhp b(pjn pjnVar, uhp uhpVar) {
        return ues.j(ufn.j(uhpVar, new pap(this, pjnVar, 5), this.b), nwk.class, new pri(1), ugk.a);
    }

    public pjo(Context context, yfo yfoVar, uhs uhsVar) {
        this.a = context;
        this.c = yfoVar;
        this.b = uhsVar;
    }
}
