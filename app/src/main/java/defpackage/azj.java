package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azj {
    final List a;

    public azj() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        DesugarCollections.unmodifiableList(arrayList);
        new ArrayList(4);
    }
}
