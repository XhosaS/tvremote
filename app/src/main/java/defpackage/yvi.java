package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yvi extends yvo implements Serializable {
    private static final long serialVersionUID = 0;
    public transient zby a;
    public transient long b;

    public yvi(int i) {
        this.a = d(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.a = d(3);
        for (int i2 = 0; i2 < i; i2++) {
            h(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(j().size());
        for (zbo zboVar : j()) {
            objectOutputStream.writeObject(zboVar.b());
            objectOutputStream.writeInt(zboVar.a());
        }
    }

    @Override // defpackage.zbp
    public final int a(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.yvo
    public final int b() {
        return this.a.c;
    }

    @Override // defpackage.yvo, defpackage.zbp
    public final int c(Object obj, int i) {
        int iD = this.a.d(obj);
        if (iD == -1) {
            return 0;
        }
        int iC = this.a.c(iD);
        if (iC > i) {
            this.a.n(iD, iC - i);
        } else {
            this.a.g(iD);
            i = iC;
        }
        this.b -= i;
        return iC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        zby zbyVar = this.a;
        zbyVar.d++;
        Arrays.fill(zbyVar.a, 0, zbyVar.c, (Object) null);
        Arrays.fill(zbyVar.b, 0, zbyVar.c, 0);
        Arrays.fill(zbyVar.e, -1);
        Arrays.fill(zbyVar.f, -1L);
        zbyVar.c = 0;
        this.b = 0L;
    }

    public abstract zby d(int i);

    @Override // defpackage.yvo
    public final Iterator e() {
        return new yvf(this);
    }

    @Override // defpackage.yvo
    public final Iterator f() {
        return new yvg(this);
    }

    @Override // defpackage.yvo, defpackage.zbp
    public final boolean g(Object obj, int i) {
        ywl.b(i, "oldCount");
        int iD = this.a.d(obj);
        if (iD == -1) {
            return i == 0;
        }
        if (this.a.c(iD) != i) {
            return false;
        }
        this.a.g(iD);
        this.b -= i;
        return true;
    }

    @Override // defpackage.yvo, defpackage.zbp
    public final void h(Object obj, int i) {
        if (i == 0) {
            this.a.b(obj);
            return;
        }
        yqw.D(i > 0, "occurrences cannot be negative: %s", i);
        int iD = this.a.d(obj);
        long j = i;
        if (iD == -1) {
            this.a.p(obj, i);
            this.b += j;
        } else {
            long jC = this.a.c(iD) + j;
            yqw.E(jC <= 2147483647L, "too many occurrences: %s", jC);
            this.a.n(iD, (int) jC);
            this.b += j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zbt(this, j().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.zbp
    public final int size() {
        return ztm.d(this.b);
    }
}
