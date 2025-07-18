package defpackage;

import android.util.Patterns;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gts {
    public static final boolean a(String str) {
        str.getClass();
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }
}
