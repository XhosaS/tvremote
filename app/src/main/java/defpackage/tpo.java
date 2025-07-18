package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpo extends Exception {
    public tpo(Intent intent) {
        super("Intent not registered in manifest: ".concat(String.valueOf(String.valueOf(intent))));
    }
}
