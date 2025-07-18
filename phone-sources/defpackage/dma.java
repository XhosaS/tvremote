package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dma {
    public final int a;
    public final int b;
    public final Map c;

    /* JADX WARN: Illegal instructions before constructor call */
    public dma() {
        int i = 0;
        this(i, i, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dma)) {
            return false;
        }
        dma dmaVar = (dma) obj;
        return this.a == dmaVar.a && this.b == dmaVar.b && yks.e(this.c, dmaVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.a + ", complexViewId=" + this.b + ", children=" + this.c + ')';
    }

    public dma(int i, int i2, Map map) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dma(int i, int i2, Map map, int i3) {
        map = (i3 & 4) != 0 ? yhc.a : map;
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        this(1 == i5 ? -1 : i, i4 != 0 ? -1 : i2, map);
    }
}
