package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class bft {
    public static final void a(bfu bfuVar, int i, Object obj) {
        bfuVar.e[(bfuVar.f - bfuVar.a[bfuVar.b - 1].c) + i] = obj;
    }

    public static final void b(bfu bfuVar, int i, Object obj, int i2, Object obj2) {
        int i3 = bfuVar.f - bfuVar.a[bfuVar.b - 1].c;
        Object[] objArr = bfuVar.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void c(bfu bfuVar, Object obj, Object obj2, Object obj3) {
        int i = bfuVar.f - bfuVar.a[bfuVar.b - 1].c;
        Object[] objArr = bfuVar.e;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
