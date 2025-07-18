package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbl {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/timeevent/TimeEventUtils");

    public static String a(Context context, long j, int i) {
        if (j <= 0) {
            return "";
        }
        return " " + j + " " + context.getString(i);
    }

    public static void b(final boolean z, jca jcaVar) {
        jcaVar.b(new jby() { // from class: fbk
            @Override // defpackage.jby
            public final void a(jdq jdqVar) {
                try {
                    jdqVar.e(z);
                } catch (Exception e) {
                    ((zdv) ((zdv) ((zdv) fbl.a.c()).p(e)).q("com/google/android/apps/tvsearch/app/timeevent/TimeEventUtils", "setIsAssistantResponding", 'Q', "TimeEventUtils.java")).u("Exception when calling setIsAssistantResponding.");
                }
            }
        });
    }
}
