package defpackage;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class okb implements Closeable {
    private static final zdy d = zdy.h("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient");
    public final afhq a;
    public final abwf b;
    public final Boolean c;

    public okb(afhq afhqVar, abwf abwfVar, Boolean bool) {
        this.a = afhqVar;
        this.b = abwfVar;
        this.c = bool;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            afhq afhqVar = this.a;
            afhqVar.f();
            afhqVar.e(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((zdv) ((zdv) ((zdv) d.d()).p(e)).q("com/google/android/libraries/geller/gellersync/GellerOnePlatformClient", "close", 'C', "GellerOnePlatformClient.java")).u("Failed to shut down managed channel");
        }
    }
}
