package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahix extends ahje implements ahin, ahgr, ahjz {
    private final agzy a;
    private int b;

    public ahix(Object obj) {
        this.a = new agzy(obj, agzz.a);
    }

    private final boolean e(Object obj, Object obj2) {
        int i;
        ahjg[] ahjgVarArr;
        ahmg ahmgVar;
        synchronized (this) {
            agzy agzyVar = this.a;
            Object obj3 = agzyVar.a;
            if (obj != null && !agvy.c(obj3, obj)) {
                return false;
            }
            if (agvy.c(obj3, obj2)) {
                return true;
            }
            agzyVar.c(obj2);
            int i2 = this.b;
            if ((i2 & 1) != 0) {
                this.b = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.b = i3;
            ahjg[] ahjgVarArr2 = this.d;
            while (true) {
                ahja[] ahjaVarArr = (ahja[]) ahjgVarArr2;
                if (ahjaVarArr != null) {
                    for (ahja ahjaVar : ahjaVarArr) {
                        if (ahjaVar != null) {
                            while (true) {
                                AtomicReference atomicReference = ahjaVar.a;
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (ahmgVar = ahiy.b)) {
                                    ahmg ahmgVar2 = ahiy.a;
                                    if (obj4 != ahmgVar2) {
                                        if (ahiz.a(atomicReference, obj4, ahmgVar2)) {
                                            ((ahar) obj4).e(agpu.a);
                                            break;
                                        }
                                    } else {
                                        if (ahiz.a(atomicReference, obj4, ahmgVar)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.b;
                    if (i == i3) {
                        this.b = i3 + 1;
                        return true;
                    }
                    ahjgVarArr = this.d;
                }
                ahjgVarArr2 = ahjgVarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.ahim, defpackage.ahgs
    public final Object a(Object obj, agsw agswVar) {
        c(obj);
        return agpu.a;
    }

    @Override // defpackage.ahin
    public final Object b() {
        ahmg ahmgVar = ahkc.a;
        Object obj = this.a.a;
        if (obj == ahmgVar) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.ahin
    public final void c(Object obj) {
        if (obj == null) {
            obj = ahkc.a;
        }
        e(null, obj);
    }

    @Override // defpackage.ahje
    public final /* synthetic */ ahjg d() {
        return new ahja();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (defpackage.agvy.c(r13, r14) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00e4: INVOKE (r12v0 ?? I:ahje), (r7 I:ahjg) VIRTUAL call: ahje.j(ahjg):void A[MD:(ahjg):void (m)] (LINE:229), block:B:56:0x00e4 */
    /* JADX WARN: Path cross not found for [B:30:0x0073, B:45:0x00ad], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:34:0x007e, B:36:0x0084], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:36:0x0084, B:34:0x007e], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:36:0x0084, B:43:0x009c], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:45:0x00ad, B:30:0x0073], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0073, B:32:0x0079, B:34:0x007e, B:43:0x009c, B:45:0x00ad, B:47:0x00c9, B:48:0x00ce, B:50:0x00d4, B:36:0x0084, B:40:0x008b, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:54:0x00da, B:55:0x00e3), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0073, B:32:0x0079, B:34:0x007e, B:43:0x009c, B:45:0x00ad, B:47:0x00c9, B:48:0x00ce, B:50:0x00d4, B:36:0x0084, B:40:0x008b, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:54:0x00da, B:55:0x00e3), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0073, B:32:0x0079, B:34:0x007e, B:43:0x009c, B:45:0x00ad, B:47:0x00c9, B:48:0x00ce, B:50:0x00d4, B:36:0x0084, B:40:0x008b, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:54:0x00da, B:55:0x00e3), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ab -> B:30:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d8 -> B:30:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.ahip, defpackage.ahgr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fD(defpackage.ahgs r13, defpackage.agsw r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahix.fD(ahgs, agsw):java.lang.Object");
    }

    @Override // defpackage.ahin
    public final boolean fE(Object obj, Object obj2) {
        if (obj == null) {
            obj = ahkc.a;
        }
        if (obj2 == null) {
            obj2 = ahkc.a;
        }
        return e(obj, obj2);
    }

    @Override // defpackage.ahje
    public final /* synthetic */ ahjg[] g() {
        return new ahja[2];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000c A[RETURN] */
    @Override // defpackage.ahjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ahgr h(defpackage.agte r2, int r3, int r4) {
        /*
            r1 = this;
            boolean r0 = defpackage.ahbx.a
            if (r3 < 0) goto L5
            goto L9
        L5:
            r0 = -2
            if (r3 != r0) goto Ld
            r3 = r0
        L9:
            r0 = 2
            if (r4 != r0) goto Ld
            return r1
        Ld:
            ahgr r2 = defpackage.ahit.c(r1, r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahix.h(agte, int, int):ahgr");
    }
}
