package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tui {
    public static final zdy a = zdy.h("com/google/android/libraries/speech/transcription/recognition/RecognitionClient");
    public final tqz b;
    public final zyh c;
    public final twe d;
    public final ttq e;
    public final twb f;
    public final twg g;
    private final twa h;

    public tui(tqz tqzVar, zyh zyhVar, txr txrVar, twr twrVar, twe tweVar, ttq ttqVar, twb twbVar) {
        this.b = tqzVar;
        this.c = zyhVar;
        this.d = tweVar;
        this.e = ttqVar;
        this.f = twbVar;
        tuh tuhVar = new tuh(this);
        sdd sddVar = (sdd) twrVar.a.a();
        sddVar.getClass();
        slz slzVar = (slz) twrVar.c.a();
        slzVar.getClass();
        uab uabVar = (uab) twrVar.d.a();
        uabVar.getClass();
        zyh zyhVar2 = (zyh) twrVar.e.a();
        zyhVar2.getClass();
        zyh zyhVar3 = (zyh) twrVar.f.a();
        zyhVar3.getClass();
        sah sahVar = (sah) twrVar.g.a();
        sahVar.getClass();
        this.g = new twq(sddVar, twrVar.b, slzVar, uabVar, zyhVar2, zyhVar3, sahVar, tweVar, tuhVar);
        tsk tskVar = (tsk) tweVar;
        int i = tskVar.M - 1;
        twa twaVarA = i != 1 ? (i == 2 || !tskVar.j) ? txrVar.b.a(tweVar, tuhVar, tuhVar) : txrVar.a.a(tweVar, tuhVar, tuhVar) : txrVar.a.a(tweVar, tuhVar, tuhVar);
        this.h = twaVarA;
    }

    public static boolean d(tso tsoVar) {
        return tsoVar.c.size() == 0 || ((String) tsoVar.c.get(0)).isEmpty();
    }

    public final void a() {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient", "cancel", 90, "RecognitionClient.java")).u("#cancel");
        this.g.d();
        this.h.a();
    }

    public final void b() {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient", "startListening", 76, "RecognitionClient.java")).u("#startListening");
        final twg twgVar = this.g;
        twgVar.e();
        twgVar.getClass();
        this.h.c(new Supplier() { // from class: tuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return twgVar.c();
            }
        }, twgVar.b(), Integer.bitCount(twgVar.a()));
    }

    public final void c() {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient", "stopListening", 85, "RecognitionClient.java")).u("#stopListening");
        this.g.d();
    }

    public final boolean e() {
        tsk tskVar = (tsk) this.d;
        return tskVar.n.isEmpty() && !tskVar.t;
    }
}
