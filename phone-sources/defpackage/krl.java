package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krl implements idb, idy {
    public volatile boolean a;

    public krl(boolean z) {
        this.a = z;
    }

    @Override // defpackage.idb
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.idy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(Boolean bool) {
        this.a = bool.booleanValue();
    }
}
