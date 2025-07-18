package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jbz implements idy {
    final /* synthetic */ jca a;
    private final maj b;

    public jbz(jca jcaVar, maj majVar) {
        this.a = jcaVar;
        this.b = majVar;
    }

    @Override // defpackage.idy
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ieg iegVar = (ieg) obj;
        iegVar.getClass();
        if (!iegVar.m()) {
            jca jcaVar = this.a;
            if (!yks.e(jcaVar.c, this.b)) {
                jcaVar.a();
                return;
            }
            jcaVar.c = null;
            int i = jcaVar.d;
            if (i == 2) {
                jcaVar.d(jcaVar.b != null ? 3 : 5);
                return;
            } else if (i == 3) {
                jcaVar.d(4);
                return;
            } else {
                if (i != 4) {
                    return;
                }
                jcaVar.d(5);
                return;
            }
        }
        rin rinVar = (rin) iegVar.g();
        maj majVar = this.b;
        jca jcaVar2 = this.a;
        Object obj2 = majVar.d;
        if (obj2 == jcaVar2.a) {
            jcaVar2.f = rinVar;
            return;
        }
        maj majVar2 = jcaVar2.c;
        if (majVar2 == null) {
            rin.n(rinVar);
            return;
        }
        if (jcaVar2.f != null && !yks.e(majVar, majVar2)) {
            rin.n(rinVar);
            jcaVar2.a();
            return;
        }
        obj2.getClass();
        int i2 = majVar.a;
        lck lckVar = (lck) obj2;
        jcaVar2.f(lckVar, i2);
        if (!rin.o(jcaVar2.e, rinVar)) {
            rin rinVar2 = jcaVar2.e;
            jcaVar2.e = rinVar;
            obj2.getClass();
            Bitmap bitmapA = rinVar.a();
            bitmapA.getClass();
            jcaVar2.e(lckVar, i2, bitmapA);
            rin.n(rinVar2);
        }
        if (!yks.e(jcaVar2.c, majVar)) {
            jcaVar2.a();
        } else {
            jcaVar2.c = null;
            jcaVar2.b();
        }
    }
}
