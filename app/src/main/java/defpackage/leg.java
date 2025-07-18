package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class leg implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ leo b;

    public leg(leo leoVar, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double dDoubleValue;
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                leo leoVar = this.b;
                ktx ktxVar = leoVar.y.d;
                String strI = leoVar.y.e().i();
                kzf kzfVar = kzg.ae;
                if (TextUtils.isEmpty(strI)) {
                    dDoubleValue = ((Double) kzfVar.a(null)).doubleValue();
                } else {
                    String strA = ktxVar.b.a(strI, kzfVar.a);
                    if (TextUtils.isEmpty(strA)) {
                        dDoubleValue = ((Double) kzfVar.a(null)).doubleValue();
                    } else {
                        try {
                            dDoubleValue = ((Double) kzfVar.a(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
                        } catch (NumberFormatException unused) {
                            dDoubleValue = ((Double) kzfVar.a(null)).doubleValue();
                        }
                    }
                }
                atomicReference.set(Double.valueOf(dDoubleValue));
            } finally {
                this.a.notify();
            }
        }
    }
}
