package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bro {
    public static final brp a(Context context, String str, brn brnVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new brp(context, str, brnVar, z, z2);
    }
}
