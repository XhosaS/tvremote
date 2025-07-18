package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afjr implements Comparator {
    final /* synthetic */ afjs a;

    public afjr(afjs afjsVar) {
        this.a = afjsVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        afjs afjsVar = this.a;
        int iA = afjsVar.a(obj) - afjsVar.a(obj2);
        return iA != 0 ? iA : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
