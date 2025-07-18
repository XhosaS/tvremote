package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slp {
    public final Context a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public slp(Context context, Executor executor) {
        this.b = false;
        this.a = context;
        this.c = executor;
    }

    public final emm a() {
        a.ab(!this.b);
        this.b = true;
        if (this.d == null) {
            this.d = new cvi(new ebu[0]);
        }
        if (this.f == null) {
            this.f = new ghc(this.a);
        }
        return new emm(this);
    }

    @Deprecated
    public final void b(elm elmVar) {
        elmVar.getClass();
        this.e = elmVar;
    }

    public final void c(ebu[] ebuVarArr) {
        this.d = new cvi(ebuVarArr);
    }

    @Deprecated
    public slp() {
        this.a = null;
        this.e = elm.a;
        this.c = emf.a;
    }

    public slp(Context context) {
        this.a = context;
        this.e = elm.a;
        this.c = emf.a;
    }
}
