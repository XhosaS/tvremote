package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mec extends ObjectInputStream implements InputStreamRetargetInterface {
    private final Map a;

    public mec(InputStream inputStream) {
        super(inputStream);
        this.a = new HashMap();
    }

    public final void a(String str, Class cls) {
        Map map = this.a;
        Collection arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(ObjectStreamClass.lookup(cls));
    }

    @Override // java.io.ObjectInputStream
    protected final ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
        ObjectStreamClass classDescriptor = super.readClassDescriptor();
        List list = (List) this.a.get(classDescriptor.getName());
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ObjectStreamClass objectStreamClass = (ObjectStreamClass) list.get(i);
                if (objectStreamClass.getSerialVersionUID() == classDescriptor.getSerialVersionUID()) {
                    return objectStreamClass;
                }
            }
        }
        return classDescriptor;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
