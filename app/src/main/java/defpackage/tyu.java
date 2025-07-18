package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.speech.RecognitionService;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tyu implements ttq {
    int a = -1;
    final /* synthetic */ String b;
    final /* synthetic */ tzh c;
    final /* synthetic */ tzy d;

    public tyu(tzh tzhVar, tzy tzyVar, String str) {
        this.d = tzyVar;
        this.b = str;
        this.c = tzhVar;
    }

    @Override // defpackage.ttq
    public final void n() {
        ((zdv) ((zdv) tzh.a.b()).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$1", "onMicrophoneCloseRequested", 211, "RecognitionServiceImpl.java")).u("RecognitionService#onMicrophoneCloseRequested");
        final String str = this.b;
        this.c.g.ifPresent(new Consumer() { // from class: tys
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tus) obj).g(str);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ttq
    public final void p() {
        ((zdv) ((zdv) tzh.a.b()).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$1", "onMicrophoneDeactivated", 205, "RecognitionServiceImpl.java")).u("RecognitionService#onMicrophoneDeactivated");
        final String str = this.b;
        this.c.g.ifPresent(new Consumer() { // from class: tyt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tus) obj).h(str);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ttq
    public final void q() {
        ((zdv) ((zdv) tzh.a.b()).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceImpl$1", "onMicrophoneOpened", 198, "RecognitionServiceImpl.java")).u("RecognitionService#onMicrophoneOpened");
        final Bundle bundle = new Bundle();
        tzy tzyVar = this.d;
        final RecognitionService.Callback callback = tzyVar.a;
        tzyVar.b(new tzz() { // from class: tzp
            @Override // defpackage.tzz
            public final void a() throws RemoteException {
                callback.readyForSpeech(bundle);
            }
        });
        final String str = this.b;
        this.c.g.ifPresent(new Consumer() { // from class: tyr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((tus) obj).i(str);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ttq
    public final void r(int i) {
        if (i != this.a) {
            this.a = i;
            tzy tzyVar = this.d;
            final RecognitionService.Callback callback = tzyVar.a;
            final float f = ((i / 100.0f) * 12.0f) - 2.0f;
            tzyVar.b(new tzz() { // from class: tzl
                @Override // defpackage.tzz
                public final void a() throws RemoteException {
                    callback.rmsChanged(f);
                }
            });
        }
    }

    @Override // defpackage.ttq
    public final void o() {
    }

    @Override // defpackage.ttq
    public final void m(Uri uri) {
    }
}
