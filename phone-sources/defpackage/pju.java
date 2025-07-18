package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pju {
    public static final pjz a = new pjz() { // from class: pjq
    };
    public static final pjz b = new pjz() { // from class: pjq
    };
    public pks c;
    public int d = -1;
    public final vty e;
    public final pkg f;
    private final pjz g;

    public pju(vty vtyVar, pjz pjzVar, pkg pkgVar) {
        this.e = vtyVar;
        this.g = pjzVar;
        this.f = pkgVar;
    }

    public final pka a() {
        return (pka) this.e.r();
    }

    public final void b(pju pjuVar) {
        a.ab(pjuVar.c == null);
        a.ab(!c());
        a.ab(this.g == pjuVar.g);
        boolean zN = this.c.n();
        if (zN) {
            this.f.d(this);
        }
        vty vtyVar = this.e;
        if (vtyVar.a.A()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        vtyVar.b = vtyVar.q();
        vtyVar.x((pka) pjuVar.e.r());
        if (zN) {
            this.f.c(this);
        }
    }

    public final boolean c() {
        ucy ucyVar = ((pka) this.e.b).d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        return (ucyVar.b & 8) != 0;
    }

    public final boolean d() {
        ucy ucyVar = ((pka) this.e.b).d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        return (ucyVar.b & RecyclerView.ItemAnimator.FLAG_MOVED) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pju.e():void");
    }

    public final int f() {
        return this.c.r();
    }

    public final String toString() {
        pks pksVar = this.c;
        String strConcat = pksVar != null ? ".".concat(String.valueOf(pksVar.getClass().getSimpleName())) : "";
        ucy ucyVar = ((pka) this.e.b).d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        return "CVE" + strConcat + "#" + ucyVar.d + " [" + Integer.toHexString(hashCode()) + "]";
    }
}
