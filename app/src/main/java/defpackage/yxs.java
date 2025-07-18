package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yxs extends yxt {
    private static final long serialVersionUID = 0;
    transient int e;

    public yxs() {
        super(new ywx(null));
        this.e = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.e = 2;
        int i = objectInputStream.readInt();
        k(new ywx(null));
        zct.b(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        zct.c(this, objectOutputStream);
    }

    @Override // defpackage.yvr, defpackage.yve
    public final /* synthetic */ Collection a() {
        return new ywz(this.e);
    }
}
