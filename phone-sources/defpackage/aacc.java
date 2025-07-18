package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aacc extends aadq {
    private static final long serialVersionUID = -4481126543819298617L;
    public aacd a;
    public aabm b;

    public aacc(aacd aacdVar, aabm aabmVar) {
        this.a = aacdVar;
        this.b = aabmVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (aacd) objectInputStream.readObject();
        this.b = ((aabo) objectInputStream.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.r());
    }

    @Override // defpackage.aadq
    protected final long a() {
        return this.a.a;
    }

    @Override // defpackage.aadq
    protected final aabk b() {
        return this.a.b;
    }

    @Override // defpackage.aadq
    public final aabm c() {
        return this.b;
    }
}
