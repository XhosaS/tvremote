package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imi {
    public static final Set a = yfm.aZ(new wog[]{wog.SENTIMENT_TYPE_UNSPECIFIED, wog.THUMBS_NONE});
    public final String b;
    public final wll c;
    public boolean d;
    public wog e;
    public boolean f;
    public boolean g;
    public long h;
    public long i;

    public imi(String str, wll wllVar, boolean z, wog wogVar, boolean z2, boolean z3, long j, long j2) {
        str.getClass();
        wllVar.getClass();
        wogVar.getClass();
        this.b = str;
        this.c = wllVar;
        this.d = z;
        this.e = wogVar;
        this.f = z2;
        this.g = z3;
        this.h = j;
        this.i = j2;
    }

    public final void a(wog wogVar) {
        wogVar.getClass();
        this.e = wogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imi)) {
            return false;
        }
        imi imiVar = (imi) obj;
        return yks.e(this.b, imiVar.b) && yks.e(this.c, imiVar.c) && this.d == imiVar.d && this.e == imiVar.e && this.f == imiVar.f && this.g == imiVar.g && this.h == imiVar.h && this.i == imiVar.i;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.b.hashCode() * 31;
        wll wllVar = this.c;
        if (wllVar.A()) {
            iJ = wllVar.j();
        } else {
            int iJ2 = wllVar.M;
            if (iJ2 == 0) {
                iJ2 = wllVar.j();
                wllVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return ((((((((((((iHashCode + iJ) * 31) + a.q(this.d)) * 31) + this.e.hashCode()) * 31) + a.q(this.f)) * 31) + a.q(this.g)) * 31) + a.k(this.h)) * 31) + a.k(this.i);
    }

    public final String toString() {
        return "UserEntityState(accountName=" + this.b + ", entityId=" + this.c + ", inWatchlist=" + this.d + ", sentiment=" + this.e + ", watched=" + this.f + ", familyShared=" + this.g + ", lastClientWriteMillis=" + this.h + ", lastServerWriteMillis=" + this.i + ")";
    }

    public /* synthetic */ imi(String str, wll wllVar) {
        this(str, wllVar, false, wog.THUMBS_NONE, false, false, 0L, 0L);
    }
}
