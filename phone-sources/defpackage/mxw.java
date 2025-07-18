package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxw implements lhf {
    public final int a;

    public mxw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof mxw) && this.a == ((mxw) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "ToggleEpisodeSynopsisClickEvent{episodeIndex=" + this.a + "}";
    }

    public mxw(int i) {
        this.a = i;
    }
}
