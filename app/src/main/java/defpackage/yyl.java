package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yyl extends yze implements zas {
    private static final long serialVersionUID = 0;

    public yyl(yyr yyrVar, int i) {
        super(yyrVar, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
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
            int i5 = yyk.e;
            yyf yyfVar = new yyf(4);
            for (int i6 = 0; i6 < i4; i6++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                yyfVar.g(object2);
            }
            yynVar.c(object, yyfVar.f());
            i2 += i4;
        }
        try {
            yzd.a.b(this, yynVar.a(true));
            yzd.b.a(this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        zct.c(this, objectOutputStream);
    }

    @Override // defpackage.yze, defpackage.zbl
    public final /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }

    @Override // defpackage.zas
    public final /* bridge */ /* synthetic */ List e(Object obj) {
        throw null;
    }
}
