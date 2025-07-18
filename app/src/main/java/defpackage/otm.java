package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otm extends zum {
    Object a;

    public otm(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.zum
    public final String a() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }

    @Override // defpackage.zum
    protected final void b() {
        this.a = null;
    }
}
