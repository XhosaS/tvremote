package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class oan {
    public Object d;
    public boolean e = false;
    final /* synthetic */ oat f;

    public oan(oat oatVar, Object obj) {
        this.f = oatVar;
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
        ArrayList arrayList = this.f.A;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
