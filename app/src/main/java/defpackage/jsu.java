package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsu extends juv {
    private final jtm a;
    private final zye b;
    private final zwx c;

    public jsu(jtm jtmVar, zye zyeVar, zwx zwxVar) {
        this.a = jtmVar;
        this.b = zyeVar;
        this.c = zwxVar;
    }

    @Override // defpackage.juv
    public final jtm a() {
        return this.a;
    }

    @Override // defpackage.juv
    public final zwx b() {
        return this.c;
    }

    @Override // defpackage.juv
    public final zye c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof juv) {
            juv juvVar = (juv) obj;
            if (this.a.equals(juvVar.a()) && this.b.equals(juvVar.c()) && this.c.equals(juvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        zwx zwxVar = this.c;
        zye zyeVar = this.b;
        return "QueuedDownload{request=" + this.a.toString() + ", task=" + zyeVar.toString() + ", resultFuture=" + zwxVar.toString() + "}";
    }
}
