package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmv implements aejg {
    public static jzu b(jyw jywVar, zyh zyhVar) {
        jzu jzuVar = new jzu(jywVar, klk.a);
        int millis = (int) TimeUnit.MINUTES.toMillis(5L);
        jzuVar.d.writeLock().lock();
        try {
            jzuVar.g = zyhVar;
            if (jzuVar.g != null) {
                jzuVar.f = millis;
                jzuVar.c();
            } else {
                jzuVar.f = 0;
            }
            return jzuVar;
        } finally {
            jzuVar.d.writeLock().unlock();
        }
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
