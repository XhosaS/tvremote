package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgq implements tgm {
    public final wxc a;
    public final tgg b;
    private final ahbt c;
    private final Context d;
    private ahcb e;
    private final ConcurrentHashMap f = new ConcurrentHashMap();
    private final kak g;
    private final thh h;

    public tgq(ahbt ahbtVar, kak kakVar, Context context, thh thhVar, wxc wxcVar, tgg tggVar) {
        this.c = ahbtVar;
        this.g = kakVar;
        this.d = context;
        this.h = thhVar;
        this.a = wxcVar;
        this.b = tggVar;
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    @Override // defpackage.tgm
    public final tgg a() {
        return this.b;
    }

    @Override // defpackage.tgm
    public final Object b(tfu tfuVar, agsw agswVar) {
        ConcurrentHashMap concurrentHashMap = this.f;
        Object objD = concurrentHashMap.get(tfuVar);
        if (objD == null) {
            objD = ahal.d(this.c, null, 0, new tgp(this, this.h.a(tfuVar), aece.DEFAULT, null), 3);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(tfuVar, objD);
            if (objPutIfAbsent != null) {
                objD = objPutIfAbsent;
            }
        }
        return ((ahcb) objD).a(agswVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r12, defpackage.aece r13, defpackage.agsw r14) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgq.c(java.lang.String, aece, agsw):java.lang.Object");
    }
}
