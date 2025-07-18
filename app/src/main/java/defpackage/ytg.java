package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytg extends ytk implements ysm {
    private static final long serialVersionUID = 1;
    transient ysm a;

    public ytg(yug yugVar) {
        super(yugVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = a().a(this.k);
    }

    private Object readResolve() {
        return this.a;
    }

    @Override // defpackage.yqi
    public final Object apply(Object obj) {
        return ((yti) this.a).a(obj);
    }
}
