package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxt implements dvw {
    public final dxy a;
    public final dxq b;
    public boolean c = false;

    public dxt(dxy dxyVar, dxq dxqVar) {
        this.a = dxyVar;
        this.b = dxqVar;
    }

    @Override // defpackage.dvw
    public final void dV(Object obj) {
        if (dxr.b(2)) {
            Objects.toString(this.a);
            dxy.j(obj);
        }
        this.c = true;
        this.b.b(obj);
    }

    public final String toString() {
        return this.b.toString();
    }
}
