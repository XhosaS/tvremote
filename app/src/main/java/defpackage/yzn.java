package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yzn extends yvp implements Serializable {
    public static final yzn a;
    public static final yzn b;
    private final transient yyk c;

    static {
        int i = yyk.e;
        a = new yzn(zcg.b);
        b = new yzn(yyk.o(zcd.a));
    }

    public yzn(yyk yykVar) {
        this.c = yykVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.zcf
    public final /* bridge */ /* synthetic */ Set a() {
        yyk yykVar = this.c;
        if (yykVar.isEmpty()) {
            return zcp.b;
        }
        zcd zcdVar = zcd.a;
        return new zcq(yykVar, zcc.a);
    }

    Object writeReplace() {
        return new yzm(this.c);
    }
}
