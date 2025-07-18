package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tws extends txn {
    public String a;
    public tuw b;
    public tso c;
    public Boolean d;
    public trb e;
    public Uri f;
    public byte g;
    private boolean h;
    private int i;

    public tws() {
    }

    @Override // defpackage.txn
    public final txo a() {
        if (this.g == 7) {
            return new twt(this.a, this.b, this.c, this.h, this.d, this.e, this.i, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" hasStartOfSpeech");
        }
        if ((this.g & 2) == 0) {
            sb.append(" speechLevel");
        }
        if ((this.g & 4) == 0) {
            sb.append(" lastAudioRationaleToastTimestampLoaded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.txn
    public final void b(boolean z) {
        this.h = z;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.txn
    public final void c(int i) {
        this.i = i;
        this.g = (byte) (this.g | 2);
    }

    public tws(txo txoVar) {
        twt twtVar = (twt) txoVar;
        this.a = twtVar.a;
        this.b = twtVar.b;
        this.c = twtVar.c;
        this.h = twtVar.d;
        this.d = twtVar.e;
        this.e = twtVar.f;
        this.i = twtVar.g;
        this.f = twtVar.h;
        this.g = (byte) 7;
    }
}
