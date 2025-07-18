package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crs implements crq {
    private final cwz a;
    private float b = -1.0f;

    public crs(List list) {
        this.a = (cwz) list.get(0);
    }

    @Override // defpackage.crq
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.crq
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.crq
    public final cwz c() {
        return this.a;
    }

    @Override // defpackage.crq
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.crq
    public final boolean e() {
        return false;
    }

    @Override // defpackage.crq
    public final boolean f(float f) {
        return !this.a.e();
    }
}
