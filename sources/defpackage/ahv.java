package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ahv {
    public Object d;
    public boolean e = false;
    final /* synthetic */ aib f;

    public ahv(aib aibVar, Object obj) {
        this.f = aibVar;
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
        ArrayList arrayList = this.f.g;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
