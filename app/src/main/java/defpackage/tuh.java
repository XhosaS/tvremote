package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.katniss.R;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tuh implements ttq, twb {
    final /* synthetic */ tui b;
    private long f;
    private final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicReference e = new AtomicReference();

    public tuh(tui tuiVar) {
        this.b = tuiVar;
    }

    private final void s(final int i) {
    }

    @Override // defpackage.twb
    public final void a(boolean z) {
        this.b.f.a(z);
    }

    @Override // defpackage.twb
    public final void b() {
        ((zdv) ((zdv) tui.a.b()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onEndOfSpeech", 192, "RecognitionClient.java")).u("#onEndOfSpeech");
        this.a.set(false);
        tui tuiVar = this.b;
        tuiVar.f.b();
        twe tweVar = tuiVar.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f;
        tsk tskVar = (tsk) tweVar;
        int i = tskVar.l;
        if (jElapsedRealtime >= j + i && (i > 0 || !tskVar.o)) {
            tuiVar.g.d();
        }
        int i2 = tskVar.m;
        if (i2 <= 0 || !tskVar.o) {
            return;
        }
        s(i2);
    }

    @Override // defpackage.twb
    public final void c(trr trrVar) {
        zdy zdyVar = tui.a;
        zdv zdvVar = (zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onError", 213, "RecognitionClient.java");
        trb trbVar = trrVar.a;
        String strC = trbVar.c();
        trd trdVar = (trd) trbVar;
        zdvVar.D("#onError space %s code %d!", strC, trdVar.a);
        if (!this.c.compareAndSet(false, true)) {
            ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onError", 218, "RecognitionClient.java")).u("#onError already finished - ignoring");
            return;
        }
        tui tuiVar = this.b;
        tuiVar.g.d();
        if (tuiVar.e()) {
            if (trdVar.b == 2) {
                tqz tqzVar = tuiVar.b;
                if (tqzVar.a.compareAndSet(false, true)) {
                    tqzVar.b.a(R.raw.no_input);
                }
            } else {
                tqz tqzVar2 = tuiVar.b;
                if (tqzVar2.a.compareAndSet(false, true)) {
                    tqzVar2.b.a(R.raw.failure);
                }
            }
        }
        tuiVar.f.c(trrVar);
    }

    @Override // defpackage.twb
    public final void d(trr trrVar) {
        ((zdv) ((zdv) tui.a.b()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onFallback", 313, "RecognitionClient.java")).u("#onFallback");
        this.b.f.d(trrVar);
    }

    @Override // defpackage.twb
    public final void f(txt txtVar, txv txvVar) {
        this.b.f.f(txtVar, txvVar);
    }

    @Override // defpackage.twb
    public final void g(adqj adqjVar) {
        if (this.c.get()) {
            ((zdv) ((zdv) tui.a.d()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onLangIdEvent", 270, "RecognitionClient.java")).u("#onLangIdEvent already finished - ignoring");
        } else {
            this.b.f.g(adqjVar);
        }
    }

    @Override // defpackage.twb
    public final void h(tuw tuwVar) {
        if (this.c.get()) {
            ((zdv) ((zdv) tui.a.d()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onPartialResults", 260, "RecognitionClient.java")).u("#onPartialResults already finished - ignoring");
        } else {
            this.b.f.h(tuwVar);
        }
    }

    @Override // defpackage.twb
    public final void i() {
        zdy zdyVar = tui.a;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onRecognitionFinished", 284, "RecognitionClient.java")).u("#onRecognitionFinished");
        if (!this.d.get()) {
            ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onRecognitionFinished", 286, "RecognitionClient.java")).u("#onRecognitionFinished no speech - erroring");
            c(new trl());
        } else {
            if (!this.c.compareAndSet(false, true)) {
                ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onRecognitionFinished", 292, "RecognitionClient.java")).u("#onRecognitionFinished already finished - ignoring");
                return;
            }
            tui tuiVar = this.b;
            tuiVar.g.d();
            if (tuiVar.e()) {
                tqz tqzVar = tuiVar.b;
                if (tqzVar.a.compareAndSet(false, true)) {
                    tqzVar.b.a(R.raw.success);
                }
            }
            tuiVar.f.i();
        }
    }

    @Override // defpackage.twb
    public final void j(tso tsoVar) {
        if (this.c.get()) {
            ((zdv) ((zdv) tui.a.d()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onResults", 239, "RecognitionClient.java")).u("#onResults already finished - ignoring");
            return;
        }
        if (tui.d(tsoVar)) {
            ((zdv) ((zdv) tui.a.b()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onResults", 246, "RecognitionClient.java")).u("#onResults empty final recognition results");
        } else {
            this.d.set(true);
        }
        if (!tui.d(tsoVar) || ((tsk) this.b.d).o) {
            ((zdv) ((zdv) tui.a.b()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onResults", 251, "RecognitionClient.java")).x("#onResults withSpeech: %b", Boolean.valueOf(this.d.get()));
            this.b.f.j(tsoVar);
        }
    }

    @Override // defpackage.twb
    public final void k(adrb adrbVar) {
        this.b.f.k(adrbVar);
    }

    @Override // defpackage.twb
    public final void l() {
        ((zdv) ((zdv) tui.a.b()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onStartOfSpeech", 174, "RecognitionClient.java")).u("#onStartOfSpeech");
        this.a.set(true);
        tui tuiVar = this.b;
        tuiVar.f.l();
        if (((tsk) tuiVar.d).m > 0) {
        }
    }

    @Override // defpackage.ttq
    public final void m(Uri uri) {
        tui tuiVar = this.b;
        if (!((tsk) tuiVar.d).h.isPresent() || !Uri.EMPTY.equals(uri)) {
            tuiVar.e.m(uri);
        } else {
            ((zdv) ((zdv) tui.a.d()).q("com/google/android/libraries/speech/transcription/recognition/RecognitionClient$SpeechAndMicrophoneListener", "onAudioRecordingCreated", 165, "RecognitionClient.java")).u("#onAudioRecordingCreated failed");
            c(new trf());
        }
    }

    @Override // defpackage.ttq
    public final void n() {
        this.b.e.n();
    }

    @Override // defpackage.ttq
    public final void o() {
        this.b.e.o();
    }

    @Override // defpackage.ttq
    public final void p() {
        this.b.e.p();
    }

    @Override // defpackage.ttq
    public final void q() {
        this.f = SystemClock.elapsedRealtime();
        tui tuiVar = this.b;
        if (tuiVar.e()) {
            tqz tqzVar = tuiVar.b;
            if (!tqzVar.a.get()) {
                tqzVar.b.a(R.raw.open);
            }
        }
        tuiVar.e.q();
        tsk tskVar = (tsk) tuiVar.d;
        int i = tskVar.l;
        if (i > 0) {
            tuiVar.c.schedule(wyo.h(new Runnable() { // from class: tuf
                @Override // java.lang.Runnable
                public final void run() {
                    tuh tuhVar = this.a;
                    if (tuhVar.a.get()) {
                        return;
                    }
                    tuhVar.b.g.d();
                }
            }), i, TimeUnit.MILLISECONDS);
        }
        int i2 = tskVar.m;
        if (i2 > 0) {
            s(i2);
        }
    }

    @Override // defpackage.ttq
    public final void r(int i) {
        TimeUnit.SECONDS.getClass();
        this.b.e.r(i);
    }

    @Override // defpackage.twb
    public final void e() {
    }
}
