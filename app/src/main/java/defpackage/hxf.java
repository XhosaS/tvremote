package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxf implements zxe {
    final /* synthetic */ hxr a;

    public hxf(hxr hxrVar) {
        this.a = hxrVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        this.a.am = null;
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        xus xusVar = (xus) obj;
        xusVar.getClass();
        zdy zdyVar = hxr.f;
        xpu xpuVar = xusVar.b;
        if (xpuVar == null) {
            xpuVar = xpu.a;
        }
        final abxs abxsVar = xpuVar.b;
        abxsVar.getClass();
        final hxr hxrVar = this.a;
        if (!hxrVar.ai) {
            hxrVar.E().post(new Runnable() { // from class: hxe
                @Override // java.lang.Runnable
                public final void run() {
                    hxrVar.M(abxsVar);
                }
            });
        }
        hxrVar.o.O(abxsVar);
        hxrVar.am = null;
    }
}
