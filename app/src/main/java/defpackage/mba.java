package defpackage;

import com.google.android.libraries.assistant.soda.Soda;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mba implements zxe {
    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) Soda.a.c()).p(th)).q("com/google/android/libraries/assistant/soda/Soda$1", "onFailure", (char) 415, "Soda.java")).u("Error setting up data provider.");
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        ((zdv) ((zdv) Soda.a.b()).q("com/google/android/libraries/assistant/soda/Soda$1", "onSuccess", 410, "Soda.java")).u("Successfully set up data provider.");
    }
}
