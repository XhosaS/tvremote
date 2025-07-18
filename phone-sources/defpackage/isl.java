package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isl implements iof, iej, yow {
    public final ilk a;
    public final iea b;
    public final Map c = new LinkedHashMap();
    private final /* synthetic */ yow d;
    private final iea e;
    private final Context f;
    private final ino g;
    private final ihi h;
    private final iov i;

    public isl(iov iovVar, ilk ilkVar, iea ieaVar, iea ieaVar2, Context context, ino inoVar, ihi ihiVar, yow yowVar) {
        this.d = yowVar;
        this.i = iovVar;
        this.a = ilkVar;
        this.e = ieaVar;
        this.b = ieaVar2;
        this.f = context;
        this.g = inoVar;
        this.h = ihiVar;
        ieaVar.ea(this);
        dM();
    }

    @Override // defpackage.iof
    public final synchronized ids a(wll wllVar) {
        Object iskVar;
        wllVar.getClass();
        Map map = this.c;
        iskVar = map.get(wllVar);
        if (iskVar == null) {
            iskVar = new isk(this, wllVar);
            map.put(wllVar, iskVar);
        }
        return (ids) iskVar;
    }

    @Override // defpackage.iof
    public final wnp b(wll wllVar, String str) {
        Object next;
        vun vunVar = e(wllVar).b;
        vunVar.getClass();
        Iterator<E> it = vunVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            wnp wnpVar = (wnp) next;
            if (str == null || str.length() == 0) {
                break;
            }
            wno wnoVar = wnpVar.b;
            if (wnoVar == null) {
                wnoVar = wno.a;
            }
            if (yks.e(wnoVar.b, str)) {
                break;
            }
        }
        wnp wnpVar2 = (wnp) next;
        return wnpVar2 == null ? (wnp) yfm.U(vunVar) : wnpVar2;
    }

    @Override // defpackage.yow
    public final yil c() {
        return ((ywq) this.d).a;
    }

    @Override // defpackage.iej
    public final void dM() {
        if (((ldy) this.e).a().m()) {
            ykr.q(this, null, 0, new gow(this, (yih) null, 16), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e  */
    @Override // defpackage.iof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wnq e(defpackage.wll r19) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isl.e(wll):wnq");
    }

    @Override // defpackage.iof
    public final void f(wll... wllVarArr) {
        wllVarArr.getClass();
        iov iovVar = this.i;
        iovVar.e(yfm.aX(wllVarArr));
        ykr.q(iovVar, null, 0, new gow(iovVar, (yih) null, 11), 3);
    }

    public final String g() {
        return ((ksn) ((ldy) this.e).a().g()).a;
    }

    public final synchronized void h(wll wllVar) {
        this.c.remove(wllVar);
    }
}
