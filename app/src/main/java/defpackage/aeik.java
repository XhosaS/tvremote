package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aeik implements aeiz {
    private volatile Object a;
    private final Object b = new Object();
    private final bq c;
    private final aeip d;

    public aeik(bq bqVar) {
        this.c = bqVar;
        this.d = new aeip(bqVar);
    }

    public static final Context c(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void d(bq bqVar) {
        if (bqVar.n == null) {
            bqVar.ae(new Bundle());
        }
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    bq bqVar = this.c;
                    if (bqVar.ep() == null) {
                        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
                    }
                    aejb.a(bqVar.ep() instanceof aeiz, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", bqVar.ep().getClass());
                    b(bqVar);
                    etf etfVarO = ((aeij) aehg.a(bqVar.ep(), aeij.class)).o();
                    etfVarO.d = this.d.dN();
                    etfVarO.c = bqVar;
                    aejk.a(etfVarO.c, bq.class);
                    aejk.a(etfVarO.d, aehk.class);
                    this.a = new eth(etfVarO.a, etfVarO.b, etfVarO.c);
                }
            }
        }
        return this.a;
    }

    protected void b(bq bqVar) {
    }
}
