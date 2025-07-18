package defpackage;

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ym extends yq implements Runnable {
    public boolean a;
    final /* synthetic */ yn b;

    public ym(yn ynVar) {
        this.b = ynVar;
    }

    @Override // defpackage.yq
    public final Object a() {
        try {
            yn ynVar = this.b;
            TreeSet treeSet = new TreeSet();
            String[] strArrSplit = tk.i(ynVar.e.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str : strArrSplit) {
                int iIndexOf = str.indexOf(32);
                String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
                bdq.m(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n%s", str);
                arrayList.add(new bed(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
            }
            Collections.sort(arrayList);
            treeSet.addAll(arrayList);
            return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
        } catch (ok e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.yq
    public final void b(Object obj) {
        yn ynVar = this.b;
        if (ynVar.a != this) {
            ynVar.c(this);
        } else {
            if (ynVar.g) {
                return;
            }
            SystemClock.uptimeMillis();
            ynVar.a = null;
            ynVar.b((List) obj);
        }
    }

    @Override // defpackage.yq
    public final void c() {
        this.b.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.a();
    }
}
