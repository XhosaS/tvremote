package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsh {
    public final kai a;

    public jsh(Context context) {
        int i = kai.n;
        kaf kafVar = new kaf(context);
        kafVar.a(kac.b);
        kai kaiVar = new kai(kafVar.a, kafVar.b, kafVar.e, kafVar.d, kafVar.c, kafVar.f);
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", "FCM_CLIENT_EVENT_LOGGING", Integer.valueOf(Integer.parseInt("FCM_CLIENT_EVENT_LOGGING"))));
        } catch (NumberFormatException unused) {
            this.a = kaiVar;
        }
    }
}
