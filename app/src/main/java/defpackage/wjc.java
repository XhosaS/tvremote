package defpackage;

import android.os.Bundle;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjc {
    public static Locale a(bq bqVar) {
        Bundle bundle = bqVar.n;
        if (bundle == null) {
            return null;
        }
        return (Locale) bundle.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }
}
