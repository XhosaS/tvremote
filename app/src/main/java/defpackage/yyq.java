package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyq implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public yyq(yyr yyrVar) {
        Object[] objArr = new Object[yyrVar.size()];
        Object[] objArr2 = new Object[yyrVar.size()];
        zdl it = yyrVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    final Object readResolve() {
        Object obj = this.a;
        if (obj instanceof yzq) {
            yzq yzqVar = (yzq) obj;
            yxy yxyVar = (yxy) this.b;
            yyn yynVar = new yyn(yzqVar.size());
            zdl it = yzqVar.iterator();
            zdl it2 = yxyVar.iterator();
            while (it.hasNext()) {
                yynVar.c(it.next(), it2.next());
            }
            return yynVar.a(true);
        }
        Object obj2 = this.b;
        Object[] objArr = (Object[]) obj;
        yyn yynVar2 = new yyn(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            yynVar2.c(objArr[i], ((Object[]) obj2)[i]);
        }
        return yynVar2.a(true);
    }
}
