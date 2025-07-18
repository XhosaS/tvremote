package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcz extends sbx {
    private final kdh a;

    public kcz(kdh kdhVar) {
        this.a = kdhVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new kdb();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [idr, java.lang.Object] */
    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        kdj kdjVar = (kdj) obj;
        ?? r0 = kdjVar.b;
        kdb kdbVar = (kdb) obj2;
        int length = r0.length();
        boolean z = kdbVar.e;
        boolean z2 = length > 0;
        if (z != z2) {
            kdbVar.e = z2;
            Iterator it = kdbVar.f.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        sco scoVar = new sco(r0);
        if (!yks.e(kdbVar.a, scoVar)) {
            kdbVar.a = scoVar;
            kdbVar.G(0);
        }
        sco scoVar2 = new sco(kdjVar.a);
        if (!yks.e(kdbVar.b, scoVar2)) {
            kdbVar.b = scoVar2;
            kdbVar.G(1);
        }
        Object objA = kdjVar.c.a();
        objA.getClass();
        Boolean bool = (Boolean) objA;
        boolean zBooleanValue = bool.booleanValue();
        if (!yks.e(Boolean.valueOf(kdbVar.d), bool)) {
            kdbVar.d = zBooleanValue;
            kdbVar.G(3);
        }
        gea geaVar = new gea(kdjVar, 8, null);
        if (yks.e(kdbVar.c, geaVar)) {
            return;
        }
        kdbVar.c = geaVar;
        kdbVar.G(2);
    }
}
