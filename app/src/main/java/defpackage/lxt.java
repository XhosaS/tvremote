package defpackage;

import android.service.voice.VoiceInteractionService;
import com.google.android.katniss.search.serviceapi.KatnissVoiceInteractionService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lxt extends VoiceInteractionService implements aeja {
    private volatile aeis a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.aeja
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aeis cO() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new aeis(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            ((KatnissVoiceInteractionService) this).a = ((etn) cO().dN()).a();
        }
        super.onCreate();
    }
}
