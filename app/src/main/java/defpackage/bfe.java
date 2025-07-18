package defpackage;

import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class bfe implements bcy {
    public final bfk a;
    public final bfb b;
    public boolean c = false;

    public bfe(bfk bfkVar, bfb bfbVar) {
        this.a = bfkVar;
        this.b = bfbVar;
    }

    @Override // defpackage.bcy
    public final void a(Object obj) {
        if (bfh.b(2)) {
            StringBuilder sb = new StringBuilder("  onLoadFinished in ");
            bfk bfkVar = this.a;
            sb.append(bfkVar);
            sb.append(": ");
            sb.append(bfkVar.d(obj));
            Log.v("LoaderManager", sb.toString());
        }
        this.c = true;
        tqc tqcVar = (tqc) this.b;
        tqcVar.a.clear();
        tqcVar.a.addAll((List) obj);
        tqcVar.a.notifyDataSetChanged();
    }

    public final String toString() {
        return this.b.toString();
    }
}
