package defpackage;

import android.app.Service;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvr {
    public static final wvr a = new wvr();

    private wvr() {
    }

    public static final wwc a(Service service, Intent intent) {
        if (intent == null || a.c(intent, false) == null) {
            wwc wwcVar = wwb.a;
            wwcVar.getClass();
            return wwcVar;
        }
        wwc wwcVarC = wwc.c(wxj.c(service));
        wwcVarC.getClass();
        return wwcVarC;
    }

    private final wwq c(Intent intent, boolean z) {
        return z ? wyo.a.n(intent, true) : wyo.a.n(intent, false);
    }

    private final wwt d(Service service, String str) {
        uea.c();
        return wxj.b(service).b(str, "", "", 0);
    }

    public final wwt b(Service service, Intent intent, String str, boolean z) {
        if (intent == null) {
            return d(service, str);
        }
        wwq wwqVarC = c(intent, z);
        if (wwqVarC == null) {
            return d(service, str);
        }
        wum.g(wum.c(), wwqVarC);
        return new wwt() { // from class: wvq
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                uea.c();
                wum.g(wum.c(), null);
            }
        };
    }
}
