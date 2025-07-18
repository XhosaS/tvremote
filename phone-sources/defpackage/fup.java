package defpackage;

import android.content.ComponentName;
import android.content.Context;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fup {
    private final ful a = new ful(this);
    public final Context e;
    public final fum f;
    public fuh g;
    public boolean h;
    public fuq i;
    public boolean j;
    public pku k;

    public fup(Context context, fum fumVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.e = context;
        if (fumVar == null) {
            this.f = new fum(new ComponentName(context, getClass()));
        } else {
            this.f = fumVar;
        }
    }

    public fun c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final void dA(fuq fuqVar) {
        fuy.e();
        if (this.i != fuqVar) {
            this.i = fuqVar;
            if (this.j) {
                return;
            }
            this.j = true;
            this.a.sendEmptyMessage(1);
        }
    }

    public final void dB(fuh fuhVar) {
        fuy.e();
        if (Objects.equals(this.g, fuhVar)) {
            return;
        }
        dC(fuhVar);
    }

    final void dC(fuh fuhVar) {
        this.g = fuhVar;
        if (this.h) {
            return;
        }
        this.h = true;
        this.a.sendEmptyMessage(2);
    }

    public final void dD(pku pkuVar) {
        fuy.e();
        this.k = pkuVar;
    }

    public fuk dx(String str, fuo fuoVar) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public fun dy(String str, fuo fuoVar) {
        return c(str);
    }

    public fun dz(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return dy(str, fuo.a);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public void e(fuh fuhVar) {
        throw null;
    }
}
