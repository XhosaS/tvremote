package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crr implements crq {
    private final List a;
    private cwz c = null;
    private float d = -1.0f;
    private cwz b = g(0.0f);

    public crr(List list) {
        this.a = list;
    }

    private final cwz g(float f) {
        List list = this.a;
        cwz cwzVar = (cwz) list.get(list.size() - 1);
        if (f >= cwzVar.c()) {
            return cwzVar;
        }
        for (int size = list.size() - 2; size > 0; size--) {
            cwz cwzVar2 = (cwz) list.get(size);
            if (this.b != cwzVar2 && cwzVar2.d(f)) {
                return cwzVar2;
            }
        }
        return (cwz) list.get(0);
    }

    @Override // defpackage.crq
    public final float a() {
        return ((cwz) this.a.get(r0.size() - 1)).b();
    }

    @Override // defpackage.crq
    public final float b() {
        return ((cwz) this.a.get(0)).c();
    }

    @Override // defpackage.crq
    public final cwz c() {
        return this.b;
    }

    @Override // defpackage.crq
    public final boolean d(float f) {
        cwz cwzVar = this.c;
        cwz cwzVar2 = this.b;
        if (cwzVar == cwzVar2 && this.d == f) {
            return true;
        }
        this.c = cwzVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.crq
    public final boolean e() {
        return false;
    }

    @Override // defpackage.crq
    public final boolean f(float f) {
        if (this.b.d(f)) {
            return !this.b.e();
        }
        this.b = g(f);
        return true;
    }
}
