package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jxt implements idf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jxt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v13, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lzz] */
    @Override // defpackage.idf
    public final Object b(Object obj) {
        switch (this.b) {
            case 0:
                obj.getClass();
                return this.a.a(obj);
            case 1:
                ipc ipcVar = iqo.a;
                obj.getClass();
                return this.a.a(obj);
            case 2:
                return this.a.b((ieg) obj);
            case 3:
                return this.a.a((lzy) obj);
            case 4:
                ieg iegVar = (ieg) obj;
                if (iegVar.k()) {
                    return lba.a;
                }
                lcs lcsVar = (lcs) ((lys) this.a).i.get(((ksn) iegVar.g()).a);
                if (lcsVar == null) {
                    return lba.a;
                }
                lba lbaVar = lcsVar.g;
                return lbaVar == null ? lba.a : lbaVar;
            case 5:
                for (idf idfVar : (idf[]) this.a) {
                    ieg iegVar2 = (ieg) idfVar.b(obj);
                    if (iegVar2.m()) {
                        return iegVar2;
                    }
                }
                return ieg.a;
            case 6:
                ieg iegVar3 = (ieg) obj;
                return iegVar3.m() ? iegVar3.g() : this.a;
            case 7:
                return ((ieg) obj).e(this.a);
            case 8:
                return ((ieg) obj).c(this.a);
            case 9:
                int i = ((kta) this.a).a;
                List list = (List) obj;
                Uri uriS = ktc.s(list, 7, i, i, 0.0f);
                return !Uri.EMPTY.equals(uriS) ? uriS : ktc.s(list, 1, i, i, 0.0f);
            case 10:
                return ((kta) this.a).e((List) obj);
            case 11:
                return ((kta) this.a).d((List) obj);
            case 12:
                return ((kta) this.a).a((List) obj);
            case 13:
                return ((kta) this.a).b((List) obj);
            case 14:
                return ((kta) this.a).c((List) obj);
            case 15:
                return ((kta) this.a).b((List) obj);
            case 16:
                return ((kta) this.a).c((List) obj);
            case 17:
                return ((kta) this.a).e((List) obj);
            case 18:
                return ((kta) this.a).d((List) obj);
            case 19:
                return ((kta) this.a).f((List) obj);
            default:
                return ((kta) this.a).d((List) obj);
        }
    }
}
