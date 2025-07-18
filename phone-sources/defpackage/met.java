package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class met implements idf {
    private final idf a;
    private final idf b;

    public met(idf idfVar, idf idfVar2) {
        this.a = idfVar;
        this.b = idfVar2;
    }

    @Override // defpackage.idf
    public final Object b(Object obj) {
        mft mftVarD = mjo.d(0);
        try {
            Object objB = this.b.b(obj);
            if (((String) objB).length() > 85) {
                objB = ((String) objB).substring(0, 85);
            }
            Trace.beginSection((String) objB);
            return this.a.b(obj);
        } finally {
            mftVarD.a();
            Trace.endSection();
        }
    }
}
