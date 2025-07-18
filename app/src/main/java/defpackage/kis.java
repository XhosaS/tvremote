package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kis {
    public Object d;
    public boolean e = false;
    final /* synthetic */ kiz f;

    public kis(kiz kizVar, Object obj) {
        this.f = kizVar;
        this.d = obj;
    }

    protected abstract void c();

    public final void d() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void e() {
        d();
        ArrayList arrayList = this.f.h;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
