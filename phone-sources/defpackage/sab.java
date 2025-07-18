package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sab implements rzz {
    public final ImmutableList a;
    public final int b;
    public final Object c;

    public sab(ImmutableList immutableList, Object obj) {
        this.a = immutableList;
        this.b = immutableList.size() + 1;
        this.c = obj;
    }

    @Override // defpackage.rzz
    public final Object a(rzy rzyVar, sbh sbhVar) {
        return sac.a(new saa(this, rzyVar, 1));
    }

    @Override // defpackage.rzz
    public final Object b(rzy rzyVar, sbh sbhVar) {
        return sbhVar.a(new saa(rzyVar, this, 2));
    }

    @Override // defpackage.rzz
    public final Object c(rzt rztVar, sbh sbhVar) {
        return sah.d(new saa(this, rztVar, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rzz
    public final void d() {
        UnmodifiableIterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object obj = ((aafi) it.next()).b;
            sbd sbdVar = (sbd) obj;
            sbdVar.d.removeMessages(0);
            Set set = sbdVar.b;
            synchronized (set) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((sbd) obj).b((sbe) it2.next());
                }
                set.clear();
            }
            sbdVar.e.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rzz
    public final void e(rzy rzyVar) {
        UnmodifiableIterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            aafi aafiVar = (aafi) it.next();
            Object obj = this.c;
            Object obj2 = aafiVar.b;
            Parcelable parcelable = (Parcelable) ((sew) aafiVar.a).a(rzyVar);
            Object obj3 = aafiVar.c;
            sbe sbeVar = (sbe) ((sbf) parcelable);
            sbeVar.a((sbb) rrx.aF((ulp) obj));
            ((sbd) obj2).a(sbeVar);
        }
    }
}
