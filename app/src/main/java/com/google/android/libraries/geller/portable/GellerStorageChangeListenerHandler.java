package com.google.android.libraries.geller.portable;

import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import defpackage.acgd;
import defpackage.onu;
import defpackage.yzq;
import defpackage.zcp;
import defpackage.zdl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GellerStorageChangeListenerHandler {
    private yzq a;
    private final GellerLoggingCallback b;

    public GellerStorageChangeListenerHandler(yzq yzqVar, GellerLoggingCallback gellerLoggingCallback) {
        this.a = zcp.b;
        if (yzqVar != null) {
            this.a = yzqVar;
        }
        this.b = gellerLoggingCallback;
    }

    void notifyOnDeletion(String str, String str2) {
        acgd.c(str2);
        this.b.k(str2);
        zdl it = this.a.iterator();
        while (it.hasNext()) {
            ((onu) it.next()).a();
        }
    }
}
