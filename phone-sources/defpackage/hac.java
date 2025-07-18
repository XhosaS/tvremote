package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hac extends gzv {
    public final Drawable a;
    public final gzu b;
    public final int c;
    private final gza d;
    private final String e;
    private final boolean f;
    private final boolean g = false;

    public hac(Drawable drawable, gzu gzuVar, int i, gza gzaVar, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = gzuVar;
        this.c = i;
        this.d = gzaVar;
        this.e = str;
        this.f = z;
    }

    @Override // defpackage.gzv
    public final gzu a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hac)) {
            return false;
        }
        hac hacVar = (hac) obj;
        if (!yks.e(this.a, hacVar.a) || !yks.e(this.b, hacVar.b) || this.c != hacVar.c || !yks.e(this.d, hacVar.d) || !yks.e(this.e, hacVar.e) || this.f != hacVar.f) {
            return false;
        }
        boolean z = hacVar.g;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = this.c;
        a.bw(i);
        gza gzaVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + i) * 31) + (gzaVar != null ? gzaVar.hashCode() : 0)) * 31;
        String str = this.e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + a.q(this.f)) * 31) + a.q(false);
    }
}
