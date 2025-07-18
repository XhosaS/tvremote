package defpackage;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esn {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public esn(Uri uri, dze dzeVar, String str, String str2, String str3, String str4) {
        this.e = uri;
        this.b = dzeVar;
        this.a = str;
        this.d = str2;
        this.f = str3;
        this.c = str4;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bdy, cju, java.lang.Object] */
    public final bdy a(final cjr cjrVar) {
        yjv yjvVar = new yjv() { // from class: ciz
            /* JADX WARN: Code restructure failed: missing block: B:212:0x036f, code lost:
            
                r0 = (java.util.List) r3.a;
                r4 = r3.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x0375, code lost:
            
                if (r0 != null) goto L215;
             */
            /* JADX WARN: Code restructure failed: missing block: B:214:0x0377, code lost:
            
                r0 = new defpackage.cjt(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:215:0x037e, code lost:
            
                r10 = (defpackage.cjd) r2;
                r2 = new defpackage.ciq(r0, r4, r5, r10.b, r7, (defpackage.cxe) r11);
                r6 = null;
                defpackage.ykr.q(r10.a, null, 4, new defpackage.btr(r2, (defpackage.yih) null, 4), 1);
                r0 = new defpackage.cjs(r2);
             */
            /* JADX WARN: Removed duplicated region for block: B:217:0x03a0  */
            /* JADX WARN: Removed duplicated region for block: B:232:0x03de  */
            /* JADX WARN: Removed duplicated region for block: B:233:0x03e0  */
            /* JADX WARN: Removed duplicated region for block: B:235:0x03e8 A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjv] */
            /* JADX WARN: Type inference failed for: r0v43, types: [cjm, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v52, types: [cjm, java.lang.Object] */
            @Override // defpackage.yjv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 1001
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ciz.a(java.lang.Object):java.lang.Object");
            }
        };
        Object obj = this.b;
        dhk dhkVar = (dhk) obj;
        synchronized (dhkVar.b) {
            Object obj2 = ((dhk) obj).a;
            cju cjuVar = (cju) ((jp) obj2).get(cjrVar);
            if (cjuVar != null) {
                if (cjuVar.b()) {
                    return cjuVar;
                }
            }
            try {
                ?? A = yjvVar.a(new bct(obj, cjrVar, 5));
                synchronized (dhkVar.b) {
                    Object obj3 = ((dhk) obj).a;
                    if (((jp) obj3).get(cjrVar) == null && A.b()) {
                        ((jp) obj3).put(cjrVar, A);
                    }
                }
                return A;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final bdy b(ciy ciyVar, cji cjiVar, int i) {
        int i2 = ((cin) this.a).a;
        if (i2 != 0 && i2 != Integer.MAX_VALUE) {
            cjiVar = new cji(ykn.l(cjiVar.h + i2, 1, 1000));
        }
        return a(new cjr(ciyVar, cjiVar, i));
    }

    public esn(cxe cxeVar, cin cinVar, dhk dhkVar, cjd cjdVar, cxe cxeVar2) {
        this.f = cxeVar;
        this.a = cinVar;
        this.b = dhkVar;
        this.e = cjdVar;
        this.c = cxeVar2;
        this.d = new bap(this, 13);
    }

    public esn(ess essVar, MediaFormat mediaFormat, dze dzeVar, Surface surface, MediaCrypto mediaCrypto, ghc ghcVar) {
        this.a = essVar;
        this.b = mediaFormat;
        this.c = dzeVar;
        this.d = surface;
        this.e = mediaCrypto;
        this.f = ghcVar;
    }
}
