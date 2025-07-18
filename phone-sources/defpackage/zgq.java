package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgq {
    public final boolean a;
    public final boolean b;
    public final zhe c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;

    public zgq(boolean z, boolean z2, zhe zheVar, Long l, Long l2, Long l3, Long l4) {
        this.a = z;
        this.b = z2;
        this.c = zheVar;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            Objects.toString(l);
            arrayList.add("byteCount=".concat(l.toString()));
        }
        Long l2 = this.e;
        if (l2 != null) {
            Objects.toString(l2);
            arrayList.add("createdAt=".concat(l2.toString()));
        }
        Long l3 = this.f;
        if (l3 != null) {
            Objects.toString(l3);
            arrayList.add("lastModifiedAt=".concat(l3.toString()));
        }
        Long l4 = this.g;
        if (l4 != null) {
            Objects.toString(l4);
            arrayList.add("lastAccessedAt=".concat(l4.toString()));
        }
        return yfm.ax(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public zgq() {
        this(false, false, null, null, null, null, null);
    }
}
