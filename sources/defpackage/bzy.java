package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzy extends byw implements Serializable {
    public static final bzy a;
    public static final bzy b;
    private final transient bzs c;

    static {
        int i = bzs.d;
        a = new bzy(cax.a);
        b = new bzy(bzs.q(cau.a));
    }

    public bzy(bzs bzsVar) {
        this.c = bzsVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.caw
    public final /* bridge */ /* synthetic */ Set a() {
        bzs bzsVar = this.c;
        if (bzsVar.isEmpty()) {
            return cbd.a;
        }
        cau cauVar = cau.a;
        return new cbe(bzsVar, cat.a);
    }

    Object writeReplace() {
        return new bzx(this.c);
    }
}
