package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abyb {
    protected volatile MessageLite a;
    public volatile abvo b;
    private volatile boolean c;

    public final int a() {
        if (this.b != null) {
            return ((abvm) this.b).a.length;
        }
        if (this.a != null) {
            return this.a.g();
        }
        return 0;
    }

    public final abvo b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = abvo.b;
            } else {
                this.b = this.a.d();
            }
            return this.b;
        }
    }

    protected final void c(MessageLite messageLite) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = messageLite;
                this.b = abvo.b;
            } catch (abxv unused) {
                this.c = true;
                this.a = messageLite;
                this.b = abvo.b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abyb)) {
            return false;
        }
        abyb abybVar = (abyb) obj;
        MessageLite messageLite = this.a;
        MessageLite messageLite2 = abybVar.a;
        if (messageLite == null && messageLite2 == null) {
            return b().equals(abybVar.b());
        }
        if (messageLite != null && messageLite2 != null) {
            return messageLite.equals(messageLite2);
        }
        if (messageLite != null) {
            abybVar.c(messageLite.x());
            return messageLite.equals(abybVar.a);
        }
        c(messageLite2.x());
        return this.a.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
