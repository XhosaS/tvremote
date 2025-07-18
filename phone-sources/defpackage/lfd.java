package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lfd implements lev {
    @Override // defpackage.lev
    public final Object a(InputStream inputStream, long j) throws IOException {
        try {
            return c(inputStream).readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.lev
    public final void b(Object obj, OutputStream outputStream) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
    }

    protected ObjectInputStream c(InputStream inputStream) {
        return new ObjectInputStream(inputStream);
    }
}
