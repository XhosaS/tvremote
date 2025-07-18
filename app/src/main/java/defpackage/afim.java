package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afim {
    private static afim a;

    public afim() {
        new HashSet();
    }

    public static synchronized void a() {
        if (a == null) {
            a = new afim();
        }
    }
}
