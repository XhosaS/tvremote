package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gei {
    public final void a(qpi qpiVar) {
        Trace.beginAsyncSection(qpiVar.a, 0);
    }

    public final void b(qpi qpiVar) {
        Trace.endAsyncSection(qpiVar.a, 0);
    }

    public final boolean c(gmc gmcVar) {
        boolean z = gmr.a;
        return gmr.a && gej.b.contains(gmcVar);
    }

    public final ahqu d(int i, String str, gph gphVar, gzu gzuVar, int i2) {
        ahqu ahquVar = ahqu.a;
        ahqt ahqtVar = new ahqt();
        abxc abxcVar = ahrs.c;
        abxcVar.getClass();
        ahrq ahrqVar = new ahrq();
        if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahrqVar.y();
        }
        ahrs ahrsVar = (ahrs) ahrqVar.b;
        ahrsVar.e |= 1;
        ahrsVar.h = i;
        ahta.c(str, ahrqVar);
        ahta.e(ahrqVar);
        ahta.d(gphVar.d, ahrqVar);
        if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahrqVar.y();
        }
        ahrs ahrsVar2 = (ahrs) ahrqVar.b;
        ahrsVar2.l = i2 - 1;
        ahrsVar2.e |= 8;
        String str2 = gzuVar.a;
        if (str2.length() > 0) {
            ahta.b(str2, ahrqVar);
        }
        ahqtVar.f(abxcVar, ahta.a(ahrqVar));
        return ahsg.a(ahqtVar);
    }
}
