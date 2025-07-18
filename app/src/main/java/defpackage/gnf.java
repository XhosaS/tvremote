package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnf {
    public final Instant a;
    public final String b;
    public final int c;

    public gnf(Instant instant, String str, int i) {
        this.a = instant;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnf)) {
            return false;
        }
        gnf gnfVar = (gnf) obj;
        return agvy.c(this.a, gnfVar.a) && agvy.c(this.b, gnfVar.b) && this.c == gnfVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "BrowseHistoryEvent(timestamp=" + this.a + ", packageName=" + this.b + ", itemType=" + this.c + ")";
    }
}
