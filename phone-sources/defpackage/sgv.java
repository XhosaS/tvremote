package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sgv extends dxx {
    private List i;

    public sgv(Context context) {
        super(context.getApplicationContext());
    }

    @Override // defpackage.dxx
    public final /* bridge */ /* synthetic */ Object a() {
        TreeSet treeSet = new TreeSet();
        String[] strArrSplit = sij.h(this.c.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            sij.z(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n%s", str);
            arrayList.add(new sgu(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    @Override // defpackage.dxy
    public final void h() {
        List list = this.i;
        if (list != null) {
            g(list);
        } else {
            c();
        }
    }

    @Override // defpackage.dxy
    public final void i() {
        f();
    }

    @Override // defpackage.dxy
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void g(List list) {
        this.i = list;
        super.g(list);
    }
}
