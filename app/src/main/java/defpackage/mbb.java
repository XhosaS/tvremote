package defpackage;

import com.google.android.libraries.assistant.soda.Soda;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mbb implements zxe {
    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) Soda.a.c()).p(th)).q("com/google/android/libraries/assistant/soda/Soda$2", "onFailure", (char) 1199, "Soda.java")).u("Error tearing down data provider.");
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        ((zdv) ((zdv) Soda.a.b()).q("com/google/android/libraries/assistant/soda/Soda$2", "onSuccess", 1194, "Soda.java")).u("Successfully tore down data provider.");
    }
}
