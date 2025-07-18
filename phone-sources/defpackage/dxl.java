package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxl extends dxj {
    public dxl() {
        this((byte[]) null);
    }

    @Override // defpackage.dxj
    public final Object a(dxi dxiVar) {
        return this.b.get(dxiVar);
    }

    public final void b(dxi dxiVar, Object obj) {
        this.b.put(dxiVar, obj);
    }

    public dxl(dxj dxjVar) {
        dxjVar.getClass();
        this.b.putAll(dxjVar.b);
    }

    public /* synthetic */ dxl(byte[] bArr) {
        this(dxh.a);
    }
}
