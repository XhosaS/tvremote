package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yzt extends yze implements zcu {
    private static final long serialVersionUID = 0;
    public final transient yzq emptySet;

    public yzt(yyr yyrVar, int i) {
        super(yyrVar, i);
        this.emptySet = a(null);
    }

    private static yzq a(Comparator comparator) {
        return comparator == null ? zcp.b : yzw.A(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.b(i, "Invalid key count "));
        }
        yyn yynVar = new yyn(4);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            object.getClass();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(a.b(i4, "Invalid value count "));
            }
            yzo yzoVar = comparator == null ? new yzo() : new yzu(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                yzoVar.c(object2);
            }
            yzq yzqVarF = yzoVar.f();
            if (yzqVarF.size() != i4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(object.toString()));
            }
            yynVar.c(object, yzqVarF);
            i2 += i4;
        }
        try {
            yzd.a.b(this, yynVar.a(true));
            yzd.b.a(this, i2);
            yzs.a.b(this, a(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        yzq yzqVar = this.emptySet;
        objectOutputStream.writeObject(yzqVar instanceof yzw ? ((yzw) yzqVar).b : null);
        zct.c(this, objectOutputStream);
    }

    @Override // defpackage.yze, defpackage.zbl
    public final /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }
}
