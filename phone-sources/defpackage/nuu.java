package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nuu {
    public final int a;
    final int b;
    final Bundle c;
    final kwy d = new kwy((byte[]) null, (byte[]) null);

    public nuu(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(nuv nuvVar) {
        this.d.t(nuvVar);
    }

    final void d(Object obj) {
        this.d.u(obj);
    }

    public final String toString() {
        return "Request { what=" + this.b + " id=" + this.a + " oneWay=" + b() + "}";
    }
}
