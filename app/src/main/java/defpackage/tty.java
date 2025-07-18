package defpackage;

import io.grpc.StatusException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tty implements ager {
    final /* synthetic */ List a;
    final /* synthetic */ ttz b;
    private final Executor c;
    private final AtomicBoolean d = new AtomicBoolean();

    public tty(ttz ttzVar, List list) {
        this.a = list;
        this.b = ttzVar;
        this.c = new zyt(ttzVar.b);
    }

    @Override // defpackage.ager
    public final void e() {
        this.d.compareAndSet(false, true);
    }

    @Override // defpackage.ager
    public final void f(final Throwable th) {
        if (this.d.compareAndSet(false, true)) {
            this.c.execute(wyo.h(new Runnable() { // from class: ttw
                @Override // java.lang.Runnable
                public final void run() {
                    tty ttyVar = this.a;
                    Throwable th2 = th;
                    Throwable thB = ttz.b(th2, trr.class);
                    if (thB != null) {
                        ((zdv) ((zdv) ((zdv) ttz.a.d()).p(thB)).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$2", "onError", (char) 251, "NetworkSpeechRecognizer.java")).u("Transcription error");
                        ttyVar.b.d.c((trr) thB);
                        return;
                    }
                    if (th2 instanceof afjx) {
                        ((zdv) ((zdv) ((zdv) ttz.a.d()).p(th2)).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$2", "onError", (char) 254, "NetworkSpeechRecognizer.java")).u("Recognizer network error");
                        ttz ttzVar = ttyVar.b;
                        ttzVar.d.c(new trh(((afjx) th2).a.getCode()));
                        return;
                    }
                    if (th2 instanceof StatusException) {
                        ((zdv) ((zdv) ((zdv) ttz.a.d()).p(th2)).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$2", "onError", (char) 258, "NetworkSpeechRecognizer.java")).u("Recognizer network error");
                        ttz ttzVar2 = ttyVar.b;
                        ttzVar2.d.c(new trh(((StatusException) th2).a.getCode()));
                        return;
                    }
                    ((zdv) ((zdv) ((zdv) ttz.a.d()).p(th2)).q("com/google/android/libraries/speech/transcription/recognition/NetworkSpeechRecognizer$2", "onError", (char) 262, "NetworkSpeechRecognizer.java")).u("Recognizer generic error");
                    ttz ttzVar3 = ttyVar.b;
                    ttzVar3.d.c(new trg());
                }
            }));
        }
    }

    @Override // defpackage.ager
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        final adkf adkfVar = (adkf) obj;
        if (this.d.get()) {
            return;
        }
        this.c.execute(wyo.h(new Runnable() { // from class: ttx
            @Override // java.lang.Runnable
            public final void run() {
                adkf adkfVar2 = adkfVar;
                int i = adkfVar2.b;
                int iA = adke.a(i);
                if (iA != 0 && iA == 2) {
                    return;
                }
                tty ttyVar = this.a;
                int iA2 = adke.a(i);
                if (iA2 != 0 && iA2 == 3) {
                    ttyVar.f(new trn(adkfVar2.c, adkfVar2.d));
                    return;
                }
                zdm zdmVarListIterator = ((yyk) ttyVar.a).listIterator(0);
                while (zdmVarListIterator.hasNext()) {
                    ((tyf) zdmVarListIterator.next()).a(adkfVar2, ttyVar.b.d);
                }
            }
        }));
    }
}
