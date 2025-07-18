package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmj extends ObjectInputStream implements InputStreamRetargetInterface {
    private static final Set a;
    private final Class b;
    private boolean c;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("java.util.TreeMap");
        hashSet.add("java.lang.Integer");
        hashSet.add("java.lang.Number");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
        hashSet.add("java.util.ArrayList");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
        hashSet.add("[B");
        hashSet.add("java.util.LinkedList");
        hashSet.add("java.util.Stack");
        hashSet.add("java.util.Vector");
        hashSet.add("[Ljava.lang.Object;");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
    }

    public dmj(Class cls, InputStream inputStream) {
        super(inputStream);
        this.c = false;
        this.b = cls;
    }

    @Override // java.io.ObjectInputStream
    protected final Class resolveClass(ObjectStreamClass objectStreamClass) throws InvalidClassException {
        if (this.c) {
            if (!a.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
        } else {
            if (!objectStreamClass.getName().equals(this.b.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            this.c = true;
        }
        return super.resolveClass(objectStreamClass);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
