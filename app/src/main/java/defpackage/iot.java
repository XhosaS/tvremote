package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iot {
    public static final iot a = new iot();

    private iot() {
    }

    public final Uri a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Uri) intent.getParcelableExtra("hotword_graphic_uri");
    }

    public final String b(Intent intent) {
        if (intent != null) {
            return intent.getStringExtra("hotword_description_appendage");
        }
        return null;
    }
}
