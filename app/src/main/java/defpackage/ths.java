package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ths implements thq {
    public final Context a;
    public final tfg b;
    private final Executor c;
    private final mcw d;

    public ths(Executor executor, mcw mcwVar, Context context, tfg tfgVar) {
        this.c = executor;
        this.d = mcwVar;
        this.a = context;
        this.b = tfgVar;
    }

    @Override // defpackage.thq
    public final void a(zmw zmwVar) {
        thp.a(zmwVar, this.d);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, roj] */
    @Override // defpackage.thq
    public final zyd b(zmx zmxVar, final tgt tgtVar) {
        zyd zydVarG;
        zmw zmwVar = new zmw();
        zmwVar.B(zmxVar);
        thp.a(zmwVar, this.d);
        final zmx zmxVar2 = (zmx) zmwVar.v();
        Optional optional = tgtVar.b;
        if (optional.isPresent()) {
            zyd zydVarA = optional.get().a();
            yqi yqiVar = new yqi() { // from class: tgs
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return (String) ((Optional) obj).orElse(null);
                }
            };
            zydVarG = zuz.g(zydVarA, wyo.a(yqiVar), zwk.a);
        } else {
            zydVarG = zxy.a;
        }
        yqi yqiVar2 = new yqi() { // from class: thr
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
            @Override // defpackage.yqi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 558
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.thr.apply(java.lang.Object):java.lang.Object");
            }
        };
        return zuz.g(zydVarG, wyo.a(yqiVar2), this.c);
    }
}
