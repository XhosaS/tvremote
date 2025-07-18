package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zcc extends zca implements Serializable {
    static final zca a = new zcc();
    private static final long serialVersionUID = 0;

    private zcc() {
    }

    @Override // defpackage.zca, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zcd zcdVar = (zcd) obj;
        zcd zcdVar2 = (zcd) obj2;
        return yxd.b.b(zcdVar.b, zcdVar2.b).b(zcdVar.c, zcdVar2.c).a();
    }
}
