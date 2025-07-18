package defpackage;

import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsd {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle");
    public final Consumer b;
    public bsc c;
    public bsc d;
    public bsb e = new bry(this);
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final bro l;

    public bsd(bro broVar, Consumer consumer) {
        this.l = broVar;
        this.b = consumer;
    }

    public final synchronized bsc a(bqr bqrVar) {
        bsc bscVar = this.c;
        if (bscVar != null) {
            bscVar.c.b(false);
            this.c = this.e.d(bqrVar);
            ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle", "startMicSession", 92, "VoiceOverBle.java")).p("Pending audio session is replaced");
            return this.c;
        }
        if (this.d != null && this.e.a() <= 0) {
            this.d.i();
        }
        bsc bscVarD = this.e.d(bqrVar);
        this.c = bscVarD;
        bscVarD.i.b.accept(bscVarD.h());
        return this.c;
    }

    public final synchronized String b() {
        String strConcat = String.format(Locale.ENGLISH, "Assistant: %d, Mic Open: %d/%d:%d, Frames received: %d/%d", Integer.valueOf(this.f), Integer.valueOf(this.g - this.h), Integer.valueOf(this.g), Integer.valueOf(this.i), Integer.valueOf(this.j - this.k), Integer.valueOf(this.j));
        bsc bscVar = this.d;
        if (bscVar != null) {
            strConcat = String.valueOf(strConcat).concat(String.valueOf(String.format(Locale.ENGLISH, "%n Ongoing session frames received: %d/%d", Integer.valueOf(bscVar.e - bscVar.h), Integer.valueOf(bscVar.e))));
        }
        if (this.c == null) {
            return strConcat;
        }
        return String.valueOf(strConcat).concat(String.valueOf(String.format(Locale.ENGLISH, "%n Pending session exists", new Object[0])));
    }

    public final synchronized void c() {
        if (this.d != null || this.c != null) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle", "closeAllSessions", 348, "VoiceOverBle.java")).p("Remote with ongoing audio sessions has been disconnected");
        }
        bsc bscVar = this.d;
        if (bscVar != null) {
            bscVar.j((short) 4);
            this.d = null;
        }
        bsc bscVar2 = this.c;
        if (bscVar2 != null) {
            bscVar2.j((short) 4);
            this.c = null;
        }
    }

    public final void d(int i, brs brsVar) {
        if (this.e.a() != i) {
            this.e = i <= 0 ? new bry(this) : new bsa(this);
        }
        this.b.accept(this.e.h(brsVar));
    }
}
