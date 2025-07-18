package com.google.android.libraries.notifications.platform.entrypoints.update;

import android.content.Context;
import defpackage.qep;
import defpackage.qeq;
import defpackage.qhj;
import defpackage.yfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UpdateReceiver extends qep {
    @Override // defpackage.qep
    public final qeq a(Context context) {
        yfo yfoVar = (yfo) qhj.a(context).Y().get("update");
        qeq qeqVar = yfoVar != null ? (qeq) yfoVar.b() : null;
        if (qeqVar != null) {
            return qeqVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.qep
    public final boolean b() {
        return true;
    }

    @Override // defpackage.qep
    public final boolean c(Context context) {
        return false;
    }
}
