package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmd {
    public final int a;
    public volatile int b;
    private volatile int c;

    public tmd() {
        this(0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmd)) {
            return false;
        }
        tmd tmdVar = (tmd) obj;
        if (this.a != tmdVar.a) {
            return false;
        }
        int i = tmdVar.b;
        int i2 = tmdVar.c;
        return true;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return "RenderedFeatureMetadata(requestedFeatureId=" + this.a + ", responseFeatureId=0, productId=0)";
    }

    public /* synthetic */ tmd(int i, int i2) {
        this.a = 1 == (i2 & 1) ? 0 : i;
        this.b = 0;
        this.c = 0;
    }
}
