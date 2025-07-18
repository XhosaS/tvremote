package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdf implements hdd {
    private final hhs a;
    private float b = -1.0f;

    public hdf(List list) {
        this.a = (hhs) list.get(0);
    }

    @Override // defpackage.hdd
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.hdd
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.hdd
    public final hhs c() {
        return this.a;
    }

    @Override // defpackage.hdd
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.hdd
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hdd
    public final boolean f(float f) {
        return !this.a.e();
    }
}
