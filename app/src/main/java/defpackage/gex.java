package defpackage;

import android.content.ComponentName;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gex implements geu {
    public final fed a;
    private final ahbt b;

    public gex(ahbt ahbtVar, feh fehVar) {
        ahbtVar.getClass();
        this.b = ahbtVar;
        ComponentName componentName = irm.a;
        String className = irm.o.getClassName();
        className.getClass();
        this.a = fehVar.a(className);
    }

    @Override // defpackage.geu
    public final void a(ggi ggiVar) {
        ggiVar.getClass();
        ahal.e(this.b, null, 0, new gew(this, ggiVar, null), 3);
    }

    @Override // defpackage.geu
    public final void b(ggg gggVar, rqs rqsVar, int i, int i2, String str, ahrs ahrsVar) {
        gggVar.getClass();
        if (i != 0 && i2 != 0) {
            throw new UnsupportedOperationException("Log function based on AppFlowCompleteRecordBuilder should not be used in Search process.");
        }
        throw null;
    }
}
