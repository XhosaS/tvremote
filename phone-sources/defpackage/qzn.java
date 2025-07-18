package defpackage;

import com.google.common.collect.Ordering;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzn extends Ordering {
    final /* synthetic */ Ordering a;

    public qzn(Ordering ordering) {
        this.a = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        rfc rfcVar = (rfc) obj;
        rfc rfcVar2 = (rfc) obj2;
        rfcVar.getClass();
        rfcVar2.getClass();
        return this.a.compare(rfcVar.i, rfcVar2.i);
    }
}
