package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzv implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public bzv(bzw bzwVar) {
        Object[] objArr = new Object[bzwVar.size()];
        Object[] objArr2 = new Object[bzwVar.size()];
        cbj cbjVarListIterator = bzwVar.entrySet().listIterator();
        int i = 0;
        while (cbjVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) cbjVarListIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    final Object readResolve() {
        Object obj = this.a;
        if (obj instanceof cab) {
            cab cabVar = (cab) obj;
            bzl bzlVar = (bzl) this.b;
            bzu bzuVar = new bzu(cabVar.size());
            cbj cbjVarListIterator = cabVar.listIterator();
            cbj cbjVarListIterator2 = bzlVar.listIterator();
            while (cbjVarListIterator.hasNext()) {
                bzuVar.c(cbjVarListIterator.next(), cbjVarListIterator2.next());
            }
            return bzuVar.b();
        }
        Object obj2 = this.b;
        Object[] objArr = (Object[]) obj;
        bzu bzuVar2 = new bzu(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            bzuVar2.c(objArr[i], ((Object[]) obj2)[i]);
        }
        return bzuVar2.b();
    }
}
