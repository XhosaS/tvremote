package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxy {
    public final tst a;

    public mxy() {
        throw null;
    }

    public static nxb a() {
        nxb nxbVar = new nxb((byte[]) null, (byte[]) null, (byte[]) null);
        nxbVar.a = trk.a;
        return nxbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxy) {
            return this.a.equals(((mxy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "EpisodesHeaderViewModel{hideUnavailableEpisodes=" + String.valueOf(this.a) + "}";
    }

    public mxy(tst tstVar) {
        this.a = tstVar;
    }
}
