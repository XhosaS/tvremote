package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class aafm implements aafo {
    private volatile String[] a;

    @Override // defpackage.aafo
    public final void b(Set set) {
        if (this.a == null) {
            String[] strArrA = a();
            String str = null;
            int length = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (String str2 : strArrA) {
                if (str2.length() < length) {
                    length = str2.length();
                    str = str2;
                }
            }
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                aafo aafoVar = (aafo) it.next();
                if (aafoVar != null) {
                    for (String str3 : aafoVar.a()) {
                        if (str3.length() > length || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                            hashSet.add(str3);
                        }
                    }
                }
            }
            this.a = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }
    }
}
