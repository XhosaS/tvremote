package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqe extends Exception {
    public aaqe(String str) {
        super(str);
        if (str == null) {
            return;
        }
        str.toLowerCase(Locale.US).hashCode();
    }
}
