package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ece {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public ece() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    final ece a(ece eceVar) {
        int i = eceVar.h;
        int i2 = this.h;
        int i3 = eceVar.g;
        int i4 = this.g;
        int i5 = eceVar.f;
        int i6 = this.f;
        int i7 = eceVar.e;
        int i8 = this.e;
        int i9 = eceVar.d;
        int i10 = this.d;
        int i11 = eceVar.c;
        int i12 = this.c;
        return new ece(eceVar.a + this.a, eceVar.b + this.b, i11 + i12, i9 + i10, i7 + i8, i5 + i6, i3 + i4, i + i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ece eceVar = (ece) obj;
            if (this.a == eceVar.a && this.b == eceVar.b && this.c == eceVar.c && this.d == eceVar.d && this.e == eceVar.e && this.f == eceVar.f && this.g == eceVar.g && this.h == eceVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        return "ChangeSetStats{mEffectiveChangesCount=" + this.a + ", mInsertSingleCount=" + this.b + ", mInsertRangeCount=" + this.c + ", mDeleteSingleCount=" + this.d + ", mDeleteRangeCount=" + this.e + ", mUpdateSingleCount=" + this.f + ", mUpdateRangeCount=" + this.g + ", mMoveCount=" + this.h + "}";
    }

    public ece(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }
}
