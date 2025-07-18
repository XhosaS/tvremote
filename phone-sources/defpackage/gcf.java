package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gcf {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public gcf(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final int a(fzx fzxVar) {
        fzxVar.getClass();
        int iOrdinal = fzxVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.c;
        }
        if (iOrdinal == 2) {
            return this.d;
        }
        throw new yfu();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcf)) {
            return false;
        }
        gcf gcfVar = (gcf) obj;
        return this.c == gcfVar.c && this.d == gcfVar.d && this.e == gcfVar.e && this.f == gcfVar.f;
    }

    public int hashCode() {
        return this.c + this.d + this.e + this.f;
    }
}
