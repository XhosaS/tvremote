package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aef {
    public static /* synthetic */ List a(Object obj) {
        Object[] objArr = {obj};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        obj2.getClass();
        arrayList.add(obj2);
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
