package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azl implements ayw {
    private final bkc a;
    private final int b = 0;

    public azl(bkc bkcVar) {
        this.a = bkcVar;
    }

    @Override // defpackage.ayw
    public final int a(cmg cmgVar, long j, int i, cmi cmiVar) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return bkb.k.a(i, i2, cmiVar);
        }
        int i3 = i2 - i;
        return ykn.l(Math.round((i3 / 2.0f) * (((bke) this.a).a + 1.0f)), 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azl)) {
            return false;
        }
        azl azlVar = (azl) obj;
        if (!yks.e(this.a, azlVar.a)) {
            return false;
        }
        int i = azlVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
