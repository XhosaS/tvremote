package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hde implements hdd {
    private final List a;
    private hhs c = null;
    private float d = -1.0f;
    private hhs b = g(0.0f);

    public hde(List list) {
        this.a = list;
    }

    private final hhs g(float f) {
        List list = this.a;
        hhs hhsVar = (hhs) list.get(list.size() - 1);
        if (f >= hhsVar.c()) {
            return hhsVar;
        }
        for (int size = list.size() - 2; size > 0; size--) {
            hhs hhsVar2 = (hhs) list.get(size);
            if (this.b != hhsVar2 && hhsVar2.d(f)) {
                return hhsVar2;
            }
        }
        return (hhs) list.get(0);
    }

    @Override // defpackage.hdd
    public final float a() {
        return ((hhs) this.a.get(r0.size() - 1)).b();
    }

    @Override // defpackage.hdd
    public final float b() {
        return ((hhs) this.a.get(0)).c();
    }

    @Override // defpackage.hdd
    public final hhs c() {
        return this.b;
    }

    @Override // defpackage.hdd
    public final boolean d(float f) {
        hhs hhsVar = this.c;
        hhs hhsVar2 = this.b;
        if (hhsVar == hhsVar2 && this.d == f) {
            return true;
        }
        this.c = hhsVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.hdd
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hdd
    public final boolean f(float f) {
        if (this.b.d(f)) {
            return !this.b.e();
        }
        this.b = g(f);
        return true;
    }
}
