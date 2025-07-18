package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
class bwv extends ObjectInputStream implements InputStreamRetargetInterface {
    public bwv(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.ObjectInputStream
    protected final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
        return cls != null ? cls : super.resolveClass(objectStreamClass);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
