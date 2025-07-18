package defpackage;

import android.widget.RemoteViews;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmk {
    public final RemoteViews a;
    public final dma b;

    public dmk(RemoteViews remoteViews, dma dmaVar) {
        this.a = remoteViews;
        this.b = dmaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmk)) {
            return false;
        }
        dmk dmkVar = (dmk) obj;
        return yks.e(this.a, dmkVar.a) && yks.e(this.b, dmkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.a + ", view=" + this.b + ')';
    }
}
