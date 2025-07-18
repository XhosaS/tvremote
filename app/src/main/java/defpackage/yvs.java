package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yvs extends yvt {
    private static final long serialVersionUID = 0;
    transient int e;

    public yvs() {
        super(new ywx(null));
        this.e = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.e = 3;
        int i = objectInputStream.readInt();
        k(new ywx());
        zct.b(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        zct.c(this, objectOutputStream);
    }

    @Override // defpackage.yum, defpackage.yve
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.e);
    }
}
