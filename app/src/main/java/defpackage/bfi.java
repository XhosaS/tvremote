package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.social.licenses.License;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfi extends bfo implements Runnable {
    public boolean a;
    final /* synthetic */ bfj b;

    public bfi(bfj bfjVar) {
        this.b = bfjVar;
    }

    @Override // defpackage.bfo
    protected final Object a() {
        try {
            bfj bfjVar = this.b;
            TreeSet treeSet = new TreeSet();
            String[] strArrSplit = tqd.a(bfjVar.d.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str : strArrSplit) {
                int iIndexOf = str.indexOf(32);
                String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
                yqw.R(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n%s", str);
                arrayList.add(new License(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
            }
            Collections.sort(arrayList);
            treeSet.addAll(arrayList);
            return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
        } catch (adu e) {
            if (this.d.get()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.bfo
    protected final void b(Object obj) {
        bfj bfjVar = this.b;
        if (bfjVar.a != this) {
            bfjVar.b(this);
        } else {
            if (bfjVar.f) {
                return;
            }
            SystemClock.uptimeMillis();
            bfjVar.a = null;
            bfjVar.e(obj);
        }
    }

    @Override // defpackage.bfo
    protected final void c() {
        this.b.b(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.a();
    }
}
