package defpackage;

import android.util.Log;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yi extends xl {
    public final int j = 54321;
    public final yo k;
    public yj l;
    private xf m;

    public yi(yo yoVar) {
        this.k = yoVar;
        if (yoVar.j != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        yoVar.j = this;
        yoVar.d = 54321;
    }

    @Override // defpackage.xk
    protected final void c() {
        if (yh.b(2)) {
            toString();
            Log.v("LoaderManager", "  Starting: ".concat(toString()));
        }
        yo yoVar = this.k;
        yoVar.f = true;
        yoVar.h = false;
        yoVar.g = false;
        yn ynVar = (yn) yoVar;
        List list = ynVar.c;
        if (list != null) {
            ynVar.b(list);
            return;
        }
        yoVar.d();
        ynVar.a = new ym(ynVar);
        ynVar.a();
    }

    @Override // defpackage.xk
    protected final void d() {
        if (yh.b(2)) {
            toString();
            Log.v("LoaderManager", "  Stopping: ".concat(toString()));
        }
        yo yoVar = this.k;
        yoVar.f = false;
        yoVar.d();
    }

    @Override // defpackage.xk
    public final void g(yj yjVar) {
        super.g(yjVar);
        this.m = null;
        this.l = null;
    }

    public final void h() {
        xf xfVar = this.m;
        yj yjVar = this.l;
        if (xfVar == null || yjVar == null) {
            return;
        }
        super.g(yjVar);
        f(xfVar, yjVar);
    }

    public final void i() {
        if (yh.b(3)) {
            toString();
            Log.d("LoaderManager", "  Destroying: ".concat(toString()));
        }
        yo yoVar = this.k;
        yoVar.d();
        yoVar.g = true;
        yj yjVar = this.l;
        if (yjVar != null) {
            g(yjVar);
            if (yjVar.b) {
                if (yh.b(2)) {
                    yo yoVar2 = yjVar.a;
                    Objects.toString(yoVar2);
                    Log.v("LoaderManager", "  Resetting: ".concat(String.valueOf(yoVar2)));
                }
                beg begVar = yjVar.c;
                begVar.Z.clear();
                begVar.Z.notifyDataSetChanged();
            }
        }
        yi yiVar = yoVar.j;
        if (yiVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (yiVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        yoVar.j = null;
        yoVar.h = true;
        yoVar.f = false;
        yoVar.g = false;
        yoVar.i = false;
    }

    public final void j(xf xfVar, beg begVar) {
        yj yjVar = new yj(this.k, begVar);
        f(xfVar, yjVar);
        yj yjVar2 = this.l;
        if (yjVar2 != null) {
            g(yjVar2);
        }
        this.m = xfVar;
        this.l = yjVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.j);
        sb.append(" : ");
        yo yoVar = this.k;
        sb.append(yoVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(yoVar)));
        sb.append("}}");
        return sb.toString();
    }
}
