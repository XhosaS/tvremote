package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txr extends txo {
    public static final txo a = new txr();

    private txr() {
    }

    @Override // defpackage.txo
    public final tvw a(String str) {
        return new txl(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
