package defpackage;

import com.google.assistant.sdk.libassistant.AudioInputEventListener;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hxu extends AudioInputEventListener {
    public Duration a = Duration.ZERO;
    public hxt b;
    private final agow c;
    private final yrn d;
    private final ghr e;

    public hxu(agow agowVar, yrx yrxVar, ghr ghrVar) {
        this.c = agowVar;
        this.d = new yrn(yrxVar);
        this.e = ghrVar;
    }

    public final abwf a() {
        return (abwf) this.c.a();
    }

    public final void b() {
        yrn yrnVar = this.d;
        yrnVar.d();
        yrnVar.e();
    }

    public final boolean c() {
        return !this.a.isZero() && this.a.compareTo(acbh.b(a())) < 0;
    }

    @Override // com.google.assistant.sdk.libassistant.AudioInputEventListener
    public final void onAudioInputEvent(AudioInputEventListener.InputEvent inputEvent) {
        new qsk(inputEvent);
        AudioInputEventListener.InputEvent inputEvent2 = AudioInputEventListener.InputEvent.CAPTURE_FAILED;
        int iOrdinal = inputEvent.ordinal();
        if (iOrdinal == 0) {
            this.e.G(9);
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        Duration durationOfNanos = Duration.ofNanos(this.d.b());
        this.a = durationOfNanos;
        durationOfNanos.toMillis();
        hxt hxtVar = this.b;
        if (hxtVar != null) {
            hxtVar.Q(c());
        }
    }
}
