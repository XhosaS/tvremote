package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blp {
    final blx a;
    final bll b;

    public blp(blx blxVar, bll bllVar) {
        this.a = blxVar;
        this.b = bllVar;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueMessage(");
        if (b()) {
            sb.append("poloMessage = ");
            sb.append(this.a);
        }
        if (a()) {
            sb.append("poloException = ");
            sb.append(this.b);
        }
        sb.append(")");
        return sb.toString();
    }

    public blp(bll bllVar) {
        this(null, bllVar);
    }
}
