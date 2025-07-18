package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvc<T> extends yvi<yve> implements ysx, yvw, yva, yuj {
    private final ynu a;
    private int b;

    public yvc(Object obj) {
        this.a = new ynu(obj, ynv.a);
    }

    private final boolean g(Object obj, Object obj2) {
        int i;
        yvk[] yvkVarArr;
        yxo yxoVar;
        synchronized (this) {
            ynu ynuVar = this.a;
            Object obj3 = ynuVar.a;
            if (obj != null && !yks.e(obj3, obj)) {
                return false;
            }
            if (yks.e(obj3, obj2)) {
                return true;
            }
            ynuVar.c(obj2);
            int i2 = this.b;
            if ((i2 & 1) != 0) {
                this.b = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.b = i3;
            yvk[] yvkVarArr2 = this.d;
            while (true) {
                yve[] yveVarArr = (yve[]) yvkVarArr2;
                if (yveVarArr != null) {
                    for (yve yveVar : yveVarArr) {
                        if (yveVar != null) {
                            while (true) {
                                AtomicReference atomicReference = yveVar.a;
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (yxoVar = yvd.b)) {
                                    yxo yxoVar2 = yvd.a;
                                    if (obj4 != yxoVar2) {
                                        if (a.t(atomicReference, obj4, yxoVar2)) {
                                            ((yof) obj4).resumeWith(ygi.a);
                                            break;
                                        }
                                    } else {
                                        if (a.t(atomicReference, obj4, yxoVar)) {
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
                    yvkVarArr = this.d;
                }
                yvkVarArr2 = yvkVarArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        if (defpackage.yks.e(r13, r14) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00e8: INVOKE (r12v0 ?? I:yvi), (r7 I:yvk) VIRTUAL call: yvi.m(yvk):void A[MD:(yvk):void (m)] (LINE:233), block:B:58:0x00e8 */
    /* JADX WARN: Path cross not found for [B:30:0x0072, B:45:0x00ac], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:34:0x007d, B:36:0x0083], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:36:0x0083, B:34:0x007d], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:36:0x0083, B:43:0x009b], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:45:0x00ac, B:30:0x0072], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0072, B:32:0x0078, B:34:0x007d, B:43:0x009b, B:45:0x00ac, B:47:0x00c8, B:48:0x00cd, B:50:0x00d3, B:52:0x00d8, B:36:0x0083, B:40:0x008a, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:56:0x00de, B:57:0x00e7), top: B:60:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0072, B:32:0x0078, B:34:0x007d, B:43:0x009b, B:45:0x00ac, B:47:0x00c8, B:48:0x00cd, B:50:0x00d3, B:52:0x00d8, B:36:0x0083, B:40:0x008a, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:56:0x00de, B:57:0x00e7), top: B:60:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0072, B:32:0x0078, B:34:0x007d, B:43:0x009b, B:45:0x00ac, B:47:0x00c8, B:48:0x00cd, B:50:0x00d3, B:52:0x00d8, B:36:0x0083, B:40:0x008a, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:56:0x00de, B:57:0x00e7), top: B:60:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00aa -> B:30:0x0072). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00dc -> B:30:0x0072). Please report as a decompilation issue!!! */
    @Override // defpackage.ysx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ysy r13, defpackage.yih r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvc.a(ysy, yih):java.lang.Object");
    }

    @Override // defpackage.yuj
    public final void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.yva
    public final Object d() {
        yxo yxoVar = yvz.a;
        Object obj = this.a.a;
        if (obj == yxoVar) {
            return null;
        }
        return obj;
    }

    public final void e(Object obj) {
        if (obj == null) {
            obj = yvz.a;
        }
        g(null, obj);
    }

    @Override // defpackage.yvw
    public final ysx eT(yil yilVar, int i, int i2) {
        return yvd.b(this, yilVar, i, i2);
    }

    @Override // defpackage.yum
    public final List eU() {
        return yfm.p(d());
    }

    @Override // defpackage.yuj
    public final boolean eV(Object obj) {
        e(obj);
        return true;
    }

    @Override // defpackage.yuj, defpackage.ysy
    public final Object emit(T t, yih<? super ygi> yihVar) {
        e(t);
        return ygi.a;
    }

    public final boolean f(Object obj, Object obj2) {
        if (obj == null) {
            obj = yvz.a;
        }
        if (obj2 == null) {
            obj2 = yvz.a;
        }
        return g(obj, obj2);
    }

    @Override // defpackage.yvi
    public final /* synthetic */ yvk h() {
        return new yve();
    }

    @Override // defpackage.yvi
    public final /* bridge */ /* synthetic */ yvk[] k() {
        return new yve[2];
    }
}
