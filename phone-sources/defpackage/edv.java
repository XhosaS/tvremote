package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edv implements eac {
    public final int a;

    public edv(int i) {
        this.a = i;
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    @Override // defpackage.eac
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edv) && this.a == ((edv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }

    @Override // defpackage.eac
    public final /* synthetic */ void b(eaa eaaVar) {
    }
}
