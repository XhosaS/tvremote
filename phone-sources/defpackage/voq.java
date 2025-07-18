package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class voq extends vot {
    public final Drawable a;
    private final boolean b;
    private final vfi c;

    public voq(Drawable drawable, boolean z, vfi vfiVar) {
        this.a = drawable;
        this.b = z;
        this.c = vfiVar;
    }

    @Override // defpackage.vot
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.vqn
    public final vfi b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voq)) {
            return false;
        }
        voq voqVar = (voq) obj;
        return yks.e(this.a, voqVar.a) && this.b == voqVar.b && yks.e(this.c, voqVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vfi vfiVar = this.c;
        return ((iHashCode + a.q(this.b)) * 31) + (vfiVar == null ? 0 : vfiVar.hashCode());
    }

    public final String toString() {
        return "CustomImage(icon=" + this.a + ", shouldTint=" + this.b + ", contentDescription=" + this.c + ")";
    }

    public /* synthetic */ voq(Drawable drawable, boolean z, int i) {
        this(drawable, z & ((i & 2) == 0), (vfi) null);
    }
}
