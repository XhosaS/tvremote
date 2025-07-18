package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cat extends cas implements Serializable {
    public static final cas a = new cat();
    private static final long serialVersionUID = 0;

    private cat() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cau cauVar = (cau) obj;
        cau cauVar2 = (cau) obj2;
        return bze.b.b(cauVar.b, cauVar2.b).b(cauVar.c, cauVar2.c).a();
    }
}
