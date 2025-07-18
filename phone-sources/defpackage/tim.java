package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tim {
    final tiu a;
    final tij b;
    final byte[] c;

    public tim(tiu tiuVar, byte[] bArr, tij tijVar) {
        this.a = tiuVar;
        this.b = tijVar;
        this.c = bArr;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final boolean c() {
        return this.c != null;
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
        if (c()) {
            sb.append("secret = ");
            sb.append(Arrays.toString(this.c));
        }
        sb.append(")");
        return sb.toString();
    }

    public tim(tij tijVar) {
        this(null, null, tijVar);
    }
}
