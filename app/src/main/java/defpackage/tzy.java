package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.speech.RecognitionService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tzy {
    public final /* synthetic */ RecognitionService.Callback a;
    final /* synthetic */ Intent b;
    final /* synthetic */ uaa c;

    public tzy(uaa uaaVar, RecognitionService.Callback callback, Intent intent) {
        this.a = callback;
        this.b = intent;
        this.c = uaaVar;
    }

    public final void a(final int i) {
        final RecognitionService.Callback callback = this.a;
        b(new tzz() { // from class: tzm
            @Override // defpackage.tzz
            public final void a() throws RemoteException {
                callback.error(i);
            }
        });
        this.c.b.remove(callback);
    }

    public final void b(tzz tzzVar) {
        try {
            tzzVar.a();
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) uaa.a.c()).p(e)).q("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceWrapper$1", "logIfThrows", 203, "RecognitionServiceWrapper.java")).t();
        }
    }

    public final void c(final Bundle bundle) {
        this.c.a();
        final RecognitionService.Callback callback = this.a;
        b(new tzz() { // from class: tzq
            @Override // defpackage.tzz
            public final void a() throws RemoteException {
                callback.partialResults(bundle);
            }
        });
    }
}
